package com.shopee.warehouse.sqlparser.util;

import com.shopee.warehouse.sqlparser.pojo.ColumnLineageResult;
import com.shopee.warehouse.sqlparser.pojo.LineageResult;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LineageUtil {

    private static final String sparkOnly = "spark only:";
    private static final String antlrOnly = "antlr only:";
    private static final Integer sparkScore = 2;
    private static final Integer antlrScore = 1;
    private static final Integer unalignedScore = 1;
    private static final Integer alignScore = sparkScore + antlrScore;

    public static LineageResult getGaps(LineageResult spark, LineageResult antlr) {
        if (null == spark) {
            return antlr;
        }
        if (null == antlr) {
            return spark;
        }

        List<String> sparkOnlyTable = (List<String>)
                CollectionUtils.subtract(spark.getInputTable(), antlr.getInputTable());
        List<String> antlrOnlyTable = (List<String>)
                CollectionUtils.subtract(antlr.getInputTable(), spark.getInputTable());

        List<ColumnLineageResult> sparkOnlyColumn = subtract(spark.getColumnLineages(), antlr.getColumnLineages());
        List<ColumnLineageResult> antlrOnlyColumn = subtract(antlr.getColumnLineages(), spark.getColumnLineages());

        sparkOnlyColumn = sparkOnlyColumn.stream().filter(o -> {
            if (CollectionUtils.isEmpty(o.getOriginal()) &&
                    antlr.getColumnLineages()
                    .stream()
                    .anyMatch(k -> {
                        return antlr.getColumnLineages()
                                .stream()
                                .anyMatch(a -> a.getColumnName().equals(k.getColumnName()) && a.getOriginal().equals(Arrays.asList("constant.constant.constant")));
                    }
            )
            ) {
                return false;
            }
            return true;
        }).map(o -> {
            o.setColumnName(sparkOnly + o.getColumnName());
            return o;
        }).collect(Collectors.toList());

        antlrOnlyColumn = antlrOnlyColumn.stream().filter(o -> !o.getOriginal().equals(Arrays.asList("constant.constant.constant"))).map(o -> {
            o.setColumnName(antlrOnly + o.getColumnName());
            return o;
        }).collect(Collectors.toList());

        sparkOnlyColumn.addAll(antlrOnlyColumn);
        sparkOnlyTable = sparkOnlyTable.stream().map(o -> sparkOnly + o).collect(Collectors.toList());
        antlrOnlyTable = antlrOnlyTable.stream().map(o -> antlrOnly + o).collect(Collectors.toList());
        LineageResult gap = new LineageResult();
        sparkOnlyTable.addAll(antlrOnlyTable);
        if (CollectionUtils.isNotEmpty(sparkOnlyTable)) {
            gap.setInputTable(sparkOnlyTable);
        }
        if (CollectionUtils.isNotEmpty(sparkOnlyColumn)) {
            gap.setColumnLineages(sparkOnlyColumn);
        }
        return gap;
    }

    private static List<ColumnLineageResult> subtract(List<ColumnLineageResult>list, List<ColumnLineageResult>other) {
        List<ColumnLineageResult> ret = new ArrayList<>();
        Map<String, List<String>> map1 = list.stream().collect(Collectors.toMap(ColumnLineageResult::getColumnName, ColumnLineageResult::getOriginal));
        Map<String, List<String>> map2 = other.stream().collect(Collectors.toMap(ColumnLineageResult::getColumnName, ColumnLineageResult::getOriginal));
        Map<String, List<String>> results = new HashMap<>();
        map1.forEach((k, v) -> {
            if (map2.containsKey(k)) {
                for(String str : v) {
                    if (!map2.get(k).contains(str)) {
                        if (results.containsKey(k)) {
                            results.get(k).add(str);
                        } else {
                            results.put(k, Stream.of(str).collect(Collectors.toList()));
                        }
                    }
                }
            } else {
                results.put(k, v);
            }
        });
        results.forEach((k, v) -> {
            ret.add(new ColumnLineageResult(k, v));
        });
        return ret;
    }

    public static void main(String[] args) {
        List<ColumnLineageResult> spark = new ArrayList<>();
        List<ColumnLineageResult> antlr = new ArrayList<>();
        List<String> tmpList = Arrays.asList("ods.cbs_deposit_core_dc_deposit_acct_ss.main_acct_no", "ods.cbs_deposit_core_dc_main_acct_ss.main_acct_no", "ods.cbs_deposit_migration_dm_replay_serial_no_mapping_ss.src_serial_no", "ods.cbs_ensemble_level_mb_acct_ss.base_acct_no");
        ColumnLineageResult tmp = new ColumnLineageResult("deposit.dwd_deposit_acct_df.acct_no", tmpList);
        spark.add(tmp);
        List<String> tmpList1_1 = Arrays.asList("ods.cbs_deposit_core_dc_deposit_acct_ss.acct_status",
                "ods.cbs_deposit_core_dc_deposit_acct_ss.acct_status_last_date",
                "ods.cbs_deposit_core_dc_main_acct_ss.acct_status",
                "ods.cbs_ensemble_level_mb_acct_ss.acct_status",
                "ods.cbs_ensemble_level_mb_acct_ss.acct_status_prev");
        ColumnLineageResult tmp1_1 = new ColumnLineageResult("deposit.dwd_deposit_acct_df.acct_status", tmpList1_1);
        antlr.add(tmp1_1);
        List<String> tmpList1_2 = Arrays.asList("ods.cbs_deposit_core_common_dc_system_date_ss.last_run_date",
                "ods.cbs_deposit_core_dc_deposit_acct_ss.acct_status",
                "ods.cbs_deposit_core_dc_deposit_acct_ss.acct_status_last_date",
                "ods.cbs_deposit_core_dc_deposit_acct_ss.last_acct_status_change_date",
                "ods.cbs_deposit_core_dc_main_acct_ss.acct_status",
                "ods.cbs_ensemble_level_mb_acct_ss.acct_status",
                "ods.cbs_ensemble_level_mb_acct_ss.acct_status_prev",
                "ods.cbs_ensemble_level_mb_acct_ss.acct_status_upd_date",
                "ods.cbs_ensemble_upright_fm_system_ss.last_run_date");
        ColumnLineageResult tmp1_2 = new ColumnLineageResult("deposit.dwd_deposit_acct_df.acct_status", tmpList1_2);

        List<String> tmpList2_2 = Arrays.asList("ods.cbs_deposit_core_common_dc_system_date_ss.last_run_date",
                "ods.cbs_deposit_core_dc_deposit_acct_ss.acct_status",
                "ods.cbs_deposit_core_dc_deposit_acct_ss.acct_status_last_date",
                "ods.cbs_deposit_core_dc_deposit_acct_ss.last_acct_status_change_date",
                "ods.cbs_deposit_core_dc_main_acct_ss.acct_status",
                "ods.cbs_ensemble_level_mb_acct_ss.acct_status",
                "ods.cbs_ensemble_level_mb_acct_ss.acct_status_prev",
                "ods.cbs_ensemble_level_mb_acct_ss.acct_status_upd_date",
                "ods.cbs_ensemble_upright_fm_system_ss.last_run_date");
        ColumnLineageResult tmp2_2 = new ColumnLineageResult("deposit.dwd_deposit_acct_df.private_is_garena_employee", tmpList2_2);
        antlr.add(tmp2_2);

        spark.add(tmp1_2);

        List list = subtract(spark, antlr);
        List list1 = subtract(antlr, spark);
        System.out.println(list);
    }

    public static LineageResult score(LineageResult spark, LineageResult antlr, LineageResult gap) {
        LineageResult score = new LineageResult();
        score.setOutputTable(spark.getOutputTable());
        score.setInputTable(Stream.concat(spark.getInputTable().stream(),
                spark.getInputTable().stream())
                .distinct()
                .collect(Collectors.toList()));
        score.initTableScore(alignScore);

        if (CollectionUtils.isNotEmpty(gap.getInputTable())) {
            for (String str : gap.getInputTable()) {
                if (str.startsWith(sparkOnly)) {
                    str = str.replace(sparkOnly, "");
                    score.setInputTableScore(str, sparkScore);
                } else {
                    score.setInputTableScore(str, antlrScore);
                }
            }
        }

        Map<String, List<String>> gapMap = gap.getColumnLineages().stream().collect(Collectors.toMap(ColumnLineageResult::getColumnName, ColumnLineageResult::getOriginal));
        if (gapMap.size() == 0) {
            spark.setColumnLineages(spark.getColumnLineages().stream().map(o -> {
                o.setScore(alignScore);
                return o;
            }).collect(Collectors.toList()));
        } else {
            gapMap.forEach((k, v) -> {
                if (k.startsWith(antlrOnly)) {
                    for (ColumnLineageResult result : spark.getColumnLineages()) {
                        if (result.getColumnName().equals(k.replace(antlrOnly, ""))) {
                            result.getOriginal().addAll(v);
                            result.setScore(unalignedScore);
                        }
                    }
                } else {
                    for (ColumnLineageResult result : spark.getColumnLineages()) {
                        if (result.getColumnName().equals(k.replace(sparkOnly, ""))) {
                            result.setScore(unalignedScore);
                        }
                    }
                }
            });
        }

        score.setColumnLineages(spark.getColumnLineages().stream().map(o -> {
            if (0 == o.getScore()) {
                o.setScore(alignScore);
            }
            return o;
        }).collect(Collectors.toList()));
        score.setLimitRelation(antlr.getLimitRelation());
        score.setLimitations(spark.getLimitations());
        return score;
    }
}
