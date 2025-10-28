package com.shopee.warehouse.sqlparser.engine.antlr.service;

import com.shopee.warehouse.sqlparser.pojo.entity.ColumnInfo;
import com.shopee.warehouse.sqlparser.pojo.entity.TableInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TableColumnsInfoTabService {


    /**
     * 获取表的字段列表，结果按字段序号排序
     * @param tableInfo 表信息
     * @return
     */
    List<String> getColumn(TableInfo tableInfo, boolean hasPartition);

    /**
     * 封装表字段
     * @param tableInfo
     * @return
     */
    List<ColumnInfo> getColumnInfo(TableInfo tableInfo, boolean hasPartition);
    /**
     * 获取表的分区字段列表，结果按字段序号排序
     * @param tableInfo 表信息
     * @return
     */
    List<String> getPartitionColumn(TableInfo tableInfo);
    /**
     * 封装表分区字段
     * @param tableInfo
     * @return
     */
    List<ColumnInfo> getPartitionInfo(TableInfo tableInfo);
}
