package com.shopee.warehouse.sqlparser.engine.antlr.visit;

import com.shopee.warehouse.sqlparser.engine.antlr.baseVisit.HplsqlParser;
import com.shopee.warehouse.sqlparser.engine.antlr.service.impl.TableColumnsInfoTabServiceImpl;
import com.shopee.warehouse.sqlparser.pojo.entity.ColumnInfo;
import com.shopee.warehouse.sqlparser.pojo.entity.DataRelaColumnVO;
import com.shopee.warehouse.sqlparser.pojo.entity.LimitedRelaTVO;
import com.shopee.warehouse.sqlparser.pojo.entity.ParseResult;
import com.shopee.warehouse.sqlparser.pojo.entity.TableInfo;
import com.shopee.warehouse.sqlparser.util.SpringUtil;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;


public class HplSqlVisit extends HplSqlDefaultVisitor{

    private String expr = "";
    private Set<TableInfo> allTables = new HashSet<>();
    private Set<ColumnInfo> allColumns = new HashSet<>();
    private Set<String> allPartitions = new HashSet<>();
    private TableInfo srcTableInfo;
    private TableInfo srcTableInfoAlias;
    private Stack<TableInfo> srcTableInfoAliasStack = new Stack<>();
    private TableInfo tgtTableInfo;
    // 来源列，可能是多个字段 表达式
    private List<ColumnInfo> srcColumn;
    private ColumnInfo columnName;
    private ColumnInfo tgtColumn;
    private List<List<ColumnInfo>> srcColumnList;
    private List<ColumnInfo> limitedColumnList = new ArrayList<>();
    private List<List<List<ColumnInfo>>> allSrcColumnList = new ArrayList<>();
    private List<ColumnInfo> tgtColumnList;
    private List<ColumnInfo> allPartitionColumnList = new ArrayList<>();
    private Map<TableInfo, List<ColumnInfo>> columnMap;
    private ParseResult parseResult;
    public ParseResult getParseResult() {
        return parseResult;
    }
    private Map<ColumnInfo, List<ColumnInfo>> aliasColumnMap = new LinkedHashMap<>();
    private Map<ColumnInfo, List<ColumnInfo>> withAliasColumnMap = new LinkedHashMap<>();
    private Stack<Map<ColumnInfo, List<ColumnInfo>>> aliasColumnMapStack = new Stack<>();
    private Map<TableInfo, TableInfo> aliasTableMap = new HashMap<>();
    private Stack<Map<TableInfo, TableInfo>> aliasTableMapStack = new Stack<>();
    private Stack<Boolean> isLimitedStack = new Stack<>();
    private TableColumnsInfoTabServiceImpl tableColumnsInfo = SpringUtil.getBean(TableColumnsInfoTabServiceImpl.class);

    @Override
    public Object visitProgram(HplsqlParser.ProgramContext ctx) {
        parseResult = new ParseResult();
        for (int i = 0; i < ctx.getChildCount(); i++) {

            ParseTree child = ctx.getChild(i);
            try {
                super.visit(child);
            } catch (Exception e) {
                e.printStackTrace();
//                System.out.println("visitProgram" + e);
                continue;
            }
        }
        parseResult.setAllTables(allTables);
        parseResult.setAllColumns(allColumns);
        parseResult.setAllPartitions(allPartitions);
        Set<DataRelaColumnVO> list = new HashSet<>();
        // 建立流向关系
        for (int j = 0; j < allSrcColumnList.size(); j++) {
            for (int i = 0; i < tgtColumnList.size(); i++) {
//                System.out.println(allSrcColumnList.get(j).get(i));
//                ColumnInfo srcColumnResult = getRealColumnInfo(allSrcColumnList.get(j).get(i));
                if (i > allSrcColumnList.get(j).size() - 1) {
//                    System.out.println("The number of target columns is not equal to the source columns");
                    continue;
                }
                List<ColumnInfo> srcColumnResults = allSrcColumnList.get(j).get(i);
                //常量
                if (srcColumnResults.isEmpty()) {
                    String srcObjId = "constant.constant.constant";
                    String tgtObjId = tgtColumnList.get(i).getTableInfo().getSchemaName() + "." + tgtColumnList.get(i).getTableInfo().getObjName() + "." + tgtColumnList.get(i).getColumnName();

                    DataRelaColumnVO dataRelaColumnVO = new DataRelaColumnVO(srcObjId, tgtObjId);
                    list.add(dataRelaColumnVO);
                }
                for (ColumnInfo srcColumnResult :
                        srcColumnResults) {
                    if (srcColumnResult.getTableInfo().getSchemaName() == null) {
                        System.out.println(srcColumnResult + " antlr parse error");
                        continue;
                    }
                    String srcObjId = srcColumnResult.getTableInfo().getSchemaName() + "." + srcColumnResult.getTableInfo().getObjName() + "." + srcColumnResult.getColumnName();
                    String tgtObjId = tgtColumnList.get(i).getTableInfo().getSchemaName() + "." + tgtColumnList.get(i).getTableInfo().getObjName() + "." + tgtColumnList.get(i).getColumnName();

                    DataRelaColumnVO dataRelaColumnVO = new DataRelaColumnVO(srcObjId, tgtObjId);
                    list.add(dataRelaColumnVO);
                }

            }
        }
        Set<LimitedRelaTVO> limitedRelaTVOS = new HashSet<>();

        //建立限定关系
        for (ColumnInfo columnInfo :
                limitedColumnList) {
//            ColumnInfo limitedColumnResult = getRealColumnInfo(columnInfo);
            if (tgtTableInfo != null) {
                ColumnInfo limitedColumnResult = columnInfo;
                if (limitedColumnResult.getTableInfo().getSchemaName() == null) {
                    System.out.println(limitedColumnResult + " antlr parse error");
                    continue;
                }
                String limitedObjId = limitedColumnResult.getTableInfo().getSchemaName() + "." + limitedColumnResult.getTableInfo().getObjName() + "." + limitedColumnResult.getColumnName();
                String tgtObjId = tgtTableInfo.getSchemaName() + "." + tgtTableInfo.getObjName();

                LimitedRelaTVO limitedRelaTVO = new LimitedRelaTVO(limitedObjId, tgtObjId);
                limitedRelaTVOS.add(limitedRelaTVO);
            }
        }
        parseResult.setDataRelaColumnVOs(new ArrayList<>(list));

        parseResult.setLimitedRelaTVOs(new ArrayList<>(limitedRelaTVOS));

        return null;
    }

    @Override
    public Object visitTarget_table(HplsqlParser.Target_tableContext ctx) {

        tgtTableInfo = new TableInfo();
        tgtColumnList = new ArrayList<>();
        return visitChildren(ctx);
    }

    @Override
    public Object visitTarget_table_or_partition(HplsqlParser.Target_table_or_partitionContext ctx) {

        tgtTableInfo = getTableInfo(ctx.table_name());
        if (ctx.insert_stmt_cols() == null) {
            List<ColumnInfo> columnInfos = tableColumnsInfo.getColumnInfo(tgtTableInfo,false);
            tgtColumnList.addAll(columnInfos);

        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitInsert_stmt_cols(HplsqlParser.Insert_stmt_colsContext ctx) {

        for (int i = 0; i < ctx.column_name().size(); i++) {
            tgtColumn = new ColumnInfo();
            tgtColumn = this.getColumnInfo(ctx.column_name(i));
            tgtColumn.setTableInfo(tgtTableInfo);
            tgtColumnList.add(tgtColumn);
        }

        return visitChildren(ctx);
    }

    /**
     * with 语法
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitWith_stmt(HplsqlParser.With_stmtContext ctx) {


        // 每个with语句 一个别名
        srcTableInfoAlias = new TableInfo();

        if (ctx.tbl_name() != null) {
            srcTableInfoAlias.setObjName(ctx.tbl_name().getText());
            srcTableInfoAliasStack.push(srcTableInfoAlias);
        }
        visitChildren(ctx);
        // 子查询别名 一个子查询结束清空
        srcTableInfoAlias = null;
        srcTableInfoAliasStack.pop();
        withAliasColumnMap.putAll(aliasColumnMap);
        return null;
    }

    /**
     * 每个查询语句
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitSubselect_stmt(HplsqlParser.Subselect_stmtContext ctx) {
        isLimitedStack.push(false);
        aliasTableMap = new HashMap<>();
        aliasTableMapStack.push(aliasTableMap);

        // 进入新的子查询中，将上一个aliasColumnMap 入栈
        if (!(ctx.getParent().getParent().getParent().getParent() instanceof HplsqlParser.Insert_stmtContext)) {
            aliasColumnMapStack.push(aliasColumnMap);
            aliasColumnMap = new HashMap<>();
        }
        // 先访问from节点，获取源表
        if (ctx.from_clause() != null) {
            visit(ctx.from_clause());
        }


        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.getChild(i) != ctx.from_clause()) {

                visit(ctx.getChild(i));
            }
        }
        srcTableInfo = null;
        // 每个子查询结束后，清空掉实体表别名映射，以免影响到别的子查询
        aliasTableMapStack.pop();
        // 返回上层查询，实体表别名映射需要设置成上一层的aliasTableMap
        aliasColumnMap = aliasColumnMapStack.empty() ? new HashMap<>() : aliasColumnMapStack.pop();
        aliasTableMap = aliasTableMapStack.empty() ? new HashMap<>() : aliasTableMapStack.peek();
        isLimitedStack.pop();
//        System.out.println(aliasColumnMap);
        return null;
    }

    /**
     * 取from子查询 别名 srcTableInfoAlias
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitFrom_subselect_clause(HplsqlParser.From_subselect_clauseContext ctx) {

        // 每个子查询一个别名
        srcTableInfoAlias = new TableInfo();
        if (ctx.from_alias_clause() != null) {
            srcTableInfoAlias.setObjName(ctx.from_alias_clause().from_alias_clause_name().getText());
            srcTableInfoAliasStack.push(srcTableInfoAlias);
        }
        visitChildren(ctx);
        // 子查询别名 一个子查询结束清空
        srcTableInfoAlias = null;
        if (!srcTableInfoAliasStack.isEmpty()) {
            srcTableInfoAliasStack.pop();
        }
        return null;
    }
    @Override
    public Object visitLateral_view(HplsqlParser.Lateral_viewContext ctx){

        srcColumn = new ArrayList<>();
        visitChildren(ctx);
        for (HplsqlParser.Select_list_aliasContext context: ctx.select_list_alias()){
            for(HplsqlParser.Select_list_alias_nameContext context2:context.select_list_alias_name()){
                aliasColumnMap.put(new ColumnInfo(context2.getText(), new TableInfo(null,ctx.from_alias_clause().getText())), srcColumn);

            }
        }
        return null;
    }


    /**
     * 保存实体表别名映射 aliasTableMap
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitFrom_alias_clause(HplsqlParser.From_alias_clauseContext ctx) {

        if (ctx.from_alias_clause_name() != null && srcTableInfo != null) {
            aliasTableMap.put(new TableInfo(null, ctx.from_alias_clause_name().getText()), srcTableInfo);
        }
        return visitChildren(ctx);
    }


    /**
     * 获取当前查询语句中的 实际访问 实体表
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitFrom_table_name_clause(HplsqlParser.From_table_name_clauseContext ctx) {
        // 记录所有字段的表别名，包含with语句设置的表名
        Set<TableInfo> withTables = new HashSet<>();
        withAliasColumnMap.forEach((key, value) -> {
            withTables.add(key.getTableInfo());
        });

        srcTableInfo = getTableInfo(ctx.table_name());
        if (!withTables.contains(srcTableInfo)) {
            TableInfo temp = getTableInfo(ctx.table_name());
            if (temp.getSchemaName()==null){
                throw new RuntimeException("data error");
            }
            allTables.add(temp);
            allPartitionColumnList.addAll(tableColumnsInfo.getPartitionInfo(temp));
        }

        // 如果没有写实体表别名,记录下特殊的表名映射，用来判断select中 不写表别名的字段情况
        if (ctx.from_alias_clause() == null) {
            aliasTableMap.put(new TableInfo(null, srcTableInfo.getObjName()), srcTableInfo);
        }

        return visitChildren(ctx);
    }

    /**
     * 每次遍历select_list节点，则说明会访问字段，用一个srcColumnList存起来，
     * 只有当前select 是 insert对应的select 才会加到allSrcColumnList中
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitSelect_list(HplsqlParser.Select_listContext ctx) {
        srcColumnList = new ArrayList<>();
        visitChildren(ctx);
        if (ctx.getParent().getParent().getParent().getParent().getParent() instanceof HplsqlParser.Insert_stmtContext) {

            allSrcColumnList.add(srcColumnList);
        }
        return null;
    }

    /**
     * 遍历每个select_list_item,则代表遍历一个字段，存下别名映射，并加入到所属于的srcColumnList中
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitSelect_list_item(HplsqlParser.Select_list_itemContext ctx) {

        // 若当前遍历列 是 * （select */select a.*）
        if (ctx.select_list_asterisk() != null) {
            // 记录所有字段的表别名，包含with语句设置的表名
            Set<TableInfo> withTables = new HashSet<>();
            withAliasColumnMap.forEach((key, value) -> {
                withTables.add(key.getTableInfo());
            });

            List<ColumnInfo> allColumnInfos = new ArrayList<>();


            // 指定了表名的* a.*
            if (ctx.select_list_asterisk().L_ID() != null) {
                TableInfo tableInfo = new TableInfo(null, ctx.select_list_asterisk().L_ID().getText());
                // 找到别名的实际表名
                TableInfo realTableName = aliasTableMap.get(tableInfo);
                // 子查询的*
                if (realTableName == null) {
                    aliasColumnMap.forEach((key, value) -> {
                        if (ctx.select_list_asterisk().L_ID().getText().equalsIgnoreCase(key.getTableInfo().getObjName())) {
                            srcColumnList.add(value);
                            if (!srcTableInfoAliasStack.isEmpty() && !aliasColumnMapStack.isEmpty()) {
                                aliasColumnMapStack.peek().put(new ColumnInfo(key.getColumnName(), srcTableInfoAliasStack.peek()), value);
                            }
                        }
                    });
                } else {
                    // with的*
                    if (withTables.contains(realTableName)) {
                        withAliasColumnMap.forEach((key, value) -> {
                            if (realTableName.equals(key.getTableInfo())) {
                                srcColumnList.add(value);
                                if (!srcTableInfoAliasStack.isEmpty() && !aliasColumnMapStack.isEmpty()) {
                                    aliasColumnMapStack.peek().put(new ColumnInfo(key.getColumnName(), srcTableInfoAliasStack.peek()), value);
                                }
                            }
                        });
                    } else {
                        // 物理表的*
                        List<ColumnInfo> columnInfos = tableColumnsInfo.getColumnInfo(realTableName,true);
                        allColumnInfos.addAll(columnInfos);
                        allColumns.addAll(columnInfos);
                    }
                }
            } else {
                aliasTableMap.forEach((key, value) -> {
                    // with的*
                    if (withTables.contains(value)) {
                        withAliasColumnMap.forEach((key2, value2) -> {
                            if (value.equals(key2.getTableInfo())) {
                                srcColumnList.add(value2);
                                if (!srcTableInfoAliasStack.isEmpty() && !aliasColumnMapStack.isEmpty()) {
                                    aliasColumnMapStack.peek().put(new ColumnInfo(key2.getColumnName(), srcTableInfoAliasStack.peek()), value2);
                                }
                            }
                        });
                    } else {
                        // 物理表的*
                        List<ColumnInfo> columnInfos = tableColumnsInfo.getColumnInfo(value,true);
                        allColumnInfos.addAll(columnInfos);
                        allColumns.addAll(columnInfos);
                    }
                });
                // 子查询的*
                aliasColumnMap.forEach((key, value) -> {
                    if (!withTables.contains(key.getTableInfo())) {
                        srcColumnList.add(value);
                        if (!srcTableInfoAliasStack.isEmpty() && !aliasColumnMapStack.isEmpty()) {
                            aliasColumnMapStack.peek().put(new ColumnInfo(key.getColumnName(), srcTableInfoAliasStack.peek()), value);
                        }
                    }
                });
            }

            // 字段加到字段列表，字段映射中
            for (ColumnInfo columnInfo :
                    allColumnInfos) {
                ArrayList<ColumnInfo> asteriskColumn = new ArrayList<>();
                asteriskColumn.add(columnInfo);

                srcColumnList.add(asteriskColumn);
                if (!srcTableInfoAliasStack.isEmpty() && !aliasColumnMapStack.isEmpty()) {
                    aliasColumnMapStack.peek().put(new ColumnInfo(columnInfo.getColumnName(), srcTableInfoAliasStack.peek()), asteriskColumn);
                }
            }
            return null;
        }

        // 字段来源列
        srcColumn = new ArrayList<>();

        // 用来记录每一列的字段名，用来处理不写别名的sql，建立字段映射。每个select_list_item一个新的字段名
        columnName = new ColumnInfo();
        visitChildren(ctx);
        // 字段没有写别名，则用 记录的字段名 建立别名映射 &&srcColumn.size()==1
        if (ctx.select_list_alias() == null && !srcTableInfoAliasStack.isEmpty() && !aliasColumnMapStack.isEmpty()) {
            aliasColumnMapStack.peek().put(new ColumnInfo(columnName.getColumnName(), srcTableInfoAliasStack.peek()), srcColumn);
        }

        srcColumnList.add(srcColumn);
        return null;
    }

    /**
     * 取字段别名，记录下来
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitSelect_list_alias(HplsqlParser.Select_list_aliasContext ctx) {

        // 当有列别名，且此查询中有实体表，且有子查询别名，则添加字段别名映射
        if (ctx.select_list_alias_name() != null && !srcTableInfoAliasStack.isEmpty() && !aliasColumnMapStack.isEmpty()) {
            for(HplsqlParser.Select_list_alias_nameContext context:ctx.select_list_alias_name()) {
                aliasColumnMapStack.peek().put(new ColumnInfo(context.getText().replace("`", ""), srcTableInfoAliasStack.peek()), srcColumn);
            }
        }
        return visitChildren(ctx);
    }


    /**
     * 取bool表达式里的字段
     * bool表达式可能有多个字段,每个子树遍历都需要new一个对象
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitBool_expr_atom(HplsqlParser.Bool_expr_atomContext ctx) {
         expr = ctx.getText();
        isLimitedStack.push(true);
        visitChildren(ctx);
        isLimitedStack.pop();

        expr = "";
        return null;
    }

    /**
     * group by 语句中的字段当做限定字段
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitGroup_by_clause(HplsqlParser.Group_by_clauseContext ctx) {
        isLimitedStack.push(true);
        visitChildren(ctx);
        isLimitedStack.pop();

        return null;
    }

    /**
     * partition by 语句中的字段当做限定字段
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitExpr_func_partition_by_clause(HplsqlParser.Expr_func_partition_by_clauseContext ctx) {
        isLimitedStack.push(true);
        visitChildren(ctx);
        isLimitedStack.pop();

        return null;
    }

    /**
     * order by 语句中的字段当做限定字段
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitOrder_by_clause(HplsqlParser.Order_by_clauseContext ctx) {
        isLimitedStack.push(true);
        visitChildren(ctx);
        isLimitedStack.pop();

        return null;
    }

    /**
     * 访问取读表字段
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitExpr_atom(HplsqlParser.Expr_atomContext ctx) {
        if (ctx.column_name() != null) {
            ColumnInfo column = this.getColumnInfo(ctx.column_name());

//            System.out.println(aliasColumnMap);
            List<ColumnInfo> columns = getRealColumnInfo(column);

            if(CollectionUtils.isNotEmpty(columns)) {
                allColumns.addAll(columns);
                if (isLimitedStack.peek()) {
                    limitedColumnList.addAll(columns);
                    columns.forEach(o -> {
                        if (allPartitionColumnList.contains(o)) {
                            if (!"".equals(expr)) {
                                allPartitions.add(
                                        o.getTableInfo().getSchemaName() + "." + o.getTableInfo().getObjName() + "." + o.getColumnName()
                                                + expr.replace(ctx.column_name().getText(), ""));
                            }
                        }
                    });
                } else {
                    columnName = column;
                    srcColumn.addAll(columns);
                }
            }
        }
        // 列是字段序号，例如order by中
        if (ctx.int_number() != null && ctx.getParent().getParent() instanceof HplsqlParser.Order_by_clauseContext) {

            limitedColumnList.addAll(srcColumnList.get(Integer.parseInt(ctx.int_number().getText()) - 1));
        }
        return visitChildren(ctx);
    }


    private TableInfo getTableInfo(HplsqlParser.Table_nameContext ctx) {
        TableInfo tableInfo = new TableInfo();
        if (ctx.database_name() != null) {
            String databaseName = ctx.database_name().getChild(0).getText();
            tableInfo.setSchemaName(databaseName);
        }
        tableInfo.setObjName(ctx.tbl_name().getChild(0).getText().toLowerCase());

        return tableInfo;
    }


    private ColumnInfo getColumnInfo(HplsqlParser.Column_nameContext ctx) {
        ColumnInfo columnInfo = new ColumnInfo();
        columnInfo.setColumnName(ctx.real_column_name().getText().replace("`", ""));

        columnInfo.setTableInfo(new TableInfo());

        if (ctx.table_name() != null) {
            columnInfo.getTableInfo().setObjName(ctx.table_name().getText());
        }

        // 如果字段的表名 在表别名映射里有值，则说明用了表别名，则替换成实际表
        if (aliasTableMap.get(columnInfo.getTableInfo()) != null) {
            columnInfo.setTableInfo(aliasTableMap.get(columnInfo.getTableInfo()));
        }

        return columnInfo;
    }


    public void setColumnMap(Map<TableInfo, List<ColumnInfo>> columnMap) {
        this.columnMap = columnMap;
    }

    private List<ColumnInfo> getRealColumnInfo(ColumnInfo aliasColumnInfo) {
        List<ColumnInfo> objects = new ArrayList<>();
        objects.add(aliasColumnInfo);
        // 记录所有字段的表别名，包含with语句设置的表名
        Set<TableInfo> withTables = new HashSet<>();
        withAliasColumnMap.forEach((key, value) -> {
            withTables.add(key.getTableInfo());
        });
        // 不写表名，则说明该字段一定是from语句中的表的字段，要么来自于子查询，要么直接来自于表，要么来自于with
        if (aliasColumnInfo.getTableInfo().getObjName() == null) {

            // 优先找实体表别名映射 或者with定义的表别名
            for (Map.Entry<TableInfo, TableInfo> entry :
                    aliasTableMap.entrySet()) {
                TableInfo table = entry.getValue();
                aliasColumnInfo.setTableInfo(table);
                // 查询中只有一张表且没有子查询
                if (aliasTableMap.size() == 1 && aliasColumnMap.isEmpty()) {
                    if (withTables.contains(table)) {
                        return withAliasColumnMap.get(aliasColumnInfo);
                    } else {
                        return objects;
                    }
                }
                // with的表
                if (withTables.contains(table)) {
                    if (withAliasColumnMap.get(aliasColumnInfo) != null) {
                        return withAliasColumnMap.get(aliasColumnInfo);
                    }
                } else {
                    // 实体表
                    List<String> columnNames = tableColumnsInfo.getColumn(table,true);
                    if (columnNames.contains(aliasColumnInfo.getColumnName().toLowerCase())) {
                        aliasColumnInfo.setTableInfo(table);
                        return aliasColumnMap.get(aliasColumnInfo) == null ? (withAliasColumnMap.get(aliasColumnInfo) == null ? objects : withAliasColumnMap.get(aliasColumnInfo)) : aliasColumnMap.get(aliasColumnInfo);
                    }
                }
            }
            // 子查询
            for (Map.Entry<ColumnInfo, List<ColumnInfo>> entry : aliasColumnMap.entrySet()) {
                // 匹配所有子查询中的字段名，如果匹配上，则说明该字段来自于子查询，直接返回子查询字段
                if (entry.getKey().getColumnName().equalsIgnoreCase(aliasColumnInfo.getColumnName())) {
                    return entry.getValue();
                }
            }
            // 若只有一张实体表，且在数据库中找不到该字段，有可能是元数据缺失，直接当做这张实体表的字段
            if (aliasTableMap.size() == 1) {
                return objects;
            }
            // 找不到不带表名的字段实际表，则抛异常
            System.out.println(aliasColumnInfo + " column can not find");
            return new ArrayList<>();
        } else {
            return aliasColumnMap.get(aliasColumnInfo) == null ? (withAliasColumnMap.get(aliasColumnInfo) == null ? objects : withAliasColumnMap.get(aliasColumnInfo)) : aliasColumnMap.get(aliasColumnInfo);
        }
    }
}
