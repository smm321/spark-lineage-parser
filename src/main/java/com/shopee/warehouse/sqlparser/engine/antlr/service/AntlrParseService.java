package com.shopee.warehouse.sqlparser.engine.antlr.service;

import com.shopee.warehouse.sqlparser.engine.antlr.baseVisit.HplsqlLexer;
import com.shopee.warehouse.sqlparser.engine.antlr.baseVisit.HplsqlParser;
import com.shopee.warehouse.sqlparser.engine.antlr.visit.HplSqlVisit;
import com.shopee.warehouse.sqlparser.pojo.LineageResult;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AntlrParseService {

    public LineageResult doParse(String sql) {
        LineageResult result = new LineageResult();
        result.setOriginalSql(sql);
        try {
            ANTLRInputStream input = new ANTLRInputStream(sql);
            HplsqlLexer lexer = new HplsqlLexer(input);
            CommonTokenStream token = new CommonTokenStream(lexer);
            HplsqlParser parser = new HplsqlParser(token);
            ParseTree tree = parser.program();
            HplSqlVisit hplSqlVisit = new HplSqlVisit();
            hplSqlVisit.visit(tree);
            LineageResult parsedResult = hplSqlVisit.getParseResult().toLineageResult();
            parsedResult.setOriginalSql(sql);
            return parsedResult;
        } catch (Exception ignored) {
//            log.error(String.format("antlr parse %s error ", sql), e);
        }
        return result;
    }
}
