package com.shopee.warehouse.sqlparser.engine.antlr.service.impl;

import com.shopee.warehouse.sqlparser.engine.spark.StandAloneSparkSession;
import com.shopee.warehouse.sqlparser.pojo.entity.ColumnInfo;
import com.shopee.warehouse.sqlparser.pojo.entity.TableInfo;
import org.apache.spark.sql.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class TableColumnsInfoTabServiceImpl implements TableColumnsInfoTabService {

    @Autowired
    private StandAloneSparkSession session;
    /**
     * 返回指定表的全小写字段名
     * @param tableInfo 表信息
     * @return
     */
    @Override
    public List<String> getColumn(TableInfo tableInfo, boolean hasPartition) {
        List<String> result = new ArrayList<>();
        Row[] rows = (Row[])session.getSparkSession()
                .sql("desc " + tableInfo.getSchemaName() + "." + tableInfo.getObjName())
                .collect();

        for (Row r : rows) {
            if (Objects.isNull(r) || ((String) r.get(0)).startsWith("#")) {
                continue;
            }
            String columnName = (String) r.get(0);
            if (hasPartition) {
                result.add(columnName);
            } else {
                if (result.contains(columnName)) {
                    result.remove(columnName);
                } else {
                    result.add(columnName);
                }
            }
        }
        return result;
    }

    @Override
    public List<ColumnInfo> getColumnInfo(TableInfo tableInfo, boolean hasPartition){

        List<String> columns = this.getColumn(tableInfo, hasPartition);
        List<ColumnInfo> columnInfos = new ArrayList<>();
        for (String column :
                columns) {
            columnInfos.add(new ColumnInfo(column,tableInfo));
        }
        return columnInfos;
    }

    @Override
    public List<String> getPartitionColumn(TableInfo tableInfo){
        List<String> result = new ArrayList<>();
        List<String> tmpCol = new ArrayList<>();
        Row[] rows = (Row[])session.getSparkSession()
                .sql("desc " + tableInfo.getSchemaName() + "." + tableInfo.getObjName())
                .collect();

        for (Row r : rows) {
            if (Objects.isNull(r) || ((String) r.get(0)).startsWith("#")) {
                continue;
            }
            String columnName = (String) r.get(0);
            if (tmpCol.contains(columnName)) {
                result.add(columnName);
            }
            tmpCol.add(columnName);
        }
        return result;
    }

    @Override
    public List<ColumnInfo> getPartitionInfo(TableInfo tableInfo){

        List<String> columns = this.getPartitionColumn(tableInfo);

        List<ColumnInfo> columnInfos = new ArrayList<>();
        for (String column :
                columns) {
            columnInfos.add(new ColumnInfo(column,tableInfo));
        }
        return columnInfos;
    }
}
