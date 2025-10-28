// Generated from /Users/wangliang/Documents/workspace/warehouse-metadata-npt/src/main/java/com/shopee/bank/common/hive/antlr/g4/Hplsql.g4 by ANTLR 4.9.2
package com.shopee.warehouse.sqlparser.engine.antlr.baseVisit;

import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HplsqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T_ACTION=4, T_ADD2=5, T_ALL=6, T_ALLOCATE=7, T_ALTER=8, 
		T_AND=9, T_ANSI_NULLS=10, T_ANSI_PADDING=11, T_AS=12, T_ASC=13, T_ASSOCIATE=14, 
		T_AT=15, T_AUTO_INCREMENT=16, T_AVG=17, T_BATCHSIZE=18, T_BEGIN=19, T_BETWEEN=20, 
		T_BIGINT=21, T_BINARY_DOUBLE=22, T_BINARY_FLOAT=23, T_BINARY_INTEGER=24, 
		T_BIT=25, T_BODY=26, T_BREAK=27, T_BULK=28, T_BY=29, T_BYTE=30, T_CALL=31, 
		T_CALLER=32, T_CASCADE=33, T_CASE=34, T_CASESPECIFIC=35, T_CAST=36, T_CHAR=37, 
		T_CHARACTER=38, T_CHARSET=39, T_CLIENT=40, T_CLOSE=41, T_CLUSTERED=42, 
		T_CMP=43, T_COLLECT=44, T_COLLECTION=45, T_COLUMN=46, T_COMMENT=47, T_CONSTANT=48, 
		T_COMMIT=49, T_COMPRESS=50, T_CONCAT=51, T_CONDITION=52, T_CONSTRAINT=53, 
		T_CONTINUE=54, T_COPY=55, T_COUNT=56, T_COUNT_BIG=57, T_CREATE=58, T_CREATION=59, 
		T_CREATOR=60, T_CROSS=61, T_CS=62, T_CURRENT=63, T_CURRENT_SCHEMA=64, 
		T_CURSOR=65, T_DATABASE=66, T_DATA=67, T_DATE=68, T_DATETIME=69, T_DAY=70, 
		T_DAYS=71, T_DEC=72, T_DECIMAL=73, T_DECLARE=74, T_DEFAULT=75, T_DEFERRED=76, 
		T_DEFINED=77, T_DEFINER=78, T_DEFINITION=79, T_DELETE=80, T_DELIMITED=81, 
		T_DELIMITER=82, T_DESC=83, T_DESCRIBE=84, T_DIAGNOSTICS=85, T_DIR=86, 
		T_DIRECTORY=87, T_DISTINCT=88, T_DISTRIBUTE=89, T_DO=90, T_DOUBLE=91, 
		T_DROP=92, T_DYNAMIC=93, T_ELSE=94, T_ELSEIF=95, T_ELSIF=96, T_ENABLE=97, 
		T_END=98, T_ENGINE=99, T_ESCAPED=100, T_EXCEPT=101, T_EXEC=102, T_EXECUTE=103, 
		T_EXCEPTION=104, T_EXCLUSIVE=105, T_EXISTS=106, T_EXIT=107, T_FALLBACK=108, 
		T_FALSE=109, T_FETCH=110, T_FIELDS=111, T_FILE=112, T_FILES=113, T_FLOAT=114, 
		T_FOR=115, T_FOREIGN=116, T_FORMAT=117, T_FOUND=118, T_FROM=119, T_FULL=120, 
		T_FUNCTION=121, T_GET=122, T_GLOBAL=123, T_GO=124, T_GRANT=125, T_GROUP=126, 
		T_GROUPING=127, T_HANDLER=128, T_HASH=129, T_HAVING=130, T_HDFS=131, T_HIVE=132, 
		T_HOST=133, T_IDENTITY=134, T_IF=135, T_IGNORE=136, T_IMMEDIATE=137, T_IN=138, 
		T_INCLUDE=139, T_INDEX=140, T_INITRANS=141, T_INNER=142, T_INOUT=143, 
		T_INSERT=144, T_INT=145, T_INT2=146, T_INT4=147, T_INT8=148, T_INTEGER=149, 
		T_INTERSECT=150, T_INTERVAL=151, T_INTO=152, T_INVOKER=153, T_IS=154, 
		T_ISOPEN=155, T_ITEMS=156, T_JOIN=157, T_SEMI=158, T_ANTI=159, T_KEEP=160, 
		T_KEY=161, T_KEYS=162, T_LANGUAGE=163, T_LEAVE=164, T_LEFT=165, T_LIKE=166, 
		T_LIMIT=167, T_LINES=168, T_LOCAL=169, T_LOCATION=170, T_LOCATOR=171, 
		T_LOCATORS=172, T_LOCKS=173, T_LOG=174, T_LOGGED=175, T_LOGGING=176, T_LOOP=177, 
		T_MAP=178, T_MATCHED=179, T_MAX=180, T_MAXTRANS=181, T_MERGE=182, T_MESSAGE_TEXT=183, 
		T_MICROSECOND=184, T_MICROSECONDS=185, T_MIN=186, T_MULTISET=187, T_NCHAR=188, 
		T_NEW=189, T_NVARCHAR=190, T_NO=191, T_NOCOUNT=192, T_NOCOMPRESS=193, 
		T_NOLOGGING=194, T_NONE=195, T_NOT=196, T_NOTFOUND=197, T_NULL=198, T_NUMERIC=199, 
		T_NUMBER=200, T_OBJECT=201, T_OFF=202, T_OF=203, T_ON=204, T_ONLY=205, 
		T_OPEN=206, T_OR=207, T_ORDER=208, T_OUT=209, T_OUTER=210, T_OVER=211, 
		T_OVERWRITE=212, T_OWNER=213, T_PACKAGE=214, T_PARTITION=215, T_PCTFREE=216, 
		T_PCTUSED=217, T_PLS_INTEGER=218, T_PRECISION=219, T_PRESERVE=220, T_PRIMARY=221, 
		T_PRINT=222, T_PROC=223, T_PROCEDURE=224, T_QUALIFY=225, T_QUERY_BAND=226, 
		T_QUIT=227, T_QUOTED_IDENTIFIER=228, T_RAISE=229, T_REAL=230, T_REFERENCES=231, 
		T_REGEXP=232, T_REPLACE=233, T_RESIGNAL=234, T_RESTRICT=235, T_RESULT=236, 
		T_RESULT_SET_LOCATOR=237, T_RETURN=238, T_RETURNS=239, T_REVERSE=240, 
		T_RIGHT=241, T_RLIKE=242, T_ROLE=243, T_ROLLBACK=244, T_ROW=245, T_ROWS=246, 
		T_ROWTYPE=247, T_ROW_COUNT=248, T_RR=249, T_RS=250, T_PWD=251, T_TRIM=252, 
		T_SCHEMA=253, T_SECOND=254, T_SECONDS=255, T_SECURITY=256, T_SEGMENT=257, 
		T_SEL=258, T_SELECT=259, T_SET=260, T_SESSION=261, T_SESSIONS=262, T_SETS=263, 
		T_SHARE=264, T_SIGNAL=265, T_SIMPLE_DOUBLE=266, T_SIMPLE_FLOAT=267, T_SIMPLE_INTEGER=268, 
		T_SMALLDATETIME=269, T_SMALLINT=270, T_SQL=271, T_SQLEXCEPTION=272, T_SQLINSERT=273, 
		T_SQLSTATE=274, T_SQLWARNING=275, T_STATS=276, T_STATISTICS=277, T_STEP=278, 
		T_STORAGE=279, T_STORED=280, T_STRING=281, T_SUBDIR=282, T_SUBSTRING=283, 
		T_SUM=284, T_SUMMARY=285, T_SYS_REFCURSOR=286, T_TABLE=287, T_TABLESPACE=288, 
		T_TEMPORARY=289, T_TERMINATED=290, T_TEXTIMAGE_ON=291, T_THEN=292, T_TIMESTAMP=293, 
		T_TINYINT=294, T_TITLE=295, T_TO=296, T_TOP=297, T_TRANSACTION=298, T_TRUE=299, 
		T_TRUNCATE=300, T_TYPE=301, T_UNION=302, T_UNIQUE=303, T_UPDATE=304, T_UR=305, 
		T_USE=306, T_USING=307, T_VALUE=308, T_VALUES=309, T_VAR=310, T_VARCHAR=311, 
		T_VARCHAR2=312, T_VARYING=313, T_VOLATILE=314, T_WHEN=315, T_WHERE=316, 
		T_WHILE=317, T_WITH=318, T_WITHOUT=319, T_WORK=320, T_XACT_ABORT=321, 
		T_XML=322, T_YES=323, T_UNBOUNDED=324, T_PRECEDING=325, T_FOLLOWING=326, 
		T_CUBE=327, T_ROLLUP=328, T_ACTIVITY_COUNT=329, T_CUME_DIST=330, T_CURRENT_DATE=331, 
		T_CURRENT_TIMESTAMP=332, T_CURRENT_USER=333, T_DENSE_RANK=334, T_FIRST_VALUE=335, 
		T_LAG=336, T_LAST_VALUE=337, T_LEAD=338, T_MAX_PART_STRING=339, T_MIN_PART_STRING=340, 
		T_MAX_PART_INT=341, T_MIN_PART_INT=342, T_MAX_PART_DATE=343, T_MIN_PART_DATE=344, 
		T_PART_COUNT=345, T_PART_LOC=346, T_RANK=347, T_ROW_NUMBER=348, T_COLLECT_LIST=349, 
		T_COLLECT_SET=350, T_STDEV=351, T_SYSDATE=352, T_VARIANCE=353, T_MAX_BY=354, 
		T_USER=355, T_WINDOW=356, T_LATERAL=357, T_VIEW=358, T_ADD=359, T_COLON=360, 
		T_COMMA=361, T_PIPE=362, T_DIV=363, T_DOT=364, T_DOT2=365, T_EQUAL=366, 
		T_EQUAL2=367, T_NOTEQUAL=368, T_NOTEQUAL2=369, T_GREATER=370, T_GREATEREQUAL=371, 
		T_LESS=372, T_LESSEQUAL=373, T_MUL=374, T_OPEN_B=375, T_OPEN_P=376, T_CLOSE_B=377, 
		T_CLOSE_P=378, T_OPEN_SB=379, T_CLOSE_SB=380, T_SEMICOLON=381, T_SUB=382, 
		T_MOD=383, L_ID=384, L_ALIAS=385, L_S_STRING=386, L_D_STRING=387, L_INT=388, 
		L_DEC=389, SIMPLE_COMMENT=390, BRACKETED_EMPTY_COMMENT=391, BRACKETED_COMMENT=392, 
		WS=393, L_FILE=394, L_LABEL=395, L_DIGIT_NAME=396, ANTI=397;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_begin_end_block = 2, RULE_single_block_stmt = 3, 
		RULE_block_end = 4, RULE_proc_block = 5, RULE_stmt = 6, RULE_semicolon_stmt = 7, 
		RULE_exception_block = 8, RULE_exception_block_item = 9, RULE_null_stmt = 10, 
		RULE_expr_stmt = 11, RULE_assignment_stmt = 12, RULE_assignment_stmt_item = 13, 
		RULE_assignment_stmt_single_item = 14, RULE_assignment_stmt_collection_item = 15, 
		RULE_assignment_stmt_multiple_item = 16, RULE_assignment_stmt_select_item = 17, 
		RULE_allocate_cursor_stmt = 18, RULE_associate_locator_stmt = 19, RULE_begin_transaction_stmt = 20, 
		RULE_break_stmt = 21, RULE_call_stmt = 22, RULE_declare_stmt = 23, RULE_declare_block = 24, 
		RULE_declare_block_inplace = 25, RULE_declare_stmt_item = 26, RULE_declare_var_item = 27, 
		RULE_declare_condition_item = 28, RULE_declare_cursor_item = 29, RULE_cursor_with_return = 30, 
		RULE_cursor_without_return = 31, RULE_declare_handler_item = 32, RULE_declare_temporary_table_item = 33, 
		RULE_create_table_stmt = 34, RULE_create_local_temp_table_stmt = 35, RULE_create_table_definition = 36, 
		RULE_create_table_columns = 37, RULE_create_table_columns_item = 38, RULE_create_table_type_stmt = 39, 
		RULE_tbl_type = 40, RULE_sql_type = 41, RULE_create_table_column_inline_cons = 42, 
		RULE_create_table_column_cons = 43, RULE_create_table_fk_action = 44, 
		RULE_create_table_preoptions = 45, RULE_create_table_preoptions_item = 46, 
		RULE_create_table_preoptions_td_item = 47, RULE_create_table_options = 48, 
		RULE_create_table_options_item = 49, RULE_create_table_options_ora_item = 50, 
		RULE_create_table_options_db2_item = 51, RULE_create_table_options_td_item = 52, 
		RULE_create_table_options_hive_item = 53, RULE_create_table_hive_row_format = 54, 
		RULE_create_table_hive_row_format_fields = 55, RULE_create_table_options_mssql_item = 56, 
		RULE_create_table_options_mysql_item = 57, RULE_alter_table_stmt = 58, 
		RULE_alter_table_item = 59, RULE_alter_table_add_constraint = 60, RULE_alter_table_add_constraint_item = 61, 
		RULE_dtype = 62, RULE_dtype_len = 63, RULE_dtype_attr = 64, RULE_dtype_default = 65, 
		RULE_create_database_stmt = 66, RULE_create_database_option = 67, RULE_create_function_stmt = 68, 
		RULE_create_function_return = 69, RULE_create_package_stmt = 70, RULE_package_spec = 71, 
		RULE_package_spec_item = 72, RULE_create_package_body_stmt = 73, RULE_package_body = 74, 
		RULE_package_body_item = 75, RULE_create_procedure_stmt = 76, RULE_create_routine_params = 77, 
		RULE_create_routine_param_item = 78, RULE_create_routine_options = 79, 
		RULE_create_routine_option = 80, RULE_drop_stmt = 81, RULE_end_transaction_stmt = 82, 
		RULE_exec_stmt = 83, RULE_if_stmt = 84, RULE_if_plsql_stmt = 85, RULE_if_tsql_stmt = 86, 
		RULE_if_bteq_stmt = 87, RULE_elseif_block = 88, RULE_else_block = 89, 
		RULE_include_stmt = 90, RULE_with_insert_stmt = 91, RULE_with_stmt = 92, 
		RULE_insert_stmt = 93, RULE_target_table = 94, RULE_target_table_or_partition = 95, 
		RULE_partition_desc = 96, RULE_partition_val = 97, RULE_insert_stmt_cols = 98, 
		RULE_insert_stmt_rows = 99, RULE_insert_stmt_row = 100, RULE_insert_directory_stmt = 101, 
		RULE_exit_stmt = 102, RULE_get_diag_stmt = 103, RULE_get_diag_stmt_item = 104, 
		RULE_get_diag_stmt_exception_item = 105, RULE_get_diag_stmt_rowcount_item = 106, 
		RULE_grant_stmt = 107, RULE_grant_stmt_item = 108, RULE_leave_stmt = 109, 
		RULE_map_object_stmt = 110, RULE_open_stmt = 111, RULE_fetch_stmt = 112, 
		RULE_fetch_limit = 113, RULE_collect_stats_stmt = 114, RULE_collect_stats_clause = 115, 
		RULE_close_stmt = 116, RULE_cmp_stmt = 117, RULE_cmp_source = 118, RULE_copy_from_local_stmt = 119, 
		RULE_copy_stmt = 120, RULE_copy_source = 121, RULE_copy_target = 122, 
		RULE_copy_option = 123, RULE_copy_file_option = 124, RULE_commit_stmt = 125, 
		RULE_create_index_stmt = 126, RULE_create_index_col = 127, RULE_index_storage_clause = 128, 
		RULE_index_mssql_storage_clause = 129, RULE_print_stmt = 130, RULE_quit_stmt = 131, 
		RULE_raise_stmt = 132, RULE_resignal_stmt = 133, RULE_return_stmt = 134, 
		RULE_rollback_stmt = 135, RULE_set_session_option = 136, RULE_set_current_schema_option = 137, 
		RULE_set_mssql_session_option = 138, RULE_set_teradata_session_option = 139, 
		RULE_signal_stmt = 140, RULE_summary_stmt = 141, RULE_truncate_stmt = 142, 
		RULE_use_stmt = 143, RULE_values_into_stmt = 144, RULE_while_stmt = 145, 
		RULE_unconditional_loop_stmt = 146, RULE_for_cursor_stmt = 147, RULE_for_range_stmt = 148, 
		RULE_label = 149, RULE_using_clause = 150, RULE_select_stmt = 151, RULE_cte_select_stmt = 152, 
		RULE_cte_select_stmt_item = 153, RULE_cte_select_cols = 154, RULE_fullselect_stmt = 155, 
		RULE_fullselect_stmt_item = 156, RULE_fullselect_set_clause = 157, RULE_subselect_stmt = 158, 
		RULE_windows = 159, RULE_namedWindow = 160, RULE_windowSpec = 161, RULE_select_list = 162, 
		RULE_select_list_set = 163, RULE_select_list_limit = 164, RULE_select_list_item = 165, 
		RULE_select_list_alias = 166, RULE_select_list_alias_name = 167, RULE_select_list_asterisk = 168, 
		RULE_table_row = 169, RULE_into_clause = 170, RULE_bulk_collect_clause = 171, 
		RULE_from_clause = 172, RULE_from_table_clause = 173, RULE_from_table_name_clause = 174, 
		RULE_from_subselect_clause = 175, RULE_from_join_clause = 176, RULE_cross_join_clause = 177, 
		RULE_from_join_type_clause = 178, RULE_from_table_values_clause = 179, 
		RULE_from_table_values_row = 180, RULE_from_alias_clause = 181, RULE_from_alias_clause_name = 182, 
		RULE_lateral_view = 183, RULE_table_name = 184, RULE_database_name = 185, 
		RULE_tbl_name = 186, RULE_column_name = 187, RULE_real_column_name = 188, 
		RULE_where_clause = 189, RULE_group_by_clause = 190, RULE_group_by_with = 191, 
		RULE_grouping_sets_clause = 192, RULE_grouping_sets_clause_item = 193, 
		RULE_having_clause = 194, RULE_qualify_clause = 195, RULE_order_by_clause = 196, 
		RULE_select_options = 197, RULE_select_options_item = 198, RULE_update_stmt = 199, 
		RULE_update_assignment = 200, RULE_update_table = 201, RULE_update_upsert = 202, 
		RULE_merge_stmt = 203, RULE_merge_table = 204, RULE_merge_condition = 205, 
		RULE_merge_action = 206, RULE_delete_stmt = 207, RULE_delete_alias = 208, 
		RULE_describe_stmt = 209, RULE_bool_expr = 210, RULE_bool_expr_atom = 211, 
		RULE_bool_expr_unary = 212, RULE_bool_expr_single_in = 213, RULE_bool_expr_multi_in = 214, 
		RULE_bool_expr_binary = 215, RULE_bool_expr_logical_operator = 216, RULE_bool_expr_binary_operator = 217, 
		RULE_expr = 218, RULE_expr_atom = 219, RULE_expr_interval = 220, RULE_interval_item = 221, 
		RULE_expr_concat = 222, RULE_expr_concat_item = 223, RULE_expr_case = 224, 
		RULE_expr_case_simple = 225, RULE_expr_case_searched = 226, RULE_expr_if = 227, 
		RULE_expr_cursor_attribute = 228, RULE_expr_agg_window_func = 229, RULE_expr_func_all_distinct = 230, 
		RULE_expr_func_over_clause = 231, RULE_rows_between_clause = 232, RULE_rows_between_clause_bound = 233, 
		RULE_expr_func_partition_by_clause = 234, RULE_expr_spec_func = 235, RULE_expr_func = 236, 
		RULE_expr_func_child = 237, RULE_expr_dot = 238, RULE_expr_dot_method_call = 239, 
		RULE_expr_dot_property_access = 240, RULE_expr_func_params = 241, RULE_func_param = 242, 
		RULE_expr_select = 243, RULE_expr_file = 244, RULE_hive = 245, RULE_hive_item = 246, 
		RULE_host = 247, RULE_host_cmd = 248, RULE_host_stmt = 249, RULE_file_name = 250, 
		RULE_date_literal = 251, RULE_timestamp_literal = 252, RULE_ident = 253, 
		RULE_qident = 254, RULE_string = 255, RULE_int_number = 256, RULE_dec_number = 257, 
		RULE_bool_literal = 258, RULE_null_const = 259, RULE_non_reserved_words = 260;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "begin_end_block", "single_block_stmt", "block_end", 
			"proc_block", "stmt", "semicolon_stmt", "exception_block", "exception_block_item", 
			"null_stmt", "expr_stmt", "assignment_stmt", "assignment_stmt_item", 
			"assignment_stmt_single_item", "assignment_stmt_collection_item", "assignment_stmt_multiple_item", 
			"assignment_stmt_select_item", "allocate_cursor_stmt", "associate_locator_stmt", 
			"begin_transaction_stmt", "break_stmt", "call_stmt", "declare_stmt", 
			"declare_block", "declare_block_inplace", "declare_stmt_item", "declare_var_item", 
			"declare_condition_item", "declare_cursor_item", "cursor_with_return", 
			"cursor_without_return", "declare_handler_item", "declare_temporary_table_item", 
			"create_table_stmt", "create_local_temp_table_stmt", "create_table_definition", 
			"create_table_columns", "create_table_columns_item", "create_table_type_stmt", 
			"tbl_type", "sql_type", "create_table_column_inline_cons", "create_table_column_cons", 
			"create_table_fk_action", "create_table_preoptions", "create_table_preoptions_item", 
			"create_table_preoptions_td_item", "create_table_options", "create_table_options_item", 
			"create_table_options_ora_item", "create_table_options_db2_item", "create_table_options_td_item", 
			"create_table_options_hive_item", "create_table_hive_row_format", "create_table_hive_row_format_fields", 
			"create_table_options_mssql_item", "create_table_options_mysql_item", 
			"alter_table_stmt", "alter_table_item", "alter_table_add_constraint", 
			"alter_table_add_constraint_item", "dtype", "dtype_len", "dtype_attr", 
			"dtype_default", "create_database_stmt", "create_database_option", "create_function_stmt", 
			"create_function_return", "create_package_stmt", "package_spec", "package_spec_item", 
			"create_package_body_stmt", "package_body", "package_body_item", "create_procedure_stmt", 
			"create_routine_params", "create_routine_param_item", "create_routine_options", 
			"create_routine_option", "drop_stmt", "end_transaction_stmt", "exec_stmt", 
			"if_stmt", "if_plsql_stmt", "if_tsql_stmt", "if_bteq_stmt", "elseif_block", 
			"else_block", "include_stmt", "with_insert_stmt", "with_stmt", "insert_stmt", 
			"target_table", "target_table_or_partition", "partition_desc", "partition_val", 
			"insert_stmt_cols", "insert_stmt_rows", "insert_stmt_row", "insert_directory_stmt", 
			"exit_stmt", "get_diag_stmt", "get_diag_stmt_item", "get_diag_stmt_exception_item", 
			"get_diag_stmt_rowcount_item", "grant_stmt", "grant_stmt_item", "leave_stmt", 
			"map_object_stmt", "open_stmt", "fetch_stmt", "fetch_limit", "collect_stats_stmt", 
			"collect_stats_clause", "close_stmt", "cmp_stmt", "cmp_source", "copy_from_local_stmt", 
			"copy_stmt", "copy_source", "copy_target", "copy_option", "copy_file_option", 
			"commit_stmt", "create_index_stmt", "create_index_col", "index_storage_clause", 
			"index_mssql_storage_clause", "print_stmt", "quit_stmt", "raise_stmt", 
			"resignal_stmt", "return_stmt", "rollback_stmt", "set_session_option", 
			"set_current_schema_option", "set_mssql_session_option", "set_teradata_session_option", 
			"signal_stmt", "summary_stmt", "truncate_stmt", "use_stmt", "values_into_stmt", 
			"while_stmt", "unconditional_loop_stmt", "for_cursor_stmt", "for_range_stmt", 
			"label", "using_clause", "select_stmt", "cte_select_stmt", "cte_select_stmt_item", 
			"cte_select_cols", "fullselect_stmt", "fullselect_stmt_item", "fullselect_set_clause", 
			"subselect_stmt", "windows", "namedWindow", "windowSpec", "select_list", 
			"select_list_set", "select_list_limit", "select_list_item", "select_list_alias", 
			"select_list_alias_name", "select_list_asterisk", "table_row", "into_clause", 
			"bulk_collect_clause", "from_clause", "from_table_clause", "from_table_name_clause", 
			"from_subselect_clause", "from_join_clause", "cross_join_clause", "from_join_type_clause", 
			"from_table_values_clause", "from_table_values_row", "from_alias_clause", 
			"from_alias_clause_name", "lateral_view", "table_name", "database_name", 
			"tbl_name", "column_name", "real_column_name", "where_clause", "group_by_clause", 
			"group_by_with", "grouping_sets_clause", "grouping_sets_clause_item", 
			"having_clause", "qualify_clause", "order_by_clause", "select_options", 
			"select_options_item", "update_stmt", "update_assignment", "update_table", 
			"update_upsert", "merge_stmt", "merge_table", "merge_condition", "merge_action", 
			"delete_stmt", "delete_alias", "describe_stmt", "bool_expr", "bool_expr_atom", 
			"bool_expr_unary", "bool_expr_single_in", "bool_expr_multi_in", "bool_expr_binary", 
			"bool_expr_logical_operator", "bool_expr_binary_operator", "expr", "expr_atom", 
			"expr_interval", "interval_item", "expr_concat", "expr_concat_item", 
			"expr_case", "expr_case_simple", "expr_case_searched", "expr_if", "expr_cursor_attribute", 
			"expr_agg_window_func", "expr_func_all_distinct", "expr_func_over_clause", 
			"rows_between_clause", "rows_between_clause_bound", "expr_func_partition_by_clause", 
			"expr_spec_func", "expr_func", "expr_func_child", "expr_dot", "expr_dot_method_call", 
			"expr_dot_property_access", "expr_func_params", "func_param", "expr_select", 
			"expr_file", "hive", "hive_item", "host", "host_cmd", "host_stmt", "file_name", 
			"date_literal", "timestamp_literal", "ident", "qident", "string", "int_number", 
			"dec_number", "bool_literal", "null_const", "non_reserved_words"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'#'", "'!'", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'+'", "':'", "','", "'||'", "'/'", "'.'", "'..'", "'='", "'=='", "'<>'", 
			"'!='", "'>'", "'>='", "'<'", "'<='", "'*'", "'{'", "'('", "'}'", "')'", 
			"'['", "']'", "';'", "'-'", "'%'", null, null, null, null, null, null, 
			null, "'/**/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "T_ACTION", "T_ADD2", "T_ALL", "T_ALLOCATE", 
			"T_ALTER", "T_AND", "T_ANSI_NULLS", "T_ANSI_PADDING", "T_AS", "T_ASC", 
			"T_ASSOCIATE", "T_AT", "T_AUTO_INCREMENT", "T_AVG", "T_BATCHSIZE", "T_BEGIN", 
			"T_BETWEEN", "T_BIGINT", "T_BINARY_DOUBLE", "T_BINARY_FLOAT", "T_BINARY_INTEGER", 
			"T_BIT", "T_BODY", "T_BREAK", "T_BULK", "T_BY", "T_BYTE", "T_CALL", "T_CALLER", 
			"T_CASCADE", "T_CASE", "T_CASESPECIFIC", "T_CAST", "T_CHAR", "T_CHARACTER", 
			"T_CHARSET", "T_CLIENT", "T_CLOSE", "T_CLUSTERED", "T_CMP", "T_COLLECT", 
			"T_COLLECTION", "T_COLUMN", "T_COMMENT", "T_CONSTANT", "T_COMMIT", "T_COMPRESS", 
			"T_CONCAT", "T_CONDITION", "T_CONSTRAINT", "T_CONTINUE", "T_COPY", "T_COUNT", 
			"T_COUNT_BIG", "T_CREATE", "T_CREATION", "T_CREATOR", "T_CROSS", "T_CS", 
			"T_CURRENT", "T_CURRENT_SCHEMA", "T_CURSOR", "T_DATABASE", "T_DATA", 
			"T_DATE", "T_DATETIME", "T_DAY", "T_DAYS", "T_DEC", "T_DECIMAL", "T_DECLARE", 
			"T_DEFAULT", "T_DEFERRED", "T_DEFINED", "T_DEFINER", "T_DEFINITION", 
			"T_DELETE", "T_DELIMITED", "T_DELIMITER", "T_DESC", "T_DESCRIBE", "T_DIAGNOSTICS", 
			"T_DIR", "T_DIRECTORY", "T_DISTINCT", "T_DISTRIBUTE", "T_DO", "T_DOUBLE", 
			"T_DROP", "T_DYNAMIC", "T_ELSE", "T_ELSEIF", "T_ELSIF", "T_ENABLE", "T_END", 
			"T_ENGINE", "T_ESCAPED", "T_EXCEPT", "T_EXEC", "T_EXECUTE", "T_EXCEPTION", 
			"T_EXCLUSIVE", "T_EXISTS", "T_EXIT", "T_FALLBACK", "T_FALSE", "T_FETCH", 
			"T_FIELDS", "T_FILE", "T_FILES", "T_FLOAT", "T_FOR", "T_FOREIGN", "T_FORMAT", 
			"T_FOUND", "T_FROM", "T_FULL", "T_FUNCTION", "T_GET", "T_GLOBAL", "T_GO", 
			"T_GRANT", "T_GROUP", "T_GROUPING", "T_HANDLER", "T_HASH", "T_HAVING", 
			"T_HDFS", "T_HIVE", "T_HOST", "T_IDENTITY", "T_IF", "T_IGNORE", "T_IMMEDIATE", 
			"T_IN", "T_INCLUDE", "T_INDEX", "T_INITRANS", "T_INNER", "T_INOUT", "T_INSERT", 
			"T_INT", "T_INT2", "T_INT4", "T_INT8", "T_INTEGER", "T_INTERSECT", "T_INTERVAL", 
			"T_INTO", "T_INVOKER", "T_IS", "T_ISOPEN", "T_ITEMS", "T_JOIN", "T_SEMI", 
			"T_ANTI", "T_KEEP", "T_KEY", "T_KEYS", "T_LANGUAGE", "T_LEAVE", "T_LEFT", 
			"T_LIKE", "T_LIMIT", "T_LINES", "T_LOCAL", "T_LOCATION", "T_LOCATOR", 
			"T_LOCATORS", "T_LOCKS", "T_LOG", "T_LOGGED", "T_LOGGING", "T_LOOP", 
			"T_MAP", "T_MATCHED", "T_MAX", "T_MAXTRANS", "T_MERGE", "T_MESSAGE_TEXT", 
			"T_MICROSECOND", "T_MICROSECONDS", "T_MIN", "T_MULTISET", "T_NCHAR", 
			"T_NEW", "T_NVARCHAR", "T_NO", "T_NOCOUNT", "T_NOCOMPRESS", "T_NOLOGGING", 
			"T_NONE", "T_NOT", "T_NOTFOUND", "T_NULL", "T_NUMERIC", "T_NUMBER", "T_OBJECT", 
			"T_OFF", "T_OF", "T_ON", "T_ONLY", "T_OPEN", "T_OR", "T_ORDER", "T_OUT", 
			"T_OUTER", "T_OVER", "T_OVERWRITE", "T_OWNER", "T_PACKAGE", "T_PARTITION", 
			"T_PCTFREE", "T_PCTUSED", "T_PLS_INTEGER", "T_PRECISION", "T_PRESERVE", 
			"T_PRIMARY", "T_PRINT", "T_PROC", "T_PROCEDURE", "T_QUALIFY", "T_QUERY_BAND", 
			"T_QUIT", "T_QUOTED_IDENTIFIER", "T_RAISE", "T_REAL", "T_REFERENCES", 
			"T_REGEXP", "T_REPLACE", "T_RESIGNAL", "T_RESTRICT", "T_RESULT", "T_RESULT_SET_LOCATOR", 
			"T_RETURN", "T_RETURNS", "T_REVERSE", "T_RIGHT", "T_RLIKE", "T_ROLE", 
			"T_ROLLBACK", "T_ROW", "T_ROWS", "T_ROWTYPE", "T_ROW_COUNT", "T_RR", 
			"T_RS", "T_PWD", "T_TRIM", "T_SCHEMA", "T_SECOND", "T_SECONDS", "T_SECURITY", 
			"T_SEGMENT", "T_SEL", "T_SELECT", "T_SET", "T_SESSION", "T_SESSIONS", 
			"T_SETS", "T_SHARE", "T_SIGNAL", "T_SIMPLE_DOUBLE", "T_SIMPLE_FLOAT", 
			"T_SIMPLE_INTEGER", "T_SMALLDATETIME", "T_SMALLINT", "T_SQL", "T_SQLEXCEPTION", 
			"T_SQLINSERT", "T_SQLSTATE", "T_SQLWARNING", "T_STATS", "T_STATISTICS", 
			"T_STEP", "T_STORAGE", "T_STORED", "T_STRING", "T_SUBDIR", "T_SUBSTRING", 
			"T_SUM", "T_SUMMARY", "T_SYS_REFCURSOR", "T_TABLE", "T_TABLESPACE", "T_TEMPORARY", 
			"T_TERMINATED", "T_TEXTIMAGE_ON", "T_THEN", "T_TIMESTAMP", "T_TINYINT", 
			"T_TITLE", "T_TO", "T_TOP", "T_TRANSACTION", "T_TRUE", "T_TRUNCATE", 
			"T_TYPE", "T_UNION", "T_UNIQUE", "T_UPDATE", "T_UR", "T_USE", "T_USING", 
			"T_VALUE", "T_VALUES", "T_VAR", "T_VARCHAR", "T_VARCHAR2", "T_VARYING", 
			"T_VOLATILE", "T_WHEN", "T_WHERE", "T_WHILE", "T_WITH", "T_WITHOUT", 
			"T_WORK", "T_XACT_ABORT", "T_XML", "T_YES", "T_UNBOUNDED", "T_PRECEDING", 
			"T_FOLLOWING", "T_CUBE", "T_ROLLUP", "T_ACTIVITY_COUNT", "T_CUME_DIST", 
			"T_CURRENT_DATE", "T_CURRENT_TIMESTAMP", "T_CURRENT_USER", "T_DENSE_RANK", 
			"T_FIRST_VALUE", "T_LAG", "T_LAST_VALUE", "T_LEAD", "T_MAX_PART_STRING", 
			"T_MIN_PART_STRING", "T_MAX_PART_INT", "T_MIN_PART_INT", "T_MAX_PART_DATE", 
			"T_MIN_PART_DATE", "T_PART_COUNT", "T_PART_LOC", "T_RANK", "T_ROW_NUMBER", 
			"T_COLLECT_LIST", "T_COLLECT_SET", "T_STDEV", "T_SYSDATE", "T_VARIANCE", 
			"T_MAX_BY", "T_USER", "T_WINDOW", "T_LATERAL", "T_VIEW", "T_ADD", "T_COLON", 
			"T_COMMA", "T_PIPE", "T_DIV", "T_DOT", "T_DOT2", "T_EQUAL", "T_EQUAL2", 
			"T_NOTEQUAL", "T_NOTEQUAL2", "T_GREATER", "T_GREATEREQUAL", "T_LESS", 
			"T_LESSEQUAL", "T_MUL", "T_OPEN_B", "T_OPEN_P", "T_CLOSE_B", "T_CLOSE_P", 
			"T_OPEN_SB", "T_CLOSE_SB", "T_SEMICOLON", "T_SUB", "T_MOD", "L_ID", "L_ALIAS", 
			"L_S_STRING", "L_D_STRING", "L_INT", "L_DEC", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", 
			"BRACKETED_COMMENT", "WS", "L_FILE", "L_LABEL", "L_DIGIT_NAME", "ANTI"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Hplsql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HplsqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HplsqlParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			block();
			setState(523);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<Begin_end_blockContext> begin_end_block() {
			return getRuleContexts(Begin_end_blockContext.class);
		}
		public Begin_end_blockContext begin_end_block(int i) {
			return getRuleContext(Begin_end_blockContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<TerminalNode> T_GO() { return getTokens(HplsqlParser.T_GO); }
		public TerminalNode T_GO(int i) {
			return getToken(HplsqlParser.T_GO, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(532); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(527);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(525);
						begin_end_block();
						}
						break;
					case 2:
						{
						setState(526);
						stmt();
						}
						break;
					}
					setState(530);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(529);
						match(T_GO);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(534); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Begin_end_blockContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(HplsqlParser.T_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public Declare_blockContext declare_block() {
			return getRuleContext(Declare_blockContext.class,0);
		}
		public Exception_blockContext exception_block() {
			return getRuleContext(Exception_blockContext.class,0);
		}
		public Begin_end_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_end_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBegin_end_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_end_blockContext begin_end_block() throws RecognitionException {
		Begin_end_blockContext _localctx = new Begin_end_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_begin_end_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_DECLARE) {
				{
				setState(536);
				declare_block();
				}
			}

			setState(539);
			match(T_BEGIN);
			setState(540);
			block();
			setState(542);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(541);
				exception_block();
				}
				break;
			}
			setState(544);
			block_end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_block_stmtContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(HplsqlParser.T_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public Exception_blockContext exception_block() {
			return getRuleContext(Exception_blockContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public Single_block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_block_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSingle_block_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_block_stmtContext single_block_stmt() throws RecognitionException {
		Single_block_stmtContext _localctx = new Single_block_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_single_block_stmt);
		try {
			setState(557);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(546);
				match(T_BEGIN);
				setState(547);
				block();
				setState(549);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(548);
					exception_block();
					}
					break;
				}
				setState(551);
				block_end();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(553);
				stmt();
				setState(555);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(554);
					match(T_SEMICOLON);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_endContext extends ParserRuleContext {
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public Block_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_end; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBlock_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_endContext block_end() throws RecognitionException {
		Block_endContext _localctx = new Block_endContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			if (!(!_input.LT(2).getText().equalsIgnoreCase("TRANSACTION"))) throw new FailedPredicateException(this, "!_input.LT(2).getText().equalsIgnoreCase(\"TRANSACTION\")");
			setState(560);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Proc_blockContext extends ParserRuleContext {
		public Begin_end_blockContext begin_end_block() {
			return getRuleContext(Begin_end_blockContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode T_GO() { return getToken(HplsqlParser.T_GO, 0); }
		public Proc_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitProc_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_blockContext proc_block() throws RecognitionException {
		Proc_blockContext _localctx = new Proc_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_proc_block);
		try {
			int _alt;
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				begin_end_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(564);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(563);
						stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(566);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(569);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(568);
					match(T_GO);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public Assignment_stmtContext assignment_stmt() {
			return getRuleContext(Assignment_stmtContext.class,0);
		}
		public Allocate_cursor_stmtContext allocate_cursor_stmt() {
			return getRuleContext(Allocate_cursor_stmtContext.class,0);
		}
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Associate_locator_stmtContext associate_locator_stmt() {
			return getRuleContext(Associate_locator_stmtContext.class,0);
		}
		public Begin_transaction_stmtContext begin_transaction_stmt() {
			return getRuleContext(Begin_transaction_stmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Call_stmtContext call_stmt() {
			return getRuleContext(Call_stmtContext.class,0);
		}
		public Collect_stats_stmtContext collect_stats_stmt() {
			return getRuleContext(Collect_stats_stmtContext.class,0);
		}
		public Close_stmtContext close_stmt() {
			return getRuleContext(Close_stmtContext.class,0);
		}
		public Cmp_stmtContext cmp_stmt() {
			return getRuleContext(Cmp_stmtContext.class,0);
		}
		public Copy_from_local_stmtContext copy_from_local_stmt() {
			return getRuleContext(Copy_from_local_stmtContext.class,0);
		}
		public Copy_stmtContext copy_stmt() {
			return getRuleContext(Copy_stmtContext.class,0);
		}
		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class,0);
		}
		public Create_database_stmtContext create_database_stmt() {
			return getRuleContext(Create_database_stmtContext.class,0);
		}
		public Create_function_stmtContext create_function_stmt() {
			return getRuleContext(Create_function_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_local_temp_table_stmtContext create_local_temp_table_stmt() {
			return getRuleContext(Create_local_temp_table_stmtContext.class,0);
		}
		public Create_package_stmtContext create_package_stmt() {
			return getRuleContext(Create_package_stmtContext.class,0);
		}
		public Create_package_body_stmtContext create_package_body_stmt() {
			return getRuleContext(Create_package_body_stmtContext.class,0);
		}
		public Create_procedure_stmtContext create_procedure_stmt() {
			return getRuleContext(Create_procedure_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_table_type_stmtContext create_table_type_stmt() {
			return getRuleContext(Create_table_type_stmtContext.class,0);
		}
		public Declare_stmtContext declare_stmt() {
			return getRuleContext(Declare_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Describe_stmtContext describe_stmt() {
			return getRuleContext(Describe_stmtContext.class,0);
		}
		public Drop_stmtContext drop_stmt() {
			return getRuleContext(Drop_stmtContext.class,0);
		}
		public End_transaction_stmtContext end_transaction_stmt() {
			return getRuleContext(End_transaction_stmtContext.class,0);
		}
		public Exec_stmtContext exec_stmt() {
			return getRuleContext(Exec_stmtContext.class,0);
		}
		public Exit_stmtContext exit_stmt() {
			return getRuleContext(Exit_stmtContext.class,0);
		}
		public Fetch_stmtContext fetch_stmt() {
			return getRuleContext(Fetch_stmtContext.class,0);
		}
		public For_cursor_stmtContext for_cursor_stmt() {
			return getRuleContext(For_cursor_stmtContext.class,0);
		}
		public For_range_stmtContext for_range_stmt() {
			return getRuleContext(For_range_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public Include_stmtContext include_stmt() {
			return getRuleContext(Include_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public With_insert_stmtContext with_insert_stmt() {
			return getRuleContext(With_insert_stmtContext.class,0);
		}
		public Insert_directory_stmtContext insert_directory_stmt() {
			return getRuleContext(Insert_directory_stmtContext.class,0);
		}
		public Get_diag_stmtContext get_diag_stmt() {
			return getRuleContext(Get_diag_stmtContext.class,0);
		}
		public Grant_stmtContext grant_stmt() {
			return getRuleContext(Grant_stmtContext.class,0);
		}
		public Leave_stmtContext leave_stmt() {
			return getRuleContext(Leave_stmtContext.class,0);
		}
		public Map_object_stmtContext map_object_stmt() {
			return getRuleContext(Map_object_stmtContext.class,0);
		}
		public Merge_stmtContext merge_stmt() {
			return getRuleContext(Merge_stmtContext.class,0);
		}
		public Open_stmtContext open_stmt() {
			return getRuleContext(Open_stmtContext.class,0);
		}
		public Print_stmtContext print_stmt() {
			return getRuleContext(Print_stmtContext.class,0);
		}
		public Quit_stmtContext quit_stmt() {
			return getRuleContext(Quit_stmtContext.class,0);
		}
		public Raise_stmtContext raise_stmt() {
			return getRuleContext(Raise_stmtContext.class,0);
		}
		public Resignal_stmtContext resignal_stmt() {
			return getRuleContext(Resignal_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Rollback_stmtContext rollback_stmt() {
			return getRuleContext(Rollback_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Signal_stmtContext signal_stmt() {
			return getRuleContext(Signal_stmtContext.class,0);
		}
		public Summary_stmtContext summary_stmt() {
			return getRuleContext(Summary_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Use_stmtContext use_stmt() {
			return getRuleContext(Use_stmtContext.class,0);
		}
		public Truncate_stmtContext truncate_stmt() {
			return getRuleContext(Truncate_stmtContext.class,0);
		}
		public Values_into_stmtContext values_into_stmt() {
			return getRuleContext(Values_into_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Unconditional_loop_stmtContext unconditional_loop_stmt() {
			return getRuleContext(Unconditional_loop_stmtContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public HiveContext hive() {
			return getRuleContext(HiveContext.class,0);
		}
		public HostContext host() {
			return getRuleContext(HostContext.class,0);
		}
		public Null_stmtContext null_stmt() {
			return getRuleContext(Null_stmtContext.class,0);
		}
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Semicolon_stmtContext semicolon_stmt() {
			return getRuleContext(Semicolon_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		try {
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				assignment_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(574);
				allocate_cursor_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(575);
				alter_table_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(576);
				associate_locator_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(577);
				begin_transaction_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(578);
				break_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(579);
				call_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(580);
				collect_stats_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(581);
				close_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(582);
				cmp_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(583);
				copy_from_local_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(584);
				copy_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(585);
				commit_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(586);
				create_database_stmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(587);
				create_function_stmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(588);
				create_index_stmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(589);
				create_local_temp_table_stmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(590);
				create_package_stmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(591);
				create_package_body_stmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(592);
				create_procedure_stmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(593);
				create_table_stmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(594);
				create_table_type_stmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(595);
				declare_stmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(596);
				delete_stmt();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(597);
				describe_stmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(598);
				drop_stmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(599);
				end_transaction_stmt();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(600);
				exec_stmt();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(601);
				exit_stmt();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(602);
				fetch_stmt();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(603);
				for_cursor_stmt();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(604);
				for_range_stmt();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(605);
				if_stmt();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(606);
				include_stmt();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(607);
				insert_stmt();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(608);
				with_insert_stmt();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(609);
				insert_directory_stmt();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(610);
				get_diag_stmt();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(611);
				grant_stmt();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(612);
				leave_stmt();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(613);
				map_object_stmt();
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(614);
				merge_stmt();
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(615);
				open_stmt();
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(616);
				print_stmt();
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(617);
				quit_stmt();
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(618);
				raise_stmt();
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(619);
				resignal_stmt();
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(620);
				return_stmt();
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 49);
				{
				setState(621);
				rollback_stmt();
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 50);
				{
				setState(622);
				select_stmt();
				}
				break;
			case 51:
				enterOuterAlt(_localctx, 51);
				{
				setState(623);
				signal_stmt();
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 52);
				{
				setState(624);
				summary_stmt();
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 53);
				{
				setState(625);
				update_stmt();
				}
				break;
			case 54:
				enterOuterAlt(_localctx, 54);
				{
				setState(626);
				use_stmt();
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 55);
				{
				setState(627);
				truncate_stmt();
				}
				break;
			case 56:
				enterOuterAlt(_localctx, 56);
				{
				setState(628);
				values_into_stmt();
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 57);
				{
				setState(629);
				while_stmt();
				}
				break;
			case 58:
				enterOuterAlt(_localctx, 58);
				{
				setState(630);
				unconditional_loop_stmt();
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 59);
				{
				setState(631);
				label();
				}
				break;
			case 60:
				enterOuterAlt(_localctx, 60);
				{
				setState(632);
				hive();
				}
				break;
			case 61:
				enterOuterAlt(_localctx, 61);
				{
				setState(633);
				host();
				}
				break;
			case 62:
				enterOuterAlt(_localctx, 62);
				{
				setState(634);
				null_stmt();
				}
				break;
			case 63:
				enterOuterAlt(_localctx, 63);
				{
				setState(635);
				expr_stmt();
				}
				break;
			case 64:
				enterOuterAlt(_localctx, 64);
				{
				setState(636);
				semicolon_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Semicolon_stmtContext extends ParserRuleContext {
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public TerminalNode T_DIV() { return getToken(HplsqlParser.T_DIV, 0); }
		public Semicolon_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSemicolon_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Semicolon_stmtContext semicolon_stmt() throws RecognitionException {
		Semicolon_stmtContext _localctx = new Semicolon_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_semicolon_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1 || _la==T_DIV || _la==T_SEMICOLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exception_blockContext extends ParserRuleContext {
		public TerminalNode T_EXCEPTION() { return getToken(HplsqlParser.T_EXCEPTION, 0); }
		public List<Exception_block_itemContext> exception_block_item() {
			return getRuleContexts(Exception_block_itemContext.class);
		}
		public Exception_block_itemContext exception_block_item(int i) {
			return getRuleContext(Exception_block_itemContext.class,i);
		}
		public Exception_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitException_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_blockContext exception_block() throws RecognitionException {
		Exception_blockContext _localctx = new Exception_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exception_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(T_EXCEPTION);
			setState(643);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(642);
					exception_block_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(645);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exception_block_itemContext extends ParserRuleContext {
		public List<TerminalNode> T_WHEN() { return getTokens(HplsqlParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(HplsqlParser.T_WHEN, i);
		}
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public Exception_block_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception_block_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitException_block_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exception_block_itemContext exception_block_item() throws RecognitionException {
		Exception_block_itemContext _localctx = new Exception_block_itemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exception_block_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(T_WHEN);
			setState(648);
			match(L_ID);
			setState(649);
			match(T_THEN);
			setState(650);
			block();
			setState(651);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T_END || _la==T_WHEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_stmtContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public Null_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitNull_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_stmtContext null_stmt() throws RecognitionException {
		Null_stmtContext _localctx = new Null_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_null_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(T_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("GO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"GO\")");
			setState(656);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmtContext extends ParserRuleContext {
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public Set_session_optionContext set_session_option() {
			return getRuleContext(Set_session_optionContext.class,0);
		}
		public List<Assignment_stmt_itemContext> assignment_stmt_item() {
			return getRuleContexts(Assignment_stmt_itemContext.class);
		}
		public Assignment_stmt_itemContext assignment_stmt_item(int i) {
			return getRuleContext(Assignment_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitAssignment_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmtContext assignment_stmt() throws RecognitionException {
		Assignment_stmtContext _localctx = new Assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment_stmt);
		try {
			int _alt;
			setState(671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				match(T_SET);
				setState(659);
				set_session_option();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(660);
					match(T_SET);
					}
					break;
				}
				setState(663);
				assignment_stmt_item();
				setState(668);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(664);
						match(T_COMMA);
						setState(665);
						assignment_stmt_item();
						}
						}
					}
					setState(670);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_itemContext extends ParserRuleContext {
		public Assignment_stmt_single_itemContext assignment_stmt_single_item() {
			return getRuleContext(Assignment_stmt_single_itemContext.class,0);
		}
		public Assignment_stmt_multiple_itemContext assignment_stmt_multiple_item() {
			return getRuleContext(Assignment_stmt_multiple_itemContext.class,0);
		}
		public Assignment_stmt_select_itemContext assignment_stmt_select_item() {
			return getRuleContext(Assignment_stmt_select_itemContext.class,0);
		}
		public Assignment_stmt_collection_itemContext assignment_stmt_collection_item() {
			return getRuleContext(Assignment_stmt_collection_itemContext.class,0);
		}
		public Assignment_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitAssignment_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_itemContext assignment_stmt_item() throws RecognitionException {
		Assignment_stmt_itemContext _localctx = new Assignment_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment_stmt_item);
		try {
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				assignment_stmt_single_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				assignment_stmt_multiple_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(675);
				assignment_stmt_select_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(676);
				assignment_stmt_collection_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_single_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COLON() { return getToken(HplsqlParser.T_COLON, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Assignment_stmt_single_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_single_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitAssignment_stmt_single_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_single_itemContext assignment_stmt_single_item() throws RecognitionException {
		Assignment_stmt_single_itemContext _localctx = new Assignment_stmt_single_itemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment_stmt_single_item);
		int _la;
		try {
			setState(695);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BULK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LIKE:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_TYPE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_SUB:
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(679);
				ident();
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(680);
					match(T_COLON);
					}
				}

				setState(683);
				match(T_EQUAL);
				setState(684);
				expr(0);
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(686);
				match(T_OPEN_P);
				setState(687);
				ident();
				setState(688);
				match(T_CLOSE_P);
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(689);
					match(T_COLON);
					}
				}

				setState(692);
				match(T_EQUAL);
				setState(693);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_collection_itemContext extends ParserRuleContext {
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public TerminalNode T_COLON() { return getToken(HplsqlParser.T_COLON, 0); }
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assignment_stmt_collection_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_collection_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitAssignment_stmt_collection_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_collection_itemContext assignment_stmt_collection_item() throws RecognitionException {
		Assignment_stmt_collection_itemContext _localctx = new Assignment_stmt_collection_itemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment_stmt_collection_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			expr_func();
			setState(698);
			match(T_COLON);
			setState(699);
			match(T_EQUAL);
			setState(700);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_multiple_itemContext extends ParserRuleContext {
		public List<TerminalNode> T_OPEN_P() { return getTokens(HplsqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HplsqlParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HplsqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HplsqlParser.T_CLOSE_P, i);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_COLON() { return getToken(HplsqlParser.T_COLON, 0); }
		public Assignment_stmt_multiple_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_multiple_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitAssignment_stmt_multiple_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_multiple_itemContext assignment_stmt_multiple_item() throws RecognitionException {
		Assignment_stmt_multiple_itemContext _localctx = new Assignment_stmt_multiple_itemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment_stmt_multiple_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			match(T_OPEN_P);
			setState(703);
			ident();
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(704);
				match(T_COMMA);
				setState(705);
				ident();
				}
				}
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(711);
			match(T_CLOSE_P);
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(712);
				match(T_COLON);
				}
			}

			setState(715);
			match(T_EQUAL);
			setState(716);
			match(T_OPEN_P);
			setState(717);
			expr(0);
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(718);
				match(T_COMMA);
				setState(719);
				expr(0);
				}
				}
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(725);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_select_itemContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(HplsqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HplsqlParser.T_OPEN_P, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HplsqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HplsqlParser.T_CLOSE_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_COLON() { return getToken(HplsqlParser.T_COLON, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Assignment_stmt_select_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_select_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitAssignment_stmt_select_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_select_itemContext assignment_stmt_select_item() throws RecognitionException {
		Assignment_stmt_select_itemContext _localctx = new Assignment_stmt_select_itemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignment_stmt_select_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BULK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LIKE:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_TYPE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_SUB:
			case L_ID:
				{
				setState(727);
				ident();
				}
				break;
			case T_OPEN_P:
				{
				{
				setState(728);
				match(T_OPEN_P);
				setState(729);
				ident();
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(730);
					match(T_COMMA);
					setState(731);
					ident();
					}
					}
					setState(736);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(737);
				match(T_CLOSE_P);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(741);
				match(T_COLON);
				}
			}

			setState(744);
			match(T_EQUAL);
			setState(745);
			match(T_OPEN_P);
			setState(746);
			select_stmt();
			setState(747);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Allocate_cursor_stmtContext extends ParserRuleContext {
		public TerminalNode T_ALLOCATE() { return getToken(HplsqlParser.T_ALLOCATE, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CURSOR() { return getToken(HplsqlParser.T_CURSOR, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(HplsqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_RESULT() { return getToken(HplsqlParser.T_RESULT, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public Allocate_cursor_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocate_cursor_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitAllocate_cursor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Allocate_cursor_stmtContext allocate_cursor_stmt() throws RecognitionException {
		Allocate_cursor_stmtContext _localctx = new Allocate_cursor_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_allocate_cursor_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(T_ALLOCATE);
			setState(750);
			ident();
			setState(751);
			match(T_CURSOR);
			setState(752);
			match(T_FOR);
			setState(756);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_RESULT:
				{
				{
				setState(753);
				match(T_RESULT);
				setState(754);
				match(T_SET);
				}
				}
				break;
			case T_PROCEDURE:
				{
				setState(755);
				match(T_PROCEDURE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(758);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Associate_locator_stmtContext extends ParserRuleContext {
		public TerminalNode T_ASSOCIATE() { return getToken(HplsqlParser.T_ASSOCIATE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(HplsqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_LOCATOR() { return getToken(HplsqlParser.T_LOCATOR, 0); }
		public TerminalNode T_LOCATORS() { return getToken(HplsqlParser.T_LOCATORS, 0); }
		public TerminalNode T_RESULT() { return getToken(HplsqlParser.T_RESULT, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Associate_locator_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associate_locator_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitAssociate_locator_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Associate_locator_stmtContext associate_locator_stmt() throws RecognitionException {
		Associate_locator_stmtContext _localctx = new Associate_locator_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_associate_locator_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			match(T_ASSOCIATE);
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_RESULT) {
				{
				setState(761);
				match(T_RESULT);
				setState(762);
				match(T_SET);
				}
			}

			setState(765);
			_la = _input.LA(1);
			if ( !(_la==T_LOCATOR || _la==T_LOCATORS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(766);
			match(T_OPEN_P);
			setState(767);
			ident();
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(768);
				match(T_COMMA);
				setState(769);
				ident();
				}
				}
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(775);
			match(T_CLOSE_P);
			setState(776);
			match(T_WITH);
			setState(777);
			match(T_PROCEDURE);
			setState(778);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Begin_transaction_stmtContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(HplsqlParser.T_BEGIN, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(HplsqlParser.T_TRANSACTION, 0); }
		public Begin_transaction_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_transaction_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBegin_transaction_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_transaction_stmtContext begin_transaction_stmt() throws RecognitionException {
		Begin_transaction_stmtContext _localctx = new Begin_transaction_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_begin_transaction_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(T_BEGIN);
			setState(781);
			match(T_TRANSACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Break_stmtContext extends ParserRuleContext {
		public TerminalNode T_BREAK() { return getToken(HplsqlParser.T_BREAK, 0); }
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(T_BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_stmtContext extends ParserRuleContext {
		public TerminalNode T_CALL() { return getToken(HplsqlParser.T_CALL, 0); }
		public Expr_dotContext expr_dot() {
			return getRuleContext(Expr_dotContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Call_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCall_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_stmtContext call_stmt() throws RecognitionException {
		Call_stmtContext _localctx = new Call_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_call_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(T_CALL);
			setState(789);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(786);
				expr_dot();
				}
				break;
			case 2:
				{
				setState(787);
				expr_func();
				}
				break;
			case 3:
				{
				setState(788);
				ident();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_stmtContext extends ParserRuleContext {
		public TerminalNode T_DECLARE() { return getToken(HplsqlParser.T_DECLARE, 0); }
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Declare_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_stmtContext declare_stmt() throws RecognitionException {
		Declare_stmtContext _localctx = new Declare_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declare_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(T_DECLARE);
			setState(792);
			declare_stmt_item();
			setState(797);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(793);
					match(T_COMMA);
					setState(794);
					declare_stmt_item();
					}
					}
				}
				setState(799);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_blockContext extends ParserRuleContext {
		public TerminalNode T_DECLARE() { return getToken(HplsqlParser.T_DECLARE, 0); }
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HplsqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HplsqlParser.T_SEMICOLON, i);
		}
		public Declare_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_blockContext declare_block() throws RecognitionException {
		Declare_blockContext _localctx = new Declare_blockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_declare_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(T_DECLARE);
			setState(801);
			declare_stmt_item();
			setState(802);
			match(T_SEMICOLON);
			setState(808);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(803);
					declare_stmt_item();
					setState(804);
					match(T_SEMICOLON);
					}
					}
				}
				setState(810);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_block_inplaceContext extends ParserRuleContext {
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HplsqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HplsqlParser.T_SEMICOLON, i);
		}
		public Declare_block_inplaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_block_inplace; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_block_inplace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_block_inplaceContext declare_block_inplace() throws RecognitionException {
		Declare_block_inplaceContext _localctx = new Declare_block_inplaceContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declare_block_inplace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			declare_stmt_item();
			setState(812);
			match(T_SEMICOLON);
			setState(818);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(813);
					declare_stmt_item();
					setState(814);
					match(T_SEMICOLON);
					}
					}
				}
				setState(820);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_stmt_itemContext extends ParserRuleContext {
		public Declare_cursor_itemContext declare_cursor_item() {
			return getRuleContext(Declare_cursor_itemContext.class,0);
		}
		public Declare_condition_itemContext declare_condition_item() {
			return getRuleContext(Declare_condition_itemContext.class,0);
		}
		public Declare_handler_itemContext declare_handler_item() {
			return getRuleContext(Declare_handler_itemContext.class,0);
		}
		public Declare_var_itemContext declare_var_item() {
			return getRuleContext(Declare_var_itemContext.class,0);
		}
		public Declare_temporary_table_itemContext declare_temporary_table_item() {
			return getRuleContext(Declare_temporary_table_itemContext.class,0);
		}
		public Declare_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stmt_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_stmt_itemContext declare_stmt_item() throws RecognitionException {
		Declare_stmt_itemContext _localctx = new Declare_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_declare_stmt_item);
		try {
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(821);
				declare_cursor_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(822);
				declare_condition_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(823);
				declare_handler_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(824);
				declare_var_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(825);
				declare_temporary_table_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_var_itemContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public TerminalNode T_CONSTANT() { return getToken(HplsqlParser.T_CONSTANT, 0); }
		public Declare_var_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_var_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_var_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_var_itemContext declare_var_item() throws RecognitionException {
		Declare_var_itemContext _localctx = new Declare_var_itemContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declare_var_item);
		int _la;
		try {
			int _alt;
			setState(863);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(828);
				ident();
				setState(833);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(829);
					match(T_COMMA);
					setState(830);
					ident();
					}
					}
					setState(835);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(837);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(836);
					match(T_AS);
					}
					break;
				}
				setState(839);
				dtype();
				setState(841);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(840);
					dtype_len();
					}
					break;
				}
				setState(846);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(843);
						dtype_attr();
						}
						}
					}
					setState(848);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(850);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(849);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(852);
				ident();
				setState(853);
				match(T_CONSTANT);
				setState(855);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(854);
					match(T_AS);
					}
					break;
				}
				setState(857);
				dtype();
				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(858);
					dtype_len();
					}
				}

				setState(861);
				dtype_default();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_condition_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CONDITION() { return getToken(HplsqlParser.T_CONDITION, 0); }
		public Declare_condition_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_condition_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_condition_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_condition_itemContext declare_condition_item() throws RecognitionException {
		Declare_condition_itemContext _localctx = new Declare_condition_itemContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_declare_condition_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			ident();
			setState(866);
			match(T_CONDITION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_cursor_itemContext extends ParserRuleContext {
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode T_CURSOR() { return getToken(HplsqlParser.T_CURSOR, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Cursor_with_returnContext cursor_with_return() {
			return getRuleContext(Cursor_with_returnContext.class,0);
		}
		public Cursor_without_returnContext cursor_without_return() {
			return getRuleContext(Cursor_without_returnContext.class,0);
		}
		public Declare_cursor_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_cursor_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_cursor_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_cursor_itemContext declare_cursor_item() throws RecognitionException {
		Declare_cursor_itemContext _localctx = new Declare_cursor_itemContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_declare_cursor_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(868);
				match(T_CURSOR);
				setState(869);
				ident();
				}
				break;
			case 2:
				{
				setState(870);
				ident();
				setState(871);
				match(T_CURSOR);
				}
				break;
			}
			setState(877);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_WITH:
				{
				setState(875);
				cursor_with_return();
				}
				break;
			case T_WITHOUT:
				{
				setState(876);
				cursor_without_return();
				}
				break;
			case T_AS:
			case T_FOR:
			case T_IS:
				break;
			default:
				break;
			}
			setState(879);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_FOR || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(880);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(881);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_with_returnContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_RETURN() { return getToken(HplsqlParser.T_RETURN, 0); }
		public TerminalNode T_ONLY() { return getToken(HplsqlParser.T_ONLY, 0); }
		public TerminalNode T_TO() { return getToken(HplsqlParser.T_TO, 0); }
		public TerminalNode T_CALLER() { return getToken(HplsqlParser.T_CALLER, 0); }
		public TerminalNode T_CLIENT() { return getToken(HplsqlParser.T_CLIENT, 0); }
		public Cursor_with_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_with_return; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCursor_with_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_with_returnContext cursor_with_return() throws RecognitionException {
		Cursor_with_returnContext _localctx = new Cursor_with_returnContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cursor_with_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(T_WITH);
			setState(885);
			match(T_RETURN);
			setState(887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ONLY) {
				{
				setState(886);
				match(T_ONLY);
				}
			}

			setState(891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_TO) {
				{
				setState(889);
				match(T_TO);
				setState(890);
				_la = _input.LA(1);
				if ( !(_la==T_CALLER || _la==T_CLIENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_without_returnContext extends ParserRuleContext {
		public TerminalNode T_WITHOUT() { return getToken(HplsqlParser.T_WITHOUT, 0); }
		public TerminalNode T_RETURN() { return getToken(HplsqlParser.T_RETURN, 0); }
		public Cursor_without_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_without_return; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCursor_without_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_without_returnContext cursor_without_return() throws RecognitionException {
		Cursor_without_returnContext _localctx = new Cursor_without_returnContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_cursor_without_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			match(T_WITHOUT);
			setState(894);
			match(T_RETURN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_handler_itemContext extends ParserRuleContext {
		public TerminalNode T_HANDLER() { return getToken(HplsqlParser.T_HANDLER, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public TerminalNode T_CONTINUE() { return getToken(HplsqlParser.T_CONTINUE, 0); }
		public TerminalNode T_EXIT() { return getToken(HplsqlParser.T_EXIT, 0); }
		public TerminalNode T_SQLEXCEPTION() { return getToken(HplsqlParser.T_SQLEXCEPTION, 0); }
		public TerminalNode T_SQLWARNING() { return getToken(HplsqlParser.T_SQLWARNING, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_FOUND() { return getToken(HplsqlParser.T_FOUND, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Declare_handler_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_handler_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_handler_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_handler_itemContext declare_handler_item() throws RecognitionException {
		Declare_handler_itemContext _localctx = new Declare_handler_itemContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_declare_handler_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			_la = _input.LA(1);
			if ( !(_la==T_CONTINUE || _la==T_EXIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(897);
			match(T_HANDLER);
			setState(898);
			match(T_FOR);
			setState(904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(899);
				match(T_SQLEXCEPTION);
				}
				break;
			case 2:
				{
				setState(900);
				match(T_SQLWARNING);
				}
				break;
			case 3:
				{
				setState(901);
				match(T_NOT);
				setState(902);
				match(T_FOUND);
				}
				break;
			case 4:
				{
				setState(903);
				ident();
				}
				break;
			}
			setState(906);
			single_block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_temporary_table_itemContext extends ParserRuleContext {
		public TerminalNode T_TEMPORARY() { return getToken(HplsqlParser.T_TEMPORARY, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public QidentContext qident() {
			return getRuleContext(QidentContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_GLOBAL() { return getToken(HplsqlParser.T_GLOBAL, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Declare_temporary_table_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_temporary_table_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDeclare_temporary_table_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_temporary_table_itemContext declare_temporary_table_item() throws RecognitionException {
		Declare_temporary_table_itemContext _localctx = new Declare_temporary_table_itemContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_declare_temporary_table_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_GLOBAL) {
				{
				setState(908);
				match(T_GLOBAL);
				}
			}

			setState(911);
			match(T_TEMPORARY);
			setState(912);
			match(T_TABLE);
			setState(913);
			qident();
			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(914);
				create_table_preoptions();
				}
			}

			setState(917);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(HplsqlParser.T_EXISTS, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			match(T_CREATE);
			setState(920);
			match(T_TABLE);
			setState(924);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(921);
				match(T_IF);
				setState(922);
				match(T_NOT);
				setState(923);
				match(T_EXISTS);
				}
				break;
			}
			setState(926);
			table_name();
			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(927);
				create_table_preoptions();
				}
			}

			setState(930);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_local_temp_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public QidentContext qident() {
			return getRuleContext(QidentContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_LOCAL() { return getToken(HplsqlParser.T_LOCAL, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(HplsqlParser.T_TEMPORARY, 0); }
		public TerminalNode T_VOLATILE() { return getToken(HplsqlParser.T_VOLATILE, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public TerminalNode T_MULTISET() { return getToken(HplsqlParser.T_MULTISET, 0); }
		public Create_local_temp_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_local_temp_table_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_local_temp_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_local_temp_table_stmtContext create_local_temp_table_stmt() throws RecognitionException {
		Create_local_temp_table_stmtContext _localctx = new Create_local_temp_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_create_local_temp_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			match(T_CREATE);
			setState(939);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LOCAL:
				{
				setState(933);
				match(T_LOCAL);
				setState(934);
				match(T_TEMPORARY);
				}
				break;
			case T_MULTISET:
			case T_SET:
			case T_VOLATILE:
				{
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_MULTISET || _la==T_SET) {
					{
					setState(935);
					_la = _input.LA(1);
					if ( !(_la==T_MULTISET || _la==T_SET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(938);
				match(T_VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(941);
			match(T_TABLE);
			setState(942);
			qident();
			setState(944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(943);
				create_table_preoptions();
				}
			}

			setState(946);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_definitionContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Create_table_columnsContext create_table_columns() {
			return getRuleContext(Create_table_columnsContext.class,0);
		}
		public TerminalNode T_LIKE() { return getToken(HplsqlParser.T_LIKE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_table_optionsContext create_table_options() {
			return getRuleContext(Create_table_optionsContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public Create_table_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_definitionContext create_table_definition() throws RecognitionException {
		Create_table_definitionContext _localctx = new Create_table_definitionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_create_table_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(948);
					match(T_AS);
					}
				}

				setState(951);
				match(T_OPEN_P);
				setState(952);
				select_stmt();
				setState(953);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(955);
					match(T_AS);
					}
				}

				setState(958);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(959);
				match(T_OPEN_P);
				setState(960);
				create_table_columns();
				setState(961);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				{
				setState(963);
				match(T_LIKE);
				setState(964);
				table_name();
				}
				break;
			}
			setState(968);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(967);
				create_table_options();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_columnsContext extends ParserRuleContext {
		public List<Create_table_columns_itemContext> create_table_columns_item() {
			return getRuleContexts(Create_table_columns_itemContext.class);
		}
		public Create_table_columns_itemContext create_table_columns_item(int i) {
			return getRuleContext(Create_table_columns_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Create_table_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_columns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_columnsContext create_table_columns() throws RecognitionException {
		Create_table_columnsContext _localctx = new Create_table_columnsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_create_table_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(970);
			create_table_columns_item();
			setState(975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(971);
				match(T_COMMA);
				setState(972);
				create_table_columns_item();
				}
				}
				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_columns_itemContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public List<Create_table_column_inline_consContext> create_table_column_inline_cons() {
			return getRuleContexts(Create_table_column_inline_consContext.class);
		}
		public Create_table_column_inline_consContext create_table_column_inline_cons(int i) {
			return getRuleContext(Create_table_column_inline_consContext.class,i);
		}
		public Create_table_column_consContext create_table_column_cons() {
			return getRuleContext(Create_table_column_consContext.class,0);
		}
		public TerminalNode T_CONSTRAINT() { return getToken(HplsqlParser.T_CONSTRAINT, 0); }
		public QidentContext qident() {
			return getRuleContext(QidentContext.class,0);
		}
		public Create_table_columns_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_columns_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_columns_itemContext create_table_columns_item() throws RecognitionException {
		Create_table_columns_itemContext _localctx = new Create_table_columns_itemContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_create_table_columns_item);
		int _la;
		try {
			int _alt;
			setState(1000);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(978);
				column_name();
				setState(979);
				dtype();
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(980);
					dtype_len();
					}
				}

				setState(986);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(983);
						dtype_attr();
						}
						}
					}
					setState(988);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
				}
				setState(992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_AUTO_INCREMENT || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (T_DEFAULT - 75)) | (1L << (T_ENABLE - 75)) | (1L << (T_IDENTITY - 75)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (T_NOT - 196)) | (1L << (T_NULL - 196)) | (1L << (T_PRIMARY - 196)) | (1L << (T_REFERENCES - 196)))) != 0) || ((((_la - 303)) & ~0x3f) == 0 && ((1L << (_la - 303)) & ((1L << (T_UNIQUE - 303)) | (1L << (T_WITH - 303)) | (1L << (T_COLON - 303)) | (1L << (T_EQUAL - 303)))) != 0)) {
					{
					{
					setState(989);
					create_table_column_inline_cons();
					}
					}
					setState(994);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CONSTRAINT) {
					{
					setState(995);
					match(T_CONSTRAINT);
					setState(996);
					qident();
					}
				}

				setState(999);
				create_table_column_cons();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_type_stmtContext extends ParserRuleContext {
		public TerminalNode T_TYPE() { return getToken(HplsqlParser.T_TYPE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public TerminalNode T_OF() { return getToken(HplsqlParser.T_OF, 0); }
		public Tbl_typeContext tbl_type() {
			return getRuleContext(Tbl_typeContext.class,0);
		}
		public TerminalNode T_INDEX() { return getToken(HplsqlParser.T_INDEX, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public Create_table_type_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_type_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_type_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_type_stmtContext create_table_type_stmt() throws RecognitionException {
		Create_table_type_stmtContext _localctx = new Create_table_type_stmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_create_table_type_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
			match(T_TYPE);
			setState(1003);
			ident();
			setState(1004);
			match(T_IS);
			setState(1005);
			match(T_TABLE);
			setState(1006);
			match(T_OF);
			setState(1007);
			tbl_type();
			setState(1010);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(1008);
				match(T_NOT);
				setState(1009);
				match(T_NULL);
				}
			}

			setState(1012);
			match(T_INDEX);
			setState(1013);
			match(T_BY);
			setState(1014);
			dtype();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tbl_typeContext extends ParserRuleContext {
		public Sql_typeContext sql_type() {
			return getRuleContext(Sql_typeContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public Tbl_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tbl_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitTbl_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tbl_typeContext tbl_type() throws RecognitionException {
		Tbl_typeContext _localctx = new Tbl_typeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_tbl_type);
		try {
			setState(1018);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1016);
				sql_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1017);
				dtype();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_typeContext extends ParserRuleContext {
		public QidentContext qident() {
			return getRuleContext(QidentContext.class,0);
		}
		public TerminalNode T_MOD() { return getToken(HplsqlParser.T_MOD, 0); }
		public TerminalNode T_TYPE() { return getToken(HplsqlParser.T_TYPE, 0); }
		public TerminalNode T_ROWTYPE() { return getToken(HplsqlParser.T_ROWTYPE, 0); }
		public Sql_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSql_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_typeContext sql_type() throws RecognitionException {
		Sql_typeContext _localctx = new Sql_typeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_sql_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			qident();
			setState(1021);
			match(T_MOD);
			setState(1022);
			_la = _input.LA(1);
			if ( !(_la==T_ROWTYPE || _la==T_TYPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_column_inline_consContext extends ParserRuleContext {
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_PRIMARY() { return getToken(HplsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(HplsqlParser.T_KEY, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HplsqlParser.T_UNIQUE, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HplsqlParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public QidentContext qident() {
			return getRuleContext(QidentContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public TerminalNode T_IDENTITY() { return getToken(HplsqlParser.T_IDENTITY, 0); }
		public List<TerminalNode> L_INT() { return getTokens(HplsqlParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(HplsqlParser.L_INT, i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_AUTO_INCREMENT() { return getToken(HplsqlParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_ENABLE() { return getToken(HplsqlParser.T_ENABLE, 0); }
		public Create_table_column_inline_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column_inline_cons; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_column_inline_cons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_column_inline_consContext create_table_column_inline_cons() throws RecognitionException {
		Create_table_column_inline_consContext _localctx = new Create_table_column_inline_consContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_create_table_column_inline_cons);
		int _la;
		try {
			setState(1056);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_DEFAULT:
			case T_WITH:
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1024);
				dtype_default();
				}
				break;
			case T_NOT:
			case T_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1026);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1025);
					match(T_NOT);
					}
				}

				setState(1028);
				match(T_NULL);
				}
				break;
			case T_PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(1029);
				match(T_PRIMARY);
				setState(1030);
				match(T_KEY);
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1031);
				match(T_UNIQUE);
				}
				break;
			case T_REFERENCES:
				enterOuterAlt(_localctx, 5);
				{
				setState(1032);
				match(T_REFERENCES);
				setState(1033);
				table_name();
				setState(1034);
				match(T_OPEN_P);
				setState(1035);
				qident();
				setState(1036);
				match(T_CLOSE_P);
				setState(1040);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(1037);
					create_table_fk_action();
					}
					}
					setState(1042);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T_IDENTITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(1043);
				match(T_IDENTITY);
				setState(1044);
				match(T_OPEN_P);
				setState(1045);
				match(L_INT);
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1046);
					match(T_COMMA);
					setState(1047);
					match(L_INT);
					}
					}
					setState(1052);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1053);
				match(T_CLOSE_P);
				}
				break;
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(1054);
				match(T_AUTO_INCREMENT);
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1055);
				match(T_ENABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_column_consContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(HplsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(HplsqlParser.T_KEY, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(HplsqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HplsqlParser.T_OPEN_P, i);
		}
		public List<QidentContext> qident() {
			return getRuleContexts(QidentContext.class);
		}
		public QidentContext qident(int i) {
			return getRuleContext(QidentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HplsqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HplsqlParser.T_CLOSE_P, i);
		}
		public TerminalNode T_CLUSTERED() { return getToken(HplsqlParser.T_CLUSTERED, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_ENABLE() { return getToken(HplsqlParser.T_ENABLE, 0); }
		public Index_storage_clauseContext index_storage_clause() {
			return getRuleContext(Index_storage_clauseContext.class,0);
		}
		public List<TerminalNode> T_ASC() { return getTokens(HplsqlParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(HplsqlParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(HplsqlParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(HplsqlParser.T_DESC, i);
		}
		public TerminalNode T_FOREIGN() { return getToken(HplsqlParser.T_FOREIGN, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HplsqlParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public Create_table_column_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column_cons; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_column_cons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_column_consContext create_table_column_cons() throws RecognitionException {
		Create_table_column_consContext _localctx = new Create_table_column_consContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_create_table_column_cons);
		int _la;
		try {
			setState(1115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1058);
				match(T_PRIMARY);
				setState(1059);
				match(T_KEY);
				setState(1061);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(1060);
					match(T_CLUSTERED);
					}
				}

				setState(1063);
				match(T_OPEN_P);
				setState(1064);
				qident();
				setState(1066);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(1065);
					_la = _input.LA(1);
					if ( !(_la==T_ASC || _la==T_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1075);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1068);
					match(T_COMMA);
					setState(1069);
					qident();
					setState(1071);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(1070);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					}
					setState(1077);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1078);
				match(T_CLOSE_P);
				setState(1080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ENABLE) {
					{
					setState(1079);
					match(T_ENABLE);
					}
				}

				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(1082);
					index_storage_clause();
					}
				}

				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1085);
				match(T_FOREIGN);
				setState(1086);
				match(T_KEY);
				setState(1087);
				match(T_OPEN_P);
				setState(1088);
				qident();
				setState(1093);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1089);
					match(T_COMMA);
					setState(1090);
					qident();
					}
					}
					setState(1095);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1096);
				match(T_CLOSE_P);
				setState(1097);
				match(T_REFERENCES);
				setState(1098);
				table_name();
				setState(1099);
				match(T_OPEN_P);
				setState(1100);
				qident();
				setState(1105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1101);
					match(T_COMMA);
					setState(1102);
					qident();
					}
					}
					setState(1107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1108);
				match(T_CLOSE_P);
				setState(1112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(1109);
					create_table_fk_action();
					}
					}
					setState(1114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_fk_actionContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_UPDATE() { return getToken(HplsqlParser.T_UPDATE, 0); }
		public TerminalNode T_DELETE() { return getToken(HplsqlParser.T_DELETE, 0); }
		public TerminalNode T_NO() { return getToken(HplsqlParser.T_NO, 0); }
		public TerminalNode T_ACTION() { return getToken(HplsqlParser.T_ACTION, 0); }
		public TerminalNode T_RESTRICT() { return getToken(HplsqlParser.T_RESTRICT, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HplsqlParser.T_DEFAULT, 0); }
		public TerminalNode T_CASCADE() { return getToken(HplsqlParser.T_CASCADE, 0); }
		public Create_table_fk_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_fk_action; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_fk_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_fk_actionContext create_table_fk_action() throws RecognitionException {
		Create_table_fk_actionContext _localctx = new Create_table_fk_actionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_create_table_fk_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			match(T_ON);
			setState(1118);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(1119);
				match(T_NO);
				setState(1120);
				match(T_ACTION);
				}
				break;
			case 2:
				{
				setState(1121);
				match(T_RESTRICT);
				}
				break;
			case 3:
				{
				setState(1122);
				match(T_SET);
				setState(1123);
				match(T_NULL);
				}
				break;
			case 4:
				{
				setState(1124);
				match(T_SET);
				setState(1125);
				match(T_DEFAULT);
				}
				break;
			case 5:
				{
				setState(1126);
				match(T_CASCADE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_preoptionsContext extends ParserRuleContext {
		public List<Create_table_preoptions_itemContext> create_table_preoptions_item() {
			return getRuleContexts(Create_table_preoptions_itemContext.class);
		}
		public Create_table_preoptions_itemContext create_table_preoptions_item(int i) {
			return getRuleContext(Create_table_preoptions_itemContext.class,i);
		}
		public Create_table_preoptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_preoptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptionsContext create_table_preoptions() throws RecognitionException {
		Create_table_preoptionsContext _localctx = new Create_table_preoptionsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_create_table_preoptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1129);
				create_table_preoptions_item();
				}
				}
				setState(1132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_ROW || _la==T_STORED || _la==T_COMMA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_preoptions_itemContext extends ParserRuleContext {
		public TerminalNode T_COMMA() { return getToken(HplsqlParser.T_COMMA, 0); }
		public Create_table_preoptions_td_itemContext create_table_preoptions_td_item() {
			return getRuleContext(Create_table_preoptions_td_itemContext.class,0);
		}
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public Create_table_preoptions_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_preoptions_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptions_itemContext create_table_preoptions_item() throws RecognitionException {
		Create_table_preoptions_itemContext _localctx = new Create_table_preoptions_itemContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_create_table_preoptions_item);
		try {
			setState(1137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1134);
				match(T_COMMA);
				setState(1135);
				create_table_preoptions_td_item();
				}
				break;
			case T_ROW:
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1136);
				create_table_options_hive_item();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_preoptions_td_itemContext extends ParserRuleContext {
		public TerminalNode T_LOG() { return getToken(HplsqlParser.T_LOG, 0); }
		public TerminalNode T_FALLBACK() { return getToken(HplsqlParser.T_FALLBACK, 0); }
		public TerminalNode T_NO() { return getToken(HplsqlParser.T_NO, 0); }
		public Create_table_preoptions_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions_td_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_preoptions_td_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptions_td_itemContext create_table_preoptions_td_item() throws RecognitionException {
		Create_table_preoptions_td_itemContext _localctx = new Create_table_preoptions_td_itemContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_create_table_preoptions_td_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NO) {
				{
				setState(1139);
				match(T_NO);
				}
			}

			setState(1142);
			_la = _input.LA(1);
			if ( !(_la==T_FALLBACK || _la==T_LOG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_optionsContext extends ParserRuleContext {
		public List<Create_table_options_itemContext> create_table_options_item() {
			return getRuleContexts(Create_table_options_itemContext.class);
		}
		public Create_table_options_itemContext create_table_options_item(int i) {
			return getRuleContext(Create_table_options_itemContext.class,i);
		}
		public Create_table_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_optionsContext create_table_options() throws RecognitionException {
		Create_table_optionsContext _localctx = new Create_table_optionsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_create_table_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1144);
					create_table_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_itemContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_COMMIT() { return getToken(HplsqlParser.T_COMMIT, 0); }
		public TerminalNode T_ROWS() { return getToken(HplsqlParser.T_ROWS, 0); }
		public TerminalNode T_DELETE() { return getToken(HplsqlParser.T_DELETE, 0); }
		public TerminalNode T_PRESERVE() { return getToken(HplsqlParser.T_PRESERVE, 0); }
		public Create_table_options_ora_itemContext create_table_options_ora_item() {
			return getRuleContext(Create_table_options_ora_itemContext.class,0);
		}
		public Create_table_options_db2_itemContext create_table_options_db2_item() {
			return getRuleContext(Create_table_options_db2_itemContext.class,0);
		}
		public Create_table_options_td_itemContext create_table_options_td_item() {
			return getRuleContext(Create_table_options_td_itemContext.class,0);
		}
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public Create_table_options_mssql_itemContext create_table_options_mssql_item() {
			return getRuleContext(Create_table_options_mssql_itemContext.class,0);
		}
		public Create_table_options_mysql_itemContext create_table_options_mysql_item() {
			return getRuleContext(Create_table_options_mysql_itemContext.class,0);
		}
		public Create_table_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_itemContext create_table_options_item() throws RecognitionException {
		Create_table_options_itemContext _localctx = new Create_table_options_itemContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_create_table_options_item);
		int _la;
		try {
			setState(1159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1149);
				match(T_ON);
				setState(1150);
				match(T_COMMIT);
				setState(1151);
				_la = _input.LA(1);
				if ( !(_la==T_DELETE || _la==T_PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1152);
				match(T_ROWS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1153);
				create_table_options_ora_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1154);
				create_table_options_db2_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1155);
				create_table_options_td_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1156);
				create_table_options_hive_item();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1157);
				create_table_options_mssql_item();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1158);
				create_table_options_mysql_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_ora_itemContext extends ParserRuleContext {
		public TerminalNode T_SEGMENT() { return getToken(HplsqlParser.T_SEGMENT, 0); }
		public TerminalNode T_CREATION() { return getToken(HplsqlParser.T_CREATION, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(HplsqlParser.T_IMMEDIATE, 0); }
		public TerminalNode T_DEFERRED() { return getToken(HplsqlParser.T_DEFERRED, 0); }
		public List<TerminalNode> L_INT() { return getTokens(HplsqlParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(HplsqlParser.L_INT, i);
		}
		public TerminalNode T_PCTFREE() { return getToken(HplsqlParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(HplsqlParser.T_PCTUSED, 0); }
		public TerminalNode T_INITRANS() { return getToken(HplsqlParser.T_INITRANS, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(HplsqlParser.T_MAXTRANS, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(HplsqlParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_LOGGING() { return getToken(HplsqlParser.T_LOGGING, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(HplsqlParser.T_NOLOGGING, 0); }
		public TerminalNode T_STORAGE() { return getToken(HplsqlParser.T_STORAGE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<QidentContext> qident() {
			return getRuleContexts(QidentContext.class);
		}
		public QidentContext qident(int i) {
			return getRuleContext(QidentContext.class,i);
		}
		public TerminalNode T_TABLESPACE() { return getToken(HplsqlParser.T_TABLESPACE, 0); }
		public Create_table_options_ora_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_ora_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_ora_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_ora_itemContext create_table_options_ora_item() throws RecognitionException {
		Create_table_options_ora_itemContext _localctx = new Create_table_options_ora_itemContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_create_table_options_ora_item);
		int _la;
		try {
			setState(1179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEGMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1161);
				match(T_SEGMENT);
				setState(1162);
				match(T_CREATION);
				setState(1163);
				_la = _input.LA(1);
				if ( !(_la==T_DEFERRED || _la==T_IMMEDIATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_INITRANS:
			case T_MAXTRANS:
			case T_PCTFREE:
			case T_PCTUSED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1164);
				_la = _input.LA(1);
				if ( !(_la==T_INITRANS || _la==T_MAXTRANS || _la==T_PCTFREE || _la==T_PCTUSED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1165);
				match(L_INT);
				}
				break;
			case T_NOCOMPRESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1166);
				match(T_NOCOMPRESS);
				}
				break;
			case T_LOGGING:
			case T_NOLOGGING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1167);
				_la = _input.LA(1);
				if ( !(_la==T_LOGGING || _la==T_NOLOGGING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_STORAGE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1168);
				match(T_STORAGE);
				setState(1169);
				match(T_OPEN_P);
				setState(1172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(1172);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T_ACTION:
					case T_ADD2:
					case T_ALL:
					case T_ALLOCATE:
					case T_ALTER:
					case T_AND:
					case T_ANSI_NULLS:
					case T_ANSI_PADDING:
					case T_AS:
					case T_ASC:
					case T_ASSOCIATE:
					case T_AT:
					case T_AUTO_INCREMENT:
					case T_AVG:
					case T_BATCHSIZE:
					case T_BEGIN:
					case T_BETWEEN:
					case T_BIGINT:
					case T_BINARY_DOUBLE:
					case T_BINARY_FLOAT:
					case T_BIT:
					case T_BODY:
					case T_BREAK:
					case T_BULK:
					case T_BY:
					case T_BYTE:
					case T_CALL:
					case T_CALLER:
					case T_CASCADE:
					case T_CASE:
					case T_CASESPECIFIC:
					case T_CAST:
					case T_CHAR:
					case T_CHARACTER:
					case T_CHARSET:
					case T_CLIENT:
					case T_CLOSE:
					case T_CLUSTERED:
					case T_CMP:
					case T_COLLECT:
					case T_COLLECTION:
					case T_COLUMN:
					case T_COMMENT:
					case T_CONSTANT:
					case T_COMMIT:
					case T_COMPRESS:
					case T_CONCAT:
					case T_CONDITION:
					case T_CONSTRAINT:
					case T_CONTINUE:
					case T_COPY:
					case T_COUNT:
					case T_COUNT_BIG:
					case T_CREATE:
					case T_CREATION:
					case T_CREATOR:
					case T_CS:
					case T_CURRENT:
					case T_CURRENT_SCHEMA:
					case T_CURSOR:
					case T_DATABASE:
					case T_DATA:
					case T_DATE:
					case T_DATETIME:
					case T_DAY:
					case T_DAYS:
					case T_DEC:
					case T_DECIMAL:
					case T_DECLARE:
					case T_DEFAULT:
					case T_DEFERRED:
					case T_DEFINED:
					case T_DEFINER:
					case T_DEFINITION:
					case T_DELETE:
					case T_DELIMITED:
					case T_DELIMITER:
					case T_DESC:
					case T_DESCRIBE:
					case T_DIAGNOSTICS:
					case T_DIR:
					case T_DIRECTORY:
					case T_DISTINCT:
					case T_DISTRIBUTE:
					case T_DO:
					case T_DOUBLE:
					case T_DROP:
					case T_DYNAMIC:
					case T_ENABLE:
					case T_ENGINE:
					case T_ESCAPED:
					case T_EXCEPT:
					case T_EXCEPTION:
					case T_EXCLUSIVE:
					case T_EXISTS:
					case T_EXIT:
					case T_FALLBACK:
					case T_FALSE:
					case T_FETCH:
					case T_FIELDS:
					case T_FILE:
					case T_FILES:
					case T_FLOAT:
					case T_FOR:
					case T_FOREIGN:
					case T_FORMAT:
					case T_FOUND:
					case T_FULL:
					case T_FUNCTION:
					case T_GET:
					case T_GLOBAL:
					case T_GO:
					case T_GRANT:
					case T_HANDLER:
					case T_HASH:
					case T_HAVING:
					case T_HDFS:
					case T_HIVE:
					case T_HOST:
					case T_IDENTITY:
					case T_IF:
					case T_IGNORE:
					case T_IMMEDIATE:
					case T_IN:
					case T_INCLUDE:
					case T_INDEX:
					case T_INITRANS:
					case T_INOUT:
					case T_INSERT:
					case T_INT:
					case T_INT2:
					case T_INT4:
					case T_INT8:
					case T_INTEGER:
					case T_INTERSECT:
					case T_INTERVAL:
					case T_INVOKER:
					case T_IS:
					case T_ISOPEN:
					case T_ITEMS:
					case T_JOIN:
					case T_KEEP:
					case T_KEY:
					case T_KEYS:
					case T_LANGUAGE:
					case T_LEAVE:
					case T_LIKE:
					case T_LINES:
					case T_LOCAL:
					case T_LOCATION:
					case T_LOCATOR:
					case T_LOCATORS:
					case T_LOCKS:
					case T_LOG:
					case T_LOGGED:
					case T_LOGGING:
					case T_LOOP:
					case T_MAP:
					case T_MATCHED:
					case T_MAX:
					case T_MAXTRANS:
					case T_MERGE:
					case T_MESSAGE_TEXT:
					case T_MICROSECOND:
					case T_MICROSECONDS:
					case T_MIN:
					case T_MULTISET:
					case T_NCHAR:
					case T_NEW:
					case T_NVARCHAR:
					case T_NO:
					case T_NOCOUNT:
					case T_NOCOMPRESS:
					case T_NOLOGGING:
					case T_NONE:
					case T_NOT:
					case T_NOTFOUND:
					case T_NUMERIC:
					case T_NUMBER:
					case T_OBJECT:
					case T_OFF:
					case T_ON:
					case T_ONLY:
					case T_OPEN:
					case T_OR:
					case T_OUT:
					case T_OUTER:
					case T_OVER:
					case T_OVERWRITE:
					case T_OWNER:
					case T_PACKAGE:
					case T_PARTITION:
					case T_PCTFREE:
					case T_PCTUSED:
					case T_PRECISION:
					case T_PRESERVE:
					case T_PRIMARY:
					case T_PRINT:
					case T_PROC:
					case T_PROCEDURE:
					case T_QUALIFY:
					case T_QUERY_BAND:
					case T_QUIT:
					case T_QUOTED_IDENTIFIER:
					case T_RAISE:
					case T_REAL:
					case T_REFERENCES:
					case T_REGEXP:
					case T_REPLACE:
					case T_RESIGNAL:
					case T_RESTRICT:
					case T_RESULT:
					case T_RESULT_SET_LOCATOR:
					case T_RETURN:
					case T_RETURNS:
					case T_REVERSE:
					case T_RIGHT:
					case T_RLIKE:
					case T_ROLE:
					case T_ROLLBACK:
					case T_ROW:
					case T_ROWS:
					case T_ROW_COUNT:
					case T_RR:
					case T_RS:
					case T_PWD:
					case T_TRIM:
					case T_SCHEMA:
					case T_SECOND:
					case T_SECONDS:
					case T_SECURITY:
					case T_SEGMENT:
					case T_SEL:
					case T_SELECT:
					case T_SET:
					case T_SESSION:
					case T_SESSIONS:
					case T_SETS:
					case T_SHARE:
					case T_SIGNAL:
					case T_SIMPLE_DOUBLE:
					case T_SIMPLE_FLOAT:
					case T_SMALLDATETIME:
					case T_SMALLINT:
					case T_SQL:
					case T_SQLEXCEPTION:
					case T_SQLINSERT:
					case T_SQLSTATE:
					case T_SQLWARNING:
					case T_STATS:
					case T_STATISTICS:
					case T_STEP:
					case T_STORAGE:
					case T_STORED:
					case T_STRING:
					case T_SUBDIR:
					case T_SUBSTRING:
					case T_SUM:
					case T_SUMMARY:
					case T_SYS_REFCURSOR:
					case T_TABLE:
					case T_TABLESPACE:
					case T_TEMPORARY:
					case T_TERMINATED:
					case T_TEXTIMAGE_ON:
					case T_THEN:
					case T_TIMESTAMP:
					case T_TITLE:
					case T_TO:
					case T_TOP:
					case T_TRANSACTION:
					case T_TRUE:
					case T_TRUNCATE:
					case T_TYPE:
					case T_UNIQUE:
					case T_UPDATE:
					case T_UR:
					case T_USE:
					case T_USING:
					case T_VALUE:
					case T_VALUES:
					case T_VAR:
					case T_VARCHAR:
					case T_VARCHAR2:
					case T_VARYING:
					case T_VOLATILE:
					case T_WHILE:
					case T_WITHOUT:
					case T_WORK:
					case T_XACT_ABORT:
					case T_XML:
					case T_YES:
					case T_ACTIVITY_COUNT:
					case T_CUME_DIST:
					case T_CURRENT_DATE:
					case T_CURRENT_TIMESTAMP:
					case T_CURRENT_USER:
					case T_DENSE_RANK:
					case T_FIRST_VALUE:
					case T_LAG:
					case T_LAST_VALUE:
					case T_LEAD:
					case T_PART_COUNT:
					case T_PART_LOC:
					case T_RANK:
					case T_ROW_NUMBER:
					case T_STDEV:
					case T_SYSDATE:
					case T_VARIANCE:
					case T_USER:
					case T_SUB:
					case L_ID:
						{
						setState(1170);
						qident();
						}
						break;
					case L_INT:
						{
						setState(1171);
						match(L_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T_ACTION - 4)) | (1L << (T_ADD2 - 4)) | (1L << (T_ALL - 4)) | (1L << (T_ALLOCATE - 4)) | (1L << (T_ALTER - 4)) | (1L << (T_AND - 4)) | (1L << (T_ANSI_NULLS - 4)) | (1L << (T_ANSI_PADDING - 4)) | (1L << (T_AS - 4)) | (1L << (T_ASC - 4)) | (1L << (T_ASSOCIATE - 4)) | (1L << (T_AT - 4)) | (1L << (T_AUTO_INCREMENT - 4)) | (1L << (T_AVG - 4)) | (1L << (T_BATCHSIZE - 4)) | (1L << (T_BEGIN - 4)) | (1L << (T_BETWEEN - 4)) | (1L << (T_BIGINT - 4)) | (1L << (T_BINARY_DOUBLE - 4)) | (1L << (T_BINARY_FLOAT - 4)) | (1L << (T_BIT - 4)) | (1L << (T_BODY - 4)) | (1L << (T_BREAK - 4)) | (1L << (T_BULK - 4)) | (1L << (T_BY - 4)) | (1L << (T_BYTE - 4)) | (1L << (T_CALL - 4)) | (1L << (T_CALLER - 4)) | (1L << (T_CASCADE - 4)) | (1L << (T_CASE - 4)) | (1L << (T_CASESPECIFIC - 4)) | (1L << (T_CAST - 4)) | (1L << (T_CHAR - 4)) | (1L << (T_CHARACTER - 4)) | (1L << (T_CHARSET - 4)) | (1L << (T_CLIENT - 4)) | (1L << (T_CLOSE - 4)) | (1L << (T_CLUSTERED - 4)) | (1L << (T_CMP - 4)) | (1L << (T_COLLECT - 4)) | (1L << (T_COLLECTION - 4)) | (1L << (T_COLUMN - 4)) | (1L << (T_COMMENT - 4)) | (1L << (T_CONSTANT - 4)) | (1L << (T_COMMIT - 4)) | (1L << (T_COMPRESS - 4)) | (1L << (T_CONCAT - 4)) | (1L << (T_CONDITION - 4)) | (1L << (T_CONSTRAINT - 4)) | (1L << (T_CONTINUE - 4)) | (1L << (T_COPY - 4)) | (1L << (T_COUNT - 4)) | (1L << (T_COUNT_BIG - 4)) | (1L << (T_CREATE - 4)) | (1L << (T_CREATION - 4)) | (1L << (T_CREATOR - 4)) | (1L << (T_CS - 4)) | (1L << (T_CURRENT - 4)) | (1L << (T_CURRENT_SCHEMA - 4)) | (1L << (T_CURSOR - 4)) | (1L << (T_DATABASE - 4)) | (1L << (T_DATA - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T_DATE - 68)) | (1L << (T_DATETIME - 68)) | (1L << (T_DAY - 68)) | (1L << (T_DAYS - 68)) | (1L << (T_DEC - 68)) | (1L << (T_DECIMAL - 68)) | (1L << (T_DECLARE - 68)) | (1L << (T_DEFAULT - 68)) | (1L << (T_DEFERRED - 68)) | (1L << (T_DEFINED - 68)) | (1L << (T_DEFINER - 68)) | (1L << (T_DEFINITION - 68)) | (1L << (T_DELETE - 68)) | (1L << (T_DELIMITED - 68)) | (1L << (T_DELIMITER - 68)) | (1L << (T_DESC - 68)) | (1L << (T_DESCRIBE - 68)) | (1L << (T_DIAGNOSTICS - 68)) | (1L << (T_DIR - 68)) | (1L << (T_DIRECTORY - 68)) | (1L << (T_DISTINCT - 68)) | (1L << (T_DISTRIBUTE - 68)) | (1L << (T_DO - 68)) | (1L << (T_DOUBLE - 68)) | (1L << (T_DROP - 68)) | (1L << (T_DYNAMIC - 68)) | (1L << (T_ENABLE - 68)) | (1L << (T_ENGINE - 68)) | (1L << (T_ESCAPED - 68)) | (1L << (T_EXCEPT - 68)) | (1L << (T_EXCEPTION - 68)) | (1L << (T_EXCLUSIVE - 68)) | (1L << (T_EXISTS - 68)) | (1L << (T_EXIT - 68)) | (1L << (T_FALLBACK - 68)) | (1L << (T_FALSE - 68)) | (1L << (T_FETCH - 68)) | (1L << (T_FIELDS - 68)) | (1L << (T_FILE - 68)) | (1L << (T_FILES - 68)) | (1L << (T_FLOAT - 68)) | (1L << (T_FOR - 68)) | (1L << (T_FOREIGN - 68)) | (1L << (T_FORMAT - 68)) | (1L << (T_FOUND - 68)) | (1L << (T_FULL - 68)) | (1L << (T_FUNCTION - 68)) | (1L << (T_GET - 68)) | (1L << (T_GLOBAL - 68)) | (1L << (T_GO - 68)) | (1L << (T_GRANT - 68)) | (1L << (T_HANDLER - 68)) | (1L << (T_HASH - 68)) | (1L << (T_HAVING - 68)) | (1L << (T_HDFS - 68)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (T_HIVE - 132)) | (1L << (T_HOST - 132)) | (1L << (T_IDENTITY - 132)) | (1L << (T_IF - 132)) | (1L << (T_IGNORE - 132)) | (1L << (T_IMMEDIATE - 132)) | (1L << (T_IN - 132)) | (1L << (T_INCLUDE - 132)) | (1L << (T_INDEX - 132)) | (1L << (T_INITRANS - 132)) | (1L << (T_INOUT - 132)) | (1L << (T_INSERT - 132)) | (1L << (T_INT - 132)) | (1L << (T_INT2 - 132)) | (1L << (T_INT4 - 132)) | (1L << (T_INT8 - 132)) | (1L << (T_INTEGER - 132)) | (1L << (T_INTERSECT - 132)) | (1L << (T_INTERVAL - 132)) | (1L << (T_INVOKER - 132)) | (1L << (T_IS - 132)) | (1L << (T_ISOPEN - 132)) | (1L << (T_ITEMS - 132)) | (1L << (T_JOIN - 132)) | (1L << (T_KEEP - 132)) | (1L << (T_KEY - 132)) | (1L << (T_KEYS - 132)) | (1L << (T_LANGUAGE - 132)) | (1L << (T_LEAVE - 132)) | (1L << (T_LIKE - 132)) | (1L << (T_LINES - 132)) | (1L << (T_LOCAL - 132)) | (1L << (T_LOCATION - 132)) | (1L << (T_LOCATOR - 132)) | (1L << (T_LOCATORS - 132)) | (1L << (T_LOCKS - 132)) | (1L << (T_LOG - 132)) | (1L << (T_LOGGED - 132)) | (1L << (T_LOGGING - 132)) | (1L << (T_LOOP - 132)) | (1L << (T_MAP - 132)) | (1L << (T_MATCHED - 132)) | (1L << (T_MAX - 132)) | (1L << (T_MAXTRANS - 132)) | (1L << (T_MERGE - 132)) | (1L << (T_MESSAGE_TEXT - 132)) | (1L << (T_MICROSECOND - 132)) | (1L << (T_MICROSECONDS - 132)) | (1L << (T_MIN - 132)) | (1L << (T_MULTISET - 132)) | (1L << (T_NCHAR - 132)) | (1L << (T_NEW - 132)) | (1L << (T_NVARCHAR - 132)) | (1L << (T_NO - 132)) | (1L << (T_NOCOUNT - 132)) | (1L << (T_NOCOMPRESS - 132)) | (1L << (T_NOLOGGING - 132)) | (1L << (T_NONE - 132)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (T_NOT - 196)) | (1L << (T_NOTFOUND - 196)) | (1L << (T_NUMERIC - 196)) | (1L << (T_NUMBER - 196)) | (1L << (T_OBJECT - 196)) | (1L << (T_OFF - 196)) | (1L << (T_ON - 196)) | (1L << (T_ONLY - 196)) | (1L << (T_OPEN - 196)) | (1L << (T_OR - 196)) | (1L << (T_OUT - 196)) | (1L << (T_OUTER - 196)) | (1L << (T_OVER - 196)) | (1L << (T_OVERWRITE - 196)) | (1L << (T_OWNER - 196)) | (1L << (T_PACKAGE - 196)) | (1L << (T_PARTITION - 196)) | (1L << (T_PCTFREE - 196)) | (1L << (T_PCTUSED - 196)) | (1L << (T_PRECISION - 196)) | (1L << (T_PRESERVE - 196)) | (1L << (T_PRIMARY - 196)) | (1L << (T_PRINT - 196)) | (1L << (T_PROC - 196)) | (1L << (T_PROCEDURE - 196)) | (1L << (T_QUALIFY - 196)) | (1L << (T_QUERY_BAND - 196)) | (1L << (T_QUIT - 196)) | (1L << (T_QUOTED_IDENTIFIER - 196)) | (1L << (T_RAISE - 196)) | (1L << (T_REAL - 196)) | (1L << (T_REFERENCES - 196)) | (1L << (T_REGEXP - 196)) | (1L << (T_REPLACE - 196)) | (1L << (T_RESIGNAL - 196)) | (1L << (T_RESTRICT - 196)) | (1L << (T_RESULT - 196)) | (1L << (T_RESULT_SET_LOCATOR - 196)) | (1L << (T_RETURN - 196)) | (1L << (T_RETURNS - 196)) | (1L << (T_REVERSE - 196)) | (1L << (T_RIGHT - 196)) | (1L << (T_RLIKE - 196)) | (1L << (T_ROLE - 196)) | (1L << (T_ROLLBACK - 196)) | (1L << (T_ROW - 196)) | (1L << (T_ROWS - 196)) | (1L << (T_ROW_COUNT - 196)) | (1L << (T_RR - 196)) | (1L << (T_RS - 196)) | (1L << (T_PWD - 196)) | (1L << (T_TRIM - 196)) | (1L << (T_SCHEMA - 196)) | (1L << (T_SECOND - 196)) | (1L << (T_SECONDS - 196)) | (1L << (T_SECURITY - 196)) | (1L << (T_SEGMENT - 196)) | (1L << (T_SEL - 196)) | (1L << (T_SELECT - 196)))) != 0) || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (T_SET - 260)) | (1L << (T_SESSION - 260)) | (1L << (T_SESSIONS - 260)) | (1L << (T_SETS - 260)) | (1L << (T_SHARE - 260)) | (1L << (T_SIGNAL - 260)) | (1L << (T_SIMPLE_DOUBLE - 260)) | (1L << (T_SIMPLE_FLOAT - 260)) | (1L << (T_SMALLDATETIME - 260)) | (1L << (T_SMALLINT - 260)) | (1L << (T_SQL - 260)) | (1L << (T_SQLEXCEPTION - 260)) | (1L << (T_SQLINSERT - 260)) | (1L << (T_SQLSTATE - 260)) | (1L << (T_SQLWARNING - 260)) | (1L << (T_STATS - 260)) | (1L << (T_STATISTICS - 260)) | (1L << (T_STEP - 260)) | (1L << (T_STORAGE - 260)) | (1L << (T_STORED - 260)) | (1L << (T_STRING - 260)) | (1L << (T_SUBDIR - 260)) | (1L << (T_SUBSTRING - 260)) | (1L << (T_SUM - 260)) | (1L << (T_SUMMARY - 260)) | (1L << (T_SYS_REFCURSOR - 260)) | (1L << (T_TABLE - 260)) | (1L << (T_TABLESPACE - 260)) | (1L << (T_TEMPORARY - 260)) | (1L << (T_TERMINATED - 260)) | (1L << (T_TEXTIMAGE_ON - 260)) | (1L << (T_THEN - 260)) | (1L << (T_TIMESTAMP - 260)) | (1L << (T_TITLE - 260)) | (1L << (T_TO - 260)) | (1L << (T_TOP - 260)) | (1L << (T_TRANSACTION - 260)) | (1L << (T_TRUE - 260)) | (1L << (T_TRUNCATE - 260)) | (1L << (T_TYPE - 260)) | (1L << (T_UNIQUE - 260)) | (1L << (T_UPDATE - 260)) | (1L << (T_UR - 260)) | (1L << (T_USE - 260)) | (1L << (T_USING - 260)) | (1L << (T_VALUE - 260)) | (1L << (T_VALUES - 260)) | (1L << (T_VAR - 260)) | (1L << (T_VARCHAR - 260)) | (1L << (T_VARCHAR2 - 260)) | (1L << (T_VARYING - 260)) | (1L << (T_VOLATILE - 260)) | (1L << (T_WHILE - 260)) | (1L << (T_WITHOUT - 260)) | (1L << (T_WORK - 260)) | (1L << (T_XACT_ABORT - 260)) | (1L << (T_XML - 260)) | (1L << (T_YES - 260)))) != 0) || ((((_la - 329)) & ~0x3f) == 0 && ((1L << (_la - 329)) & ((1L << (T_ACTIVITY_COUNT - 329)) | (1L << (T_CUME_DIST - 329)) | (1L << (T_CURRENT_DATE - 329)) | (1L << (T_CURRENT_TIMESTAMP - 329)) | (1L << (T_CURRENT_USER - 329)) | (1L << (T_DENSE_RANK - 329)) | (1L << (T_FIRST_VALUE - 329)) | (1L << (T_LAG - 329)) | (1L << (T_LAST_VALUE - 329)) | (1L << (T_LEAD - 329)) | (1L << (T_PART_COUNT - 329)) | (1L << (T_PART_LOC - 329)) | (1L << (T_RANK - 329)) | (1L << (T_ROW_NUMBER - 329)) | (1L << (T_STDEV - 329)) | (1L << (T_SYSDATE - 329)) | (1L << (T_VARIANCE - 329)) | (1L << (T_USER - 329)) | (1L << (T_SUB - 329)) | (1L << (L_ID - 329)) | (1L << (L_INT - 329)))) != 0) );
				setState(1176);
				match(T_CLOSE_P);
				}
				break;
			case T_TABLESPACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1177);
				match(T_TABLESPACE);
				setState(1178);
				qident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_db2_itemContext extends ParserRuleContext {
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public List<QidentContext> qident() {
			return getRuleContexts(QidentContext.class);
		}
		public QidentContext qident(int i) {
			return getRuleContext(QidentContext.class,i);
		}
		public TerminalNode T_INDEX() { return getToken(HplsqlParser.T_INDEX, 0); }
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(HplsqlParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public TerminalNode T_HASH() { return getToken(HplsqlParser.T_HASH, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_LOGGED() { return getToken(HplsqlParser.T_LOGGED, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(HplsqlParser.T_COMPRESS, 0); }
		public TerminalNode T_YES() { return getToken(HplsqlParser.T_YES, 0); }
		public TerminalNode T_NO() { return getToken(HplsqlParser.T_NO, 0); }
		public TerminalNode T_DEFINITION() { return getToken(HplsqlParser.T_DEFINITION, 0); }
		public TerminalNode T_ONLY() { return getToken(HplsqlParser.T_ONLY, 0); }
		public TerminalNode T_RESTRICT() { return getToken(HplsqlParser.T_RESTRICT, 0); }
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_DROP() { return getToken(HplsqlParser.T_DROP, 0); }
		public Create_table_options_db2_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_db2_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_db2_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_db2_itemContext create_table_options_db2_item() throws RecognitionException {
		Create_table_options_db2_itemContext _localctx = new Create_table_options_db2_itemContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_create_table_options_db2_item);
		int _la;
		try {
			setState(1214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INDEX) {
					{
					setState(1181);
					match(T_INDEX);
					}
				}

				setState(1184);
				match(T_IN);
				setState(1185);
				qident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1186);
				match(T_WITH);
				setState(1187);
				match(T_REPLACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1188);
				match(T_DISTRIBUTE);
				setState(1189);
				match(T_BY);
				setState(1190);
				match(T_HASH);
				setState(1191);
				match(T_OPEN_P);
				setState(1192);
				qident();
				setState(1197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1193);
					match(T_COMMA);
					setState(1194);
					qident();
					}
					}
					setState(1199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1200);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1202);
					match(T_NOT);
					}
				}

				setState(1205);
				match(T_LOGGED);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1206);
				match(T_COMPRESS);
				setState(1207);
				_la = _input.LA(1);
				if ( !(_la==T_NO || _la==T_YES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1208);
				match(T_DEFINITION);
				setState(1209);
				match(T_ONLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1210);
				match(T_WITH);
				setState(1211);
				match(T_RESTRICT);
				setState(1212);
				match(T_ON);
				setState(1213);
				match(T_DROP);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_td_itemContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(HplsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_INDEX() { return getToken(HplsqlParser.T_INDEX, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<QidentContext> qident() {
			return getRuleContexts(QidentContext.class);
		}
		public QidentContext qident(int i) {
			return getRuleContext(QidentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HplsqlParser.T_UNIQUE, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_DATA() { return getToken(HplsqlParser.T_DATA, 0); }
		public Create_table_options_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_td_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_td_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_td_itemContext create_table_options_td_item() throws RecognitionException {
		Create_table_options_td_itemContext _localctx = new Create_table_options_td_itemContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_create_table_options_td_item);
		int _la;
		try {
			setState(1234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
			case T_UNIQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_UNIQUE) {
					{
					setState(1216);
					match(T_UNIQUE);
					}
				}

				setState(1219);
				match(T_PRIMARY);
				setState(1220);
				match(T_INDEX);
				setState(1221);
				match(T_OPEN_P);
				setState(1222);
				qident();
				setState(1227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1223);
					match(T_COMMA);
					setState(1224);
					qident();
					}
					}
					setState(1229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1230);
				match(T_CLOSE_P);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1232);
				match(T_WITH);
				setState(1233);
				match(T_DATA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_hive_itemContext extends ParserRuleContext {
		public Create_table_hive_row_formatContext create_table_hive_row_format() {
			return getRuleContext(Create_table_hive_row_formatContext.class,0);
		}
		public TerminalNode T_STORED() { return getToken(HplsqlParser.T_STORED, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public QidentContext qident() {
			return getRuleContext(QidentContext.class,0);
		}
		public Create_table_options_hive_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_hive_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_hive_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_hive_itemContext create_table_options_hive_item() throws RecognitionException {
		Create_table_options_hive_itemContext _localctx = new Create_table_options_hive_itemContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_create_table_options_hive_item);
		try {
			setState(1240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1236);
				create_table_hive_row_format();
				}
				break;
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1237);
				match(T_STORED);
				setState(1238);
				match(T_AS);
				setState(1239);
				qident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_hive_row_formatContext extends ParserRuleContext {
		public TerminalNode T_ROW() { return getToken(HplsqlParser.T_ROW, 0); }
		public TerminalNode T_FORMAT() { return getToken(HplsqlParser.T_FORMAT, 0); }
		public TerminalNode T_DELIMITED() { return getToken(HplsqlParser.T_DELIMITED, 0); }
		public List<Create_table_hive_row_format_fieldsContext> create_table_hive_row_format_fields() {
			return getRuleContexts(Create_table_hive_row_format_fieldsContext.class);
		}
		public Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields(int i) {
			return getRuleContext(Create_table_hive_row_format_fieldsContext.class,i);
		}
		public Create_table_hive_row_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_hive_row_format(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_hive_row_formatContext create_table_hive_row_format() throws RecognitionException {
		Create_table_hive_row_formatContext _localctx = new Create_table_hive_row_formatContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_create_table_hive_row_format);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1242);
			match(T_ROW);
			setState(1243);
			match(T_FORMAT);
			setState(1244);
			match(T_DELIMITED);
			setState(1248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1245);
					create_table_hive_row_format_fields();
					}
					}
				}
				setState(1250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_hive_row_format_fieldsContext extends ParserRuleContext {
		public TerminalNode T_FIELDS() { return getToken(HplsqlParser.T_FIELDS, 0); }
		public TerminalNode T_TERMINATED() { return getToken(HplsqlParser.T_TERMINATED, 0); }
		public List<TerminalNode> T_BY() { return getTokens(HplsqlParser.T_BY); }
		public TerminalNode T_BY(int i) {
			return getToken(HplsqlParser.T_BY, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_ESCAPED() { return getToken(HplsqlParser.T_ESCAPED, 0); }
		public TerminalNode T_COLLECTION() { return getToken(HplsqlParser.T_COLLECTION, 0); }
		public TerminalNode T_ITEMS() { return getToken(HplsqlParser.T_ITEMS, 0); }
		public TerminalNode T_MAP() { return getToken(HplsqlParser.T_MAP, 0); }
		public TerminalNode T_KEYS() { return getToken(HplsqlParser.T_KEYS, 0); }
		public TerminalNode T_LINES() { return getToken(HplsqlParser.T_LINES, 0); }
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public TerminalNode T_DEFINED() { return getToken(HplsqlParser.T_DEFINED, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public Create_table_hive_row_format_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format_fields; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_hive_row_format_fields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields() throws RecognitionException {
		Create_table_hive_row_format_fieldsContext _localctx = new Create_table_hive_row_format_fieldsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_create_table_hive_row_format_fields);
		try {
			setState(1278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FIELDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1251);
				match(T_FIELDS);
				setState(1252);
				match(T_TERMINATED);
				setState(1253);
				match(T_BY);
				setState(1254);
				expr(0);
				setState(1258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(1255);
					match(T_ESCAPED);
					setState(1256);
					match(T_BY);
					setState(1257);
					expr(0);
					}
					break;
				}
				}
				break;
			case T_COLLECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1260);
				match(T_COLLECTION);
				setState(1261);
				match(T_ITEMS);
				setState(1262);
				match(T_TERMINATED);
				setState(1263);
				match(T_BY);
				setState(1264);
				expr(0);
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1265);
				match(T_MAP);
				setState(1266);
				match(T_KEYS);
				setState(1267);
				match(T_TERMINATED);
				setState(1268);
				match(T_BY);
				setState(1269);
				expr(0);
				}
				break;
			case T_LINES:
				enterOuterAlt(_localctx, 4);
				{
				setState(1270);
				match(T_LINES);
				setState(1271);
				match(T_TERMINATED);
				setState(1272);
				match(T_BY);
				setState(1273);
				expr(0);
				}
				break;
			case T_NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1274);
				match(T_NULL);
				setState(1275);
				match(T_DEFINED);
				setState(1276);
				match(T_AS);
				setState(1277);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_mssql_itemContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public QidentContext qident() {
			return getRuleContext(QidentContext.class,0);
		}
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(HplsqlParser.T_TEXTIMAGE_ON, 0); }
		public Create_table_options_mssql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_mssql_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_mssql_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_mssql_itemContext create_table_options_mssql_item() throws RecognitionException {
		Create_table_options_mssql_itemContext _localctx = new Create_table_options_mssql_itemContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_create_table_options_mssql_item);
		try {
			setState(1284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1280);
				match(T_ON);
				setState(1281);
				qident();
				}
				break;
			case T_TEXTIMAGE_ON:
				enterOuterAlt(_localctx, 2);
				{
				setState(1282);
				match(T_TEXTIMAGE_ON);
				setState(1283);
				qident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_mysql_itemContext extends ParserRuleContext {
		public TerminalNode T_AUTO_INCREMENT() { return getToken(HplsqlParser.T_AUTO_INCREMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_COMMENT() { return getToken(HplsqlParser.T_COMMENT, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HplsqlParser.T_CHARACTER, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public TerminalNode T_CHARSET() { return getToken(HplsqlParser.T_CHARSET, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HplsqlParser.T_DEFAULT, 0); }
		public TerminalNode T_ENGINE() { return getToken(HplsqlParser.T_ENGINE, 0); }
		public Create_table_options_mysql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_mysql_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_table_options_mysql_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_mysql_itemContext create_table_options_mysql_item() throws RecognitionException {
		Create_table_options_mysql_itemContext _localctx = new Create_table_options_mysql_itemContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_create_table_options_mysql_item);
		int _la;
		try {
			setState(1313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1286);
				match(T_AUTO_INCREMENT);
				setState(1288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1287);
					match(T_EQUAL);
					}
				}

				setState(1290);
				expr(0);
				}
				break;
			case T_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1291);
				match(T_COMMENT);
				setState(1293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1292);
					match(T_EQUAL);
					}
				}

				setState(1295);
				expr(0);
				}
				break;
			case T_CHARACTER:
			case T_CHARSET:
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DEFAULT) {
					{
					setState(1296);
					match(T_DEFAULT);
					}
				}

				setState(1302);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CHARACTER:
					{
					setState(1299);
					match(T_CHARACTER);
					setState(1300);
					match(T_SET);
					}
					break;
				case T_CHARSET:
					{
					setState(1301);
					match(T_CHARSET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1304);
					match(T_EQUAL);
					}
				}

				setState(1307);
				expr(0);
				}
				break;
			case T_ENGINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1308);
				match(T_ENGINE);
				setState(1310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1309);
					match(T_EQUAL);
					}
				}

				setState(1312);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_ALTER() { return getToken(HplsqlParser.T_ALTER, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Alter_table_itemContext alter_table_item() {
			return getRuleContext(Alter_table_itemContext.class,0);
		}
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1315);
			match(T_ALTER);
			setState(1316);
			match(T_TABLE);
			setState(1317);
			table_name();
			setState(1318);
			alter_table_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_itemContext extends ParserRuleContext {
		public Alter_table_add_constraintContext alter_table_add_constraint() {
			return getRuleContext(Alter_table_add_constraintContext.class,0);
		}
		public Alter_table_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitAlter_table_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_itemContext alter_table_item() throws RecognitionException {
		Alter_table_itemContext _localctx = new Alter_table_itemContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_alter_table_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1320);
			alter_table_add_constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_add_constraintContext extends ParserRuleContext {
		public TerminalNode T_ADD2() { return getToken(HplsqlParser.T_ADD2, 0); }
		public Alter_table_add_constraint_itemContext alter_table_add_constraint_item() {
			return getRuleContext(Alter_table_add_constraint_itemContext.class,0);
		}
		public TerminalNode T_CONSTRAINT() { return getToken(HplsqlParser.T_CONSTRAINT, 0); }
		public QidentContext qident() {
			return getRuleContext(QidentContext.class,0);
		}
		public Alter_table_add_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_constraint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitAlter_table_add_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_add_constraintContext alter_table_add_constraint() throws RecognitionException {
		Alter_table_add_constraintContext _localctx = new Alter_table_add_constraintContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_alter_table_add_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1322);
			match(T_ADD2);
			setState(1325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_CONSTRAINT) {
				{
				setState(1323);
				match(T_CONSTRAINT);
				setState(1324);
				qident();
				}
			}

			setState(1327);
			alter_table_add_constraint_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_add_constraint_itemContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(HplsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(HplsqlParser.T_KEY, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(HplsqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HplsqlParser.T_OPEN_P, i);
		}
		public List<QidentContext> qident() {
			return getRuleContexts(QidentContext.class);
		}
		public QidentContext qident(int i) {
			return getRuleContext(QidentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HplsqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HplsqlParser.T_CLOSE_P, i);
		}
		public TerminalNode T_CLUSTERED() { return getToken(HplsqlParser.T_CLUSTERED, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_ENABLE() { return getToken(HplsqlParser.T_ENABLE, 0); }
		public Index_storage_clauseContext index_storage_clause() {
			return getRuleContext(Index_storage_clauseContext.class,0);
		}
		public List<TerminalNode> T_ASC() { return getTokens(HplsqlParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(HplsqlParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(HplsqlParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(HplsqlParser.T_DESC, i);
		}
		public TerminalNode T_FOREIGN() { return getToken(HplsqlParser.T_FOREIGN, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HplsqlParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public TerminalNode T_DEFAULT() { return getToken(HplsqlParser.T_DEFAULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public Alter_table_add_constraint_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_constraint_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitAlter_table_add_constraint_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_add_constraint_itemContext alter_table_add_constraint_item() throws RecognitionException {
		Alter_table_add_constraint_itemContext _localctx = new Alter_table_add_constraint_itemContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_alter_table_add_constraint_item);
		int _la;
		try {
			int _alt;
			setState(1391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1329);
				match(T_PRIMARY);
				setState(1330);
				match(T_KEY);
				setState(1332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(1331);
					match(T_CLUSTERED);
					}
				}

				setState(1334);
				match(T_OPEN_P);
				setState(1335);
				qident();
				setState(1337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(1336);
					_la = _input.LA(1);
					if ( !(_la==T_ASC || _la==T_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1339);
					match(T_COMMA);
					setState(1340);
					qident();
					setState(1342);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(1341);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					}
					setState(1348);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1349);
				match(T_CLOSE_P);
				setState(1351);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1350);
					match(T_ENABLE);
					}
					break;
				}
				setState(1354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1353);
					index_storage_clause();
					}
					break;
				}
				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1356);
				match(T_FOREIGN);
				setState(1357);
				match(T_KEY);
				setState(1358);
				match(T_OPEN_P);
				setState(1359);
				qident();
				setState(1364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1360);
					match(T_COMMA);
					setState(1361);
					qident();
					}
					}
					setState(1366);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1367);
				match(T_CLOSE_P);
				setState(1368);
				match(T_REFERENCES);
				setState(1369);
				table_name();
				setState(1370);
				match(T_OPEN_P);
				setState(1371);
				qident();
				setState(1376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1372);
					match(T_COMMA);
					setState(1373);
					qident();
					}
					}
					setState(1378);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1379);
				match(T_CLOSE_P);
				setState(1383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1380);
						create_table_fk_action();
						}
						}
					}
					setState(1385);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
				}
				}
				break;
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1386);
				match(T_DEFAULT);
				setState(1387);
				expr(0);
				setState(1388);
				match(T_FOR);
				setState(1389);
				qident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DtypeContext extends ParserRuleContext {
		public TerminalNode T_CHAR() { return getToken(HplsqlParser.T_CHAR, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HplsqlParser.T_CHARACTER, 0); }
		public TerminalNode T_BIGINT() { return getToken(HplsqlParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(HplsqlParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(HplsqlParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BINARY_INTEGER() { return getToken(HplsqlParser.T_BINARY_INTEGER, 0); }
		public TerminalNode T_BIT() { return getToken(HplsqlParser.T_BIT, 0); }
		public TerminalNode T_DATE() { return getToken(HplsqlParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(HplsqlParser.T_DATETIME, 0); }
		public TerminalNode T_DEC() { return getToken(HplsqlParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(HplsqlParser.T_DECIMAL, 0); }
		public TerminalNode T_DOUBLE() { return getToken(HplsqlParser.T_DOUBLE, 0); }
		public TerminalNode T_PRECISION() { return getToken(HplsqlParser.T_PRECISION, 0); }
		public TerminalNode T_FLOAT() { return getToken(HplsqlParser.T_FLOAT, 0); }
		public TerminalNode T_INT() { return getToken(HplsqlParser.T_INT, 0); }
		public TerminalNode T_INT2() { return getToken(HplsqlParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(HplsqlParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(HplsqlParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(HplsqlParser.T_INTEGER, 0); }
		public TerminalNode T_NCHAR() { return getToken(HplsqlParser.T_NCHAR, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(HplsqlParser.T_NVARCHAR, 0); }
		public TerminalNode T_NUMBER() { return getToken(HplsqlParser.T_NUMBER, 0); }
		public TerminalNode T_NUMERIC() { return getToken(HplsqlParser.T_NUMERIC, 0); }
		public TerminalNode T_PLS_INTEGER() { return getToken(HplsqlParser.T_PLS_INTEGER, 0); }
		public TerminalNode T_REAL() { return getToken(HplsqlParser.T_REAL, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(HplsqlParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_VARYING() { return getToken(HplsqlParser.T_VARYING, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(HplsqlParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(HplsqlParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_INTEGER() { return getToken(HplsqlParser.T_SIMPLE_INTEGER, 0); }
		public TerminalNode T_SMALLINT() { return getToken(HplsqlParser.T_SMALLINT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(HplsqlParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_STRING() { return getToken(HplsqlParser.T_STRING, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(HplsqlParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(HplsqlParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TINYINT() { return getToken(HplsqlParser.T_TINYINT, 0); }
		public TerminalNode T_VARCHAR() { return getToken(HplsqlParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(HplsqlParser.T_VARCHAR2, 0); }
		public TerminalNode T_XML() { return getToken(HplsqlParser.T_XML, 0); }
		public QidentContext qident() {
			return getRuleContext(QidentContext.class,0);
		}
		public TerminalNode T_MOD() { return getToken(HplsqlParser.T_MOD, 0); }
		public TerminalNode T_TYPE() { return getToken(HplsqlParser.T_TYPE, 0); }
		public TerminalNode T_ROWTYPE() { return getToken(HplsqlParser.T_ROWTYPE, 0); }
		public DtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtypeContext dtype() throws RecognitionException {
		DtypeContext _localctx = new DtypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_dtype);
		int _la;
		try {
			setState(1439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1393);
				match(T_CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1394);
				match(T_CHARACTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1395);
				match(T_BIGINT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1396);
				match(T_BINARY_DOUBLE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1397);
				match(T_BINARY_FLOAT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1398);
				match(T_BINARY_INTEGER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1399);
				match(T_BIT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1400);
				match(T_DATE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1401);
				match(T_DATETIME);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1402);
				match(T_DEC);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1403);
				match(T_DECIMAL);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1404);
				match(T_DOUBLE);
				setState(1406);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1405);
					match(T_PRECISION);
					}
					break;
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1408);
				match(T_FLOAT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1409);
				match(T_INT);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1410);
				match(T_INT2);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1411);
				match(T_INT4);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1412);
				match(T_INT8);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1413);
				match(T_INTEGER);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1414);
				match(T_NCHAR);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1415);
				match(T_NVARCHAR);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1416);
				match(T_NUMBER);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1417);
				match(T_NUMERIC);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1418);
				match(T_PLS_INTEGER);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1419);
				match(T_REAL);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1420);
				match(T_RESULT_SET_LOCATOR);
				setState(1421);
				match(T_VARYING);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1422);
				match(T_SIMPLE_FLOAT);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1423);
				match(T_SIMPLE_DOUBLE);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1424);
				match(T_SIMPLE_INTEGER);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1425);
				match(T_SMALLINT);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1426);
				match(T_SMALLDATETIME);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1427);
				match(T_STRING);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1428);
				match(T_SYS_REFCURSOR);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1429);
				match(T_TIMESTAMP);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1430);
				match(T_TINYINT);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1431);
				match(T_VARCHAR);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1432);
				match(T_VARCHAR2);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1433);
				match(T_XML);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1434);
				qident();
				setState(1437);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1435);
					match(T_MOD);
					setState(1436);
					_la = _input.LA(1);
					if ( !(_la==T_ROWTYPE || _la==T_TYPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dtype_lenContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> L_INT() { return getTokens(HplsqlParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(HplsqlParser.L_INT, i);
		}
		public TerminalNode T_MAX() { return getToken(HplsqlParser.T_MAX, 0); }
		public TerminalNode T_COMMA() { return getToken(HplsqlParser.T_COMMA, 0); }
		public TerminalNode T_CHAR() { return getToken(HplsqlParser.T_CHAR, 0); }
		public TerminalNode T_BYTE() { return getToken(HplsqlParser.T_BYTE, 0); }
		public Dtype_lenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_len; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDtype_len(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_lenContext dtype_len() throws RecognitionException {
		Dtype_lenContext _localctx = new Dtype_lenContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_dtype_len);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			match(T_OPEN_P);
			setState(1442);
			_la = _input.LA(1);
			if ( !(_la==T_MAX || _la==L_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(1443);
				_la = _input.LA(1);
				if ( !(_la==T_BYTE || _la==T_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(1446);
				match(T_COMMA);
				setState(1447);
				match(L_INT);
				}
			}

			setState(1450);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dtype_attrContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HplsqlParser.T_CHARACTER, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CASESPECIFIC() { return getToken(HplsqlParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CS() { return getToken(HplsqlParser.T_CS, 0); }
		public Dtype_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_attr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDtype_attr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_attrContext dtype_attr() throws RecognitionException {
		Dtype_attrContext _localctx = new Dtype_attrContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_dtype_attr);
		int _la;
		try {
			setState(1463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1452);
					match(T_NOT);
					}
				}

				setState(1455);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1456);
				match(T_CHARACTER);
				setState(1457);
				match(T_SET);
				setState(1458);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1459);
					match(T_NOT);
					}
				}

				setState(1462);
				_la = _input.LA(1);
				if ( !(_la==T_CASESPECIFIC || _la==T_CS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dtype_defaultContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COLON() { return getToken(HplsqlParser.T_COLON, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HplsqlParser.T_DEFAULT, 0); }
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public Dtype_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_default; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDtype_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_defaultContext dtype_default() throws RecognitionException {
		Dtype_defaultContext _localctx = new Dtype_defaultContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_dtype_default);
		int _la;
		try {
			setState(1477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(1465);
					match(T_COLON);
					}
				}

				setState(1468);
				match(T_EQUAL);
				setState(1469);
				expr(0);
				}
				break;
			case T_DEFAULT:
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(1470);
					match(T_WITH);
					}
				}

				setState(1473);
				match(T_DEFAULT);
				setState(1475);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1474);
					expr(0);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_database_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_DATABASE() { return getToken(HplsqlParser.T_DATABASE, 0); }
		public TerminalNode T_SCHEMA() { return getToken(HplsqlParser.T_SCHEMA, 0); }
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(HplsqlParser.T_EXISTS, 0); }
		public List<Create_database_optionContext> create_database_option() {
			return getRuleContexts(Create_database_optionContext.class);
		}
		public Create_database_optionContext create_database_option(int i) {
			return getRuleContext(Create_database_optionContext.class,i);
		}
		public Create_database_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_database_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_stmtContext create_database_stmt() throws RecognitionException {
		Create_database_stmtContext _localctx = new Create_database_stmtContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_create_database_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1479);
			match(T_CREATE);
			setState(1480);
			_la = _input.LA(1);
			if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1481);
				match(T_IF);
				setState(1482);
				match(T_NOT);
				setState(1483);
				match(T_EXISTS);
				}
				break;
			}
			setState(1486);
			expr(0);
			setState(1490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1487);
					create_database_option();
					}
					}
				}
				setState(1492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_database_optionContext extends ParserRuleContext {
		public TerminalNode T_COMMENT() { return getToken(HplsqlParser.T_COMMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_LOCATION() { return getToken(HplsqlParser.T_LOCATION, 0); }
		public Create_database_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_option; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_database_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_optionContext create_database_option() throws RecognitionException {
		Create_database_optionContext _localctx = new Create_database_optionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_create_database_option);
		try {
			setState(1497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1493);
				match(T_COMMENT);
				setState(1494);
				expr(0);
				}
				break;
			case T_LOCATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1495);
				match(T_LOCATION);
				setState(1496);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_function_stmtContext extends ParserRuleContext {
		public TerminalNode T_FUNCTION() { return getToken(HplsqlParser.T_FUNCTION, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_function_returnContext create_function_return() {
			return getRuleContext(Create_function_returnContext.class,0);
		}
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public TerminalNode T_ALTER() { return getToken(HplsqlParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public Declare_block_inplaceContext declare_block_inplace() {
			return getRuleContext(Declare_block_inplaceContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public Create_function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_function_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_function_stmtContext create_function_stmt() throws RecognitionException {
		Create_function_stmtContext _localctx = new Create_function_stmtContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_create_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1499);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1500);
				match(T_CREATE);
				setState(1503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1501);
					match(T_OR);
					setState(1502);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1505);
				match(T_REPLACE);
				}
				break;
			case T_FUNCTION:
				break;
			default:
				break;
			}
			setState(1508);
			match(T_FUNCTION);
			setState(1509);
			ident();
			setState(1511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1510);
				create_routine_params();
				}
				break;
			}
			setState(1513);
			create_function_return();
			setState(1515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1514);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1517);
				declare_block_inplace();
				}
				break;
			}
			setState(1520);
			single_block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_function_returnContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_RETURN() { return getToken(HplsqlParser.T_RETURN, 0); }
		public TerminalNode T_RETURNS() { return getToken(HplsqlParser.T_RETURNS, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public Create_function_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_return; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_function_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_function_returnContext create_function_return() throws RecognitionException {
		Create_function_returnContext _localctx = new Create_function_returnContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_create_function_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1522);
			_la = _input.LA(1);
			if ( !(_la==T_RETURN || _la==T_RETURNS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1523);
			dtype();
			setState(1525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1524);
				dtype_len();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_package_stmtContext extends ParserRuleContext {
		public TerminalNode T_PACKAGE() { return getToken(HplsqlParser.T_PACKAGE, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Package_specContext package_spec() {
			return getRuleContext(Package_specContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_ALTER() { return getToken(HplsqlParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public Create_package_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_package_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_package_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_package_stmtContext create_package_stmt() throws RecognitionException {
		Create_package_stmtContext _localctx = new Create_package_stmtContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_create_package_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1534);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1527);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1528);
				match(T_CREATE);
				setState(1531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1529);
					match(T_OR);
					setState(1530);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1533);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1536);
			match(T_PACKAGE);
			setState(1537);
			ident();
			setState(1538);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1539);
			package_spec();
			setState(1540);
			match(T_END);
			setState(1544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1541);
				ident();
				setState(1542);
				match(T_SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_specContext extends ParserRuleContext {
		public List<Package_spec_itemContext> package_spec_item() {
			return getRuleContexts(Package_spec_itemContext.class);
		}
		public Package_spec_itemContext package_spec_item(int i) {
			return getRuleContext(Package_spec_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HplsqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HplsqlParser.T_SEMICOLON, i);
		}
		public Package_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_spec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitPackage_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_specContext package_spec() throws RecognitionException {
		Package_specContext _localctx = new Package_specContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_package_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1546);
			package_spec_item();
			setState(1547);
			match(T_SEMICOLON);
			setState(1553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T_ACTION - 4)) | (1L << (T_ADD2 - 4)) | (1L << (T_ALL - 4)) | (1L << (T_ALLOCATE - 4)) | (1L << (T_ALTER - 4)) | (1L << (T_AND - 4)) | (1L << (T_ANSI_NULLS - 4)) | (1L << (T_ANSI_PADDING - 4)) | (1L << (T_AS - 4)) | (1L << (T_ASC - 4)) | (1L << (T_ASSOCIATE - 4)) | (1L << (T_AT - 4)) | (1L << (T_AUTO_INCREMENT - 4)) | (1L << (T_AVG - 4)) | (1L << (T_BATCHSIZE - 4)) | (1L << (T_BEGIN - 4)) | (1L << (T_BETWEEN - 4)) | (1L << (T_BIGINT - 4)) | (1L << (T_BINARY_DOUBLE - 4)) | (1L << (T_BINARY_FLOAT - 4)) | (1L << (T_BIT - 4)) | (1L << (T_BODY - 4)) | (1L << (T_BREAK - 4)) | (1L << (T_BULK - 4)) | (1L << (T_BY - 4)) | (1L << (T_BYTE - 4)) | (1L << (T_CALL - 4)) | (1L << (T_CALLER - 4)) | (1L << (T_CASCADE - 4)) | (1L << (T_CASE - 4)) | (1L << (T_CASESPECIFIC - 4)) | (1L << (T_CAST - 4)) | (1L << (T_CHAR - 4)) | (1L << (T_CHARACTER - 4)) | (1L << (T_CHARSET - 4)) | (1L << (T_CLIENT - 4)) | (1L << (T_CLOSE - 4)) | (1L << (T_CLUSTERED - 4)) | (1L << (T_CMP - 4)) | (1L << (T_COLLECT - 4)) | (1L << (T_COLLECTION - 4)) | (1L << (T_COLUMN - 4)) | (1L << (T_COMMENT - 4)) | (1L << (T_CONSTANT - 4)) | (1L << (T_COMMIT - 4)) | (1L << (T_COMPRESS - 4)) | (1L << (T_CONCAT - 4)) | (1L << (T_CONDITION - 4)) | (1L << (T_CONSTRAINT - 4)) | (1L << (T_CONTINUE - 4)) | (1L << (T_COPY - 4)) | (1L << (T_COUNT - 4)) | (1L << (T_COUNT_BIG - 4)) | (1L << (T_CREATE - 4)) | (1L << (T_CREATION - 4)) | (1L << (T_CREATOR - 4)) | (1L << (T_CS - 4)) | (1L << (T_CURRENT - 4)) | (1L << (T_CURRENT_SCHEMA - 4)) | (1L << (T_CURSOR - 4)) | (1L << (T_DATABASE - 4)) | (1L << (T_DATA - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T_DATE - 68)) | (1L << (T_DATETIME - 68)) | (1L << (T_DAY - 68)) | (1L << (T_DAYS - 68)) | (1L << (T_DEC - 68)) | (1L << (T_DECIMAL - 68)) | (1L << (T_DECLARE - 68)) | (1L << (T_DEFAULT - 68)) | (1L << (T_DEFERRED - 68)) | (1L << (T_DEFINED - 68)) | (1L << (T_DEFINER - 68)) | (1L << (T_DEFINITION - 68)) | (1L << (T_DELETE - 68)) | (1L << (T_DELIMITED - 68)) | (1L << (T_DELIMITER - 68)) | (1L << (T_DESC - 68)) | (1L << (T_DESCRIBE - 68)) | (1L << (T_DIAGNOSTICS - 68)) | (1L << (T_DIR - 68)) | (1L << (T_DIRECTORY - 68)) | (1L << (T_DISTINCT - 68)) | (1L << (T_DISTRIBUTE - 68)) | (1L << (T_DO - 68)) | (1L << (T_DOUBLE - 68)) | (1L << (T_DROP - 68)) | (1L << (T_DYNAMIC - 68)) | (1L << (T_ENABLE - 68)) | (1L << (T_ENGINE - 68)) | (1L << (T_ESCAPED - 68)) | (1L << (T_EXCEPT - 68)) | (1L << (T_EXCEPTION - 68)) | (1L << (T_EXCLUSIVE - 68)) | (1L << (T_EXISTS - 68)) | (1L << (T_EXIT - 68)) | (1L << (T_FALLBACK - 68)) | (1L << (T_FALSE - 68)) | (1L << (T_FETCH - 68)) | (1L << (T_FIELDS - 68)) | (1L << (T_FILE - 68)) | (1L << (T_FILES - 68)) | (1L << (T_FLOAT - 68)) | (1L << (T_FOR - 68)) | (1L << (T_FOREIGN - 68)) | (1L << (T_FORMAT - 68)) | (1L << (T_FOUND - 68)) | (1L << (T_FULL - 68)) | (1L << (T_FUNCTION - 68)) | (1L << (T_GET - 68)) | (1L << (T_GLOBAL - 68)) | (1L << (T_GO - 68)) | (1L << (T_GRANT - 68)) | (1L << (T_HANDLER - 68)) | (1L << (T_HASH - 68)) | (1L << (T_HAVING - 68)) | (1L << (T_HDFS - 68)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (T_HIVE - 132)) | (1L << (T_HOST - 132)) | (1L << (T_IDENTITY - 132)) | (1L << (T_IF - 132)) | (1L << (T_IGNORE - 132)) | (1L << (T_IMMEDIATE - 132)) | (1L << (T_IN - 132)) | (1L << (T_INCLUDE - 132)) | (1L << (T_INDEX - 132)) | (1L << (T_INITRANS - 132)) | (1L << (T_INOUT - 132)) | (1L << (T_INSERT - 132)) | (1L << (T_INT - 132)) | (1L << (T_INT2 - 132)) | (1L << (T_INT4 - 132)) | (1L << (T_INT8 - 132)) | (1L << (T_INTEGER - 132)) | (1L << (T_INTERSECT - 132)) | (1L << (T_INTERVAL - 132)) | (1L << (T_INVOKER - 132)) | (1L << (T_IS - 132)) | (1L << (T_ISOPEN - 132)) | (1L << (T_ITEMS - 132)) | (1L << (T_JOIN - 132)) | (1L << (T_KEEP - 132)) | (1L << (T_KEY - 132)) | (1L << (T_KEYS - 132)) | (1L << (T_LANGUAGE - 132)) | (1L << (T_LEAVE - 132)) | (1L << (T_LIKE - 132)) | (1L << (T_LINES - 132)) | (1L << (T_LOCAL - 132)) | (1L << (T_LOCATION - 132)) | (1L << (T_LOCATOR - 132)) | (1L << (T_LOCATORS - 132)) | (1L << (T_LOCKS - 132)) | (1L << (T_LOG - 132)) | (1L << (T_LOGGED - 132)) | (1L << (T_LOGGING - 132)) | (1L << (T_LOOP - 132)) | (1L << (T_MAP - 132)) | (1L << (T_MATCHED - 132)) | (1L << (T_MAX - 132)) | (1L << (T_MAXTRANS - 132)) | (1L << (T_MERGE - 132)) | (1L << (T_MESSAGE_TEXT - 132)) | (1L << (T_MICROSECOND - 132)) | (1L << (T_MICROSECONDS - 132)) | (1L << (T_MIN - 132)) | (1L << (T_MULTISET - 132)) | (1L << (T_NCHAR - 132)) | (1L << (T_NEW - 132)) | (1L << (T_NVARCHAR - 132)) | (1L << (T_NO - 132)) | (1L << (T_NOCOUNT - 132)) | (1L << (T_NOCOMPRESS - 132)) | (1L << (T_NOLOGGING - 132)) | (1L << (T_NONE - 132)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (T_NOT - 196)) | (1L << (T_NOTFOUND - 196)) | (1L << (T_NUMERIC - 196)) | (1L << (T_NUMBER - 196)) | (1L << (T_OBJECT - 196)) | (1L << (T_OFF - 196)) | (1L << (T_ON - 196)) | (1L << (T_ONLY - 196)) | (1L << (T_OPEN - 196)) | (1L << (T_OR - 196)) | (1L << (T_OUT - 196)) | (1L << (T_OUTER - 196)) | (1L << (T_OVER - 196)) | (1L << (T_OVERWRITE - 196)) | (1L << (T_OWNER - 196)) | (1L << (T_PACKAGE - 196)) | (1L << (T_PARTITION - 196)) | (1L << (T_PCTFREE - 196)) | (1L << (T_PCTUSED - 196)) | (1L << (T_PRECISION - 196)) | (1L << (T_PRESERVE - 196)) | (1L << (T_PRIMARY - 196)) | (1L << (T_PRINT - 196)) | (1L << (T_PROC - 196)) | (1L << (T_PROCEDURE - 196)) | (1L << (T_QUALIFY - 196)) | (1L << (T_QUERY_BAND - 196)) | (1L << (T_QUIT - 196)) | (1L << (T_QUOTED_IDENTIFIER - 196)) | (1L << (T_RAISE - 196)) | (1L << (T_REAL - 196)) | (1L << (T_REFERENCES - 196)) | (1L << (T_REGEXP - 196)) | (1L << (T_REPLACE - 196)) | (1L << (T_RESIGNAL - 196)) | (1L << (T_RESTRICT - 196)) | (1L << (T_RESULT - 196)) | (1L << (T_RESULT_SET_LOCATOR - 196)) | (1L << (T_RETURN - 196)) | (1L << (T_RETURNS - 196)) | (1L << (T_REVERSE - 196)) | (1L << (T_RIGHT - 196)) | (1L << (T_RLIKE - 196)) | (1L << (T_ROLE - 196)) | (1L << (T_ROLLBACK - 196)) | (1L << (T_ROW - 196)) | (1L << (T_ROWS - 196)) | (1L << (T_ROW_COUNT - 196)) | (1L << (T_RR - 196)) | (1L << (T_RS - 196)) | (1L << (T_PWD - 196)) | (1L << (T_TRIM - 196)) | (1L << (T_SCHEMA - 196)) | (1L << (T_SECOND - 196)) | (1L << (T_SECONDS - 196)) | (1L << (T_SECURITY - 196)) | (1L << (T_SEGMENT - 196)) | (1L << (T_SEL - 196)) | (1L << (T_SELECT - 196)))) != 0) || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (T_SET - 260)) | (1L << (T_SESSION - 260)) | (1L << (T_SESSIONS - 260)) | (1L << (T_SETS - 260)) | (1L << (T_SHARE - 260)) | (1L << (T_SIGNAL - 260)) | (1L << (T_SIMPLE_DOUBLE - 260)) | (1L << (T_SIMPLE_FLOAT - 260)) | (1L << (T_SMALLDATETIME - 260)) | (1L << (T_SMALLINT - 260)) | (1L << (T_SQL - 260)) | (1L << (T_SQLEXCEPTION - 260)) | (1L << (T_SQLINSERT - 260)) | (1L << (T_SQLSTATE - 260)) | (1L << (T_SQLWARNING - 260)) | (1L << (T_STATS - 260)) | (1L << (T_STATISTICS - 260)) | (1L << (T_STEP - 260)) | (1L << (T_STORAGE - 260)) | (1L << (T_STORED - 260)) | (1L << (T_STRING - 260)) | (1L << (T_SUBDIR - 260)) | (1L << (T_SUBSTRING - 260)) | (1L << (T_SUM - 260)) | (1L << (T_SUMMARY - 260)) | (1L << (T_SYS_REFCURSOR - 260)) | (1L << (T_TABLE - 260)) | (1L << (T_TABLESPACE - 260)) | (1L << (T_TEMPORARY - 260)) | (1L << (T_TERMINATED - 260)) | (1L << (T_TEXTIMAGE_ON - 260)) | (1L << (T_THEN - 260)) | (1L << (T_TIMESTAMP - 260)) | (1L << (T_TITLE - 260)) | (1L << (T_TO - 260)) | (1L << (T_TOP - 260)) | (1L << (T_TRANSACTION - 260)) | (1L << (T_TRUE - 260)) | (1L << (T_TRUNCATE - 260)) | (1L << (T_TYPE - 260)) | (1L << (T_UNIQUE - 260)) | (1L << (T_UPDATE - 260)) | (1L << (T_UR - 260)) | (1L << (T_USE - 260)) | (1L << (T_USING - 260)) | (1L << (T_VALUE - 260)) | (1L << (T_VALUES - 260)) | (1L << (T_VAR - 260)) | (1L << (T_VARCHAR - 260)) | (1L << (T_VARCHAR2 - 260)) | (1L << (T_VARYING - 260)) | (1L << (T_VOLATILE - 260)) | (1L << (T_WHILE - 260)) | (1L << (T_WITHOUT - 260)) | (1L << (T_WORK - 260)) | (1L << (T_XACT_ABORT - 260)) | (1L << (T_XML - 260)) | (1L << (T_YES - 260)))) != 0) || ((((_la - 329)) & ~0x3f) == 0 && ((1L << (_la - 329)) & ((1L << (T_ACTIVITY_COUNT - 329)) | (1L << (T_CUME_DIST - 329)) | (1L << (T_CURRENT_DATE - 329)) | (1L << (T_CURRENT_TIMESTAMP - 329)) | (1L << (T_CURRENT_USER - 329)) | (1L << (T_DENSE_RANK - 329)) | (1L << (T_FIRST_VALUE - 329)) | (1L << (T_LAG - 329)) | (1L << (T_LAST_VALUE - 329)) | (1L << (T_LEAD - 329)) | (1L << (T_PART_COUNT - 329)) | (1L << (T_PART_LOC - 329)) | (1L << (T_RANK - 329)) | (1L << (T_ROW_NUMBER - 329)) | (1L << (T_STDEV - 329)) | (1L << (T_SYSDATE - 329)) | (1L << (T_VARIANCE - 329)) | (1L << (T_USER - 329)) | (1L << (T_SUB - 329)) | (1L << (L_ID - 329)))) != 0)) {
				{
				{
				setState(1548);
				package_spec_item();
				setState(1549);
				match(T_SEMICOLON);
				}
				}
				setState(1555);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_spec_itemContext extends ParserRuleContext {
		public Declare_stmt_itemContext declare_stmt_item() {
			return getRuleContext(Declare_stmt_itemContext.class,0);
		}
		public TerminalNode T_FUNCTION() { return getToken(HplsqlParser.T_FUNCTION, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_function_returnContext create_function_return() {
			return getRuleContext(Create_function_returnContext.class,0);
		}
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public TerminalNode T_PROCEDURE() { return getToken(HplsqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_PROC() { return getToken(HplsqlParser.T_PROC, 0); }
		public Package_spec_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_spec_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitPackage_spec_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_spec_itemContext package_spec_item() throws RecognitionException {
		Package_spec_itemContext _localctx = new Package_spec_itemContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_package_spec_item);
		int _la;
		try {
			setState(1569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1556);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1557);
				match(T_FUNCTION);
				setState(1558);
				ident();
				setState(1560);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1559);
					create_routine_params();
					}
					break;
				}
				setState(1562);
				create_function_return();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1564);
				_la = _input.LA(1);
				if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1565);
				ident();
				setState(1567);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1566);
					create_routine_params();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_package_body_stmtContext extends ParserRuleContext {
		public TerminalNode T_PACKAGE() { return getToken(HplsqlParser.T_PACKAGE, 0); }
		public TerminalNode T_BODY() { return getToken(HplsqlParser.T_BODY, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Package_bodyContext package_body() {
			return getRuleContext(Package_bodyContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_ALTER() { return getToken(HplsqlParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public Create_package_body_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_package_body_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_package_body_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_package_body_stmtContext create_package_body_stmt() throws RecognitionException {
		Create_package_body_stmtContext _localctx = new Create_package_body_stmtContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_create_package_body_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1578);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1571);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1572);
				match(T_CREATE);
				setState(1575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1573);
					match(T_OR);
					setState(1574);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1577);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1580);
			match(T_PACKAGE);
			setState(1581);
			match(T_BODY);
			setState(1582);
			ident();
			setState(1583);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1584);
			package_body();
			setState(1585);
			match(T_END);
			setState(1589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1586);
				ident();
				setState(1587);
				match(T_SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_bodyContext extends ParserRuleContext {
		public List<Package_body_itemContext> package_body_item() {
			return getRuleContexts(Package_body_itemContext.class);
		}
		public Package_body_itemContext package_body_item(int i) {
			return getRuleContext(Package_body_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(HplsqlParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(HplsqlParser.T_SEMICOLON, i);
		}
		public Package_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitPackage_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_bodyContext package_body() throws RecognitionException {
		Package_bodyContext _localctx = new Package_bodyContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_package_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1591);
			package_body_item();
			setState(1592);
			match(T_SEMICOLON);
			setState(1598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T_ACTION - 4)) | (1L << (T_ADD2 - 4)) | (1L << (T_ALL - 4)) | (1L << (T_ALLOCATE - 4)) | (1L << (T_ALTER - 4)) | (1L << (T_AND - 4)) | (1L << (T_ANSI_NULLS - 4)) | (1L << (T_ANSI_PADDING - 4)) | (1L << (T_AS - 4)) | (1L << (T_ASC - 4)) | (1L << (T_ASSOCIATE - 4)) | (1L << (T_AT - 4)) | (1L << (T_AUTO_INCREMENT - 4)) | (1L << (T_AVG - 4)) | (1L << (T_BATCHSIZE - 4)) | (1L << (T_BEGIN - 4)) | (1L << (T_BETWEEN - 4)) | (1L << (T_BIGINT - 4)) | (1L << (T_BINARY_DOUBLE - 4)) | (1L << (T_BINARY_FLOAT - 4)) | (1L << (T_BIT - 4)) | (1L << (T_BODY - 4)) | (1L << (T_BREAK - 4)) | (1L << (T_BULK - 4)) | (1L << (T_BY - 4)) | (1L << (T_BYTE - 4)) | (1L << (T_CALL - 4)) | (1L << (T_CALLER - 4)) | (1L << (T_CASCADE - 4)) | (1L << (T_CASE - 4)) | (1L << (T_CASESPECIFIC - 4)) | (1L << (T_CAST - 4)) | (1L << (T_CHAR - 4)) | (1L << (T_CHARACTER - 4)) | (1L << (T_CHARSET - 4)) | (1L << (T_CLIENT - 4)) | (1L << (T_CLOSE - 4)) | (1L << (T_CLUSTERED - 4)) | (1L << (T_CMP - 4)) | (1L << (T_COLLECT - 4)) | (1L << (T_COLLECTION - 4)) | (1L << (T_COLUMN - 4)) | (1L << (T_COMMENT - 4)) | (1L << (T_CONSTANT - 4)) | (1L << (T_COMMIT - 4)) | (1L << (T_COMPRESS - 4)) | (1L << (T_CONCAT - 4)) | (1L << (T_CONDITION - 4)) | (1L << (T_CONSTRAINT - 4)) | (1L << (T_CONTINUE - 4)) | (1L << (T_COPY - 4)) | (1L << (T_COUNT - 4)) | (1L << (T_COUNT_BIG - 4)) | (1L << (T_CREATE - 4)) | (1L << (T_CREATION - 4)) | (1L << (T_CREATOR - 4)) | (1L << (T_CS - 4)) | (1L << (T_CURRENT - 4)) | (1L << (T_CURRENT_SCHEMA - 4)) | (1L << (T_CURSOR - 4)) | (1L << (T_DATABASE - 4)) | (1L << (T_DATA - 4)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T_DATE - 68)) | (1L << (T_DATETIME - 68)) | (1L << (T_DAY - 68)) | (1L << (T_DAYS - 68)) | (1L << (T_DEC - 68)) | (1L << (T_DECIMAL - 68)) | (1L << (T_DECLARE - 68)) | (1L << (T_DEFAULT - 68)) | (1L << (T_DEFERRED - 68)) | (1L << (T_DEFINED - 68)) | (1L << (T_DEFINER - 68)) | (1L << (T_DEFINITION - 68)) | (1L << (T_DELETE - 68)) | (1L << (T_DELIMITED - 68)) | (1L << (T_DELIMITER - 68)) | (1L << (T_DESC - 68)) | (1L << (T_DESCRIBE - 68)) | (1L << (T_DIAGNOSTICS - 68)) | (1L << (T_DIR - 68)) | (1L << (T_DIRECTORY - 68)) | (1L << (T_DISTINCT - 68)) | (1L << (T_DISTRIBUTE - 68)) | (1L << (T_DO - 68)) | (1L << (T_DOUBLE - 68)) | (1L << (T_DROP - 68)) | (1L << (T_DYNAMIC - 68)) | (1L << (T_ENABLE - 68)) | (1L << (T_ENGINE - 68)) | (1L << (T_ESCAPED - 68)) | (1L << (T_EXCEPT - 68)) | (1L << (T_EXCEPTION - 68)) | (1L << (T_EXCLUSIVE - 68)) | (1L << (T_EXISTS - 68)) | (1L << (T_EXIT - 68)) | (1L << (T_FALLBACK - 68)) | (1L << (T_FALSE - 68)) | (1L << (T_FETCH - 68)) | (1L << (T_FIELDS - 68)) | (1L << (T_FILE - 68)) | (1L << (T_FILES - 68)) | (1L << (T_FLOAT - 68)) | (1L << (T_FOR - 68)) | (1L << (T_FOREIGN - 68)) | (1L << (T_FORMAT - 68)) | (1L << (T_FOUND - 68)) | (1L << (T_FULL - 68)) | (1L << (T_FUNCTION - 68)) | (1L << (T_GET - 68)) | (1L << (T_GLOBAL - 68)) | (1L << (T_GO - 68)) | (1L << (T_GRANT - 68)) | (1L << (T_HANDLER - 68)) | (1L << (T_HASH - 68)) | (1L << (T_HAVING - 68)) | (1L << (T_HDFS - 68)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (T_HIVE - 132)) | (1L << (T_HOST - 132)) | (1L << (T_IDENTITY - 132)) | (1L << (T_IF - 132)) | (1L << (T_IGNORE - 132)) | (1L << (T_IMMEDIATE - 132)) | (1L << (T_IN - 132)) | (1L << (T_INCLUDE - 132)) | (1L << (T_INDEX - 132)) | (1L << (T_INITRANS - 132)) | (1L << (T_INOUT - 132)) | (1L << (T_INSERT - 132)) | (1L << (T_INT - 132)) | (1L << (T_INT2 - 132)) | (1L << (T_INT4 - 132)) | (1L << (T_INT8 - 132)) | (1L << (T_INTEGER - 132)) | (1L << (T_INTERSECT - 132)) | (1L << (T_INTERVAL - 132)) | (1L << (T_INVOKER - 132)) | (1L << (T_IS - 132)) | (1L << (T_ISOPEN - 132)) | (1L << (T_ITEMS - 132)) | (1L << (T_JOIN - 132)) | (1L << (T_KEEP - 132)) | (1L << (T_KEY - 132)) | (1L << (T_KEYS - 132)) | (1L << (T_LANGUAGE - 132)) | (1L << (T_LEAVE - 132)) | (1L << (T_LIKE - 132)) | (1L << (T_LINES - 132)) | (1L << (T_LOCAL - 132)) | (1L << (T_LOCATION - 132)) | (1L << (T_LOCATOR - 132)) | (1L << (T_LOCATORS - 132)) | (1L << (T_LOCKS - 132)) | (1L << (T_LOG - 132)) | (1L << (T_LOGGED - 132)) | (1L << (T_LOGGING - 132)) | (1L << (T_LOOP - 132)) | (1L << (T_MAP - 132)) | (1L << (T_MATCHED - 132)) | (1L << (T_MAX - 132)) | (1L << (T_MAXTRANS - 132)) | (1L << (T_MERGE - 132)) | (1L << (T_MESSAGE_TEXT - 132)) | (1L << (T_MICROSECOND - 132)) | (1L << (T_MICROSECONDS - 132)) | (1L << (T_MIN - 132)) | (1L << (T_MULTISET - 132)) | (1L << (T_NCHAR - 132)) | (1L << (T_NEW - 132)) | (1L << (T_NVARCHAR - 132)) | (1L << (T_NO - 132)) | (1L << (T_NOCOUNT - 132)) | (1L << (T_NOCOMPRESS - 132)) | (1L << (T_NOLOGGING - 132)) | (1L << (T_NONE - 132)))) != 0) || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (T_NOT - 196)) | (1L << (T_NOTFOUND - 196)) | (1L << (T_NUMERIC - 196)) | (1L << (T_NUMBER - 196)) | (1L << (T_OBJECT - 196)) | (1L << (T_OFF - 196)) | (1L << (T_ON - 196)) | (1L << (T_ONLY - 196)) | (1L << (T_OPEN - 196)) | (1L << (T_OR - 196)) | (1L << (T_OUT - 196)) | (1L << (T_OUTER - 196)) | (1L << (T_OVER - 196)) | (1L << (T_OVERWRITE - 196)) | (1L << (T_OWNER - 196)) | (1L << (T_PACKAGE - 196)) | (1L << (T_PARTITION - 196)) | (1L << (T_PCTFREE - 196)) | (1L << (T_PCTUSED - 196)) | (1L << (T_PRECISION - 196)) | (1L << (T_PRESERVE - 196)) | (1L << (T_PRIMARY - 196)) | (1L << (T_PRINT - 196)) | (1L << (T_PROC - 196)) | (1L << (T_PROCEDURE - 196)) | (1L << (T_QUALIFY - 196)) | (1L << (T_QUERY_BAND - 196)) | (1L << (T_QUIT - 196)) | (1L << (T_QUOTED_IDENTIFIER - 196)) | (1L << (T_RAISE - 196)) | (1L << (T_REAL - 196)) | (1L << (T_REFERENCES - 196)) | (1L << (T_REGEXP - 196)) | (1L << (T_REPLACE - 196)) | (1L << (T_RESIGNAL - 196)) | (1L << (T_RESTRICT - 196)) | (1L << (T_RESULT - 196)) | (1L << (T_RESULT_SET_LOCATOR - 196)) | (1L << (T_RETURN - 196)) | (1L << (T_RETURNS - 196)) | (1L << (T_REVERSE - 196)) | (1L << (T_RIGHT - 196)) | (1L << (T_RLIKE - 196)) | (1L << (T_ROLE - 196)) | (1L << (T_ROLLBACK - 196)) | (1L << (T_ROW - 196)) | (1L << (T_ROWS - 196)) | (1L << (T_ROW_COUNT - 196)) | (1L << (T_RR - 196)) | (1L << (T_RS - 196)) | (1L << (T_PWD - 196)) | (1L << (T_TRIM - 196)) | (1L << (T_SCHEMA - 196)) | (1L << (T_SECOND - 196)) | (1L << (T_SECONDS - 196)) | (1L << (T_SECURITY - 196)) | (1L << (T_SEGMENT - 196)) | (1L << (T_SEL - 196)) | (1L << (T_SELECT - 196)))) != 0) || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (T_SET - 260)) | (1L << (T_SESSION - 260)) | (1L << (T_SESSIONS - 260)) | (1L << (T_SETS - 260)) | (1L << (T_SHARE - 260)) | (1L << (T_SIGNAL - 260)) | (1L << (T_SIMPLE_DOUBLE - 260)) | (1L << (T_SIMPLE_FLOAT - 260)) | (1L << (T_SMALLDATETIME - 260)) | (1L << (T_SMALLINT - 260)) | (1L << (T_SQL - 260)) | (1L << (T_SQLEXCEPTION - 260)) | (1L << (T_SQLINSERT - 260)) | (1L << (T_SQLSTATE - 260)) | (1L << (T_SQLWARNING - 260)) | (1L << (T_STATS - 260)) | (1L << (T_STATISTICS - 260)) | (1L << (T_STEP - 260)) | (1L << (T_STORAGE - 260)) | (1L << (T_STORED - 260)) | (1L << (T_STRING - 260)) | (1L << (T_SUBDIR - 260)) | (1L << (T_SUBSTRING - 260)) | (1L << (T_SUM - 260)) | (1L << (T_SUMMARY - 260)) | (1L << (T_SYS_REFCURSOR - 260)) | (1L << (T_TABLE - 260)) | (1L << (T_TABLESPACE - 260)) | (1L << (T_TEMPORARY - 260)) | (1L << (T_TERMINATED - 260)) | (1L << (T_TEXTIMAGE_ON - 260)) | (1L << (T_THEN - 260)) | (1L << (T_TIMESTAMP - 260)) | (1L << (T_TITLE - 260)) | (1L << (T_TO - 260)) | (1L << (T_TOP - 260)) | (1L << (T_TRANSACTION - 260)) | (1L << (T_TRUE - 260)) | (1L << (T_TRUNCATE - 260)) | (1L << (T_TYPE - 260)) | (1L << (T_UNIQUE - 260)) | (1L << (T_UPDATE - 260)) | (1L << (T_UR - 260)) | (1L << (T_USE - 260)) | (1L << (T_USING - 260)) | (1L << (T_VALUE - 260)) | (1L << (T_VALUES - 260)) | (1L << (T_VAR - 260)) | (1L << (T_VARCHAR - 260)) | (1L << (T_VARCHAR2 - 260)) | (1L << (T_VARYING - 260)) | (1L << (T_VOLATILE - 260)) | (1L << (T_WHILE - 260)) | (1L << (T_WITHOUT - 260)) | (1L << (T_WORK - 260)) | (1L << (T_XACT_ABORT - 260)) | (1L << (T_XML - 260)) | (1L << (T_YES - 260)))) != 0) || ((((_la - 329)) & ~0x3f) == 0 && ((1L << (_la - 329)) & ((1L << (T_ACTIVITY_COUNT - 329)) | (1L << (T_CUME_DIST - 329)) | (1L << (T_CURRENT_DATE - 329)) | (1L << (T_CURRENT_TIMESTAMP - 329)) | (1L << (T_CURRENT_USER - 329)) | (1L << (T_DENSE_RANK - 329)) | (1L << (T_FIRST_VALUE - 329)) | (1L << (T_LAG - 329)) | (1L << (T_LAST_VALUE - 329)) | (1L << (T_LEAD - 329)) | (1L << (T_PART_COUNT - 329)) | (1L << (T_PART_LOC - 329)) | (1L << (T_RANK - 329)) | (1L << (T_ROW_NUMBER - 329)) | (1L << (T_STDEV - 329)) | (1L << (T_SYSDATE - 329)) | (1L << (T_VARIANCE - 329)) | (1L << (T_USER - 329)) | (1L << (T_SUB - 329)) | (1L << (L_ID - 329)))) != 0)) {
				{
				{
				setState(1593);
				package_body_item();
				setState(1594);
				match(T_SEMICOLON);
				}
				}
				setState(1600);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Package_body_itemContext extends ParserRuleContext {
		public Declare_stmt_itemContext declare_stmt_item() {
			return getRuleContext(Declare_stmt_itemContext.class,0);
		}
		public Create_function_stmtContext create_function_stmt() {
			return getRuleContext(Create_function_stmtContext.class,0);
		}
		public Create_procedure_stmtContext create_procedure_stmt() {
			return getRuleContext(Create_procedure_stmtContext.class,0);
		}
		public Package_body_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitPackage_body_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_body_itemContext package_body_item() throws RecognitionException {
		Package_body_itemContext _localctx = new Package_body_itemContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_package_body_item);
		try {
			setState(1604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1601);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1602);
				create_function_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1603);
				create_procedure_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_procedure_stmtContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Proc_blockContext proc_block() {
			return getRuleContext(Proc_blockContext.class,0);
		}
		public TerminalNode T_PROCEDURE() { return getToken(HplsqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_PROC() { return getToken(HplsqlParser.T_PROC, 0); }
		public TerminalNode T_ALTER() { return getToken(HplsqlParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public Create_routine_optionsContext create_routine_options() {
			return getRuleContext(Create_routine_optionsContext.class,0);
		}
		public Declare_block_inplaceContext declare_block_inplace() {
			return getRuleContext(Declare_block_inplaceContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public Create_procedure_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_procedure_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_procedure_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_procedure_stmtContext create_procedure_stmt() throws RecognitionException {
		Create_procedure_stmtContext _localctx = new Create_procedure_stmtContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_create_procedure_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1613);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1606);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1607);
				match(T_CREATE);
				setState(1610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1608);
					match(T_OR);
					setState(1609);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1612);
				match(T_REPLACE);
				}
				break;
			case T_PROC:
			case T_PROCEDURE:
				break;
			default:
				break;
			}
			setState(1615);
			_la = _input.LA(1);
			if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1616);
			ident();
			setState(1618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				setState(1617);
				create_routine_params();
				}
				break;
			}
			setState(1621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				{
				setState(1620);
				create_routine_options();
				}
				break;
			}
			setState(1624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1623);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1626);
				declare_block_inplace();
				}
				break;
			}
			setState(1630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1629);
				label();
				}
				break;
			}
			setState(1632);
			proc_block();
			setState(1636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1633);
				ident();
				setState(1634);
				match(T_SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_paramsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<Create_routine_param_itemContext> create_routine_param_item() {
			return getRuleContexts(Create_routine_param_itemContext.class);
		}
		public Create_routine_param_itemContext create_routine_param_item(int i) {
			return getRuleContext(Create_routine_param_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Create_routine_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_routine_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_paramsContext create_routine_params() throws RecognitionException {
		Create_routine_paramsContext _localctx = new Create_routine_paramsContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_create_routine_params);
		int _la;
		try {
			int _alt;
			setState(1660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1638);
				match(T_OPEN_P);
				setState(1639);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1640);
				match(T_OPEN_P);
				setState(1641);
				create_routine_param_item();
				setState(1646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1642);
					match(T_COMMA);
					setState(1643);
					create_routine_param_item();
					}
					}
					setState(1648);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1649);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1651);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("IS") &&
				        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
				        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
				        )) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"IS\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"AS\") &&\n        !(_input.LT(1).getText().equalsIgnoreCase(\"DYNAMIC\") && _input.LT(2).getText().equalsIgnoreCase(\"RESULT\"))\n        ");
				setState(1652);
				create_routine_param_item();
				setState(1657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1653);
						match(T_COMMA);
						setState(1654);
						create_routine_param_item();
						}
						}
					}
					setState(1659);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_param_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public TerminalNode T_OUT() { return getToken(HplsqlParser.T_OUT, 0); }
		public TerminalNode T_INOUT() { return getToken(HplsqlParser.T_INOUT, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public Create_routine_param_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_param_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_routine_param_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_param_itemContext create_routine_param_item() throws RecognitionException {
		Create_routine_param_itemContext _localctx = new Create_routine_param_itemContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_create_routine_param_item);
		try {
			int _alt;
			setState(1704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1667);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1662);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1663);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1664);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1665);
					match(T_IN);
					setState(1666);
					match(T_OUT);
					}
					break;
				}
				setState(1669);
				ident();
				setState(1670);
				dtype();
				setState(1672);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1671);
					dtype_len();
					}
					break;
				}
				setState(1677);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1674);
						dtype_attr();
						}
						}
					}
					setState(1679);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,166,_ctx);
				}
				setState(1681);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1680);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1683);
				ident();
				setState(1689);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1684);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1685);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1686);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1687);
					match(T_IN);
					setState(1688);
					match(T_OUT);
					}
					break;
				}
				setState(1691);
				dtype();
				setState(1693);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1692);
					dtype_len();
					}
					break;
				}
				setState(1698);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1695);
						dtype_attr();
						}
						}
					}
					setState(1700);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
				}
				setState(1702);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1701);
					dtype_default();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_optionsContext extends ParserRuleContext {
		public List<Create_routine_optionContext> create_routine_option() {
			return getRuleContexts(Create_routine_optionContext.class);
		}
		public Create_routine_optionContext create_routine_option(int i) {
			return getRuleContext(Create_routine_optionContext.class,i);
		}
		public Create_routine_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_options; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_routine_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_optionsContext create_routine_options() throws RecognitionException {
		Create_routine_optionsContext _localctx = new Create_routine_optionsContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_create_routine_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1707);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1706);
					create_routine_option();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1709);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_optionContext extends ParserRuleContext {
		public TerminalNode T_LANGUAGE() { return getToken(HplsqlParser.T_LANGUAGE, 0); }
		public TerminalNode T_SQL() { return getToken(HplsqlParser.T_SQL, 0); }
		public TerminalNode T_SECURITY() { return getToken(HplsqlParser.T_SECURITY, 0); }
		public TerminalNode T_CREATOR() { return getToken(HplsqlParser.T_CREATOR, 0); }
		public TerminalNode T_DEFINER() { return getToken(HplsqlParser.T_DEFINER, 0); }
		public TerminalNode T_INVOKER() { return getToken(HplsqlParser.T_INVOKER, 0); }
		public TerminalNode T_OWNER() { return getToken(HplsqlParser.T_OWNER, 0); }
		public TerminalNode T_RESULT() { return getToken(HplsqlParser.T_RESULT, 0); }
		public TerminalNode T_SETS() { return getToken(HplsqlParser.T_SETS, 0); }
		public TerminalNode L_INT() { return getToken(HplsqlParser.L_INT, 0); }
		public TerminalNode T_DYNAMIC() { return getToken(HplsqlParser.T_DYNAMIC, 0); }
		public Create_routine_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_option; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_routine_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_optionContext create_routine_option() throws RecognitionException {
		Create_routine_optionContext _localctx = new Create_routine_optionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_create_routine_option);
		int _la;
		try {
			setState(1722);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LANGUAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1711);
				match(T_LANGUAGE);
				setState(1712);
				match(T_SQL);
				}
				break;
			case T_SQL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1713);
				match(T_SQL);
				setState(1714);
				match(T_SECURITY);
				setState(1715);
				_la = _input.LA(1);
				if ( !(_la==T_CREATOR || _la==T_DEFINER || _la==T_INVOKER || _la==T_OWNER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_DYNAMIC:
			case T_RESULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DYNAMIC) {
					{
					setState(1716);
					match(T_DYNAMIC);
					}
				}

				setState(1719);
				match(T_RESULT);
				setState(1720);
				match(T_SETS);
				setState(1721);
				match(L_INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_stmtContext extends ParserRuleContext {
		public TerminalNode T_DROP() { return getToken(HplsqlParser.T_DROP, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public TerminalNode T_EXISTS() { return getToken(HplsqlParser.T_EXISTS, 0); }
		public TerminalNode T_PACKAGE() { return getToken(HplsqlParser.T_PACKAGE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_PROCEDURE() { return getToken(HplsqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_FUNCTION() { return getToken(HplsqlParser.T_FUNCTION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_DATABASE() { return getToken(HplsqlParser.T_DATABASE, 0); }
		public TerminalNode T_SCHEMA() { return getToken(HplsqlParser.T_SCHEMA, 0); }
		public Drop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDrop_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_stmtContext drop_stmt() throws RecognitionException {
		Drop_stmtContext _localctx = new Drop_stmtContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_drop_stmt);
		int _la;
		try {
			setState(1752);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1724);
				match(T_DROP);
				setState(1725);
				match(T_TABLE);
				setState(1728);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1726);
					match(T_IF);
					setState(1727);
					match(T_EXISTS);
					}
					break;
				}
				setState(1730);
				table_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1731);
				match(T_DROP);
				setState(1732);
				match(T_PACKAGE);
				setState(1735);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1733);
					match(T_IF);
					setState(1734);
					match(T_EXISTS);
					}
					break;
				}
				setState(1737);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1738);
				match(T_DROP);
				setState(1739);
				_la = _input.LA(1);
				if ( !(_la==T_FUNCTION || _la==T_PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1742);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1740);
					match(T_IF);
					setState(1741);
					match(T_EXISTS);
					}
					break;
				}
				setState(1744);
				ident();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1745);
				match(T_DROP);
				setState(1746);
				_la = _input.LA(1);
				if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1749);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1747);
					match(T_IF);
					setState(1748);
					match(T_EXISTS);
					}
					break;
				}
				setState(1751);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class End_transaction_stmtContext extends ParserRuleContext {
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(HplsqlParser.T_TRANSACTION, 0); }
		public End_transaction_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_transaction_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitEnd_transaction_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_transaction_stmtContext end_transaction_stmt() throws RecognitionException {
		End_transaction_stmtContext _localctx = new End_transaction_stmtContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_end_transaction_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1754);
			match(T_END);
			setState(1755);
			match(T_TRANSACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exec_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_EXEC() { return getToken(HplsqlParser.T_EXEC, 0); }
		public TerminalNode T_EXECUTE() { return getToken(HplsqlParser.T_EXECUTE, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(HplsqlParser.T_IMMEDIATE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_INTO() { return getToken(HplsqlParser.T_INTO, 0); }
		public List<TerminalNode> L_ID() { return getTokens(HplsqlParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(HplsqlParser.L_ID, i);
		}
		public Using_clauseContext using_clause() {
			return getRuleContext(Using_clauseContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Exec_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exec_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExec_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exec_stmtContext exec_stmt() throws RecognitionException {
		Exec_stmtContext _localctx = new Exec_stmtContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_exec_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1757);
			_la = _input.LA(1);
			if ( !(_la==T_EXEC || _la==T_EXECUTE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1758);
				match(T_IMMEDIATE);
				}
				break;
			}
			setState(1761);
			expr(0);
			setState(1767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1762);
				match(T_OPEN_P);
				setState(1763);
				expr_func_params();
				setState(1764);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1766);
				expr_func_params();
				}
				break;
			}
			setState(1778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1769);
				match(T_INTO);
				setState(1770);
				match(L_ID);
				setState(1775);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1771);
						match(T_COMMA);
						setState(1772);
						match(L_ID);
						}
						}
					}
					setState(1777);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
				}
				}
				break;
			}
			setState(1781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1780);
				using_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public If_plsql_stmtContext if_plsql_stmt() {
			return getRuleContext(If_plsql_stmtContext.class,0);
		}
		public If_tsql_stmtContext if_tsql_stmt() {
			return getRuleContext(If_tsql_stmtContext.class,0);
		}
		public If_bteq_stmtContext if_bteq_stmt() {
			return getRuleContext(If_bteq_stmtContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_if_stmt);
		try {
			setState(1786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1783);
				if_plsql_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1784);
				if_tsql_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1785);
				if_bteq_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_plsql_stmtContext extends ParserRuleContext {
		public List<TerminalNode> T_IF() { return getTokens(HplsqlParser.T_IF); }
		public TerminalNode T_IF(int i) {
			return getToken(HplsqlParser.T_IF, i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public List<Elseif_blockContext> elseif_block() {
			return getRuleContexts(Elseif_blockContext.class);
		}
		public Elseif_blockContext elseif_block(int i) {
			return getRuleContext(Elseif_blockContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_plsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_plsql_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIf_plsql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_plsql_stmtContext if_plsql_stmt() throws RecognitionException {
		If_plsql_stmtContext _localctx = new If_plsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_if_plsql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1788);
			match(T_IF);
			setState(1789);
			bool_expr(0);
			setState(1790);
			match(T_THEN);
			setState(1791);
			block();
			setState(1795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ELSEIF || _la==T_ELSIF) {
				{
				{
				setState(1792);
				elseif_block();
				}
				}
				setState(1797);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(1798);
				else_block();
				}
			}

			setState(1801);
			match(T_END);
			setState(1802);
			match(T_IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_tsql_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public List<Single_block_stmtContext> single_block_stmt() {
			return getRuleContexts(Single_block_stmtContext.class);
		}
		public Single_block_stmtContext single_block_stmt(int i) {
			return getRuleContext(Single_block_stmtContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public If_tsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_tsql_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIf_tsql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_tsql_stmtContext if_tsql_stmt() throws RecognitionException {
		If_tsql_stmtContext _localctx = new If_tsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_if_tsql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1804);
			match(T_IF);
			setState(1805);
			bool_expr(0);
			setState(1806);
			single_block_stmt();
			setState(1809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1807);
				match(T_ELSE);
				setState(1808);
				single_block_stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_bteq_stmtContext extends ParserRuleContext {
		public TerminalNode T_DOT() { return getToken(HplsqlParser.T_DOT, 0); }
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public If_bteq_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_bteq_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIf_bteq_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_bteq_stmtContext if_bteq_stmt() throws RecognitionException {
		If_bteq_stmtContext _localctx = new If_bteq_stmtContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_if_bteq_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1811);
			match(T_DOT);
			setState(1812);
			match(T_IF);
			setState(1813);
			bool_expr(0);
			setState(1814);
			match(T_THEN);
			setState(1815);
			single_block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elseif_blockContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_ELSIF() { return getToken(HplsqlParser.T_ELSIF, 0); }
		public TerminalNode T_ELSEIF() { return getToken(HplsqlParser.T_ELSEIF, 0); }
		public Elseif_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitElseif_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elseif_blockContext elseif_block() throws RecognitionException {
		Elseif_blockContext _localctx = new Elseif_blockContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_elseif_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1817);
			_la = _input.LA(1);
			if ( !(_la==T_ELSEIF || _la==T_ELSIF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1818);
			bool_expr(0);
			setState(1819);
			match(T_THEN);
			setState(1820);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1822);
			match(T_ELSE);
			setState(1823);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Include_stmtContext extends ParserRuleContext {
		public TerminalNode T_INCLUDE() { return getToken(HplsqlParser.T_INCLUDE, 0); }
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Include_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitInclude_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Include_stmtContext include_stmt() throws RecognitionException {
		Include_stmtContext _localctx = new Include_stmtContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_include_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1825);
			match(T_INCLUDE);
			setState(1828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1826);
				file_name();
				}
				break;
			case 2:
				{
				setState(1827);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_insert_stmtContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public List<With_stmtContext> with_stmt() {
			return getRuleContexts(With_stmtContext.class);
		}
		public With_stmtContext with_stmt(int i) {
			return getRuleContext(With_stmtContext.class,i);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public With_insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_insert_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitWith_insert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_insert_stmtContext with_insert_stmt() throws RecognitionException {
		With_insert_stmtContext _localctx = new With_insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_with_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			match(T_WITH);
			setState(1831);
			with_stmt();
			setState(1836);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1832);
				match(T_COMMA);
				setState(1833);
				with_stmt();
				}
				}
				setState(1838);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1839);
			insert_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_stmtContext extends ParserRuleContext {
		public Tbl_nameContext tbl_name() {
			return getRuleContext(Tbl_nameContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public With_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitWith_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_stmtContext with_stmt() throws RecognitionException {
		With_stmtContext _localctx = new With_stmtContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_with_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1841);
			tbl_name();
			setState(1842);
			match(T_AS);
			setState(1843);
			fullselect_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode T_INSERT() { return getToken(HplsqlParser.T_INSERT, 0); }
		public Target_tableContext target_table() {
			return getRuleContext(Target_tableContext.class,0);
		}
		public TerminalNode T_OVERWRITE() { return getToken(HplsqlParser.T_OVERWRITE, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public TerminalNode T_INTO() { return getToken(HplsqlParser.T_INTO, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Insert_stmt_rowsContext insert_stmt_rows() {
			return getRuleContext(Insert_stmt_rowsContext.class,0);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_insert_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1845);
			match(T_INSERT);
			setState(1852);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_OVERWRITE:
				{
				setState(1846);
				match(T_OVERWRITE);
				setState(1847);
				match(T_TABLE);
				}
				break;
			case T_INTO:
				{
				setState(1848);
				match(T_INTO);
				setState(1850);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1849);
					match(T_TABLE);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1854);
			target_table();
			setState(1857);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
			case T_WITH:
			case T_OPEN_P:
				{
				setState(1855);
				select_stmt();
				}
				break;
			case T_VALUES:
				{
				setState(1856);
				insert_stmt_rows();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Target_tableContext extends ParserRuleContext {
		public Target_table_or_partitionContext target_table_or_partition() {
			return getRuleContext(Target_table_or_partitionContext.class,0);
		}
		public Target_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target_table; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitTarget_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Target_tableContext target_table() throws RecognitionException {
		Target_tableContext _localctx = new Target_tableContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_target_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1859);
			target_table_or_partition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Target_table_or_partitionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Insert_stmt_colsContext insert_stmt_cols() {
			return getRuleContext(Insert_stmt_colsContext.class,0);
		}
		public Partition_descContext partition_desc() {
			return getRuleContext(Partition_descContext.class,0);
		}
		public Target_table_or_partitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target_table_or_partition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitTarget_table_or_partition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Target_table_or_partitionContext target_table_or_partition() throws RecognitionException {
		Target_table_or_partitionContext _localctx = new Target_table_or_partitionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_target_table_or_partition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1861);
			table_name();
			setState(1863);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1862);
				insert_stmt_cols();
				}
				break;
			}
			setState(1866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_PARTITION) {
				{
				setState(1865);
				partition_desc();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_descContext extends ParserRuleContext {
		public TerminalNode T_PARTITION() { return getToken(HplsqlParser.T_PARTITION, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<Partition_valContext> partition_val() {
			return getRuleContexts(Partition_valContext.class);
		}
		public Partition_valContext partition_val(int i) {
			return getRuleContext(Partition_valContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Partition_descContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_desc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitPartition_desc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_descContext partition_desc() throws RecognitionException {
		Partition_descContext _localctx = new Partition_descContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_partition_desc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1868);
			match(T_PARTITION);
			setState(1880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1869);
				match(T_OPEN_P);
				setState(1870);
				partition_val();
				setState(1875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1871);
					match(T_COMMA);
					setState(1872);
					partition_val();
					}
					}
					setState(1877);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1878);
				match(T_CLOSE_P);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_valContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public Partition_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_val; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitPartition_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_valContext partition_val() throws RecognitionException {
		Partition_valContext _localctx = new Partition_valContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_partition_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1882);
			ident();
			setState(1885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_EQUAL) {
				{
				setState(1883);
				match(T_EQUAL);
				setState(1884);
				expr_atom();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmt_colsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Insert_stmt_colsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt_cols; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitInsert_stmt_cols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmt_colsContext insert_stmt_cols() throws RecognitionException {
		Insert_stmt_colsContext _localctx = new Insert_stmt_colsContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_insert_stmt_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1887);
			match(T_OPEN_P);
			setState(1888);
			column_name();
			setState(1893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1889);
				match(T_COMMA);
				setState(1890);
				column_name();
				}
				}
				setState(1895);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1896);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmt_rowsContext extends ParserRuleContext {
		public TerminalNode T_VALUES() { return getToken(HplsqlParser.T_VALUES, 0); }
		public List<Insert_stmt_rowContext> insert_stmt_row() {
			return getRuleContexts(Insert_stmt_rowContext.class);
		}
		public Insert_stmt_rowContext insert_stmt_row(int i) {
			return getRuleContext(Insert_stmt_rowContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Insert_stmt_rowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt_rows; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitInsert_stmt_rows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmt_rowsContext insert_stmt_rows() throws RecognitionException {
		Insert_stmt_rowsContext _localctx = new Insert_stmt_rowsContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_insert_stmt_rows);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1898);
			match(T_VALUES);
			setState(1899);
			insert_stmt_row();
			setState(1904);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1900);
					match(T_COMMA);
					setState(1901);
					insert_stmt_row();
					}
					}
				}
				setState(1906);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmt_rowContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Insert_stmt_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt_row; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitInsert_stmt_row(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmt_rowContext insert_stmt_row() throws RecognitionException {
		Insert_stmt_rowContext _localctx = new Insert_stmt_rowContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_insert_stmt_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1907);
			match(T_OPEN_P);
			setState(1908);
			expr(0);
			setState(1913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1909);
				match(T_COMMA);
				setState(1910);
				expr(0);
				}
				}
				setState(1915);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1916);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_directory_stmtContext extends ParserRuleContext {
		public TerminalNode T_INSERT() { return getToken(HplsqlParser.T_INSERT, 0); }
		public TerminalNode T_OVERWRITE() { return getToken(HplsqlParser.T_OVERWRITE, 0); }
		public TerminalNode T_DIRECTORY() { return getToken(HplsqlParser.T_DIRECTORY, 0); }
		public Expr_fileContext expr_file() {
			return getRuleContext(Expr_fileContext.class,0);
		}
		public Expr_selectContext expr_select() {
			return getRuleContext(Expr_selectContext.class,0);
		}
		public TerminalNode T_LOCAL() { return getToken(HplsqlParser.T_LOCAL, 0); }
		public Insert_directory_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_directory_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitInsert_directory_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_directory_stmtContext insert_directory_stmt() throws RecognitionException {
		Insert_directory_stmtContext _localctx = new Insert_directory_stmtContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_insert_directory_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1918);
			match(T_INSERT);
			setState(1919);
			match(T_OVERWRITE);
			setState(1921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_LOCAL) {
				{
				setState(1920);
				match(T_LOCAL);
				}
			}

			setState(1923);
			match(T_DIRECTORY);
			setState(1924);
			expr_file();
			setState(1925);
			expr_select();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exit_stmtContext extends ParserRuleContext {
		public TerminalNode T_EXIT() { return getToken(HplsqlParser.T_EXIT, 0); }
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public TerminalNode T_WHEN() { return getToken(HplsqlParser.T_WHEN, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Exit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exit_stmtContext exit_stmt() throws RecognitionException {
		Exit_stmtContext _localctx = new Exit_stmtContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_exit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1927);
			match(T_EXIT);
			setState(1929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1928);
				match(L_ID);
				}
				break;
			}
			setState(1933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				{
				setState(1931);
				match(T_WHEN);
				setState(1932);
				bool_expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_diag_stmtContext extends ParserRuleContext {
		public TerminalNode T_GET() { return getToken(HplsqlParser.T_GET, 0); }
		public TerminalNode T_DIAGNOSTICS() { return getToken(HplsqlParser.T_DIAGNOSTICS, 0); }
		public Get_diag_stmt_itemContext get_diag_stmt_item() {
			return getRuleContext(Get_diag_stmt_itemContext.class,0);
		}
		public Get_diag_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_diag_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitGet_diag_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_diag_stmtContext get_diag_stmt() throws RecognitionException {
		Get_diag_stmtContext _localctx = new Get_diag_stmtContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_get_diag_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1935);
			match(T_GET);
			setState(1936);
			match(T_DIAGNOSTICS);
			setState(1937);
			get_diag_stmt_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_diag_stmt_itemContext extends ParserRuleContext {
		public Get_diag_stmt_exception_itemContext get_diag_stmt_exception_item() {
			return getRuleContext(Get_diag_stmt_exception_itemContext.class,0);
		}
		public Get_diag_stmt_rowcount_itemContext get_diag_stmt_rowcount_item() {
			return getRuleContext(Get_diag_stmt_rowcount_itemContext.class,0);
		}
		public Get_diag_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_diag_stmt_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitGet_diag_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_diag_stmt_itemContext get_diag_stmt_item() throws RecognitionException {
		Get_diag_stmt_itemContext _localctx = new Get_diag_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_get_diag_stmt_item);
		try {
			setState(1941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1939);
				get_diag_stmt_exception_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1940);
				get_diag_stmt_rowcount_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_diag_stmt_exception_itemContext extends ParserRuleContext {
		public TerminalNode T_EXCEPTION() { return getToken(HplsqlParser.T_EXCEPTION, 0); }
		public TerminalNode L_INT() { return getToken(HplsqlParser.L_INT, 0); }
		public QidentContext qident() {
			return getRuleContext(QidentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_MESSAGE_TEXT() { return getToken(HplsqlParser.T_MESSAGE_TEXT, 0); }
		public Get_diag_stmt_exception_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_diag_stmt_exception_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitGet_diag_stmt_exception_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_diag_stmt_exception_itemContext get_diag_stmt_exception_item() throws RecognitionException {
		Get_diag_stmt_exception_itemContext _localctx = new Get_diag_stmt_exception_itemContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_get_diag_stmt_exception_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1943);
			match(T_EXCEPTION);
			setState(1944);
			match(L_INT);
			setState(1945);
			qident();
			setState(1946);
			match(T_EQUAL);
			setState(1947);
			match(T_MESSAGE_TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_diag_stmt_rowcount_itemContext extends ParserRuleContext {
		public QidentContext qident() {
			return getRuleContext(QidentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_ROW_COUNT() { return getToken(HplsqlParser.T_ROW_COUNT, 0); }
		public Get_diag_stmt_rowcount_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_diag_stmt_rowcount_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitGet_diag_stmt_rowcount_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_diag_stmt_rowcount_itemContext get_diag_stmt_rowcount_item() throws RecognitionException {
		Get_diag_stmt_rowcount_itemContext _localctx = new Get_diag_stmt_rowcount_itemContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_get_diag_stmt_rowcount_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1949);
			qident();
			setState(1950);
			match(T_EQUAL);
			setState(1951);
			match(T_ROW_COUNT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grant_stmtContext extends ParserRuleContext {
		public TerminalNode T_GRANT() { return getToken(HplsqlParser.T_GRANT, 0); }
		public List<Grant_stmt_itemContext> grant_stmt_item() {
			return getRuleContexts(Grant_stmt_itemContext.class);
		}
		public Grant_stmt_itemContext grant_stmt_item(int i) {
			return getRuleContext(Grant_stmt_itemContext.class,i);
		}
		public TerminalNode T_TO() { return getToken(HplsqlParser.T_TO, 0); }
		public TerminalNode T_ROLE() { return getToken(HplsqlParser.T_ROLE, 0); }
		public QidentContext qident() {
			return getRuleContext(QidentContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Grant_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitGrant_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grant_stmtContext grant_stmt() throws RecognitionException {
		Grant_stmtContext _localctx = new Grant_stmtContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_grant_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1953);
			match(T_GRANT);
			setState(1954);
			grant_stmt_item();
			setState(1959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1955);
				match(T_COMMA);
				setState(1956);
				grant_stmt_item();
				}
				}
				setState(1961);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1962);
			match(T_TO);
			setState(1963);
			match(T_ROLE);
			setState(1964);
			qident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grant_stmt_itemContext extends ParserRuleContext {
		public TerminalNode T_EXECUTE() { return getToken(HplsqlParser.T_EXECUTE, 0); }
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(HplsqlParser.T_PROCEDURE, 0); }
		public QidentContext qident() {
			return getRuleContext(QidentContext.class,0);
		}
		public Grant_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant_stmt_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitGrant_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grant_stmt_itemContext grant_stmt_item() throws RecognitionException {
		Grant_stmt_itemContext _localctx = new Grant_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_grant_stmt_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1966);
			match(T_EXECUTE);
			setState(1967);
			match(T_ON);
			setState(1968);
			match(T_PROCEDURE);
			setState(1969);
			qident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Leave_stmtContext extends ParserRuleContext {
		public TerminalNode T_LEAVE() { return getToken(HplsqlParser.T_LEAVE, 0); }
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public Leave_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leave_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitLeave_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Leave_stmtContext leave_stmt() throws RecognitionException {
		Leave_stmtContext _localctx = new Leave_stmtContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_leave_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1971);
			match(T_LEAVE);
			setState(1973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1972);
				match(L_ID);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Map_object_stmtContext extends ParserRuleContext {
		public TerminalNode T_MAP() { return getToken(HplsqlParser.T_MAP, 0); }
		public TerminalNode T_OBJECT() { return getToken(HplsqlParser.T_OBJECT, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_TO() { return getToken(HplsqlParser.T_TO, 0); }
		public TerminalNode T_AT() { return getToken(HplsqlParser.T_AT, 0); }
		public Map_object_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_object_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitMap_object_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Map_object_stmtContext map_object_stmt() throws RecognitionException {
		Map_object_stmtContext _localctx = new Map_object_stmtContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_map_object_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1975);
			match(T_MAP);
			setState(1976);
			match(T_OBJECT);
			setState(1977);
			ident();
			setState(1980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1978);
				match(T_TO);
				setState(1979);
				ident();
				}
				break;
			}
			setState(1984);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1982);
				match(T_AT);
				setState(1983);
				ident();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Open_stmtContext extends ParserRuleContext {
		public TerminalNode T_OPEN() { return getToken(HplsqlParser.T_OPEN, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Open_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitOpen_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_stmtContext open_stmt() throws RecognitionException {
		Open_stmtContext _localctx = new Open_stmtContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_open_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1986);
			match(T_OPEN);
			setState(1987);
			ident();
			setState(1993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				{
				setState(1988);
				match(T_FOR);
				setState(1991);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1989);
					select_stmt();
					}
					break;
				case 2:
					{
					setState(1990);
					expr(0);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fetch_stmtContext extends ParserRuleContext {
		public TerminalNode T_FETCH() { return getToken(HplsqlParser.T_FETCH, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_INTO() { return getToken(HplsqlParser.T_INTO, 0); }
		public TerminalNode T_FROM() { return getToken(HplsqlParser.T_FROM, 0); }
		public Bulk_collect_clauseContext bulk_collect_clause() {
			return getRuleContext(Bulk_collect_clauseContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Fetch_limitContext fetch_limit() {
			return getRuleContext(Fetch_limitContext.class,0);
		}
		public Fetch_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFetch_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fetch_stmtContext fetch_stmt() throws RecognitionException {
		Fetch_stmtContext _localctx = new Fetch_stmtContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_fetch_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1995);
			match(T_FETCH);
			setState(1997);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_FROM) {
				{
				setState(1996);
				match(T_FROM);
				}
			}

			setState(1999);
			ident();
			setState(2001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BULK) {
				{
				setState(2000);
				bulk_collect_clause();
				}
			}

			setState(2003);
			match(T_INTO);
			setState(2004);
			ident();
			setState(2009);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2005);
					match(T_COMMA);
					setState(2006);
					ident();
					}
					}
				}
				setState(2011);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
			}
			setState(2013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				{
				setState(2012);
				fetch_limit();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fetch_limitContext extends ParserRuleContext {
		public TerminalNode T_LIMIT() { return getToken(HplsqlParser.T_LIMIT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Fetch_limitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_limit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFetch_limit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fetch_limitContext fetch_limit() throws RecognitionException {
		Fetch_limitContext _localctx = new Fetch_limitContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_fetch_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2015);
			match(T_LIMIT);
			setState(2016);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collect_stats_stmtContext extends ParserRuleContext {
		public TerminalNode T_COLLECT() { return getToken(HplsqlParser.T_COLLECT, 0); }
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_STATISTICS() { return getToken(HplsqlParser.T_STATISTICS, 0); }
		public TerminalNode T_STATS() { return getToken(HplsqlParser.T_STATS, 0); }
		public Collect_stats_clauseContext collect_stats_clause() {
			return getRuleContext(Collect_stats_clauseContext.class,0);
		}
		public Collect_stats_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collect_stats_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCollect_stats_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collect_stats_stmtContext collect_stats_stmt() throws RecognitionException {
		Collect_stats_stmtContext _localctx = new Collect_stats_stmtContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_collect_stats_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2018);
			match(T_COLLECT);
			setState(2019);
			_la = _input.LA(1);
			if ( !(_la==T_STATS || _la==T_STATISTICS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2020);
			match(T_ON);
			setState(2021);
			table_name();
			setState(2023);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(2022);
				collect_stats_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collect_stats_clauseContext extends ParserRuleContext {
		public TerminalNode T_COLUMN() { return getToken(HplsqlParser.T_COLUMN, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<QidentContext> qident() {
			return getRuleContexts(QidentContext.class);
		}
		public QidentContext qident(int i) {
			return getRuleContext(QidentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Collect_stats_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collect_stats_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCollect_stats_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collect_stats_clauseContext collect_stats_clause() throws RecognitionException {
		Collect_stats_clauseContext _localctx = new Collect_stats_clauseContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_collect_stats_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2025);
			match(T_COLUMN);
			setState(2026);
			match(T_OPEN_P);
			setState(2027);
			qident();
			setState(2032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2028);
				match(T_COMMA);
				setState(2029);
				qident();
				}
				}
				setState(2034);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2035);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Close_stmtContext extends ParserRuleContext {
		public TerminalNode T_CLOSE() { return getToken(HplsqlParser.T_CLOSE, 0); }
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public Close_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitClose_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Close_stmtContext close_stmt() throws RecognitionException {
		Close_stmtContext _localctx = new Close_stmtContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_close_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2037);
			match(T_CLOSE);
			setState(2038);
			match(L_ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmp_stmtContext extends ParserRuleContext {
		public TerminalNode T_CMP() { return getToken(HplsqlParser.T_CMP, 0); }
		public List<Cmp_sourceContext> cmp_source() {
			return getRuleContexts(Cmp_sourceContext.class);
		}
		public Cmp_sourceContext cmp_source(int i) {
			return getRuleContext(Cmp_sourceContext.class,i);
		}
		public TerminalNode T_COMMA() { return getToken(HplsqlParser.T_COMMA, 0); }
		public TerminalNode T_ROW_COUNT() { return getToken(HplsqlParser.T_ROW_COUNT, 0); }
		public TerminalNode T_SUM() { return getToken(HplsqlParser.T_SUM, 0); }
		public Cmp_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCmp_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmp_stmtContext cmp_stmt() throws RecognitionException {
		Cmp_stmtContext _localctx = new Cmp_stmtContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_cmp_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2040);
			match(T_CMP);
			setState(2041);
			_la = _input.LA(1);
			if ( !(_la==T_ROW_COUNT || _la==T_SUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2042);
			cmp_source();
			setState(2043);
			match(T_COMMA);
			setState(2044);
			cmp_source();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cmp_sourceContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_AT() { return getToken(HplsqlParser.T_AT, 0); }
		public QidentContext qident() {
			return getRuleContext(QidentContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Cmp_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp_source; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCmp_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmp_sourceContext cmp_source() throws RecognitionException {
		Cmp_sourceContext _localctx = new Cmp_sourceContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_cmp_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2054);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BULK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LIKE:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_TYPE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_SUB:
			case L_ID:
			case L_DIGIT_NAME:
				{
				setState(2046);
				table_name();
				setState(2048);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(2047);
					where_clause();
					}
					break;
				}
				}
				break;
			case T_OPEN_P:
				{
				setState(2050);
				match(T_OPEN_P);
				setState(2051);
				select_stmt();
				setState(2052);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2058);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(2056);
				match(T_AT);
				setState(2057);
				qident();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Copy_from_local_stmtContext extends ParserRuleContext {
		public TerminalNode T_COPY() { return getToken(HplsqlParser.T_COPY, 0); }
		public TerminalNode T_FROM() { return getToken(HplsqlParser.T_FROM, 0); }
		public TerminalNode T_LOCAL() { return getToken(HplsqlParser.T_LOCAL, 0); }
		public List<Copy_sourceContext> copy_source() {
			return getRuleContexts(Copy_sourceContext.class);
		}
		public Copy_sourceContext copy_source(int i) {
			return getRuleContext(Copy_sourceContext.class,i);
		}
		public TerminalNode T_TO() { return getToken(HplsqlParser.T_TO, 0); }
		public Copy_targetContext copy_target() {
			return getRuleContext(Copy_targetContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public List<Copy_file_optionContext> copy_file_option() {
			return getRuleContexts(Copy_file_optionContext.class);
		}
		public Copy_file_optionContext copy_file_option(int i) {
			return getRuleContext(Copy_file_optionContext.class,i);
		}
		public Copy_from_local_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_from_local_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCopy_from_local_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_from_local_stmtContext copy_from_local_stmt() throws RecognitionException {
		Copy_from_local_stmtContext _localctx = new Copy_from_local_stmtContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_copy_from_local_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2060);
			match(T_COPY);
			setState(2061);
			match(T_FROM);
			setState(2062);
			match(T_LOCAL);
			setState(2063);
			copy_source();
			setState(2068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2064);
				match(T_COMMA);
				setState(2065);
				copy_source();
				}
				}
				setState(2070);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2071);
			match(T_TO);
			setState(2072);
			copy_target();
			setState(2076);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2073);
					copy_file_option();
					}
					}
				}
				setState(2078);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Copy_stmtContext extends ParserRuleContext {
		public TerminalNode T_COPY() { return getToken(HplsqlParser.T_COPY, 0); }
		public TerminalNode T_TO() { return getToken(HplsqlParser.T_TO, 0); }
		public Copy_targetContext copy_target() {
			return getRuleContext(Copy_targetContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_HDFS() { return getToken(HplsqlParser.T_HDFS, 0); }
		public List<Copy_optionContext> copy_option() {
			return getRuleContexts(Copy_optionContext.class);
		}
		public Copy_optionContext copy_option(int i) {
			return getRuleContext(Copy_optionContext.class,i);
		}
		public Copy_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCopy_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_stmtContext copy_stmt() throws RecognitionException {
		Copy_stmtContext _localctx = new Copy_stmtContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_copy_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2079);
			match(T_COPY);
			setState(2085);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BULK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LIKE:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_TYPE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_SUB:
			case L_ID:
			case L_DIGIT_NAME:
				{
				setState(2080);
				table_name();
				}
				break;
			case T_OPEN_P:
				{
				setState(2081);
				match(T_OPEN_P);
				setState(2082);
				select_stmt();
				setState(2083);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2087);
			match(T_TO);
			setState(2089);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(2088);
				match(T_HDFS);
				}
				break;
			}
			setState(2091);
			copy_target();
			setState(2095);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2092);
					copy_option();
					}
					}
				}
				setState(2097);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Copy_sourceContext extends ParserRuleContext {
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Copy_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_source; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCopy_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_sourceContext copy_source() throws RecognitionException {
		Copy_sourceContext _localctx = new Copy_sourceContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_copy_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(2098);
				file_name();
				}
				break;
			case 2:
				{
				setState(2099);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Copy_targetContext extends ParserRuleContext {
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Copy_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_target; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCopy_target(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_targetContext copy_target() throws RecognitionException {
		Copy_targetContext _localctx = new Copy_targetContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_copy_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(2102);
				file_name();
				}
				break;
			case 2:
				{
				setState(2103);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Copy_optionContext extends ParserRuleContext {
		public TerminalNode T_AT() { return getToken(HplsqlParser.T_AT, 0); }
		public QidentContext qident() {
			return getRuleContext(QidentContext.class,0);
		}
		public TerminalNode T_BATCHSIZE() { return getToken(HplsqlParser.T_BATCHSIZE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_DELIMITER() { return getToken(HplsqlParser.T_DELIMITER, 0); }
		public TerminalNode T_SQLINSERT() { return getToken(HplsqlParser.T_SQLINSERT, 0); }
		public Copy_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_option; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCopy_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_optionContext copy_option() throws RecognitionException {
		Copy_optionContext _localctx = new Copy_optionContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_copy_option);
		try {
			setState(2114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2106);
				match(T_AT);
				setState(2107);
				qident();
				}
				break;
			case T_BATCHSIZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2108);
				match(T_BATCHSIZE);
				setState(2109);
				expr(0);
				}
				break;
			case T_DELIMITER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2110);
				match(T_DELIMITER);
				setState(2111);
				expr(0);
				}
				break;
			case T_SQLINSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(2112);
				match(T_SQLINSERT);
				setState(2113);
				qident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Copy_file_optionContext extends ParserRuleContext {
		public TerminalNode T_DELETE() { return getToken(HplsqlParser.T_DELETE, 0); }
		public TerminalNode T_IGNORE() { return getToken(HplsqlParser.T_IGNORE, 0); }
		public TerminalNode T_OVERWRITE() { return getToken(HplsqlParser.T_OVERWRITE, 0); }
		public Copy_file_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_file_option; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCopy_file_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Copy_file_optionContext copy_file_option() throws RecognitionException {
		Copy_file_optionContext _localctx = new Copy_file_optionContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_copy_file_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2116);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_IGNORE || _la==T_OVERWRITE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Commit_stmtContext extends ParserRuleContext {
		public TerminalNode T_COMMIT() { return getToken(HplsqlParser.T_COMMIT, 0); }
		public TerminalNode T_WORK() { return getToken(HplsqlParser.T_WORK, 0); }
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCommit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_commit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2118);
			match(T_COMMIT);
			setState(2120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(2119);
				match(T_WORK);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_INDEX() { return getToken(HplsqlParser.T_INDEX, 0); }
		public QidentContext qident() {
			return getRuleContext(QidentContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<Create_index_colContext> create_index_col() {
			return getRuleContexts(Create_index_colContext.class);
		}
		public Create_index_colContext create_index_col(int i) {
			return getRuleContext(Create_index_colContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HplsqlParser.T_UNIQUE, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2122);
			match(T_CREATE);
			setState(2124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UNIQUE) {
				{
				setState(2123);
				match(T_UNIQUE);
				}
			}

			setState(2126);
			match(T_INDEX);
			setState(2127);
			qident();
			setState(2128);
			match(T_ON);
			setState(2129);
			table_name();
			setState(2130);
			match(T_OPEN_P);
			setState(2131);
			create_index_col();
			setState(2136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2132);
				match(T_COMMA);
				setState(2133);
				create_index_col();
				}
				}
				setState(2138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2139);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_colContext extends ParserRuleContext {
		public QidentContext qident() {
			return getRuleContext(QidentContext.class,0);
		}
		public TerminalNode T_ASC() { return getToken(HplsqlParser.T_ASC, 0); }
		public TerminalNode T_DESC() { return getToken(HplsqlParser.T_DESC, 0); }
		public Create_index_colContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_col; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCreate_index_col(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_colContext create_index_col() throws RecognitionException {
		Create_index_colContext _localctx = new Create_index_colContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_create_index_col);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2141);
			qident();
			setState(2143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ASC || _la==T_DESC) {
				{
				setState(2142);
				_la = _input.LA(1);
				if ( !(_la==T_ASC || _la==T_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_storage_clauseContext extends ParserRuleContext {
		public Index_mssql_storage_clauseContext index_mssql_storage_clause() {
			return getRuleContext(Index_mssql_storage_clauseContext.class,0);
		}
		public Index_storage_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_storage_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIndex_storage_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_storage_clauseContext index_storage_clause() throws RecognitionException {
		Index_storage_clauseContext _localctx = new Index_storage_clauseContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_index_storage_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2145);
			index_mssql_storage_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_mssql_storage_clauseContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<QidentContext> qident() {
			return getRuleContexts(QidentContext.class);
		}
		public QidentContext qident(int i) {
			return getRuleContext(QidentContext.class,i);
		}
		public List<TerminalNode> T_EQUAL() { return getTokens(HplsqlParser.T_EQUAL); }
		public TerminalNode T_EQUAL(int i) {
			return getToken(HplsqlParser.T_EQUAL, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public List<Create_table_options_mssql_itemContext> create_table_options_mssql_item() {
			return getRuleContexts(Create_table_options_mssql_itemContext.class);
		}
		public Create_table_options_mssql_itemContext create_table_options_mssql_item(int i) {
			return getRuleContext(Create_table_options_mssql_itemContext.class,i);
		}
		public Index_mssql_storage_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_mssql_storage_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIndex_mssql_storage_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_mssql_storage_clauseContext index_mssql_storage_clause() throws RecognitionException {
		Index_mssql_storage_clauseContext _localctx = new Index_mssql_storage_clauseContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_index_mssql_storage_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2147);
			match(T_WITH);
			setState(2148);
			match(T_OPEN_P);
			setState(2149);
			qident();
			setState(2150);
			match(T_EQUAL);
			setState(2151);
			qident();
			setState(2159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2152);
				match(T_COMMA);
				setState(2153);
				qident();
				setState(2154);
				match(T_EQUAL);
				setState(2155);
				qident();
				}
				}
				setState(2161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2162);
			match(T_CLOSE_P);
			setState(2166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2163);
					create_table_options_mssql_item();
					}
					}
				}
				setState(2168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_stmtContext extends ParserRuleContext {
		public TerminalNode T_PRINT() { return getToken(HplsqlParser.T_PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Print_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitPrint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stmtContext print_stmt() throws RecognitionException {
		Print_stmtContext _localctx = new Print_stmtContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_print_stmt);
		try {
			setState(2176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2169);
				match(T_PRINT);
				setState(2170);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2171);
				match(T_PRINT);
				setState(2172);
				match(T_OPEN_P);
				setState(2173);
				expr(0);
				setState(2174);
				match(T_CLOSE_P);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quit_stmtContext extends ParserRuleContext {
		public TerminalNode T_QUIT() { return getToken(HplsqlParser.T_QUIT, 0); }
		public TerminalNode T_DOT() { return getToken(HplsqlParser.T_DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Quit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quit_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitQuit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quit_stmtContext quit_stmt() throws RecognitionException {
		Quit_stmtContext _localctx = new Quit_stmtContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_quit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_DOT) {
				{
				setState(2178);
				match(T_DOT);
				}
			}

			setState(2181);
			match(T_QUIT);
			setState(2183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(2182);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raise_stmtContext extends ParserRuleContext {
		public TerminalNode T_RAISE() { return getToken(HplsqlParser.T_RAISE, 0); }
		public Raise_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitRaise_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_stmtContext raise_stmt() throws RecognitionException {
		Raise_stmtContext _localctx = new Raise_stmtContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_raise_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2185);
			match(T_RAISE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Resignal_stmtContext extends ParserRuleContext {
		public TerminalNode T_RESIGNAL() { return getToken(HplsqlParser.T_RESIGNAL, 0); }
		public TerminalNode T_SQLSTATE() { return getToken(HplsqlParser.T_SQLSTATE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_VALUE() { return getToken(HplsqlParser.T_VALUE, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public TerminalNode T_MESSAGE_TEXT() { return getToken(HplsqlParser.T_MESSAGE_TEXT, 0); }
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public Resignal_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resignal_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitResignal_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Resignal_stmtContext resignal_stmt() throws RecognitionException {
		Resignal_stmtContext _localctx = new Resignal_stmtContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_resignal_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2187);
			match(T_RESIGNAL);
			setState(2199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(2188);
				match(T_SQLSTATE);
				setState(2190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(2189);
					match(T_VALUE);
					}
					break;
				}
				setState(2192);
				expr(0);
				setState(2197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(2193);
					match(T_SET);
					setState(2194);
					match(T_MESSAGE_TEXT);
					setState(2195);
					match(T_EQUAL);
					setState(2196);
					expr(0);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode T_RETURN() { return getToken(HplsqlParser.T_RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2201);
			match(T_RETURN);
			setState(2203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(2202);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rollback_stmtContext extends ParserRuleContext {
		public TerminalNode T_ROLLBACK() { return getToken(HplsqlParser.T_ROLLBACK, 0); }
		public TerminalNode T_WORK() { return getToken(HplsqlParser.T_WORK, 0); }
		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitRollback_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rollback_stmtContext rollback_stmt() throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_rollback_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2205);
			match(T_ROLLBACK);
			setState(2207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				setState(2206);
				match(T_WORK);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_session_optionContext extends ParserRuleContext {
		public Set_current_schema_optionContext set_current_schema_option() {
			return getRuleContext(Set_current_schema_optionContext.class,0);
		}
		public Set_mssql_session_optionContext set_mssql_session_option() {
			return getRuleContext(Set_mssql_session_optionContext.class,0);
		}
		public Set_teradata_session_optionContext set_teradata_session_option() {
			return getRuleContext(Set_teradata_session_optionContext.class,0);
		}
		public Set_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_session_option; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSet_session_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_session_optionContext set_session_option() throws RecognitionException {
		Set_session_optionContext _localctx = new Set_session_optionContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_set_session_option);
		try {
			setState(2212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_SCHEMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(2209);
				set_current_schema_option();
				}
				break;
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_NOCOUNT:
			case T_QUOTED_IDENTIFIER:
			case T_XACT_ABORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2210);
				set_mssql_session_option();
				}
				break;
			case T_QUERY_BAND:
				enterOuterAlt(_localctx, 3);
				{
				setState(2211);
				set_teradata_session_option();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_current_schema_optionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CURRENT_SCHEMA() { return getToken(HplsqlParser.T_CURRENT_SCHEMA, 0); }
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_SCHEMA() { return getToken(HplsqlParser.T_SCHEMA, 0); }
		public TerminalNode T_CURRENT() { return getToken(HplsqlParser.T_CURRENT, 0); }
		public Set_current_schema_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_current_schema_option; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSet_current_schema_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_current_schema_optionContext set_current_schema_option() throws RecognitionException {
		Set_current_schema_optionContext _localctx = new Set_current_schema_optionContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_set_current_schema_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CURRENT:
			case T_SCHEMA:
				{
				{
				setState(2215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CURRENT) {
					{
					setState(2214);
					match(T_CURRENT);
					}
				}

				setState(2217);
				match(T_SCHEMA);
				}
				}
				break;
			case T_CURRENT_SCHEMA:
				{
				setState(2218);
				match(T_CURRENT_SCHEMA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_EQUAL) {
				{
				setState(2221);
				match(T_EQUAL);
				}
			}

			setState(2224);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_mssql_session_optionContext extends ParserRuleContext {
		public TerminalNode T_ANSI_NULLS() { return getToken(HplsqlParser.T_ANSI_NULLS, 0); }
		public TerminalNode T_ANSI_PADDING() { return getToken(HplsqlParser.T_ANSI_PADDING, 0); }
		public TerminalNode T_NOCOUNT() { return getToken(HplsqlParser.T_NOCOUNT, 0); }
		public TerminalNode T_QUOTED_IDENTIFIER() { return getToken(HplsqlParser.T_QUOTED_IDENTIFIER, 0); }
		public TerminalNode T_XACT_ABORT() { return getToken(HplsqlParser.T_XACT_ABORT, 0); }
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_OFF() { return getToken(HplsqlParser.T_OFF, 0); }
		public Set_mssql_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_mssql_session_option; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSet_mssql_session_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_mssql_session_optionContext set_mssql_session_option() throws RecognitionException {
		Set_mssql_session_optionContext _localctx = new Set_mssql_session_optionContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_set_mssql_session_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2226);
			_la = _input.LA(1);
			if ( !(_la==T_ANSI_NULLS || _la==T_ANSI_PADDING || _la==T_NOCOUNT || _la==T_QUOTED_IDENTIFIER || _la==T_XACT_ABORT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2227);
			_la = _input.LA(1);
			if ( !(_la==T_OFF || _la==T_ON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_teradata_session_optionContext extends ParserRuleContext {
		public TerminalNode T_QUERY_BAND() { return getToken(HplsqlParser.T_QUERY_BAND, 0); }
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(HplsqlParser.T_TRANSACTION, 0); }
		public TerminalNode T_SESSION() { return getToken(HplsqlParser.T_SESSION, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_NONE() { return getToken(HplsqlParser.T_NONE, 0); }
		public TerminalNode T_UPDATE() { return getToken(HplsqlParser.T_UPDATE, 0); }
		public Set_teradata_session_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_teradata_session_option; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSet_teradata_session_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_teradata_session_optionContext set_teradata_session_option() throws RecognitionException {
		Set_teradata_session_optionContext _localctx = new Set_teradata_session_optionContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_set_teradata_session_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2229);
			match(T_QUERY_BAND);
			setState(2230);
			match(T_EQUAL);
			setState(2233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(2231);
				expr(0);
				}
				break;
			case 2:
				{
				setState(2232);
				match(T_NONE);
				}
				break;
			}
			setState(2236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UPDATE) {
				{
				setState(2235);
				match(T_UPDATE);
				}
			}

			setState(2238);
			match(T_FOR);
			setState(2239);
			_la = _input.LA(1);
			if ( !(_la==T_SESSION || _la==T_TRANSACTION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signal_stmtContext extends ParserRuleContext {
		public TerminalNode T_SIGNAL() { return getToken(HplsqlParser.T_SIGNAL, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Signal_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signal_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSignal_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signal_stmtContext signal_stmt() throws RecognitionException {
		Signal_stmtContext _localctx = new Signal_stmtContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_signal_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2241);
			match(T_SIGNAL);
			setState(2242);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Summary_stmtContext extends ParserRuleContext {
		public TerminalNode T_SUMMARY() { return getToken(HplsqlParser.T_SUMMARY, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_TOP() { return getToken(HplsqlParser.T_TOP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode T_LIMIT() { return getToken(HplsqlParser.T_LIMIT, 0); }
		public Summary_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_summary_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSummary_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Summary_stmtContext summary_stmt() throws RecognitionException {
		Summary_stmtContext _localctx = new Summary_stmtContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_summary_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2244);
			match(T_SUMMARY);
			setState(2247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_TOP) {
				{
				setState(2245);
				match(T_TOP);
				setState(2246);
				expr(0);
				}
			}

			setState(2249);
			match(T_FOR);
			setState(2259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(2250);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(2251);
				table_name();
				setState(2253);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
				case 1:
					{
					setState(2252);
					where_clause();
					}
					break;
				}
				setState(2257);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(2255);
					match(T_LIMIT);
					setState(2256);
					expr(0);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Truncate_stmtContext extends ParserRuleContext {
		public TerminalNode T_TRUNCATE() { return getToken(HplsqlParser.T_TRUNCATE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public Truncate_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncate_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitTruncate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Truncate_stmtContext truncate_stmt() throws RecognitionException {
		Truncate_stmtContext _localctx = new Truncate_stmtContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_truncate_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2261);
			match(T_TRUNCATE);
			setState(2263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(2262);
				match(T_TABLE);
				}
				break;
			}
			setState(2265);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Use_stmtContext extends ParserRuleContext {
		public TerminalNode T_USE() { return getToken(HplsqlParser.T_USE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Use_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitUse_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_stmtContext use_stmt() throws RecognitionException {
		Use_stmtContext _localctx = new Use_stmtContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_use_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2267);
			match(T_USE);
			setState(2268);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Values_into_stmtContext extends ParserRuleContext {
		public TerminalNode T_VALUES() { return getToken(HplsqlParser.T_VALUES, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_INTO() { return getToken(HplsqlParser.T_INTO, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_OPEN_P() { return getTokens(HplsqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HplsqlParser.T_OPEN_P, i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HplsqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HplsqlParser.T_CLOSE_P, i);
		}
		public Values_into_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values_into_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitValues_into_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Values_into_stmtContext values_into_stmt() throws RecognitionException {
		Values_into_stmtContext _localctx = new Values_into_stmtContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_values_into_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2270);
			match(T_VALUES);
			setState(2272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				setState(2271);
				match(T_OPEN_P);
				}
				break;
			}
			setState(2274);
			expr(0);
			setState(2279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2275);
				match(T_COMMA);
				setState(2276);
				expr(0);
				}
				}
				setState(2281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_CLOSE_P) {
				{
				setState(2282);
				match(T_CLOSE_P);
				}
			}

			setState(2285);
			match(T_INTO);
			setState(2287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(2286);
				match(T_OPEN_P);
				}
			}

			setState(2289);
			ident();
			setState(2294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2290);
					match(T_COMMA);
					setState(2291);
					ident();
					}
					}
				}
				setState(2296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			}
			setState(2298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				{
				setState(2297);
				match(T_CLOSE_P);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_stmtContext extends ParserRuleContext {
		public List<TerminalNode> T_WHILE() { return getTokens(HplsqlParser.T_WHILE); }
		public TerminalNode T_WHILE(int i) {
			return getToken(HplsqlParser.T_WHILE, i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public TerminalNode T_DO() { return getToken(HplsqlParser.T_DO, 0); }
		public List<TerminalNode> T_LOOP() { return getTokens(HplsqlParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(HplsqlParser.T_LOOP, i);
		}
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public TerminalNode T_BEGIN() { return getToken(HplsqlParser.T_BEGIN, 0); }
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2300);
			match(T_WHILE);
			setState(2301);
			bool_expr(0);
			setState(2302);
			_la = _input.LA(1);
			if ( !(_la==T_BEGIN || _la==T_DO || _la==T_LOOP || _la==T_THEN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2303);
			block();
			setState(2304);
			match(T_END);
			setState(2306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				{
				setState(2305);
				_la = _input.LA(1);
				if ( !(_la==T_LOOP || _la==T_WHILE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unconditional_loop_stmtContext extends ParserRuleContext {
		public List<TerminalNode> T_LOOP() { return getTokens(HplsqlParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(HplsqlParser.T_LOOP, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public Unconditional_loop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unconditional_loop_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitUnconditional_loop_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unconditional_loop_stmtContext unconditional_loop_stmt() throws RecognitionException {
		Unconditional_loop_stmtContext _localctx = new Unconditional_loop_stmtContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_unconditional_loop_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2308);
			match(T_LOOP);
			setState(2309);
			block();
			setState(2310);
			match(T_END);
			setState(2311);
			match(T_LOOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_cursor_stmtContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_LOOP() { return getTokens(HplsqlParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(HplsqlParser.T_LOOP, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public For_cursor_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_cursor_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFor_cursor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_cursor_stmtContext for_cursor_stmt() throws RecognitionException {
		For_cursor_stmtContext _localctx = new For_cursor_stmtContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_for_cursor_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2313);
			match(T_FOR);
			setState(2314);
			match(L_ID);
			setState(2315);
			match(T_IN);
			setState(2317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(2316);
				match(T_OPEN_P);
				}
				break;
			}
			setState(2319);
			select_stmt();
			setState(2321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_CLOSE_P) {
				{
				setState(2320);
				match(T_CLOSE_P);
				}
			}

			setState(2323);
			match(T_LOOP);
			setState(2324);
			block();
			setState(2325);
			match(T_END);
			setState(2326);
			match(T_LOOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_range_stmtContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_DOT2() { return getToken(HplsqlParser.T_DOT2, 0); }
		public List<TerminalNode> T_LOOP() { return getTokens(HplsqlParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(HplsqlParser.T_LOOP, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public TerminalNode T_REVERSE() { return getToken(HplsqlParser.T_REVERSE, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public TerminalNode T_STEP() { return getToken(HplsqlParser.T_STEP, 0); }
		public For_range_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_range_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFor_range_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_range_stmtContext for_range_stmt() throws RecognitionException {
		For_range_stmtContext _localctx = new For_range_stmtContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_for_range_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2328);
			match(T_FOR);
			setState(2329);
			match(L_ID);
			setState(2330);
			match(T_IN);
			setState(2332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				{
				setState(2331);
				match(T_REVERSE);
				}
				break;
			}
			setState(2334);
			expr(0);
			setState(2335);
			match(T_DOT2);
			setState(2336);
			expr(0);
			setState(2339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BY || _la==T_STEP) {
				{
				setState(2337);
				_la = _input.LA(1);
				if ( !(_la==T_BY || _la==T_STEP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2338);
				expr(0);
				}
			}

			setState(2341);
			match(T_LOOP);
			setState(2342);
			block();
			setState(2343);
			match(T_END);
			setState(2344);
			match(T_LOOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode L_LABEL() { return getToken(HplsqlParser.L_LABEL, 0); }
		public List<TerminalNode> T_LESS() { return getTokens(HplsqlParser.T_LESS); }
		public TerminalNode T_LESS(int i) {
			return getToken(HplsqlParser.T_LESS, i);
		}
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public List<TerminalNode> T_GREATER() { return getTokens(HplsqlParser.T_GREATER); }
		public TerminalNode T_GREATER(int i) {
			return getToken(HplsqlParser.T_GREATER, i);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_label);
		try {
			setState(2352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_LABEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2346);
				match(L_LABEL);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(2347);
				match(T_LESS);
				setState(2348);
				match(T_LESS);
				setState(2349);
				match(L_ID);
				setState(2350);
				match(T_GREATER);
				setState(2351);
				match(T_GREATER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Using_clauseContext extends ParserRuleContext {
		public TerminalNode T_USING() { return getToken(HplsqlParser.T_USING, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Using_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitUsing_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Using_clauseContext using_clause() throws RecognitionException {
		Using_clauseContext _localctx = new Using_clauseContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_using_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2354);
			match(T_USING);
			setState(2355);
			expr(0);
			setState(2360);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2356);
					match(T_COMMA);
					setState(2357);
					expr(0);
					}
					}
				}
				setState(2362);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,267,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public Cte_select_stmtContext cte_select_stmt() {
			return getRuleContext(Cte_select_stmtContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_WITH) {
				{
				setState(2363);
				cte_select_stmt();
				}
			}

			setState(2366);
			fullselect_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_select_stmtContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public List<Cte_select_stmt_itemContext> cte_select_stmt_item() {
			return getRuleContexts(Cte_select_stmt_itemContext.class);
		}
		public Cte_select_stmt_itemContext cte_select_stmt_item(int i) {
			return getRuleContext(Cte_select_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Cte_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCte_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_stmtContext cte_select_stmt() throws RecognitionException {
		Cte_select_stmtContext _localctx = new Cte_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_cte_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2368);
			match(T_WITH);
			setState(2369);
			cte_select_stmt_item();
			setState(2374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2370);
				match(T_COMMA);
				setState(2371);
				cte_select_stmt_item();
				}
				}
				setState(2376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_select_stmt_itemContext extends ParserRuleContext {
		public QidentContext qident() {
			return getRuleContext(QidentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Cte_select_colsContext cte_select_cols() {
			return getRuleContext(Cte_select_colsContext.class,0);
		}
		public Cte_select_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_stmt_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCte_select_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_stmt_itemContext cte_select_stmt_item() throws RecognitionException {
		Cte_select_stmt_itemContext _localctx = new Cte_select_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_cte_select_stmt_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2377);
			qident();
			setState(2379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(2378);
				cte_select_cols();
				}
			}

			setState(2381);
			match(T_AS);
			setState(2382);
			match(T_OPEN_P);
			setState(2383);
			fullselect_stmt();
			setState(2384);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_select_colsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<QidentContext> qident() {
			return getRuleContexts(QidentContext.class);
		}
		public QidentContext qident(int i) {
			return getRuleContext(QidentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Cte_select_colsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_cols; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCte_select_cols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_colsContext cte_select_cols() throws RecognitionException {
		Cte_select_colsContext _localctx = new Cte_select_colsContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_cte_select_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2386);
			match(T_OPEN_P);
			setState(2387);
			qident();
			setState(2392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2388);
				match(T_COMMA);
				setState(2389);
				qident();
				}
				}
				setState(2394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2395);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fullselect_stmtContext extends ParserRuleContext {
		public List<Fullselect_stmt_itemContext> fullselect_stmt_item() {
			return getRuleContexts(Fullselect_stmt_itemContext.class);
		}
		public Fullselect_stmt_itemContext fullselect_stmt_item(int i) {
			return getRuleContext(Fullselect_stmt_itemContext.class,i);
		}
		public List<Fullselect_set_clauseContext> fullselect_set_clause() {
			return getRuleContexts(Fullselect_set_clauseContext.class);
		}
		public Fullselect_set_clauseContext fullselect_set_clause(int i) {
			return getRuleContext(Fullselect_set_clauseContext.class,i);
		}
		public Fullselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFullselect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_stmtContext fullselect_stmt() throws RecognitionException {
		Fullselect_stmtContext _localctx = new Fullselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_fullselect_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2397);
			fullselect_stmt_item();
			setState(2403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2398);
					fullselect_set_clause();
					setState(2399);
					fullselect_stmt_item();
					}
					}
				}
				setState(2405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fullselect_stmt_itemContext extends ParserRuleContext {
		public Subselect_stmtContext subselect_stmt() {
			return getRuleContext(Subselect_stmtContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Fullselect_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFullselect_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_stmt_itemContext fullselect_stmt_item() throws RecognitionException {
		Fullselect_stmt_itemContext _localctx = new Fullselect_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_fullselect_stmt_item);
		try {
			setState(2411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2406);
				subselect_stmt();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(2407);
				match(T_OPEN_P);
				setState(2408);
				fullselect_stmt();
				setState(2409);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fullselect_set_clauseContext extends ParserRuleContext {
		public TerminalNode T_UNION() { return getToken(HplsqlParser.T_UNION, 0); }
		public TerminalNode T_ALL() { return getToken(HplsqlParser.T_ALL, 0); }
		public TerminalNode T_EXCEPT() { return getToken(HplsqlParser.T_EXCEPT, 0); }
		public TerminalNode T_INTERSECT() { return getToken(HplsqlParser.T_INTERSECT, 0); }
		public Fullselect_set_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_set_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFullselect_set_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_set_clauseContext fullselect_set_clause() throws RecognitionException {
		Fullselect_set_clauseContext _localctx = new Fullselect_set_clauseContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_fullselect_set_clause);
		int _la;
		try {
			setState(2425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_UNION:
				enterOuterAlt(_localctx, 1);
				{
				setState(2413);
				match(T_UNION);
				setState(2415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(2414);
					match(T_ALL);
					}
				}

				}
				break;
			case T_EXCEPT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2417);
				match(T_EXCEPT);
				setState(2419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(2418);
					match(T_ALL);
					}
				}

				}
				break;
			case T_INTERSECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2421);
				match(T_INTERSECT);
				setState(2423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(2422);
					match(T_ALL);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subselect_stmtContext extends ParserRuleContext {
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode T_SELECT() { return getToken(HplsqlParser.T_SELECT, 0); }
		public TerminalNode T_SEL() { return getToken(HplsqlParser.T_SEL, 0); }
		public Into_clauseContext into_clause() {
			return getRuleContext(Into_clauseContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Group_by_clauseContext group_by_clause() {
			return getRuleContext(Group_by_clauseContext.class,0);
		}
		public Grouping_sets_clauseContext grouping_sets_clause() {
			return getRuleContext(Grouping_sets_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Qualify_clauseContext qualify_clause() {
			return getRuleContext(Qualify_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Select_optionsContext select_options() {
			return getRuleContext(Select_optionsContext.class,0);
		}
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public Subselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subselect_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSubselect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subselect_stmtContext subselect_stmt() throws RecognitionException {
		Subselect_stmtContext _localctx = new Subselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_subselect_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2427);
			_la = _input.LA(1);
			if ( !(_la==T_SEL || _la==T_SELECT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2428);
			select_list();
			setState(2430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				{
				setState(2429);
				into_clause();
				}
				break;
			}
			setState(2433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(2432);
				from_clause();
				}
				break;
			}
			setState(2436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				{
				setState(2435);
				where_clause();
				}
				break;
			}
			setState(2439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				{
				setState(2438);
				group_by_clause();
				}
				break;
			}
			setState(2442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				{
				setState(2441);
				grouping_sets_clause();
				}
				break;
			}
			setState(2446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				{
				setState(2444);
				having_clause();
				}
				break;
			case 2:
				{
				setState(2445);
				qualify_clause();
				}
				break;
			}
			setState(2449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				{
				setState(2448);
				order_by_clause();
				}
				break;
			}
			setState(2452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				{
				setState(2451);
				select_options();
				}
				break;
			}
			setState(2455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				{
				setState(2454);
				windows();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowsContext extends ParserRuleContext {
		public TerminalNode T_WINDOW() { return getToken(HplsqlParser.T_WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public WindowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windows; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitWindows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowsContext windows() throws RecognitionException {
		WindowsContext _localctx = new WindowsContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_windows);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2457);
			match(T_WINDOW);
			setState(2458);
			namedWindow();
			setState(2463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2459);
					match(T_COMMA);
					setState(2460);
					namedWindow();
					}
					}
				}
				setState(2465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedWindowContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitNamedWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2466);
			ident();
			setState(2467);
			match(T_AS);
			setState(2468);
			windowSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowSpecContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Expr_func_partition_by_clauseContext expr_func_partition_by_clause() {
			return getRuleContext(Expr_func_partition_by_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Rows_between_clauseContext rows_between_clause() {
			return getRuleContext(Rows_between_clauseContext.class,0);
		}
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitWindowSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_windowSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2470);
			match(T_OPEN_P);
			setState(2472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_PARTITION) {
				{
				setState(2471);
				expr_func_partition_by_clause();
				}
			}

			setState(2475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ORDER) {
				{
				setState(2474);
				order_by_clause();
				}
			}

			setState(2478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROWS) {
				{
				setState(2477);
				rows_between_clause();
				}
			}

			setState(2480);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_listContext extends ParserRuleContext {
		public List<Select_list_itemContext> select_list_item() {
			return getRuleContexts(Select_list_itemContext.class);
		}
		public Select_list_itemContext select_list_item(int i) {
			return getRuleContext(Select_list_itemContext.class,i);
		}
		public Select_list_setContext select_list_set() {
			return getRuleContext(Select_list_setContext.class,0);
		}
		public Select_list_limitContext select_list_limit() {
			return getRuleContext(Select_list_limitContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_select_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				{
				setState(2482);
				select_list_set();
				}
				break;
			}
			setState(2486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				{
				setState(2485);
				select_list_limit();
				}
				break;
			}
			setState(2488);
			select_list_item();
			setState(2493);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,293,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2489);
					match(T_COMMA);
					setState(2490);
					select_list_item();
					}
					}
				}
				setState(2495);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,293,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_setContext extends ParserRuleContext {
		public TerminalNode T_ALL() { return getToken(HplsqlParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HplsqlParser.T_DISTINCT, 0); }
		public Select_list_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_set; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_list_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_setContext select_list_set() throws RecognitionException {
		Select_list_setContext _localctx = new Select_list_setContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_select_list_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2496);
			_la = _input.LA(1);
			if ( !(_la==T_ALL || _la==T_DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_limitContext extends ParserRuleContext {
		public TerminalNode T_TOP() { return getToken(HplsqlParser.T_TOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_list_limitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_limit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_list_limit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_limitContext select_list_limit() throws RecognitionException {
		Select_list_limitContext _localctx = new Select_list_limitContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_select_list_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2498);
			match(T_TOP);
			setState(2499);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_itemContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_list_asteriskContext select_list_asterisk() {
			return getRuleContext(Select_list_asteriskContext.class,0);
		}
		public QidentContext qident() {
			return getRuleContext(QidentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public Select_list_aliasContext select_list_alias() {
			return getRuleContext(Select_list_aliasContext.class,0);
		}
		public Select_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_list_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_itemContext select_list_item() throws RecognitionException {
		Select_list_itemContext _localctx = new Select_list_itemContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_select_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				{
				setState(2504);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(2501);
					qident();
					setState(2502);
					match(T_EQUAL);
					}
					break;
				}
				setState(2506);
				expr(0);
				setState(2508);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(2507);
					select_list_alias();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(2510);
				select_list_asterisk();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_aliasContext extends ParserRuleContext {
		public List<Select_list_alias_nameContext> select_list_alias_name() {
			return getRuleContexts(Select_list_alias_nameContext.class);
		}
		public Select_list_alias_nameContext select_list_alias_name(int i) {
			return getRuleContext(Select_list_alias_nameContext.class,i);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_TITLE() { return getToken(HplsqlParser.T_TITLE, 0); }
		public TerminalNode L_S_STRING() { return getToken(HplsqlParser.L_S_STRING, 0); }
		public Select_list_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_list_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_aliasContext select_list_alias() throws RecognitionException {
		Select_list_aliasContext _localctx = new Select_list_aliasContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_select_list_alias);
		int _la;
		try {
			setState(2535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2513);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\") && !_input.LT(1).getText().equalsIgnoreCase(\"FROM\")");
				setState(2515);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(2514);
					match(T_AS);
					}
					break;
				}
				setState(2529);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BULK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LIKE:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_TYPE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_SUB:
				case L_ID:
				case L_DIGIT_NAME:
					{
					setState(2517);
					select_list_alias_name();
					}
					break;
				case T_OPEN_P:
					{
					setState(2518);
					match(T_OPEN_P);
					{
					setState(2519);
					select_list_alias_name();
					setState(2524);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2520);
						match(T_COMMA);
						setState(2521);
						select_list_alias_name();
						}
						}
						setState(2526);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(2527);
					match(T_CLOSE_P);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2531);
				match(T_OPEN_P);
				setState(2532);
				match(T_TITLE);
				setState(2533);
				match(L_S_STRING);
				setState(2534);
				match(T_CLOSE_P);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_alias_nameContext extends ParserRuleContext {
		public List<TerminalNode> L_ID() { return getTokens(HplsqlParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(HplsqlParser.L_ID, i);
		}
		public TerminalNode L_DIGIT_NAME() { return getToken(HplsqlParser.L_DIGIT_NAME, 0); }
		public List<Non_reserved_wordsContext> non_reserved_words() {
			return getRuleContexts(Non_reserved_wordsContext.class);
		}
		public Non_reserved_wordsContext non_reserved_words(int i) {
			return getRuleContext(Non_reserved_wordsContext.class,i);
		}
		public List<TerminalNode> T_SUB() { return getTokens(HplsqlParser.T_SUB); }
		public TerminalNode T_SUB(int i) {
			return getToken(HplsqlParser.T_SUB, i);
		}
		public List<TerminalNode> T_DOT() { return getTokens(HplsqlParser.T_DOT); }
		public TerminalNode T_DOT(int i) {
			return getToken(HplsqlParser.T_DOT, i);
		}
		public Select_list_alias_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_alias_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_list_alias_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_alias_nameContext select_list_alias_name() throws RecognitionException {
		Select_list_alias_nameContext _localctx = new Select_list_alias_nameContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_select_list_alias_name);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_SUB) {
				{
				setState(2537);
				match(T_SUB);
				}
			}

			setState(2543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(2540);
				match(L_ID);
				}
				break;
			case L_DIGIT_NAME:
				{
				setState(2541);
				match(L_DIGIT_NAME);
				}
				break;
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BULK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LIKE:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_TYPE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
				{
				setState(2542);
				non_reserved_words();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2555);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2545);
					match(T_DOT);
					setState(2547);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_SUB) {
						{
						setState(2546);
						match(T_SUB);
						}
					}

					setState(2551);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case L_ID:
						{
						setState(2549);
						match(L_ID);
						}
						break;
					case T_ACTION:
					case T_ADD2:
					case T_ALL:
					case T_ALLOCATE:
					case T_ALTER:
					case T_AND:
					case T_ANSI_NULLS:
					case T_ANSI_PADDING:
					case T_AS:
					case T_ASC:
					case T_ASSOCIATE:
					case T_AT:
					case T_AUTO_INCREMENT:
					case T_AVG:
					case T_BATCHSIZE:
					case T_BEGIN:
					case T_BETWEEN:
					case T_BIGINT:
					case T_BINARY_DOUBLE:
					case T_BINARY_FLOAT:
					case T_BIT:
					case T_BODY:
					case T_BREAK:
					case T_BULK:
					case T_BY:
					case T_BYTE:
					case T_CALL:
					case T_CALLER:
					case T_CASCADE:
					case T_CASE:
					case T_CASESPECIFIC:
					case T_CAST:
					case T_CHAR:
					case T_CHARACTER:
					case T_CHARSET:
					case T_CLIENT:
					case T_CLOSE:
					case T_CLUSTERED:
					case T_CMP:
					case T_COLLECT:
					case T_COLLECTION:
					case T_COLUMN:
					case T_COMMENT:
					case T_CONSTANT:
					case T_COMMIT:
					case T_COMPRESS:
					case T_CONCAT:
					case T_CONDITION:
					case T_CONSTRAINT:
					case T_CONTINUE:
					case T_COPY:
					case T_COUNT:
					case T_COUNT_BIG:
					case T_CREATE:
					case T_CREATION:
					case T_CREATOR:
					case T_CS:
					case T_CURRENT:
					case T_CURRENT_SCHEMA:
					case T_CURSOR:
					case T_DATABASE:
					case T_DATA:
					case T_DATE:
					case T_DATETIME:
					case T_DAY:
					case T_DAYS:
					case T_DEC:
					case T_DECIMAL:
					case T_DECLARE:
					case T_DEFAULT:
					case T_DEFERRED:
					case T_DEFINED:
					case T_DEFINER:
					case T_DEFINITION:
					case T_DELETE:
					case T_DELIMITED:
					case T_DELIMITER:
					case T_DESC:
					case T_DESCRIBE:
					case T_DIAGNOSTICS:
					case T_DIR:
					case T_DIRECTORY:
					case T_DISTINCT:
					case T_DISTRIBUTE:
					case T_DO:
					case T_DOUBLE:
					case T_DROP:
					case T_DYNAMIC:
					case T_ENABLE:
					case T_ENGINE:
					case T_ESCAPED:
					case T_EXCEPT:
					case T_EXCEPTION:
					case T_EXCLUSIVE:
					case T_EXISTS:
					case T_EXIT:
					case T_FALLBACK:
					case T_FALSE:
					case T_FETCH:
					case T_FIELDS:
					case T_FILE:
					case T_FILES:
					case T_FLOAT:
					case T_FOR:
					case T_FOREIGN:
					case T_FORMAT:
					case T_FOUND:
					case T_FULL:
					case T_FUNCTION:
					case T_GET:
					case T_GLOBAL:
					case T_GO:
					case T_GRANT:
					case T_HANDLER:
					case T_HASH:
					case T_HAVING:
					case T_HDFS:
					case T_HIVE:
					case T_HOST:
					case T_IDENTITY:
					case T_IF:
					case T_IGNORE:
					case T_IMMEDIATE:
					case T_IN:
					case T_INCLUDE:
					case T_INDEX:
					case T_INITRANS:
					case T_INOUT:
					case T_INSERT:
					case T_INT:
					case T_INT2:
					case T_INT4:
					case T_INT8:
					case T_INTEGER:
					case T_INTERSECT:
					case T_INTERVAL:
					case T_INVOKER:
					case T_IS:
					case T_ISOPEN:
					case T_ITEMS:
					case T_JOIN:
					case T_KEEP:
					case T_KEY:
					case T_KEYS:
					case T_LANGUAGE:
					case T_LEAVE:
					case T_LIKE:
					case T_LINES:
					case T_LOCAL:
					case T_LOCATION:
					case T_LOCATOR:
					case T_LOCATORS:
					case T_LOCKS:
					case T_LOG:
					case T_LOGGED:
					case T_LOGGING:
					case T_LOOP:
					case T_MAP:
					case T_MATCHED:
					case T_MAX:
					case T_MAXTRANS:
					case T_MERGE:
					case T_MESSAGE_TEXT:
					case T_MICROSECOND:
					case T_MICROSECONDS:
					case T_MIN:
					case T_MULTISET:
					case T_NCHAR:
					case T_NEW:
					case T_NVARCHAR:
					case T_NO:
					case T_NOCOUNT:
					case T_NOCOMPRESS:
					case T_NOLOGGING:
					case T_NONE:
					case T_NOT:
					case T_NOTFOUND:
					case T_NUMERIC:
					case T_NUMBER:
					case T_OBJECT:
					case T_OFF:
					case T_ON:
					case T_ONLY:
					case T_OPEN:
					case T_OR:
					case T_OUT:
					case T_OUTER:
					case T_OVER:
					case T_OVERWRITE:
					case T_OWNER:
					case T_PACKAGE:
					case T_PARTITION:
					case T_PCTFREE:
					case T_PCTUSED:
					case T_PRECISION:
					case T_PRESERVE:
					case T_PRIMARY:
					case T_PRINT:
					case T_PROC:
					case T_PROCEDURE:
					case T_QUALIFY:
					case T_QUERY_BAND:
					case T_QUIT:
					case T_QUOTED_IDENTIFIER:
					case T_RAISE:
					case T_REAL:
					case T_REFERENCES:
					case T_REGEXP:
					case T_REPLACE:
					case T_RESIGNAL:
					case T_RESTRICT:
					case T_RESULT:
					case T_RESULT_SET_LOCATOR:
					case T_RETURN:
					case T_RETURNS:
					case T_REVERSE:
					case T_RIGHT:
					case T_RLIKE:
					case T_ROLE:
					case T_ROLLBACK:
					case T_ROW:
					case T_ROWS:
					case T_ROW_COUNT:
					case T_RR:
					case T_RS:
					case T_PWD:
					case T_TRIM:
					case T_SCHEMA:
					case T_SECOND:
					case T_SECONDS:
					case T_SECURITY:
					case T_SEGMENT:
					case T_SEL:
					case T_SELECT:
					case T_SET:
					case T_SESSION:
					case T_SESSIONS:
					case T_SETS:
					case T_SHARE:
					case T_SIGNAL:
					case T_SIMPLE_DOUBLE:
					case T_SIMPLE_FLOAT:
					case T_SMALLDATETIME:
					case T_SMALLINT:
					case T_SQL:
					case T_SQLEXCEPTION:
					case T_SQLINSERT:
					case T_SQLSTATE:
					case T_SQLWARNING:
					case T_STATS:
					case T_STATISTICS:
					case T_STEP:
					case T_STORAGE:
					case T_STORED:
					case T_STRING:
					case T_SUBDIR:
					case T_SUBSTRING:
					case T_SUM:
					case T_SUMMARY:
					case T_SYS_REFCURSOR:
					case T_TABLE:
					case T_TABLESPACE:
					case T_TEMPORARY:
					case T_TERMINATED:
					case T_TEXTIMAGE_ON:
					case T_THEN:
					case T_TIMESTAMP:
					case T_TITLE:
					case T_TO:
					case T_TOP:
					case T_TRANSACTION:
					case T_TRUE:
					case T_TRUNCATE:
					case T_TYPE:
					case T_UNIQUE:
					case T_UPDATE:
					case T_UR:
					case T_USE:
					case T_USING:
					case T_VALUE:
					case T_VALUES:
					case T_VAR:
					case T_VARCHAR:
					case T_VARCHAR2:
					case T_VARYING:
					case T_VOLATILE:
					case T_WHILE:
					case T_WITHOUT:
					case T_WORK:
					case T_XACT_ABORT:
					case T_XML:
					case T_YES:
					case T_ACTIVITY_COUNT:
					case T_CUME_DIST:
					case T_CURRENT_DATE:
					case T_CURRENT_TIMESTAMP:
					case T_CURRENT_USER:
					case T_DENSE_RANK:
					case T_FIRST_VALUE:
					case T_LAG:
					case T_LAST_VALUE:
					case T_LEAD:
					case T_PART_COUNT:
					case T_PART_LOC:
					case T_RANK:
					case T_ROW_NUMBER:
					case T_STDEV:
					case T_SYSDATE:
					case T_VARIANCE:
					case T_USER:
						{
						setState(2550);
						non_reserved_words();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
				}
				setState(2557);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,305,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_asteriskContext extends ParserRuleContext {
		public TerminalNode T_MUL() { return getToken(HplsqlParser.T_MUL, 0); }
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public TerminalNode T_DOT() { return getToken(HplsqlParser.T_DOT, 0); }
		public Select_list_asteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_asterisk; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_list_asterisk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_asteriskContext select_list_asterisk() throws RecognitionException {
		Select_list_asteriskContext _localctx = new Select_list_asteriskContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_select_list_asterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_ID) {
				{
				setState(2558);
				match(L_ID);
				setState(2559);
				match(T_DOT);
				}
			}

			setState(2562);
			match(T_MUL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_rowContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode L_INT() { return getToken(HplsqlParser.L_INT, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Table_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_row; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitTable_row(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_rowContext table_row() throws RecognitionException {
		Table_rowContext _localctx = new Table_rowContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_table_row);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2564);
			ident();
			setState(2565);
			match(T_OPEN_P);
			setState(2566);
			match(L_INT);
			setState(2567);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Into_clauseContext extends ParserRuleContext {
		public TerminalNode T_INTO() { return getToken(HplsqlParser.T_INTO, 0); }
		public List<Table_rowContext> table_row() {
			return getRuleContexts(Table_rowContext.class);
		}
		public Table_rowContext table_row(int i) {
			return getRuleContext(Table_rowContext.class,i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Bulk_collect_clauseContext bulk_collect_clause() {
			return getRuleContext(Bulk_collect_clauseContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Into_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_into_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitInto_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Into_clauseContext into_clause() throws RecognitionException {
		Into_clauseContext _localctx = new Into_clauseContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_into_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BULK) {
				{
				setState(2569);
				bulk_collect_clause();
				}
			}

			setState(2572);
			match(T_INTO);
			setState(2575);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
			case 1:
				{
				setState(2573);
				table_row();
				}
				break;
			case 2:
				{
				setState(2574);
				ident();
				}
				break;
			}
			setState(2584);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2577);
					match(T_COMMA);
					setState(2580);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
					case 1:
						{
						setState(2578);
						table_row();
						}
						break;
					case 2:
						{
						setState(2579);
						ident();
						}
						break;
					}
					}
					}
				}
				setState(2586);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bulk_collect_clauseContext extends ParserRuleContext {
		public TerminalNode T_BULK() { return getToken(HplsqlParser.T_BULK, 0); }
		public TerminalNode T_COLLECT() { return getToken(HplsqlParser.T_COLLECT, 0); }
		public Bulk_collect_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bulk_collect_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBulk_collect_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bulk_collect_clauseContext bulk_collect_clause() throws RecognitionException {
		Bulk_collect_clauseContext _localctx = new Bulk_collect_clauseContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_bulk_collect_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2587);
			match(T_BULK);
			setState(2588);
			match(T_COLLECT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode T_FROM() { return getToken(HplsqlParser.T_FROM, 0); }
		public From_table_clauseContext from_table_clause() {
			return getRuleContext(From_table_clauseContext.class,0);
		}
		public List<From_join_clauseContext> from_join_clause() {
			return getRuleContexts(From_join_clauseContext.class);
		}
		public From_join_clauseContext from_join_clause(int i) {
			return getRuleContext(From_join_clauseContext.class,i);
		}
		public List<Lateral_viewContext> lateral_view() {
			return getRuleContexts(Lateral_viewContext.class);
		}
		public Lateral_viewContext lateral_view(int i) {
			return getRuleContext(Lateral_viewContext.class,i);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_from_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2590);
			match(T_FROM);
			setState(2591);
			from_table_clause();
			setState(2595);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2592);
					from_join_clause();
					}
					}
				}
				setState(2597);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			}
			setState(2601);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2598);
					lateral_view();
					}
					}
				}
				setState(2603);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_clauseContext extends ParserRuleContext {
		public From_table_name_clauseContext from_table_name_clause() {
			return getRuleContext(From_table_name_clauseContext.class,0);
		}
		public From_subselect_clauseContext from_subselect_clause() {
			return getRuleContext(From_subselect_clauseContext.class,0);
		}
		public From_table_values_clauseContext from_table_values_clause() {
			return getRuleContext(From_table_values_clauseContext.class,0);
		}
		public From_table_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_table_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_clauseContext from_table_clause() throws RecognitionException {
		From_table_clauseContext _localctx = new From_table_clauseContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_from_table_clause);
		try {
			setState(2607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2604);
				from_table_name_clause();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2605);
				from_subselect_clause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2606);
				from_table_values_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_name_clauseContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_table_name_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_name_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_table_name_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_name_clauseContext from_table_name_clause() throws RecognitionException {
		From_table_name_clauseContext _localctx = new From_table_name_clauseContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_from_table_name_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2609);
			table_name();
			setState(2611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				{
				setState(2610);
				from_alias_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_subselect_clauseContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_subselect_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_subselect_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_subselect_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_subselect_clauseContext from_subselect_clause() throws RecognitionException {
		From_subselect_clauseContext _localctx = new From_subselect_clauseContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_from_subselect_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2613);
			match(T_OPEN_P);
			setState(2614);
			select_stmt();
			setState(2615);
			match(T_CLOSE_P);
			setState(2617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				{
				setState(2616);
				from_alias_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_join_clauseContext extends ParserRuleContext {
		public TerminalNode T_COMMA() { return getToken(HplsqlParser.T_COMMA, 0); }
		public From_table_clauseContext from_table_clause() {
			return getRuleContext(From_table_clauseContext.class,0);
		}
		public From_join_type_clauseContext from_join_type_clause() {
			return getRuleContext(From_join_type_clauseContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Cross_join_clauseContext cross_join_clause() {
			return getRuleContext(Cross_join_clauseContext.class,0);
		}
		public From_join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_join_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_join_clauseContext from_join_clause() throws RecognitionException {
		From_join_clauseContext _localctx = new From_join_clauseContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_from_join_clause);
		try {
			setState(2633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(2619);
				match(T_COMMA);
				setState(2620);
				from_table_clause();
				}
				break;
			case T_FULL:
			case T_INNER:
			case T_JOIN:
			case T_LEFT:
			case T_RIGHT:
			case ANTI:
				enterOuterAlt(_localctx, 2);
				{
				setState(2621);
				from_join_type_clause();
				setState(2622);
				from_table_clause();
				setState(2625);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
				case 1:
					{
					setState(2623);
					match(T_ON);
					setState(2624);
					bool_expr(0);
					}
					break;
				}
				}
				break;
			case T_CROSS:
				enterOuterAlt(_localctx, 3);
				{
				setState(2627);
				cross_join_clause();
				setState(2628);
				from_table_clause();
				setState(2631);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
				case 1:
					{
					setState(2629);
					match(T_ON);
					setState(2630);
					bool_expr(0);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cross_join_clauseContext extends ParserRuleContext {
		public TerminalNode T_CROSS() { return getToken(HplsqlParser.T_CROSS, 0); }
		public TerminalNode T_JOIN() { return getToken(HplsqlParser.T_JOIN, 0); }
		public Cross_join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cross_join_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitCross_join_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cross_join_clauseContext cross_join_clause() throws RecognitionException {
		Cross_join_clauseContext _localctx = new Cross_join_clauseContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_cross_join_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2635);
			match(T_CROSS);
			setState(2636);
			match(T_JOIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_join_type_clauseContext extends ParserRuleContext {
		public TerminalNode T_JOIN() { return getToken(HplsqlParser.T_JOIN, 0); }
		public TerminalNode T_INNER() { return getToken(HplsqlParser.T_INNER, 0); }
		public TerminalNode T_LEFT() { return getToken(HplsqlParser.T_LEFT, 0); }
		public TerminalNode T_RIGHT() { return getToken(HplsqlParser.T_RIGHT, 0); }
		public TerminalNode T_FULL() { return getToken(HplsqlParser.T_FULL, 0); }
		public TerminalNode T_OUTER() { return getToken(HplsqlParser.T_OUTER, 0); }
		public TerminalNode T_SEMI() { return getToken(HplsqlParser.T_SEMI, 0); }
		public TerminalNode ANTI() { return getToken(HplsqlParser.ANTI, 0); }
		public From_join_type_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_type_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_join_type_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_join_type_clauseContext from_join_type_clause() throws RecognitionException {
		From_join_type_clauseContext _localctx = new From_join_type_clauseContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_from_join_type_clause);
		int _la;
		try {
			setState(2655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(2638);
					match(T_INNER);
					}
				}

				setState(2641);
				match(T_JOIN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2642);
				_la = _input.LA(1);
				if ( !(_la==T_FULL || _la==T_LEFT || _la==T_RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(2643);
					match(T_OUTER);
					}
				}

				setState(2646);
				match(T_JOIN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2647);
				match(T_LEFT);
				setState(2648);
				match(T_SEMI);
				setState(2649);
				match(T_JOIN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_LEFT) {
					{
					setState(2650);
					match(T_LEFT);
					}
				}

				setState(2653);
				match(ANTI);
				setState(2654);
				match(T_JOIN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_values_clauseContext extends ParserRuleContext {
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_VALUES() { return getToken(HplsqlParser.T_VALUES, 0); }
		public List<From_table_values_rowContext> from_table_values_row() {
			return getRuleContexts(From_table_values_rowContext.class);
		}
		public From_table_values_rowContext from_table_values_row(int i) {
			return getRuleContext(From_table_values_rowContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_table_values_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_table_values_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_values_clauseContext from_table_values_clause() throws RecognitionException {
		From_table_values_clauseContext _localctx = new From_table_values_clauseContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_from_table_values_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2657);
			match(T_TABLE);
			setState(2658);
			match(T_OPEN_P);
			setState(2659);
			match(T_VALUES);
			setState(2660);
			from_table_values_row();
			setState(2665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2661);
				match(T_COMMA);
				setState(2662);
				from_table_values_row();
				}
				}
				setState(2667);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2668);
			match(T_CLOSE_P);
			setState(2670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				{
				setState(2669);
				from_alias_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_values_rowContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public From_table_values_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_row; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_table_values_row(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_values_rowContext from_table_values_row() throws RecognitionException {
		From_table_values_rowContext _localctx = new From_table_values_rowContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_from_table_values_row);
		int _la;
		try {
			setState(2684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2672);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2673);
				match(T_OPEN_P);
				setState(2674);
				expr(0);
				setState(2679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2675);
					match(T_COMMA);
					setState(2676);
					expr(0);
					}
					}
					setState(2681);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2682);
				match(T_CLOSE_P);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_alias_clauseContext extends ParserRuleContext {
		public From_alias_clause_nameContext from_alias_clause_name() {
			return getRuleContext(From_alias_clause_nameContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<TerminalNode> L_ID() { return getTokens(HplsqlParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(HplsqlParser.L_ID, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public From_alias_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_alias_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_alias_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_alias_clauseContext from_alias_clause() throws RecognitionException {
		From_alias_clauseContext _localctx = new From_alias_clauseContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_from_alias_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2686);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
			        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
			        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
			        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("WITH"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"EXEC\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"EXECUTE\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"INNER\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"LEFT\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"GROUP\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"ORDER\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"LIMIT\") &&\n        !_input.LT(1).getText().equalsIgnoreCase(\"WITH\")");
			setState(2688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				{
				setState(2687);
				match(T_AS);
				}
				break;
			}
			setState(2690);
			from_alias_clause_name();
			setState(2701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				{
				setState(2691);
				match(T_OPEN_P);
				setState(2692);
				match(L_ID);
				setState(2697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2693);
					match(T_COMMA);
					setState(2694);
					match(L_ID);
					}
					}
					setState(2699);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2700);
				match(T_CLOSE_P);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_alias_clause_nameContext extends ParserRuleContext {
		public List<TerminalNode> L_ID() { return getTokens(HplsqlParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(HplsqlParser.L_ID, i);
		}
		public TerminalNode L_DIGIT_NAME() { return getToken(HplsqlParser.L_DIGIT_NAME, 0); }
		public List<Non_reserved_wordsContext> non_reserved_words() {
			return getRuleContexts(Non_reserved_wordsContext.class);
		}
		public Non_reserved_wordsContext non_reserved_words(int i) {
			return getRuleContext(Non_reserved_wordsContext.class,i);
		}
		public List<TerminalNode> T_SUB() { return getTokens(HplsqlParser.T_SUB); }
		public TerminalNode T_SUB(int i) {
			return getToken(HplsqlParser.T_SUB, i);
		}
		public List<TerminalNode> T_DOT() { return getTokens(HplsqlParser.T_DOT); }
		public TerminalNode T_DOT(int i) {
			return getToken(HplsqlParser.T_DOT, i);
		}
		public From_alias_clause_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_alias_clause_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFrom_alias_clause_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_alias_clause_nameContext from_alias_clause_name() throws RecognitionException {
		From_alias_clause_nameContext _localctx = new From_alias_clause_nameContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_from_alias_clause_name);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_SUB) {
				{
				setState(2703);
				match(T_SUB);
				}
			}

			setState(2709);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(2706);
				match(L_ID);
				}
				break;
			case L_DIGIT_NAME:
				{
				setState(2707);
				match(L_DIGIT_NAME);
				}
				break;
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BULK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LIKE:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_TYPE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
				{
				setState(2708);
				non_reserved_words();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2721);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,334,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2711);
					match(T_DOT);
					setState(2713);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_SUB) {
						{
						setState(2712);
						match(T_SUB);
						}
					}

					setState(2717);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case L_ID:
						{
						setState(2715);
						match(L_ID);
						}
						break;
					case T_ACTION:
					case T_ADD2:
					case T_ALL:
					case T_ALLOCATE:
					case T_ALTER:
					case T_AND:
					case T_ANSI_NULLS:
					case T_ANSI_PADDING:
					case T_AS:
					case T_ASC:
					case T_ASSOCIATE:
					case T_AT:
					case T_AUTO_INCREMENT:
					case T_AVG:
					case T_BATCHSIZE:
					case T_BEGIN:
					case T_BETWEEN:
					case T_BIGINT:
					case T_BINARY_DOUBLE:
					case T_BINARY_FLOAT:
					case T_BIT:
					case T_BODY:
					case T_BREAK:
					case T_BULK:
					case T_BY:
					case T_BYTE:
					case T_CALL:
					case T_CALLER:
					case T_CASCADE:
					case T_CASE:
					case T_CASESPECIFIC:
					case T_CAST:
					case T_CHAR:
					case T_CHARACTER:
					case T_CHARSET:
					case T_CLIENT:
					case T_CLOSE:
					case T_CLUSTERED:
					case T_CMP:
					case T_COLLECT:
					case T_COLLECTION:
					case T_COLUMN:
					case T_COMMENT:
					case T_CONSTANT:
					case T_COMMIT:
					case T_COMPRESS:
					case T_CONCAT:
					case T_CONDITION:
					case T_CONSTRAINT:
					case T_CONTINUE:
					case T_COPY:
					case T_COUNT:
					case T_COUNT_BIG:
					case T_CREATE:
					case T_CREATION:
					case T_CREATOR:
					case T_CS:
					case T_CURRENT:
					case T_CURRENT_SCHEMA:
					case T_CURSOR:
					case T_DATABASE:
					case T_DATA:
					case T_DATE:
					case T_DATETIME:
					case T_DAY:
					case T_DAYS:
					case T_DEC:
					case T_DECIMAL:
					case T_DECLARE:
					case T_DEFAULT:
					case T_DEFERRED:
					case T_DEFINED:
					case T_DEFINER:
					case T_DEFINITION:
					case T_DELETE:
					case T_DELIMITED:
					case T_DELIMITER:
					case T_DESC:
					case T_DESCRIBE:
					case T_DIAGNOSTICS:
					case T_DIR:
					case T_DIRECTORY:
					case T_DISTINCT:
					case T_DISTRIBUTE:
					case T_DO:
					case T_DOUBLE:
					case T_DROP:
					case T_DYNAMIC:
					case T_ENABLE:
					case T_ENGINE:
					case T_ESCAPED:
					case T_EXCEPT:
					case T_EXCEPTION:
					case T_EXCLUSIVE:
					case T_EXISTS:
					case T_EXIT:
					case T_FALLBACK:
					case T_FALSE:
					case T_FETCH:
					case T_FIELDS:
					case T_FILE:
					case T_FILES:
					case T_FLOAT:
					case T_FOR:
					case T_FOREIGN:
					case T_FORMAT:
					case T_FOUND:
					case T_FULL:
					case T_FUNCTION:
					case T_GET:
					case T_GLOBAL:
					case T_GO:
					case T_GRANT:
					case T_HANDLER:
					case T_HASH:
					case T_HAVING:
					case T_HDFS:
					case T_HIVE:
					case T_HOST:
					case T_IDENTITY:
					case T_IF:
					case T_IGNORE:
					case T_IMMEDIATE:
					case T_IN:
					case T_INCLUDE:
					case T_INDEX:
					case T_INITRANS:
					case T_INOUT:
					case T_INSERT:
					case T_INT:
					case T_INT2:
					case T_INT4:
					case T_INT8:
					case T_INTEGER:
					case T_INTERSECT:
					case T_INTERVAL:
					case T_INVOKER:
					case T_IS:
					case T_ISOPEN:
					case T_ITEMS:
					case T_JOIN:
					case T_KEEP:
					case T_KEY:
					case T_KEYS:
					case T_LANGUAGE:
					case T_LEAVE:
					case T_LIKE:
					case T_LINES:
					case T_LOCAL:
					case T_LOCATION:
					case T_LOCATOR:
					case T_LOCATORS:
					case T_LOCKS:
					case T_LOG:
					case T_LOGGED:
					case T_LOGGING:
					case T_LOOP:
					case T_MAP:
					case T_MATCHED:
					case T_MAX:
					case T_MAXTRANS:
					case T_MERGE:
					case T_MESSAGE_TEXT:
					case T_MICROSECOND:
					case T_MICROSECONDS:
					case T_MIN:
					case T_MULTISET:
					case T_NCHAR:
					case T_NEW:
					case T_NVARCHAR:
					case T_NO:
					case T_NOCOUNT:
					case T_NOCOMPRESS:
					case T_NOLOGGING:
					case T_NONE:
					case T_NOT:
					case T_NOTFOUND:
					case T_NUMERIC:
					case T_NUMBER:
					case T_OBJECT:
					case T_OFF:
					case T_ON:
					case T_ONLY:
					case T_OPEN:
					case T_OR:
					case T_OUT:
					case T_OUTER:
					case T_OVER:
					case T_OVERWRITE:
					case T_OWNER:
					case T_PACKAGE:
					case T_PARTITION:
					case T_PCTFREE:
					case T_PCTUSED:
					case T_PRECISION:
					case T_PRESERVE:
					case T_PRIMARY:
					case T_PRINT:
					case T_PROC:
					case T_PROCEDURE:
					case T_QUALIFY:
					case T_QUERY_BAND:
					case T_QUIT:
					case T_QUOTED_IDENTIFIER:
					case T_RAISE:
					case T_REAL:
					case T_REFERENCES:
					case T_REGEXP:
					case T_REPLACE:
					case T_RESIGNAL:
					case T_RESTRICT:
					case T_RESULT:
					case T_RESULT_SET_LOCATOR:
					case T_RETURN:
					case T_RETURNS:
					case T_REVERSE:
					case T_RIGHT:
					case T_RLIKE:
					case T_ROLE:
					case T_ROLLBACK:
					case T_ROW:
					case T_ROWS:
					case T_ROW_COUNT:
					case T_RR:
					case T_RS:
					case T_PWD:
					case T_TRIM:
					case T_SCHEMA:
					case T_SECOND:
					case T_SECONDS:
					case T_SECURITY:
					case T_SEGMENT:
					case T_SEL:
					case T_SELECT:
					case T_SET:
					case T_SESSION:
					case T_SESSIONS:
					case T_SETS:
					case T_SHARE:
					case T_SIGNAL:
					case T_SIMPLE_DOUBLE:
					case T_SIMPLE_FLOAT:
					case T_SMALLDATETIME:
					case T_SMALLINT:
					case T_SQL:
					case T_SQLEXCEPTION:
					case T_SQLINSERT:
					case T_SQLSTATE:
					case T_SQLWARNING:
					case T_STATS:
					case T_STATISTICS:
					case T_STEP:
					case T_STORAGE:
					case T_STORED:
					case T_STRING:
					case T_SUBDIR:
					case T_SUBSTRING:
					case T_SUM:
					case T_SUMMARY:
					case T_SYS_REFCURSOR:
					case T_TABLE:
					case T_TABLESPACE:
					case T_TEMPORARY:
					case T_TERMINATED:
					case T_TEXTIMAGE_ON:
					case T_THEN:
					case T_TIMESTAMP:
					case T_TITLE:
					case T_TO:
					case T_TOP:
					case T_TRANSACTION:
					case T_TRUE:
					case T_TRUNCATE:
					case T_TYPE:
					case T_UNIQUE:
					case T_UPDATE:
					case T_UR:
					case T_USE:
					case T_USING:
					case T_VALUE:
					case T_VALUES:
					case T_VAR:
					case T_VARCHAR:
					case T_VARCHAR2:
					case T_VARYING:
					case T_VOLATILE:
					case T_WHILE:
					case T_WITHOUT:
					case T_WORK:
					case T_XACT_ABORT:
					case T_XML:
					case T_YES:
					case T_ACTIVITY_COUNT:
					case T_CUME_DIST:
					case T_CURRENT_DATE:
					case T_CURRENT_TIMESTAMP:
					case T_CURRENT_USER:
					case T_DENSE_RANK:
					case T_FIRST_VALUE:
					case T_LAG:
					case T_LAST_VALUE:
					case T_LEAD:
					case T_PART_COUNT:
					case T_PART_LOC:
					case T_RANK:
					case T_ROW_NUMBER:
					case T_STDEV:
					case T_SYSDATE:
					case T_VARIANCE:
					case T_USER:
						{
						setState(2716);
						non_reserved_words();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
				}
				setState(2723);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,334,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lateral_viewContext extends ParserRuleContext {
		public TerminalNode T_LATERAL() { return getToken(HplsqlParser.T_LATERAL, 0); }
		public TerminalNode T_VIEW() { return getToken(HplsqlParser.T_VIEW, 0); }
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public List<Select_list_aliasContext> select_list_alias() {
			return getRuleContexts(Select_list_aliasContext.class);
		}
		public Select_list_aliasContext select_list_alias(int i) {
			return getRuleContext(Select_list_aliasContext.class,i);
		}
		public TerminalNode T_OUTER() { return getToken(HplsqlParser.T_OUTER, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Lateral_viewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateral_view; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitLateral_view(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lateral_viewContext lateral_view() throws RecognitionException {
		Lateral_viewContext _localctx = new Lateral_viewContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_lateral_view);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2724);
			match(T_LATERAL);
			setState(2725);
			match(T_VIEW);
			setState(2727);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
			case 1:
				{
				setState(2726);
				match(T_OUTER);
				}
				break;
			}
			setState(2729);
			expr_func();
			setState(2730);
			from_alias_clause();
			setState(2731);
			select_list_alias();
			setState(2736);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,336,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2732);
					match(T_COMMA);
					setState(2733);
					select_list_alias();
					}
					}
				}
				setState(2738);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,336,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public Tbl_nameContext tbl_name() {
			return getRuleContext(Tbl_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode T_DOT() { return getToken(HplsqlParser.T_DOT, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2742);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
			case 1:
				{
				setState(2739);
				database_name();
				setState(2740);
				match(T_DOT);
				}
				break;
			}
			setState(2744);
			tbl_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_nameContext extends ParserRuleContext {
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public TerminalNode L_DIGIT_NAME() { return getToken(HplsqlParser.L_DIGIT_NAME, 0); }
		public Non_reserved_wordsContext non_reserved_words() {
			return getRuleContext(Non_reserved_wordsContext.class,0);
		}
		public TerminalNode T_SUB() { return getToken(HplsqlParser.T_SUB, 0); }
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_database_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_SUB) {
				{
				setState(2746);
				match(T_SUB);
				}
			}

			setState(2752);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(2749);
				match(L_ID);
				}
				break;
			case L_DIGIT_NAME:
				{
				setState(2750);
				match(L_DIGIT_NAME);
				}
				break;
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BULK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LIKE:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_TYPE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
				{
				setState(2751);
				non_reserved_words();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tbl_nameContext extends ParserRuleContext {
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public TerminalNode L_DIGIT_NAME() { return getToken(HplsqlParser.L_DIGIT_NAME, 0); }
		public Non_reserved_wordsContext non_reserved_words() {
			return getRuleContext(Non_reserved_wordsContext.class,0);
		}
		public TerminalNode T_SUB() { return getToken(HplsqlParser.T_SUB, 0); }
		public Tbl_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tbl_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitTbl_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tbl_nameContext tbl_name() throws RecognitionException {
		Tbl_nameContext _localctx = new Tbl_nameContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_tbl_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_SUB) {
				{
				setState(2754);
				match(T_SUB);
				}
			}

			setState(2760);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(2757);
				match(L_ID);
				}
				break;
			case L_DIGIT_NAME:
				{
				setState(2758);
				match(L_DIGIT_NAME);
				}
				break;
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BULK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LIKE:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_TYPE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
				{
				setState(2759);
				non_reserved_words();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public Real_column_nameContext real_column_name() {
			return getRuleContext(Real_column_nameContext.class,0);
		}
		public TerminalNode T_SUB() { return getToken(HplsqlParser.T_SUB, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_DOT() { return getToken(HplsqlParser.T_DOT, 0); }
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
			case 1:
				{
				setState(2762);
				match(T_SUB);
				}
				break;
			}
			setState(2768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
			case 1:
				{
				setState(2765);
				table_name();
				setState(2766);
				match(T_DOT);
				}
				break;
			}
			setState(2770);
			real_column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Real_column_nameContext extends ParserRuleContext {
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public TerminalNode L_DIGIT_NAME() { return getToken(HplsqlParser.L_DIGIT_NAME, 0); }
		public Non_reserved_wordsContext non_reserved_words() {
			return getRuleContext(Non_reserved_wordsContext.class,0);
		}
		public TerminalNode T_SUB() { return getToken(HplsqlParser.T_SUB, 0); }
		public Real_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real_column_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitReal_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Real_column_nameContext real_column_name() throws RecognitionException {
		Real_column_nameContext _localctx = new Real_column_nameContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_real_column_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_SUB) {
				{
				setState(2772);
				match(T_SUB);
				}
			}

			setState(2778);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(2775);
				match(L_ID);
				}
				break;
			case L_DIGIT_NAME:
				{
				setState(2776);
				match(L_DIGIT_NAME);
				}
				break;
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BULK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LIKE:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_TYPE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
				{
				setState(2777);
				non_reserved_words();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode T_WHERE() { return getToken(HplsqlParser.T_WHERE, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2780);
			match(T_WHERE);
			setState(2781);
			bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_GROUP() { return getToken(HplsqlParser.T_GROUP, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Group_by_withContext group_by_with() {
			return getRuleContext(Group_by_withContext.class,0);
		}
		public Group_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitGroup_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_clauseContext group_by_clause() throws RecognitionException {
		Group_by_clauseContext _localctx = new Group_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_group_by_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2783);
			match(T_GROUP);
			setState(2784);
			match(T_BY);
			setState(2785);
			expr(0);
			setState(2790);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,346,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2786);
					match(T_COMMA);
					setState(2787);
					expr(0);
					}
					}
				}
				setState(2792);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,346,_ctx);
			}
			setState(2794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
			case 1:
				{
				setState(2793);
				group_by_with();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_by_withContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_ROLLUP() { return getToken(HplsqlParser.T_ROLLUP, 0); }
		public TerminalNode T_CUBE() { return getToken(HplsqlParser.T_CUBE, 0); }
		public Group_by_withContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_with; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitGroup_by_with(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_withContext group_by_with() throws RecognitionException {
		Group_by_withContext _localctx = new Group_by_withContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_group_by_with);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2796);
			match(T_WITH);
			setState(2797);
			_la = _input.LA(1);
			if ( !(_la==T_CUBE || _la==T_ROLLUP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grouping_sets_clauseContext extends ParserRuleContext {
		public TerminalNode T_GROUPING() { return getToken(HplsqlParser.T_GROUPING, 0); }
		public TerminalNode T_SETS() { return getToken(HplsqlParser.T_SETS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<Grouping_sets_clause_itemContext> grouping_sets_clause_item() {
			return getRuleContexts(Grouping_sets_clause_itemContext.class);
		}
		public Grouping_sets_clause_itemContext grouping_sets_clause_item(int i) {
			return getRuleContext(Grouping_sets_clause_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Grouping_sets_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping_sets_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitGrouping_sets_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grouping_sets_clauseContext grouping_sets_clause() throws RecognitionException {
		Grouping_sets_clauseContext _localctx = new Grouping_sets_clauseContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_grouping_sets_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2799);
			match(T_GROUPING);
			setState(2800);
			match(T_SETS);
			setState(2801);
			match(T_OPEN_P);
			{
			setState(2802);
			grouping_sets_clause_item();
			setState(2807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2803);
				match(T_COMMA);
				setState(2804);
				grouping_sets_clause_item();
				}
				}
				setState(2809);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(2810);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grouping_sets_clause_itemContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public List<Grouping_sets_clause_itemContext> grouping_sets_clause_item() {
			return getRuleContexts(Grouping_sets_clause_itemContext.class);
		}
		public Grouping_sets_clause_itemContext grouping_sets_clause_item(int i) {
			return getRuleContext(Grouping_sets_clause_itemContext.class,i);
		}
		public Grouping_sets_clause_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping_sets_clause_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitGrouping_sets_clause_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grouping_sets_clause_itemContext grouping_sets_clause_item() throws RecognitionException {
		Grouping_sets_clause_itemContext _localctx = new Grouping_sets_clause_itemContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_grouping_sets_clause_item);
		int _la;
		try {
			setState(2825);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,351,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2812);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2813);
				match(T_OPEN_P);
				setState(2815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BULK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HANDLER - 128)) | (1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOCOUNT - 192)) | (1L << (T_NOCOMPRESS - 192)) | (1L << (T_NOLOGGING - 192)) | (1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NULL - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SECURITY - 256)) | (1L << (T_SEGMENT - 256)) | (1L << (T_SEL - 256)) | (1L << (T_SELECT - 256)) | (1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_TYPE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITHOUT - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_WORK - 320)) | (1L << (T_XACT_ABORT - 320)) | (1L << (T_XML - 320)) | (1L << (T_YES - 320)) | (1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_MAX_PART_STRING - 320)) | (1L << (T_MIN_PART_STRING - 320)) | (1L << (T_MAX_PART_INT - 320)) | (1L << (T_MIN_PART_INT - 320)) | (1L << (T_MAX_PART_DATE - 320)) | (1L << (T_MIN_PART_DATE - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_COLLECT_LIST - 320)) | (1L << (T_COLLECT_SET - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_MAX_BY - 320)) | (1L << (T_USER - 320)) | (1L << (T_ADD - 320)) | (1L << (T_OPEN_P - 320)) | (1L << (T_SUB - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (L_ID - 384)) | (1L << (L_S_STRING - 384)) | (1L << (L_D_STRING - 384)) | (1L << (L_INT - 384)) | (1L << (L_DEC - 384)) | (1L << (L_DIGIT_NAME - 384)))) != 0)) {
					{
					setState(2814);
					expr(0);
					}
				}

				setState(2821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2817);
					match(T_COMMA);
					setState(2818);
					grouping_sets_clause_item();
					}
					}
					setState(2823);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2824);
				match(T_CLOSE_P);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode T_HAVING() { return getToken(HplsqlParser.T_HAVING, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitHaving_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2827);
			match(T_HAVING);
			setState(2828);
			bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualify_clauseContext extends ParserRuleContext {
		public TerminalNode T_QUALIFY() { return getToken(HplsqlParser.T_QUALIFY, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Qualify_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualify_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitQualify_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualify_clauseContext qualify_clause() throws RecognitionException {
		Qualify_clauseContext _localctx = new Qualify_clauseContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_qualify_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2830);
			match(T_QUALIFY);
			setState(2831);
			bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_ORDER() { return getToken(HplsqlParser.T_ORDER, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public List<TerminalNode> T_ASC() { return getTokens(HplsqlParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(HplsqlParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(HplsqlParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(HplsqlParser.T_DESC, i);
		}
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitOrder_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2833);
			match(T_ORDER);
			setState(2834);
			match(T_BY);
			setState(2835);
			expr(0);
			setState(2837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
			case 1:
				{
				setState(2836);
				_la = _input.LA(1);
				if ( !(_la==T_ASC || _la==T_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(2846);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,354,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2839);
					match(T_COMMA);
					setState(2840);
					expr(0);
					setState(2842);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
					case 1:
						{
						setState(2841);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					}
					}
				}
				setState(2848);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,354,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_optionsContext extends ParserRuleContext {
		public List<Select_options_itemContext> select_options_item() {
			return getRuleContexts(Select_options_itemContext.class);
		}
		public Select_options_itemContext select_options_item(int i) {
			return getRuleContext(Select_options_itemContext.class,i);
		}
		public Select_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_options; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_optionsContext select_options() throws RecognitionException {
		Select_optionsContext _localctx = new Select_optionsContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_select_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2850);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2849);
					select_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2852);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,355,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_options_itemContext extends ParserRuleContext {
		public TerminalNode T_LIMIT() { return getToken(HplsqlParser.T_LIMIT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_WITH() { return getToken(HplsqlParser.T_WITH, 0); }
		public TerminalNode T_RR() { return getToken(HplsqlParser.T_RR, 0); }
		public TerminalNode T_RS() { return getToken(HplsqlParser.T_RS, 0); }
		public TerminalNode T_CS() { return getToken(HplsqlParser.T_CS, 0); }
		public TerminalNode T_UR() { return getToken(HplsqlParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(HplsqlParser.T_USE, 0); }
		public TerminalNode T_AND() { return getToken(HplsqlParser.T_AND, 0); }
		public TerminalNode T_KEEP() { return getToken(HplsqlParser.T_KEEP, 0); }
		public TerminalNode T_LOCKS() { return getToken(HplsqlParser.T_LOCKS, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(HplsqlParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_UPDATE() { return getToken(HplsqlParser.T_UPDATE, 0); }
		public TerminalNode T_SHARE() { return getToken(HplsqlParser.T_SHARE, 0); }
		public Select_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_options_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSelect_options_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_options_itemContext select_options_item() throws RecognitionException {
		Select_options_itemContext _localctx = new Select_options_itemContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_select_options_item);
		int _la;
		try {
			setState(2865);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LIMIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2854);
				match(T_LIMIT);
				setState(2855);
				expr(0);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(2856);
				match(T_WITH);
				setState(2857);
				_la = _input.LA(1);
				if ( !(_la==T_CS || ((((_la - 249)) & ~0x3f) == 0 && ((1L << (_la - 249)) & ((1L << (T_RR - 249)) | (1L << (T_RS - 249)) | (1L << (T_UR - 249)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2863);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,356,_ctx) ) {
				case 1:
					{
					setState(2858);
					match(T_USE);
					setState(2859);
					match(T_AND);
					setState(2860);
					match(T_KEEP);
					setState(2861);
					_la = _input.LA(1);
					if ( !(_la==T_EXCLUSIVE || _la==T_SHARE || _la==T_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2862);
					match(T_LOCKS);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode T_UPDATE() { return getToken(HplsqlParser.T_UPDATE, 0); }
		public Update_tableContext update_table() {
			return getRuleContext(Update_tableContext.class,0);
		}
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public Update_assignmentContext update_assignment() {
			return getRuleContext(Update_assignmentContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Update_upsertContext update_upsert() {
			return getRuleContext(Update_upsertContext.class,0);
		}
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_update_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2867);
			match(T_UPDATE);
			setState(2868);
			update_table();
			setState(2869);
			match(T_SET);
			setState(2870);
			update_assignment();
			setState(2872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,358,_ctx) ) {
			case 1:
				{
				setState(2871);
				where_clause();
				}
				break;
			}
			setState(2875);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,359,_ctx) ) {
			case 1:
				{
				setState(2874);
				update_upsert();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_assignmentContext extends ParserRuleContext {
		public List<Assignment_stmt_itemContext> assignment_stmt_item() {
			return getRuleContexts(Assignment_stmt_itemContext.class);
		}
		public Assignment_stmt_itemContext assignment_stmt_item(int i) {
			return getRuleContext(Assignment_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Update_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitUpdate_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_assignmentContext update_assignment() throws RecognitionException {
		Update_assignmentContext _localctx = new Update_assignmentContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_update_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2877);
			assignment_stmt_item();
			setState(2882);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,360,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2878);
					match(T_COMMA);
					setState(2879);
					assignment_stmt_item();
					}
					}
				}
				setState(2884);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,360,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_tableContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public QidentContext qident() {
			return getRuleContext(QidentContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public Update_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_table; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitUpdate_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_tableContext update_table() throws RecognitionException {
		Update_tableContext _localctx = new Update_tableContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_update_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2893);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BULK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LIKE:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_TYPE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_SUB:
			case L_ID:
			case L_DIGIT_NAME:
				{
				setState(2885);
				table_name();
				setState(2887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_FROM) {
					{
					setState(2886);
					from_clause();
					}
				}

				}
				break;
			case T_OPEN_P:
				{
				setState(2889);
				match(T_OPEN_P);
				setState(2890);
				select_stmt();
				setState(2891);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,364,_ctx) ) {
			case 1:
				{
				setState(2896);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,363,_ctx) ) {
				case 1:
					{
					setState(2895);
					match(T_AS);
					}
					break;
				}
				setState(2898);
				qident();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_upsertContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Update_upsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_upsert; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitUpdate_upsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_upsertContext update_upsert() throws RecognitionException {
		Update_upsertContext _localctx = new Update_upsertContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_update_upsert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2901);
			match(T_ELSE);
			setState(2902);
			insert_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Merge_stmtContext extends ParserRuleContext {
		public TerminalNode T_MERGE() { return getToken(HplsqlParser.T_MERGE, 0); }
		public TerminalNode T_INTO() { return getToken(HplsqlParser.T_INTO, 0); }
		public List<Merge_tableContext> merge_table() {
			return getRuleContexts(Merge_tableContext.class);
		}
		public Merge_tableContext merge_table(int i) {
			return getRuleContext(Merge_tableContext.class,i);
		}
		public TerminalNode T_USING() { return getToken(HplsqlParser.T_USING, 0); }
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public List<Merge_conditionContext> merge_condition() {
			return getRuleContexts(Merge_conditionContext.class);
		}
		public Merge_conditionContext merge_condition(int i) {
			return getRuleContext(Merge_conditionContext.class,i);
		}
		public Merge_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_merge_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitMerge_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Merge_stmtContext merge_stmt() throws RecognitionException {
		Merge_stmtContext _localctx = new Merge_stmtContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_merge_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2904);
			match(T_MERGE);
			setState(2905);
			match(T_INTO);
			setState(2906);
			merge_table();
			setState(2907);
			match(T_USING);
			setState(2908);
			merge_table();
			setState(2909);
			match(T_ON);
			setState(2910);
			bool_expr(0);
			setState(2912);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2911);
					merge_condition();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2914);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,365,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Merge_tableContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public QidentContext qident() {
			return getRuleContext(QidentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public Merge_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_merge_table; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitMerge_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Merge_tableContext merge_table() throws RecognitionException {
		Merge_tableContext _localctx = new Merge_tableContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_merge_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2921);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BULK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LIKE:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_TYPE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_SUB:
			case L_ID:
			case L_DIGIT_NAME:
				{
				setState(2916);
				table_name();
				}
				break;
			case T_OPEN_P:
				{
				{
				setState(2917);
				match(T_OPEN_P);
				setState(2918);
				select_stmt();
				setState(2919);
				match(T_CLOSE_P);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,368,_ctx) ) {
			case 1:
				{
				setState(2924);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,367,_ctx) ) {
				case 1:
					{
					setState(2923);
					match(T_AS);
					}
					break;
				}
				setState(2926);
				qident();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Merge_conditionContext extends ParserRuleContext {
		public TerminalNode T_WHEN() { return getToken(HplsqlParser.T_WHEN, 0); }
		public TerminalNode T_MATCHED() { return getToken(HplsqlParser.T_MATCHED, 0); }
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public Merge_actionContext merge_action() {
			return getRuleContext(Merge_actionContext.class,0);
		}
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_AND() { return getToken(HplsqlParser.T_AND, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public TerminalNode T_IGNORE() { return getToken(HplsqlParser.T_IGNORE, 0); }
		public Merge_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_merge_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitMerge_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Merge_conditionContext merge_condition() throws RecognitionException {
		Merge_conditionContext _localctx = new Merge_conditionContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_merge_condition);
		int _la;
		try {
			setState(2942);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_WHEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2929);
				match(T_WHEN);
				setState(2931);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2930);
					match(T_NOT);
					}
				}

				setState(2933);
				match(T_MATCHED);
				setState(2936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AND) {
					{
					setState(2934);
					match(T_AND);
					setState(2935);
					bool_expr(0);
					}
				}

				setState(2938);
				match(T_THEN);
				setState(2939);
				merge_action();
				}
				break;
			case T_ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2940);
				match(T_ELSE);
				setState(2941);
				match(T_IGNORE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Merge_actionContext extends ParserRuleContext {
		public TerminalNode T_INSERT() { return getToken(HplsqlParser.T_INSERT, 0); }
		public TerminalNode T_VALUES() { return getToken(HplsqlParser.T_VALUES, 0); }
		public Insert_stmt_rowContext insert_stmt_row() {
			return getRuleContext(Insert_stmt_rowContext.class,0);
		}
		public Insert_stmt_colsContext insert_stmt_cols() {
			return getRuleContext(Insert_stmt_colsContext.class,0);
		}
		public TerminalNode T_UPDATE() { return getToken(HplsqlParser.T_UPDATE, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public List<Assignment_stmt_itemContext> assignment_stmt_item() {
			return getRuleContexts(Assignment_stmt_itemContext.class);
		}
		public Assignment_stmt_itemContext assignment_stmt_item(int i) {
			return getRuleContext(Assignment_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode T_DELETE() { return getToken(HplsqlParser.T_DELETE, 0); }
		public Merge_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_merge_action; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitMerge_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Merge_actionContext merge_action() throws RecognitionException {
		Merge_actionContext _localctx = new Merge_actionContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_merge_action);
		int _la;
		try {
			int _alt;
			setState(2964);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2944);
				match(T_INSERT);
				setState(2946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(2945);
					insert_stmt_cols();
					}
				}

				setState(2948);
				match(T_VALUES);
				setState(2949);
				insert_stmt_row();
				}
				break;
			case T_UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2950);
				match(T_UPDATE);
				setState(2951);
				match(T_SET);
				setState(2952);
				assignment_stmt_item();
				setState(2957);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,373,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2953);
						match(T_COMMA);
						setState(2954);
						assignment_stmt_item();
						}
						}
					}
					setState(2959);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,373,_ctx);
				}
				setState(2961);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,374,_ctx) ) {
				case 1:
					{
					setState(2960);
					where_clause();
					}
					break;
				}
				}
				break;
			case T_DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2963);
				match(T_DELETE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode T_DELETE() { return getToken(HplsqlParser.T_DELETE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_FROM() { return getToken(HplsqlParser.T_FROM, 0); }
		public Delete_aliasContext delete_alias() {
			return getRuleContext(Delete_aliasContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode T_ALL() { return getToken(HplsqlParser.T_ALL, 0); }
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2966);
			match(T_DELETE);
			setState(2968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_FROM) {
				{
				setState(2967);
				match(T_FROM);
				}
			}

			setState(2970);
			table_name();
			setState(2972);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,377,_ctx) ) {
			case 1:
				{
				setState(2971);
				delete_alias();
				}
				break;
			}
			setState(2976);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,378,_ctx) ) {
			case 1:
				{
				setState(2974);
				where_clause();
				}
				break;
			case 2:
				{
				setState(2975);
				match(T_ALL);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_aliasContext extends ParserRuleContext {
		public QidentContext qident() {
			return getRuleContext(QidentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public Delete_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDelete_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_aliasContext delete_alias() throws RecognitionException {
		Delete_aliasContext _localctx = new Delete_aliasContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_delete_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2978);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("ALL"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"ALL\")");
			setState(2980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,379,_ctx) ) {
			case 1:
				{
				setState(2979);
				match(T_AS);
				}
				break;
			}
			setState(2982);
			qident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Describe_stmtContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_DESCRIBE() { return getToken(HplsqlParser.T_DESCRIBE, 0); }
		public TerminalNode T_DESC() { return getToken(HplsqlParser.T_DESC, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public Describe_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describe_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDescribe_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Describe_stmtContext describe_stmt() throws RecognitionException {
		Describe_stmtContext _localctx = new Describe_stmtContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_describe_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2984);
			_la = _input.LA(1);
			if ( !(_la==T_DESC || _la==T_DESCRIBE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2986);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,380,_ctx) ) {
			case 1:
				{
				setState(2985);
				match(T_TABLE);
				}
				break;
			}
			setState(2988);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_exprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public Bool_expr_atomContext bool_expr_atom() {
			return getRuleContext(Bool_expr_atomContext.class,0);
		}
		public Bool_expr_logical_operatorContext bool_expr_logical_operator() {
			return getRuleContext(Bool_expr_logical_operatorContext.class,0);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		return bool_expr(0);
	}

	private Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
		Bool_exprContext _prevctx = _localctx;
		int _startState = 420;
		enterRecursionRule(_localctx, 420, RULE_bool_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,383,_ctx) ) {
			case 1:
				{
				setState(2992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(2991);
					match(T_NOT);
					}
				}

				setState(2994);
				match(T_OPEN_P);
				setState(2995);
				bool_expr(0);
				setState(2996);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(2998);
				bool_expr_atom();
				}
				break;
			case 3:
				{
				setState(3000);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,382,_ctx) ) {
				case 1:
					{
					setState(2999);
					match(T_NOT);
					}
					break;
				}
				setState(3002);
				bool_expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(3011);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,384,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(3005);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(3006);
					bool_expr_logical_operator();
					setState(3007);
					bool_expr(4);
					}
					}
				}
				setState(3013);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,384,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Bool_expr_atomContext extends ParserRuleContext {
		public Bool_expr_unaryContext bool_expr_unary() {
			return getRuleContext(Bool_expr_unaryContext.class,0);
		}
		public Bool_expr_binaryContext bool_expr_binary() {
			return getRuleContext(Bool_expr_binaryContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Bool_expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_atom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_atomContext bool_expr_atom() throws RecognitionException {
		Bool_expr_atomContext _localctx = new Bool_expr_atomContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_bool_expr_atom);
		try {
			setState(3017);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,385,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3014);
				bool_expr_unary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3015);
				bool_expr_binary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3016);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_unaryContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_BETWEEN() { return getToken(HplsqlParser.T_BETWEEN, 0); }
		public TerminalNode T_AND() { return getToken(HplsqlParser.T_AND, 0); }
		public TerminalNode T_EXISTS() { return getToken(HplsqlParser.T_EXISTS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Bool_expr_single_inContext bool_expr_single_in() {
			return getRuleContext(Bool_expr_single_inContext.class,0);
		}
		public Bool_expr_multi_inContext bool_expr_multi_in() {
			return getRuleContext(Bool_expr_multi_inContext.class,0);
		}
		public Bool_expr_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_unary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_unary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_unaryContext bool_expr_unary() throws RecognitionException {
		Bool_expr_unaryContext _localctx = new Bool_expr_unaryContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_bool_expr_unary);
		int _la;
		try {
			setState(3042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,388,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3019);
				expr(0);
				setState(3020);
				match(T_IS);
				setState(3022);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(3021);
					match(T_NOT);
					}
				}

				setState(3024);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3026);
				expr(0);
				setState(3027);
				match(T_BETWEEN);
				setState(3028);
				expr(0);
				setState(3029);
				match(T_AND);
				setState(3030);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3033);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(3032);
					match(T_NOT);
					}
				}

				setState(3035);
				match(T_EXISTS);
				setState(3036);
				match(T_OPEN_P);
				setState(3037);
				select_stmt();
				setState(3038);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3040);
				bool_expr_single_in();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3041);
				bool_expr_multi_in();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_single_inContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Bool_expr_single_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_single_in; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_single_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_single_inContext bool_expr_single_in() throws RecognitionException {
		Bool_expr_single_inContext _localctx = new Bool_expr_single_inContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_bool_expr_single_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3044);
			expr(0);
			setState(3046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(3045);
				match(T_NOT);
				}
			}

			setState(3048);
			match(T_IN);
			setState(3049);
			match(T_OPEN_P);
			setState(3059);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,391,_ctx) ) {
			case 1:
				{
				{
				setState(3050);
				expr(0);
				setState(3055);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(3051);
					match(T_COMMA);
					setState(3052);
					expr(0);
					}
					}
					setState(3057);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(3058);
				select_stmt();
				}
				break;
			}
			setState(3061);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_multi_inContext extends ParserRuleContext {
		public List<TerminalNode> T_OPEN_P() { return getTokens(HplsqlParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(HplsqlParser.T_OPEN_P, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(HplsqlParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(HplsqlParser.T_CLOSE_P, i);
		}
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public Bool_expr_multi_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_multi_in; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_multi_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_multi_inContext bool_expr_multi_in() throws RecognitionException {
		Bool_expr_multi_inContext _localctx = new Bool_expr_multi_inContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_bool_expr_multi_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3063);
			match(T_OPEN_P);
			setState(3064);
			expr(0);
			setState(3069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(3065);
				match(T_COMMA);
				setState(3066);
				expr(0);
				}
				}
				setState(3071);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(3072);
			match(T_CLOSE_P);
			setState(3074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(3073);
				match(T_NOT);
				}
			}

			setState(3076);
			match(T_IN);
			setState(3077);
			match(T_OPEN_P);
			setState(3078);
			select_stmt();
			setState(3079);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_binaryContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Bool_expr_binary_operatorContext bool_expr_binary_operator() {
			return getRuleContext(Bool_expr_binary_operatorContext.class,0);
		}
		public Bool_expr_binaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_binary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_binaryContext bool_expr_binary() throws RecognitionException {
		Bool_expr_binaryContext _localctx = new Bool_expr_binaryContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_bool_expr_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3081);
			expr(0);
			setState(3082);
			bool_expr_binary_operator();
			setState(3083);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_logical_operatorContext extends ParserRuleContext {
		public TerminalNode T_AND() { return getToken(HplsqlParser.T_AND, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public Bool_expr_logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_logical_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_logical_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_logical_operatorContext bool_expr_logical_operator() throws RecognitionException {
		Bool_expr_logical_operatorContext _localctx = new Bool_expr_logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_bool_expr_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3085);
			_la = _input.LA(1);
			if ( !(_la==T_AND || _la==T_OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_binary_operatorContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_EQUAL2() { return getToken(HplsqlParser.T_EQUAL2, 0); }
		public TerminalNode T_NOTEQUAL() { return getToken(HplsqlParser.T_NOTEQUAL, 0); }
		public TerminalNode T_NOTEQUAL2() { return getToken(HplsqlParser.T_NOTEQUAL2, 0); }
		public TerminalNode T_LESS() { return getToken(HplsqlParser.T_LESS, 0); }
		public TerminalNode T_LESSEQUAL() { return getToken(HplsqlParser.T_LESSEQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(HplsqlParser.T_GREATER, 0); }
		public TerminalNode T_GREATEREQUAL() { return getToken(HplsqlParser.T_GREATEREQUAL, 0); }
		public TerminalNode T_LIKE() { return getToken(HplsqlParser.T_LIKE, 0); }
		public TerminalNode T_RLIKE() { return getToken(HplsqlParser.T_RLIKE, 0); }
		public TerminalNode T_REGEXP() { return getToken(HplsqlParser.T_REGEXP, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public Bool_expr_binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_expr_binary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_binary_operatorContext bool_expr_binary_operator() throws RecognitionException {
		Bool_expr_binary_operatorContext _localctx = new Bool_expr_binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_bool_expr_binary_operator);
		int _la;
		try {
			setState(3099);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(3087);
				match(T_EQUAL);
				}
				break;
			case T_EQUAL2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3088);
				match(T_EQUAL2);
				}
				break;
			case T_NOTEQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(3089);
				match(T_NOTEQUAL);
				}
				break;
			case T_NOTEQUAL2:
				enterOuterAlt(_localctx, 4);
				{
				setState(3090);
				match(T_NOTEQUAL2);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 5);
				{
				setState(3091);
				match(T_LESS);
				}
				break;
			case T_LESSEQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(3092);
				match(T_LESSEQUAL);
				}
				break;
			case T_GREATER:
				enterOuterAlt(_localctx, 7);
				{
				setState(3093);
				match(T_GREATER);
				}
				break;
			case T_GREATEREQUAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(3094);
				match(T_GREATEREQUAL);
				}
				break;
			case T_LIKE:
			case T_NOT:
			case T_REGEXP:
			case T_RLIKE:
				enterOuterAlt(_localctx, 9);
				{
				setState(3096);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(3095);
					match(T_NOT);
					}
				}

				setState(3098);
				_la = _input.LA(1);
				if ( !(_la==T_LIKE || _la==T_REGEXP || _la==T_RLIKE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public TerminalNode T_SUB() { return getToken(HplsqlParser.T_SUB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_intervalContext expr_interval() {
			return getRuleContext(Expr_intervalContext.class,0);
		}
		public Expr_concatContext expr_concat() {
			return getRuleContext(Expr_concatContext.class,0);
		}
		public Expr_dotContext expr_dot() {
			return getRuleContext(Expr_dotContext.class,0);
		}
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_ifContext expr_if() {
			return getRuleContext(Expr_ifContext.class,0);
		}
		public Expr_cursor_attributeContext expr_cursor_attribute() {
			return getRuleContext(Expr_cursor_attributeContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public TerminalNode T_MUL() { return getToken(HplsqlParser.T_MUL, 0); }
		public TerminalNode T_DIV() { return getToken(HplsqlParser.T_DIV, 0); }
		public TerminalNode T_ADD() { return getToken(HplsqlParser.T_ADD, 0); }
		public TerminalNode T_MOD() { return getToken(HplsqlParser.T_MOD, 0); }
		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class,0);
		}
		public Expr_func_childContext expr_func_child() {
			return getRuleContext(Expr_func_childContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 436;
		enterRecursionRule(_localctx, 436, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,398,_ctx) ) {
			case 1:
				{
				setState(3103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_SUB) {
					{
					setState(3102);
					match(T_SUB);
					}
				}

				setState(3105);
				match(T_OPEN_P);
				setState(3106);
				select_stmt();
				setState(3107);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(3110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_SUB) {
					{
					setState(3109);
					match(T_SUB);
					}
				}

				setState(3112);
				match(T_OPEN_P);
				setState(3113);
				expr(0);
				setState(3114);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				{
				setState(3116);
				expr_interval();
				}
				break;
			case 4:
				{
				setState(3117);
				expr_concat();
				}
				break;
			case 5:
				{
				setState(3118);
				expr_dot();
				}
				break;
			case 6:
				{
				setState(3119);
				expr_case();
				}
				break;
			case 7:
				{
				setState(3120);
				expr_if();
				}
				break;
			case 8:
				{
				setState(3121);
				expr_cursor_attribute();
				}
				break;
			case 9:
				{
				setState(3122);
				expr_agg_window_func();
				}
				break;
			case 10:
				{
				setState(3123);
				expr_spec_func();
				}
				break;
			case 11:
				{
				setState(3124);
				expr_func();
				}
				break;
			case 12:
				{
				setState(3125);
				expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(3143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,400,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(3141);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,399,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(3128);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(3129);
						_la = _input.LA(1);
						if ( !(_la==T_DIV || _la==T_MUL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(3130);
						expr(17);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(3131);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(3132);
						_la = _input.LA(1);
						if ( !(_la==T_ADD || _la==T_SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(3133);
						expr(16);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(3134);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(3135);
						match(T_MOD);
						setState(3136);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(3137);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(3138);
						interval_item();
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(3139);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(3140);
						expr_func_child();
						}
						break;
					}
					}
				}
				setState(3145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,400,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_atomContext extends ParserRuleContext {
		public Date_literalContext date_literal() {
			return getRuleContext(Date_literalContext.class,0);
		}
		public Timestamp_literalContext timestamp_literal() {
			return getRuleContext(Timestamp_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Dec_numberContext dec_number() {
			return getRuleContext(Dec_numberContext.class,0);
		}
		public Int_numberContext int_number() {
			return getRuleContext(Int_numberContext.class,0);
		}
		public Null_constContext null_const() {
			return getRuleContext(Null_constContext.class,0);
		}
		public Expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_atom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_atomContext expr_atom() throws RecognitionException {
		Expr_atomContext _localctx = new Expr_atomContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_expr_atom);
		try {
			setState(3154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,401,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3146);
				date_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3147);
				timestamp_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3148);
				bool_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3149);
				column_name();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3150);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3151);
				dec_number();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3152);
				int_number();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(3153);
				null_const();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_intervalContext extends ParserRuleContext {
		public TerminalNode T_INTERVAL() { return getToken(HplsqlParser.T_INTERVAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class,0);
		}
		public Expr_intervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_interval; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_interval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_intervalContext expr_interval() throws RecognitionException {
		Expr_intervalContext _localctx = new Expr_intervalContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_expr_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3156);
			match(T_INTERVAL);
			setState(3157);
			expr(0);
			setState(3158);
			interval_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interval_itemContext extends ParserRuleContext {
		public TerminalNode T_DAY() { return getToken(HplsqlParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(HplsqlParser.T_DAYS, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(HplsqlParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(HplsqlParser.T_MICROSECONDS, 0); }
		public TerminalNode T_SECOND() { return getToken(HplsqlParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(HplsqlParser.T_SECONDS, 0); }
		public Interval_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitInterval_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interval_itemContext interval_item() throws RecognitionException {
		Interval_itemContext _localctx = new Interval_itemContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_interval_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3160);
			_la = _input.LA(1);
			if ( !(_la==T_DAY || _la==T_DAYS || _la==T_MICROSECOND || _la==T_MICROSECONDS || _la==T_SECOND || _la==T_SECONDS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_concatContext extends ParserRuleContext {
		public List<Expr_concat_itemContext> expr_concat_item() {
			return getRuleContexts(Expr_concat_itemContext.class);
		}
		public Expr_concat_itemContext expr_concat_item(int i) {
			return getRuleContext(Expr_concat_itemContext.class,i);
		}
		public List<TerminalNode> T_PIPE() { return getTokens(HplsqlParser.T_PIPE); }
		public TerminalNode T_PIPE(int i) {
			return getToken(HplsqlParser.T_PIPE, i);
		}
		public List<TerminalNode> T_CONCAT() { return getTokens(HplsqlParser.T_CONCAT); }
		public TerminalNode T_CONCAT(int i) {
			return getToken(HplsqlParser.T_CONCAT, i);
		}
		public Expr_concatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_concat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_concatContext expr_concat() throws RecognitionException {
		Expr_concatContext _localctx = new Expr_concatContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_expr_concat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3162);
			expr_concat_item();
			setState(3163);
			_la = _input.LA(1);
			if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(3164);
			expr_concat_item();
			setState(3169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,402,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3165);
					_la = _input.LA(1);
					if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(3166);
					expr_concat_item();
					}
					}
				}
				setState(3171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,402,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_concat_itemContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_ifContext expr_if() {
			return getRuleContext(Expr_ifContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_dotContext expr_dot() {
			return getRuleContext(Expr_dotContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public Expr_concat_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_concat_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_concat_itemContext expr_concat_item() throws RecognitionException {
		Expr_concat_itemContext _localctx = new Expr_concat_itemContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_expr_concat_item);
		try {
			setState(3183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,403,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3172);
				match(T_OPEN_P);
				setState(3173);
				expr(0);
				setState(3174);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3176);
				expr_case();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3177);
				expr_if();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3178);
				expr_agg_window_func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3179);
				expr_spec_func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3180);
				expr_dot();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3181);
				expr_func();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(3182);
				expr_atom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_caseContext extends ParserRuleContext {
		public Expr_case_simpleContext expr_case_simple() {
			return getRuleContext(Expr_case_simpleContext.class,0);
		}
		public Expr_case_searchedContext expr_case_searched() {
			return getRuleContext(Expr_case_searchedContext.class,0);
		}
		public Expr_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_caseContext expr_case() throws RecognitionException {
		Expr_caseContext _localctx = new Expr_caseContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_expr_case);
		try {
			setState(3187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,404,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3185);
				expr_case_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3186);
				expr_case_searched();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_case_simpleContext extends ParserRuleContext {
		public TerminalNode T_CASE() { return getToken(HplsqlParser.T_CASE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public List<TerminalNode> T_WHEN() { return getTokens(HplsqlParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(HplsqlParser.T_WHEN, i);
		}
		public List<TerminalNode> T_THEN() { return getTokens(HplsqlParser.T_THEN); }
		public TerminalNode T_THEN(int i) {
			return getToken(HplsqlParser.T_THEN, i);
		}
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public Expr_case_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_simple; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_case_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_case_simpleContext expr_case_simple() throws RecognitionException {
		Expr_case_simpleContext _localctx = new Expr_case_simpleContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_expr_case_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3189);
			match(T_CASE);
			setState(3190);
			expr(0);
			setState(3196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3191);
				match(T_WHEN);
				setState(3192);
				expr(0);
				setState(3193);
				match(T_THEN);
				setState(3194);
				expr(0);
				}
				}
				setState(3198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(3202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(3200);
				match(T_ELSE);
				setState(3201);
				expr(0);
				}
			}

			setState(3204);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_case_searchedContext extends ParserRuleContext {
		public TerminalNode T_CASE() { return getToken(HplsqlParser.T_CASE, 0); }
		public TerminalNode T_END() { return getToken(HplsqlParser.T_END, 0); }
		public List<TerminalNode> T_WHEN() { return getTokens(HplsqlParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(HplsqlParser.T_WHEN, i);
		}
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public List<TerminalNode> T_THEN() { return getTokens(HplsqlParser.T_THEN); }
		public TerminalNode T_THEN(int i) {
			return getToken(HplsqlParser.T_THEN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(HplsqlParser.T_ELSE, 0); }
		public Expr_case_searchedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_searched; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_case_searched(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_case_searchedContext expr_case_searched() throws RecognitionException {
		Expr_case_searchedContext _localctx = new Expr_case_searchedContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_expr_case_searched);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3206);
			match(T_CASE);
			setState(3212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(3207);
				match(T_WHEN);
				setState(3208);
				bool_expr(0);
				setState(3209);
				match(T_THEN);
				setState(3210);
				expr(0);
				}
				}
				setState(3214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(3218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(3216);
				match(T_ELSE);
				setState(3217);
				expr(0);
				}
			}

			setState(3220);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_ifContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Expr_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_if; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_ifContext expr_if() throws RecognitionException {
		Expr_ifContext _localctx = new Expr_ifContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_expr_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3222);
			match(T_IF);
			setState(3223);
			match(T_OPEN_P);
			setState(3224);
			bool_expr(0);
			setState(3225);
			match(T_COMMA);
			setState(3226);
			expr(0);
			setState(3227);
			match(T_COMMA);
			setState(3228);
			expr(0);
			setState(3229);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_cursor_attributeContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_MOD() { return getToken(HplsqlParser.T_MOD, 0); }
		public TerminalNode T_ISOPEN() { return getToken(HplsqlParser.T_ISOPEN, 0); }
		public TerminalNode T_FOUND() { return getToken(HplsqlParser.T_FOUND, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(HplsqlParser.T_NOTFOUND, 0); }
		public Expr_cursor_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_cursor_attribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_cursor_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_cursor_attributeContext expr_cursor_attribute() throws RecognitionException {
		Expr_cursor_attributeContext _localctx = new Expr_cursor_attributeContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_expr_cursor_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3231);
			ident();
			setState(3232);
			match(T_MOD);
			setState(3233);
			_la = _input.LA(1);
			if ( !(_la==T_FOUND || _la==T_ISOPEN || _la==T_NOTFOUND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_agg_window_funcContext extends ParserRuleContext {
		public TerminalNode T_AVG() { return getToken(HplsqlParser.T_AVG, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Expr_func_all_distinctContext expr_func_all_distinct() {
			return getRuleContext(Expr_func_all_distinctContext.class,0);
		}
		public Expr_func_over_clauseContext expr_func_over_clause() {
			return getRuleContext(Expr_func_over_clauseContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(HplsqlParser.T_COUNT, 0); }
		public TerminalNode T_MUL() { return getToken(HplsqlParser.T_MUL, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(HplsqlParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(HplsqlParser.T_CUME_DIST, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(HplsqlParser.T_DENSE_RANK, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(HplsqlParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_LAG() { return getToken(HplsqlParser.T_LAG, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public TerminalNode T_LAST_VALUE() { return getToken(HplsqlParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(HplsqlParser.T_LEAD, 0); }
		public TerminalNode T_MAX() { return getToken(HplsqlParser.T_MAX, 0); }
		public TerminalNode T_MIN() { return getToken(HplsqlParser.T_MIN, 0); }
		public TerminalNode T_RANK() { return getToken(HplsqlParser.T_RANK, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(HplsqlParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_COLLECT_LIST() { return getToken(HplsqlParser.T_COLLECT_LIST, 0); }
		public TerminalNode T_COLLECT_SET() { return getToken(HplsqlParser.T_COLLECT_SET, 0); }
		public TerminalNode T_STDEV() { return getToken(HplsqlParser.T_STDEV, 0); }
		public TerminalNode T_SUM() { return getToken(HplsqlParser.T_SUM, 0); }
		public TerminalNode T_VAR() { return getToken(HplsqlParser.T_VAR, 0); }
		public TerminalNode T_VARIANCE() { return getToken(HplsqlParser.T_VARIANCE, 0); }
		public TerminalNode T_MAX_BY() { return getToken(HplsqlParser.T_MAX_BY, 0); }
		public Expr_agg_window_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_agg_window_func; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_agg_window_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_agg_window_funcContext expr_agg_window_func() throws RecognitionException {
		Expr_agg_window_funcContext _localctx = new Expr_agg_window_funcContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_expr_agg_window_func);
		int _la;
		try {
			setState(3410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(3235);
				match(T_AVG);
				setState(3236);
				match(T_OPEN_P);
				setState(3238);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,409,_ctx) ) {
				case 1:
					{
					setState(3237);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3240);
				expr(0);
				setState(3241);
				match(T_CLOSE_P);
				setState(3243);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,410,_ctx) ) {
				case 1:
					{
					setState(3242);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3245);
				match(T_COUNT);
				setState(3246);
				match(T_OPEN_P);
				setState(3252);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BULK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LIKE:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_TYPE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_COLLECT_LIST:
				case T_COLLECT_SET:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_MAX_BY:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
				case L_DIGIT_NAME:
					{
					{
					setState(3248);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,411,_ctx) ) {
					case 1:
						{
						setState(3247);
						expr_func_all_distinct();
						}
						break;
					}
					setState(3250);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(3251);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3254);
				match(T_CLOSE_P);
				setState(3256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,413,_ctx) ) {
				case 1:
					{
					setState(3255);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT_BIG:
				enterOuterAlt(_localctx, 3);
				{
				setState(3258);
				match(T_COUNT_BIG);
				setState(3259);
				match(T_OPEN_P);
				setState(3265);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BULK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LIKE:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_TYPE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_COLLECT_LIST:
				case T_COLLECT_SET:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_MAX_BY:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
				case L_DIGIT_NAME:
					{
					{
					setState(3261);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,414,_ctx) ) {
					case 1:
						{
						setState(3260);
						expr_func_all_distinct();
						}
						break;
					}
					setState(3263);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(3264);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3267);
				match(T_CLOSE_P);
				setState(3269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,416,_ctx) ) {
				case 1:
					{
					setState(3268);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_CUME_DIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(3271);
				match(T_CUME_DIST);
				setState(3272);
				match(T_OPEN_P);
				setState(3273);
				match(T_CLOSE_P);
				setState(3274);
				expr_func_over_clause();
				}
				break;
			case T_DENSE_RANK:
				enterOuterAlt(_localctx, 5);
				{
				setState(3275);
				match(T_DENSE_RANK);
				setState(3276);
				match(T_OPEN_P);
				setState(3277);
				match(T_CLOSE_P);
				setState(3278);
				expr_func_over_clause();
				}
				break;
			case T_FIRST_VALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(3279);
				match(T_FIRST_VALUE);
				setState(3280);
				match(T_OPEN_P);
				setState(3281);
				expr(0);
				setState(3282);
				match(T_CLOSE_P);
				setState(3283);
				expr_func_over_clause();
				}
				break;
			case T_LAG:
				enterOuterAlt(_localctx, 7);
				{
				setState(3285);
				match(T_LAG);
				setState(3286);
				match(T_OPEN_P);
				setState(3287);
				expr(0);
				setState(3294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3288);
					match(T_COMMA);
					setState(3289);
					expr(0);
					setState(3292);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(3290);
						match(T_COMMA);
						setState(3291);
						expr(0);
						}
					}

					}
				}

				setState(3296);
				match(T_CLOSE_P);
				setState(3297);
				expr_func_over_clause();
				}
				break;
			case T_LAST_VALUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(3299);
				match(T_LAST_VALUE);
				setState(3300);
				match(T_OPEN_P);
				setState(3301);
				expr(0);
				setState(3302);
				match(T_CLOSE_P);
				setState(3303);
				expr_func_over_clause();
				}
				break;
			case T_LEAD:
				enterOuterAlt(_localctx, 9);
				{
				setState(3305);
				match(T_LEAD);
				setState(3306);
				match(T_OPEN_P);
				setState(3307);
				expr(0);
				setState(3314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3308);
					match(T_COMMA);
					setState(3309);
					expr(0);
					setState(3312);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(3310);
						match(T_COMMA);
						setState(3311);
						expr(0);
						}
					}

					}
				}

				setState(3316);
				match(T_CLOSE_P);
				setState(3317);
				expr_func_over_clause();
				}
				break;
			case T_MAX:
				enterOuterAlt(_localctx, 10);
				{
				setState(3319);
				match(T_MAX);
				setState(3320);
				match(T_OPEN_P);
				setState(3322);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,421,_ctx) ) {
				case 1:
					{
					setState(3321);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3324);
				expr(0);
				setState(3325);
				match(T_CLOSE_P);
				setState(3327);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,422,_ctx) ) {
				case 1:
					{
					setState(3326);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_MIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(3329);
				match(T_MIN);
				setState(3330);
				match(T_OPEN_P);
				setState(3332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,423,_ctx) ) {
				case 1:
					{
					setState(3331);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3334);
				expr(0);
				setState(3335);
				match(T_CLOSE_P);
				setState(3337);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,424,_ctx) ) {
				case 1:
					{
					setState(3336);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_RANK:
				enterOuterAlt(_localctx, 12);
				{
				setState(3339);
				match(T_RANK);
				setState(3340);
				match(T_OPEN_P);
				setState(3341);
				match(T_CLOSE_P);
				setState(3342);
				expr_func_over_clause();
				}
				break;
			case T_ROW_NUMBER:
				enterOuterAlt(_localctx, 13);
				{
				setState(3343);
				match(T_ROW_NUMBER);
				setState(3344);
				match(T_OPEN_P);
				setState(3345);
				match(T_CLOSE_P);
				setState(3346);
				expr_func_over_clause();
				}
				break;
			case T_COLLECT_LIST:
				enterOuterAlt(_localctx, 14);
				{
				setState(3347);
				match(T_COLLECT_LIST);
				setState(3348);
				match(T_OPEN_P);
				setState(3349);
				expr(0);
				setState(3350);
				match(T_CLOSE_P);
				setState(3352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,425,_ctx) ) {
				case 1:
					{
					setState(3351);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COLLECT_SET:
				enterOuterAlt(_localctx, 15);
				{
				setState(3354);
				match(T_COLLECT_SET);
				setState(3355);
				match(T_OPEN_P);
				setState(3356);
				expr(0);
				setState(3357);
				match(T_CLOSE_P);
				setState(3359);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,426,_ctx) ) {
				case 1:
					{
					setState(3358);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_STDEV:
				enterOuterAlt(_localctx, 16);
				{
				setState(3361);
				match(T_STDEV);
				setState(3362);
				match(T_OPEN_P);
				setState(3364);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,427,_ctx) ) {
				case 1:
					{
					setState(3363);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3366);
				expr(0);
				setState(3367);
				match(T_CLOSE_P);
				setState(3369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,428,_ctx) ) {
				case 1:
					{
					setState(3368);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_SUM:
				enterOuterAlt(_localctx, 17);
				{
				setState(3371);
				match(T_SUM);
				setState(3372);
				match(T_OPEN_P);
				setState(3374);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,429,_ctx) ) {
				case 1:
					{
					setState(3373);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3376);
				expr(0);
				setState(3377);
				match(T_CLOSE_P);
				setState(3379);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,430,_ctx) ) {
				case 1:
					{
					setState(3378);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VAR:
				enterOuterAlt(_localctx, 18);
				{
				setState(3381);
				match(T_VAR);
				setState(3382);
				match(T_OPEN_P);
				setState(3384);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,431,_ctx) ) {
				case 1:
					{
					setState(3383);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3386);
				expr(0);
				setState(3387);
				match(T_CLOSE_P);
				setState(3389);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,432,_ctx) ) {
				case 1:
					{
					setState(3388);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VARIANCE:
				enterOuterAlt(_localctx, 19);
				{
				setState(3391);
				match(T_VARIANCE);
				setState(3392);
				match(T_OPEN_P);
				setState(3394);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,433,_ctx) ) {
				case 1:
					{
					setState(3393);
					expr_func_all_distinct();
					}
					break;
				}
				setState(3396);
				expr(0);
				setState(3397);
				match(T_CLOSE_P);
				setState(3399);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,434,_ctx) ) {
				case 1:
					{
					setState(3398);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_MAX_BY:
				enterOuterAlt(_localctx, 20);
				{
				setState(3401);
				match(T_MAX_BY);
				setState(3402);
				match(T_OPEN_P);
				setState(3403);
				expr(0);
				setState(3404);
				match(T_COMMA);
				setState(3405);
				expr(0);
				setState(3406);
				match(T_CLOSE_P);
				setState(3408);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,435,_ctx) ) {
				case 1:
					{
					setState(3407);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_all_distinctContext extends ParserRuleContext {
		public TerminalNode T_ALL() { return getToken(HplsqlParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HplsqlParser.T_DISTINCT, 0); }
		public Expr_func_all_distinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_all_distinct; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_func_all_distinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_all_distinctContext expr_func_all_distinct() throws RecognitionException {
		Expr_func_all_distinctContext _localctx = new Expr_func_all_distinctContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_expr_func_all_distinct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3412);
			_la = _input.LA(1);
			if ( !(_la==T_ALL || _la==T_DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_over_clauseContext extends ParserRuleContext {
		public TerminalNode T_OVER() { return getToken(HplsqlParser.T_OVER, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Expr_func_partition_by_clauseContext expr_func_partition_by_clause() {
			return getRuleContext(Expr_func_partition_by_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Rows_between_clauseContext rows_between_clause() {
			return getRuleContext(Rows_between_clauseContext.class,0);
		}
		public Expr_func_over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_over_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_func_over_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_over_clauseContext expr_func_over_clause() throws RecognitionException {
		Expr_func_over_clauseContext _localctx = new Expr_func_over_clauseContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_expr_func_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3414);
			match(T_OVER);
			setState(3427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BULK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LIKE:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_TYPE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_SUB:
			case L_ID:
				{
				setState(3415);
				ident();
				}
				break;
			case T_OPEN_P:
				{
				setState(3416);
				match(T_OPEN_P);
				setState(3418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_PARTITION) {
					{
					setState(3417);
					expr_func_partition_by_clause();
					}
				}

				setState(3421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ORDER) {
					{
					setState(3420);
					order_by_clause();
					}
				}

				setState(3424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ROWS) {
					{
					setState(3423);
					rows_between_clause();
					}
				}

				setState(3426);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rows_between_clauseContext extends ParserRuleContext {
		public TerminalNode T_ROWS() { return getToken(HplsqlParser.T_ROWS, 0); }
		public TerminalNode T_BETWEEN() { return getToken(HplsqlParser.T_BETWEEN, 0); }
		public List<Rows_between_clause_boundContext> rows_between_clause_bound() {
			return getRuleContexts(Rows_between_clause_boundContext.class);
		}
		public Rows_between_clause_boundContext rows_between_clause_bound(int i) {
			return getRuleContext(Rows_between_clause_boundContext.class,i);
		}
		public TerminalNode T_AND() { return getToken(HplsqlParser.T_AND, 0); }
		public Rows_between_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rows_between_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitRows_between_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rows_between_clauseContext rows_between_clause() throws RecognitionException {
		Rows_between_clauseContext _localctx = new Rows_between_clauseContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_rows_between_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3429);
			match(T_ROWS);
			setState(3430);
			match(T_BETWEEN);
			setState(3431);
			rows_between_clause_bound();
			setState(3432);
			match(T_AND);
			setState(3433);
			rows_between_clause_bound();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rows_between_clause_boundContext extends ParserRuleContext {
		public TerminalNode T_UNBOUNDED() { return getToken(HplsqlParser.T_UNBOUNDED, 0); }
		public TerminalNode T_PRECEDING() { return getToken(HplsqlParser.T_PRECEDING, 0); }
		public TerminalNode T_FOLLOWING() { return getToken(HplsqlParser.T_FOLLOWING, 0); }
		public TerminalNode T_CURRENT() { return getToken(HplsqlParser.T_CURRENT, 0); }
		public TerminalNode T_ROW() { return getToken(HplsqlParser.T_ROW, 0); }
		public TerminalNode L_INT() { return getToken(HplsqlParser.L_INT, 0); }
		public Rows_between_clause_boundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rows_between_clause_bound; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitRows_between_clause_bound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rows_between_clause_boundContext rows_between_clause_bound() throws RecognitionException {
		Rows_between_clause_boundContext _localctx = new Rows_between_clause_boundContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_rows_between_clause_bound);
		try {
			setState(3445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,441,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3435);
				match(T_UNBOUNDED);
				setState(3436);
				match(T_PRECEDING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3437);
				match(T_UNBOUNDED);
				setState(3438);
				match(T_FOLLOWING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3439);
				match(T_CURRENT);
				setState(3440);
				match(T_ROW);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3441);
				match(L_INT);
				setState(3442);
				match(T_FOLLOWING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3443);
				match(L_INT);
				setState(3444);
				match(T_PRECEDING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_partition_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_PARTITION() { return getToken(HplsqlParser.T_PARTITION, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Expr_func_partition_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_partition_by_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_func_partition_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_partition_by_clauseContext expr_func_partition_by_clause() throws RecognitionException {
		Expr_func_partition_by_clauseContext _localctx = new Expr_func_partition_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_expr_func_partition_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3447);
			match(T_PARTITION);
			setState(3448);
			match(T_BY);
			setState(3449);
			expr(0);
			setState(3454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(3450);
				match(T_COMMA);
				setState(3451);
				expr(0);
				}
				}
				setState(3456);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_spec_funcContext extends ParserRuleContext {
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(HplsqlParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_CAST() { return getToken(HplsqlParser.T_CAST, 0); }
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(HplsqlParser.T_COUNT, 0); }
		public TerminalNode T_MUL() { return getToken(HplsqlParser.T_MUL, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(HplsqlParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT() { return getToken(HplsqlParser.T_CURRENT, 0); }
		public TerminalNode T_DATE() { return getToken(HplsqlParser.T_DATE, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(HplsqlParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(HplsqlParser.T_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(HplsqlParser.T_CURRENT_USER, 0); }
		public TerminalNode T_USER() { return getToken(HplsqlParser.T_USER, 0); }
		public TerminalNode T_MAX_PART_STRING() { return getToken(HplsqlParser.T_MAX_PART_STRING, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public List<TerminalNode> T_EQUAL() { return getTokens(HplsqlParser.T_EQUAL); }
		public TerminalNode T_EQUAL(int i) {
			return getToken(HplsqlParser.T_EQUAL, i);
		}
		public TerminalNode T_MIN_PART_STRING() { return getToken(HplsqlParser.T_MIN_PART_STRING, 0); }
		public TerminalNode T_MAX_PART_INT() { return getToken(HplsqlParser.T_MAX_PART_INT, 0); }
		public TerminalNode T_MIN_PART_INT() { return getToken(HplsqlParser.T_MIN_PART_INT, 0); }
		public TerminalNode T_MAX_PART_DATE() { return getToken(HplsqlParser.T_MAX_PART_DATE, 0); }
		public TerminalNode T_MIN_PART_DATE() { return getToken(HplsqlParser.T_MIN_PART_DATE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(HplsqlParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(HplsqlParser.T_PART_LOC, 0); }
		public TerminalNode T_TRIM() { return getToken(HplsqlParser.T_TRIM, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(HplsqlParser.T_SUBSTRING, 0); }
		public TerminalNode T_FROM() { return getToken(HplsqlParser.T_FROM, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode T_SYSDATE() { return getToken(HplsqlParser.T_SYSDATE, 0); }
		public Expr_spec_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_spec_func; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_spec_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_spec_funcContext expr_spec_func() throws RecognitionException {
		Expr_spec_funcContext _localctx = new Expr_spec_funcContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_expr_spec_func);
		int _la;
		try {
			int _alt;
			setState(3657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,463,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3457);
				match(T_ACTIVITY_COUNT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3458);
				match(T_CAST);
				setState(3459);
				match(T_OPEN_P);
				setState(3460);
				expr(0);
				setState(3461);
				match(T_AS);
				setState(3462);
				dtype();
				setState(3464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(3463);
					dtype_len();
					}
				}

				setState(3466);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3468);
				match(T_COUNT);
				setState(3469);
				match(T_OPEN_P);
				setState(3472);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BULK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LIKE:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NULL:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_TYPE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_COLLECT_LIST:
				case T_COLLECT_SET:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_MAX_BY:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
				case L_DIGIT_NAME:
					{
					setState(3470);
					expr(0);
					}
					break;
				case T_MUL:
					{
					setState(3471);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3474);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3475);
				match(T_CURRENT_DATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3476);
				match(T_CURRENT);
				setState(3477);
				match(T_DATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3481);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CURRENT_TIMESTAMP:
					{
					setState(3478);
					match(T_CURRENT_TIMESTAMP);
					}
					break;
				case T_CURRENT:
					{
					setState(3479);
					match(T_CURRENT);
					setState(3480);
					match(T_TIMESTAMP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3487);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,446,_ctx) ) {
				case 1:
					{
					setState(3483);
					match(T_OPEN_P);
					setState(3484);
					expr(0);
					setState(3485);
					match(T_CLOSE_P);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(3489);
				match(T_CURRENT_USER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(3490);
				match(T_CURRENT);
				setState(3491);
				match(T_USER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(3492);
				match(T_MAX_PART_STRING);
				setState(3493);
				match(T_OPEN_P);
				setState(3494);
				expr(0);
				setState(3507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3495);
					match(T_COMMA);
					setState(3496);
					expr(0);
					setState(3504);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3497);
						match(T_COMMA);
						setState(3498);
						expr(0);
						setState(3499);
						match(T_EQUAL);
						setState(3500);
						expr(0);
						}
						}
						setState(3506);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3509);
				match(T_CLOSE_P);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(3511);
				match(T_MIN_PART_STRING);
				setState(3512);
				match(T_OPEN_P);
				setState(3513);
				expr(0);
				setState(3526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3514);
					match(T_COMMA);
					setState(3515);
					expr(0);
					setState(3523);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3516);
						match(T_COMMA);
						setState(3517);
						expr(0);
						setState(3518);
						match(T_EQUAL);
						setState(3519);
						expr(0);
						}
						}
						setState(3525);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3528);
				match(T_CLOSE_P);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(3530);
				match(T_MAX_PART_INT);
				setState(3531);
				match(T_OPEN_P);
				setState(3532);
				expr(0);
				setState(3545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3533);
					match(T_COMMA);
					setState(3534);
					expr(0);
					setState(3542);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3535);
						match(T_COMMA);
						setState(3536);
						expr(0);
						setState(3537);
						match(T_EQUAL);
						setState(3538);
						expr(0);
						}
						}
						setState(3544);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3547);
				match(T_CLOSE_P);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(3549);
				match(T_MIN_PART_INT);
				setState(3550);
				match(T_OPEN_P);
				setState(3551);
				expr(0);
				setState(3564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3552);
					match(T_COMMA);
					setState(3553);
					expr(0);
					setState(3561);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3554);
						match(T_COMMA);
						setState(3555);
						expr(0);
						setState(3556);
						match(T_EQUAL);
						setState(3557);
						expr(0);
						}
						}
						setState(3563);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3566);
				match(T_CLOSE_P);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(3568);
				match(T_MAX_PART_DATE);
				setState(3569);
				match(T_OPEN_P);
				setState(3570);
				expr(0);
				setState(3583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3571);
					match(T_COMMA);
					setState(3572);
					expr(0);
					setState(3580);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3573);
						match(T_COMMA);
						setState(3574);
						expr(0);
						setState(3575);
						match(T_EQUAL);
						setState(3576);
						expr(0);
						}
						}
						setState(3582);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3585);
				match(T_CLOSE_P);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(3587);
				match(T_MIN_PART_DATE);
				setState(3588);
				match(T_OPEN_P);
				setState(3589);
				expr(0);
				setState(3602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3590);
					match(T_COMMA);
					setState(3591);
					expr(0);
					setState(3599);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(3592);
						match(T_COMMA);
						setState(3593);
						expr(0);
						setState(3594);
						match(T_EQUAL);
						setState(3595);
						expr(0);
						}
						}
						setState(3601);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(3604);
				match(T_CLOSE_P);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(3606);
				match(T_PART_COUNT);
				setState(3607);
				match(T_OPEN_P);
				setState(3608);
				expr(0);
				setState(3616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(3609);
					match(T_COMMA);
					setState(3610);
					expr(0);
					setState(3611);
					match(T_EQUAL);
					setState(3612);
					expr(0);
					}
					}
					setState(3618);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(3619);
				match(T_CLOSE_P);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(3621);
				match(T_PART_LOC);
				setState(3622);
				match(T_OPEN_P);
				setState(3623);
				expr(0);
				setState(3629);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3624);
						match(T_COMMA);
						setState(3625);
						expr(0);
						setState(3626);
						match(T_EQUAL);
						setState(3627);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3631);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,460,_ctx);
				} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
				setState(3635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(3633);
					match(T_COMMA);
					setState(3634);
					expr(0);
					}
				}

				setState(3637);
				match(T_CLOSE_P);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(3639);
				match(T_TRIM);
				setState(3640);
				match(T_OPEN_P);
				setState(3641);
				expr(0);
				setState(3642);
				match(T_CLOSE_P);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(3644);
				match(T_SUBSTRING);
				setState(3645);
				match(T_OPEN_P);
				setState(3646);
				expr(0);
				setState(3647);
				match(T_FROM);
				setState(3648);
				expr(0);
				setState(3651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_FOR) {
					{
					setState(3649);
					match(T_FOR);
					setState(3650);
					expr(0);
					}
				}

				setState(3653);
				match(T_CLOSE_P);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(3655);
				match(T_SYSDATE);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(3656);
				match(T_USER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_funcContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(HplsqlParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(HplsqlParser.T_CLOSE_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public Expr_func_childContext expr_func_child() {
			return getRuleContext(Expr_func_childContext.class,0);
		}
		public Expr_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_funcContext expr_func() throws RecognitionException {
		Expr_funcContext _localctx = new Expr_funcContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_expr_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3659);
			ident();
			setState(3660);
			match(T_OPEN_P);
			setState(3662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,464,_ctx) ) {
			case 1:
				{
				setState(3661);
				expr_func_params();
				}
				break;
			}
			setState(3664);
			match(T_CLOSE_P);
			setState(3666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,465,_ctx) ) {
			case 1:
				{
				setState(3665);
				expr_func_child();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_childContext extends ParserRuleContext {
		public TerminalNode T_OPEN_SB() { return getToken(HplsqlParser.T_OPEN_SB, 0); }
		public TerminalNode T_CLOSE_SB() { return getToken(HplsqlParser.T_CLOSE_SB, 0); }
		public TerminalNode L_INT() { return getToken(HplsqlParser.L_INT, 0); }
		public TerminalNode L_S_STRING() { return getToken(HplsqlParser.L_S_STRING, 0); }
		public TerminalNode L_D_STRING() { return getToken(HplsqlParser.L_D_STRING, 0); }
		public QidentContext qident() {
			return getRuleContext(QidentContext.class,0);
		}
		public Expr_func_childContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_child; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_func_child(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_childContext expr_func_child() throws RecognitionException {
		Expr_func_childContext _localctx = new Expr_func_childContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_expr_func_child);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3668);
			match(T_OPEN_SB);
			setState(3673);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_INT:
				{
				setState(3669);
				match(L_INT);
				}
				break;
			case L_S_STRING:
				{
				setState(3670);
				match(L_S_STRING);
				}
				break;
			case L_D_STRING:
				{
				setState(3671);
				match(L_D_STRING);
				}
				break;
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BULK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LIKE:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_TYPE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_SUB:
			case L_ID:
				{
				setState(3672);
				qident();
				}
				break;
			case T_CLOSE_SB:
				break;
			default:
				break;
			}
			setState(3675);
			match(T_CLOSE_SB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_dotContext extends ParserRuleContext {
		public Expr_dot_method_callContext expr_dot_method_call() {
			return getRuleContext(Expr_dot_method_callContext.class,0);
		}
		public Expr_dot_property_accessContext expr_dot_property_access() {
			return getRuleContext(Expr_dot_property_accessContext.class,0);
		}
		public Expr_dotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_dot; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_dot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_dotContext expr_dot() throws RecognitionException {
		Expr_dotContext _localctx = new Expr_dotContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_expr_dot);
		try {
			setState(3679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,467,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3677);
				expr_dot_method_call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3678);
				expr_dot_property_access();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_dot_method_callContext extends ParserRuleContext {
		public TerminalNode T_DOT() { return getToken(HplsqlParser.T_DOT, 0); }
		public List<Expr_funcContext> expr_func() {
			return getRuleContexts(Expr_funcContext.class);
		}
		public Expr_funcContext expr_func(int i) {
			return getRuleContext(Expr_funcContext.class,i);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Expr_dot_method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_dot_method_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_dot_method_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_dot_method_callContext expr_dot_method_call() throws RecognitionException {
		Expr_dot_method_callContext _localctx = new Expr_dot_method_callContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_expr_dot_method_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,468,_ctx) ) {
			case 1:
				{
				setState(3681);
				ident();
				}
				break;
			case 2:
				{
				setState(3682);
				expr_func();
				}
				break;
			}
			setState(3685);
			match(T_DOT);
			setState(3686);
			expr_func();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_dot_property_accessContext extends ParserRuleContext {
		public TerminalNode T_DOT() { return getToken(HplsqlParser.T_DOT, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_dot_property_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_dot_property_access; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_dot_property_access(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_dot_property_accessContext expr_dot_property_access() throws RecognitionException {
		Expr_dot_property_accessContext _localctx = new Expr_dot_property_accessContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_expr_dot_property_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(3688);
			expr_func();
			}
			setState(3689);
			match(T_DOT);
			setState(3690);
			column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_paramsContext extends ParserRuleContext {
		public List<Func_paramContext> func_param() {
			return getRuleContexts(Func_paramContext.class);
		}
		public Func_paramContext func_param(int i) {
			return getRuleContext(Func_paramContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(HplsqlParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(HplsqlParser.T_COMMA, i);
		}
		public Expr_func_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_func_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_paramsContext expr_func_params() throws RecognitionException {
		Expr_func_paramsContext _localctx = new Expr_func_paramsContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_expr_func_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3692);
			func_param();
			setState(3697);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,469,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3693);
					match(T_COMMA);
					setState(3694);
					func_param();
					}
					}
				}
				setState(3699);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,469,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_paramContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(HplsqlParser.T_GREATER, 0); }
		public Func_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFunc_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_paramContext func_param() throws RecognitionException {
		Func_paramContext _localctx = new Func_paramContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_func_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3700);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\")");
			setState(3706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,471,_ctx) ) {
			case 1:
				{
				setState(3701);
				ident();
				setState(3702);
				match(T_EQUAL);
				setState(3704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_GREATER) {
					{
					setState(3703);
					match(T_GREATER);
					}
				}

				}
				break;
			}
			setState(3708);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_selectContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_select; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_select(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_selectContext expr_select() throws RecognitionException {
		Expr_selectContext _localctx = new Expr_selectContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_expr_select);
		try {
			setState(3712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,472,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3710);
				select_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3711);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_fileContext extends ParserRuleContext {
		public File_nameContext file_name() {
			return getRuleContext(File_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_file; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitExpr_file(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_fileContext expr_file() throws RecognitionException {
		Expr_fileContext _localctx = new Expr_fileContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_expr_file);
		try {
			setState(3716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,473,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3714);
				file_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3715);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HiveContext extends ParserRuleContext {
		public TerminalNode T_HIVE() { return getToken(HplsqlParser.T_HIVE, 0); }
		public List<Hive_itemContext> hive_item() {
			return getRuleContexts(Hive_itemContext.class);
		}
		public Hive_itemContext hive_item(int i) {
			return getRuleContext(Hive_itemContext.class,i);
		}
		public HiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitHive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HiveContext hive() throws RecognitionException {
		HiveContext _localctx = new HiveContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_hive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3718);
			match(T_HIVE);
			setState(3722);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,474,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3719);
					hive_item();
					}
					}
				}
				setState(3724);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,474,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hive_itemContext extends ParserRuleContext {
		public TerminalNode T_SUB() { return getToken(HplsqlParser.T_SUB, 0); }
		public QidentContext qident() {
			return getRuleContext(QidentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public TerminalNode T_EQUAL() { return getToken(HplsqlParser.T_EQUAL, 0); }
		public Hive_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hive_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitHive_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hive_itemContext hive_item() throws RecognitionException {
		Hive_itemContext _localctx = new Hive_itemContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_hive_item);
		try {
			setState(3737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,475,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3725);
				match(T_SUB);
				setState(3726);
				qident();
				setState(3727);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3729);
				match(T_SUB);
				setState(3730);
				qident();
				setState(3731);
				match(L_ID);
				setState(3732);
				match(T_EQUAL);
				setState(3733);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3735);
				match(T_SUB);
				setState(3736);
				qident();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HostContext extends ParserRuleContext {
		public Host_cmdContext host_cmd() {
			return getRuleContext(Host_cmdContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(HplsqlParser.T_SEMICOLON, 0); }
		public Host_stmtContext host_stmt() {
			return getRuleContext(Host_stmtContext.class,0);
		}
		public HostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitHost(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostContext host() throws RecognitionException {
		HostContext _localctx = new HostContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_host);
		try {
			setState(3744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(3739);
				match(T__2);
				setState(3740);
				host_cmd();
				setState(3741);
				match(T_SEMICOLON);
				}
				break;
			case T_HOST:
				enterOuterAlt(_localctx, 2);
				{
				setState(3743);
				host_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Host_cmdContext extends ParserRuleContext {
		public Host_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host_cmd; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitHost_cmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Host_cmdContext host_cmd() throws RecognitionException {
		Host_cmdContext _localctx = new Host_cmdContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_host_cmd);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3749);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,477,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(3746);
					matchWildcard();
					}
					}
				}
				setState(3751);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,477,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Host_stmtContext extends ParserRuleContext {
		public TerminalNode T_HOST() { return getToken(HplsqlParser.T_HOST, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Host_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitHost_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Host_stmtContext host_stmt() throws RecognitionException {
		Host_stmtContext _localctx = new Host_stmtContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_host_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3752);
			match(T_HOST);
			setState(3753);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class File_nameContext extends ParserRuleContext {
		public TerminalNode L_FILE() { return getToken(HplsqlParser.L_FILE, 0); }
		public List<QidentContext> qident() {
			return getRuleContexts(QidentContext.class);
		}
		public QidentContext qident(int i) {
			return getRuleContext(QidentContext.class,i);
		}
		public List<TerminalNode> T_DIV() { return getTokens(HplsqlParser.T_DIV); }
		public TerminalNode T_DIV(int i) {
			return getToken(HplsqlParser.T_DIV, i);
		}
		public TerminalNode T_DOT() { return getToken(HplsqlParser.T_DOT, 0); }
		public File_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitFile_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_nameContext file_name() throws RecognitionException {
		File_nameContext _localctx = new File_nameContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_file_name);
		try {
			int _alt;
			setState(3769);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_FILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3755);
				match(L_FILE);
				}
				break;
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BULK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LIKE:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_TYPE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_DIV:
			case T_DOT:
			case T_SUB:
			case L_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(3759);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_DIV:
					{
					setState(3756);
					match(T_DIV);
					}
					break;
				case T_DOT:
					{
					setState(3757);
					match(T_DOT);
					setState(3758);
					match(T_DIV);
					}
					break;
				case T_ACTION:
				case T_ADD2:
				case T_ALL:
				case T_ALLOCATE:
				case T_ALTER:
				case T_AND:
				case T_ANSI_NULLS:
				case T_ANSI_PADDING:
				case T_AS:
				case T_ASC:
				case T_ASSOCIATE:
				case T_AT:
				case T_AUTO_INCREMENT:
				case T_AVG:
				case T_BATCHSIZE:
				case T_BEGIN:
				case T_BETWEEN:
				case T_BIGINT:
				case T_BINARY_DOUBLE:
				case T_BINARY_FLOAT:
				case T_BIT:
				case T_BODY:
				case T_BREAK:
				case T_BULK:
				case T_BY:
				case T_BYTE:
				case T_CALL:
				case T_CALLER:
				case T_CASCADE:
				case T_CASE:
				case T_CASESPECIFIC:
				case T_CAST:
				case T_CHAR:
				case T_CHARACTER:
				case T_CHARSET:
				case T_CLIENT:
				case T_CLOSE:
				case T_CLUSTERED:
				case T_CMP:
				case T_COLLECT:
				case T_COLLECTION:
				case T_COLUMN:
				case T_COMMENT:
				case T_CONSTANT:
				case T_COMMIT:
				case T_COMPRESS:
				case T_CONCAT:
				case T_CONDITION:
				case T_CONSTRAINT:
				case T_CONTINUE:
				case T_COPY:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CREATE:
				case T_CREATION:
				case T_CREATOR:
				case T_CS:
				case T_CURRENT:
				case T_CURRENT_SCHEMA:
				case T_CURSOR:
				case T_DATABASE:
				case T_DATA:
				case T_DATE:
				case T_DATETIME:
				case T_DAY:
				case T_DAYS:
				case T_DEC:
				case T_DECIMAL:
				case T_DECLARE:
				case T_DEFAULT:
				case T_DEFERRED:
				case T_DEFINED:
				case T_DEFINER:
				case T_DEFINITION:
				case T_DELETE:
				case T_DELIMITED:
				case T_DELIMITER:
				case T_DESC:
				case T_DESCRIBE:
				case T_DIAGNOSTICS:
				case T_DIR:
				case T_DIRECTORY:
				case T_DISTINCT:
				case T_DISTRIBUTE:
				case T_DO:
				case T_DOUBLE:
				case T_DROP:
				case T_DYNAMIC:
				case T_ENABLE:
				case T_ENGINE:
				case T_ESCAPED:
				case T_EXCEPT:
				case T_EXCEPTION:
				case T_EXCLUSIVE:
				case T_EXISTS:
				case T_EXIT:
				case T_FALLBACK:
				case T_FALSE:
				case T_FETCH:
				case T_FIELDS:
				case T_FILE:
				case T_FILES:
				case T_FLOAT:
				case T_FOR:
				case T_FOREIGN:
				case T_FORMAT:
				case T_FOUND:
				case T_FULL:
				case T_FUNCTION:
				case T_GET:
				case T_GLOBAL:
				case T_GO:
				case T_GRANT:
				case T_HANDLER:
				case T_HASH:
				case T_HAVING:
				case T_HDFS:
				case T_HIVE:
				case T_HOST:
				case T_IDENTITY:
				case T_IF:
				case T_IGNORE:
				case T_IMMEDIATE:
				case T_IN:
				case T_INCLUDE:
				case T_INDEX:
				case T_INITRANS:
				case T_INOUT:
				case T_INSERT:
				case T_INT:
				case T_INT2:
				case T_INT4:
				case T_INT8:
				case T_INTEGER:
				case T_INTERSECT:
				case T_INTERVAL:
				case T_INVOKER:
				case T_IS:
				case T_ISOPEN:
				case T_ITEMS:
				case T_JOIN:
				case T_KEEP:
				case T_KEY:
				case T_KEYS:
				case T_LANGUAGE:
				case T_LEAVE:
				case T_LIKE:
				case T_LINES:
				case T_LOCAL:
				case T_LOCATION:
				case T_LOCATOR:
				case T_LOCATORS:
				case T_LOCKS:
				case T_LOG:
				case T_LOGGED:
				case T_LOGGING:
				case T_LOOP:
				case T_MAP:
				case T_MATCHED:
				case T_MAX:
				case T_MAXTRANS:
				case T_MERGE:
				case T_MESSAGE_TEXT:
				case T_MICROSECOND:
				case T_MICROSECONDS:
				case T_MIN:
				case T_MULTISET:
				case T_NCHAR:
				case T_NEW:
				case T_NVARCHAR:
				case T_NO:
				case T_NOCOUNT:
				case T_NOCOMPRESS:
				case T_NOLOGGING:
				case T_NONE:
				case T_NOT:
				case T_NOTFOUND:
				case T_NUMERIC:
				case T_NUMBER:
				case T_OBJECT:
				case T_OFF:
				case T_ON:
				case T_ONLY:
				case T_OPEN:
				case T_OR:
				case T_OUT:
				case T_OUTER:
				case T_OVER:
				case T_OVERWRITE:
				case T_OWNER:
				case T_PACKAGE:
				case T_PARTITION:
				case T_PCTFREE:
				case T_PCTUSED:
				case T_PRECISION:
				case T_PRESERVE:
				case T_PRIMARY:
				case T_PRINT:
				case T_PROC:
				case T_PROCEDURE:
				case T_QUALIFY:
				case T_QUERY_BAND:
				case T_QUIT:
				case T_QUOTED_IDENTIFIER:
				case T_RAISE:
				case T_REAL:
				case T_REFERENCES:
				case T_REGEXP:
				case T_REPLACE:
				case T_RESIGNAL:
				case T_RESTRICT:
				case T_RESULT:
				case T_RESULT_SET_LOCATOR:
				case T_RETURN:
				case T_RETURNS:
				case T_REVERSE:
				case T_RIGHT:
				case T_RLIKE:
				case T_ROLE:
				case T_ROLLBACK:
				case T_ROW:
				case T_ROWS:
				case T_ROW_COUNT:
				case T_RR:
				case T_RS:
				case T_PWD:
				case T_TRIM:
				case T_SCHEMA:
				case T_SECOND:
				case T_SECONDS:
				case T_SECURITY:
				case T_SEGMENT:
				case T_SEL:
				case T_SELECT:
				case T_SET:
				case T_SESSION:
				case T_SESSIONS:
				case T_SETS:
				case T_SHARE:
				case T_SIGNAL:
				case T_SIMPLE_DOUBLE:
				case T_SIMPLE_FLOAT:
				case T_SMALLDATETIME:
				case T_SMALLINT:
				case T_SQL:
				case T_SQLEXCEPTION:
				case T_SQLINSERT:
				case T_SQLSTATE:
				case T_SQLWARNING:
				case T_STATS:
				case T_STATISTICS:
				case T_STEP:
				case T_STORAGE:
				case T_STORED:
				case T_STRING:
				case T_SUBDIR:
				case T_SUBSTRING:
				case T_SUM:
				case T_SUMMARY:
				case T_SYS_REFCURSOR:
				case T_TABLE:
				case T_TABLESPACE:
				case T_TEMPORARY:
				case T_TERMINATED:
				case T_TEXTIMAGE_ON:
				case T_THEN:
				case T_TIMESTAMP:
				case T_TITLE:
				case T_TO:
				case T_TOP:
				case T_TRANSACTION:
				case T_TRUE:
				case T_TRUNCATE:
				case T_TYPE:
				case T_UNIQUE:
				case T_UPDATE:
				case T_UR:
				case T_USE:
				case T_USING:
				case T_VALUE:
				case T_VALUES:
				case T_VAR:
				case T_VARCHAR:
				case T_VARCHAR2:
				case T_VARYING:
				case T_VOLATILE:
				case T_WHILE:
				case T_WITHOUT:
				case T_WORK:
				case T_XACT_ABORT:
				case T_XML:
				case T_YES:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_SUB:
				case L_ID:
					break;
				default:
					break;
				}
				setState(3761);
				qident();
				setState(3766);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,479,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(3762);
						match(T_DIV);
						setState(3763);
						qident();
						}
						}
					}
					setState(3768);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,479,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_literalContext extends ParserRuleContext {
		public TerminalNode T_DATE() { return getToken(HplsqlParser.T_DATE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Date_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDate_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_literalContext date_literal() throws RecognitionException {
		Date_literalContext _localctx = new Date_literalContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3771);
			match(T_DATE);
			setState(3772);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Timestamp_literalContext extends ParserRuleContext {
		public TerminalNode T_TIMESTAMP() { return getToken(HplsqlParser.T_TIMESTAMP, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Timestamp_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitTimestamp_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timestamp_literalContext timestamp_literal() throws RecognitionException {
		Timestamp_literalContext _localctx = new Timestamp_literalContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3774);
			match(T_TIMESTAMP);
			setState(3775);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentContext extends ParserRuleContext {
		public TerminalNode L_ID() { return getToken(HplsqlParser.L_ID, 0); }
		public Non_reserved_wordsContext non_reserved_words() {
			return getRuleContext(Non_reserved_wordsContext.class,0);
		}
		public TerminalNode T_SUB() { return getToken(HplsqlParser.T_SUB, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 506, RULE_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_SUB) {
				{
				setState(3777);
				match(T_SUB);
				}
			}

			setState(3782);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(3780);
				match(L_ID);
				}
				break;
			case T_ACTION:
			case T_ADD2:
			case T_ALL:
			case T_ALLOCATE:
			case T_ALTER:
			case T_AND:
			case T_ANSI_NULLS:
			case T_ANSI_PADDING:
			case T_AS:
			case T_ASC:
			case T_ASSOCIATE:
			case T_AT:
			case T_AUTO_INCREMENT:
			case T_AVG:
			case T_BATCHSIZE:
			case T_BEGIN:
			case T_BETWEEN:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BIT:
			case T_BODY:
			case T_BREAK:
			case T_BULK:
			case T_BY:
			case T_BYTE:
			case T_CALL:
			case T_CALLER:
			case T_CASCADE:
			case T_CASE:
			case T_CASESPECIFIC:
			case T_CAST:
			case T_CHAR:
			case T_CHARACTER:
			case T_CHARSET:
			case T_CLIENT:
			case T_CLOSE:
			case T_CLUSTERED:
			case T_CMP:
			case T_COLLECT:
			case T_COLLECTION:
			case T_COLUMN:
			case T_COMMENT:
			case T_CONSTANT:
			case T_COMMIT:
			case T_COMPRESS:
			case T_CONCAT:
			case T_CONDITION:
			case T_CONSTRAINT:
			case T_CONTINUE:
			case T_COPY:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CREATION:
			case T_CREATOR:
			case T_CS:
			case T_CURRENT:
			case T_CURRENT_SCHEMA:
			case T_CURSOR:
			case T_DATABASE:
			case T_DATA:
			case T_DATE:
			case T_DATETIME:
			case T_DAY:
			case T_DAYS:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DEFAULT:
			case T_DEFERRED:
			case T_DEFINED:
			case T_DEFINER:
			case T_DEFINITION:
			case T_DELETE:
			case T_DELIMITED:
			case T_DELIMITER:
			case T_DESC:
			case T_DESCRIBE:
			case T_DIAGNOSTICS:
			case T_DIR:
			case T_DIRECTORY:
			case T_DISTINCT:
			case T_DISTRIBUTE:
			case T_DO:
			case T_DOUBLE:
			case T_DROP:
			case T_DYNAMIC:
			case T_ENABLE:
			case T_ENGINE:
			case T_ESCAPED:
			case T_EXCEPT:
			case T_EXCEPTION:
			case T_EXCLUSIVE:
			case T_EXISTS:
			case T_EXIT:
			case T_FALLBACK:
			case T_FALSE:
			case T_FETCH:
			case T_FIELDS:
			case T_FILE:
			case T_FILES:
			case T_FLOAT:
			case T_FOR:
			case T_FOREIGN:
			case T_FORMAT:
			case T_FOUND:
			case T_FULL:
			case T_FUNCTION:
			case T_GET:
			case T_GLOBAL:
			case T_GO:
			case T_GRANT:
			case T_HANDLER:
			case T_HASH:
			case T_HAVING:
			case T_HDFS:
			case T_HIVE:
			case T_HOST:
			case T_IDENTITY:
			case T_IF:
			case T_IGNORE:
			case T_IMMEDIATE:
			case T_IN:
			case T_INCLUDE:
			case T_INDEX:
			case T_INITRANS:
			case T_INOUT:
			case T_INSERT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERSECT:
			case T_INTERVAL:
			case T_INVOKER:
			case T_IS:
			case T_ISOPEN:
			case T_ITEMS:
			case T_JOIN:
			case T_KEEP:
			case T_KEY:
			case T_KEYS:
			case T_LANGUAGE:
			case T_LEAVE:
			case T_LIKE:
			case T_LINES:
			case T_LOCAL:
			case T_LOCATION:
			case T_LOCATOR:
			case T_LOCATORS:
			case T_LOCKS:
			case T_LOG:
			case T_LOGGED:
			case T_LOGGING:
			case T_LOOP:
			case T_MAP:
			case T_MATCHED:
			case T_MAX:
			case T_MAXTRANS:
			case T_MERGE:
			case T_MESSAGE_TEXT:
			case T_MICROSECOND:
			case T_MICROSECONDS:
			case T_MIN:
			case T_MULTISET:
			case T_NCHAR:
			case T_NEW:
			case T_NVARCHAR:
			case T_NO:
			case T_NOCOUNT:
			case T_NOCOMPRESS:
			case T_NOLOGGING:
			case T_NONE:
			case T_NOT:
			case T_NOTFOUND:
			case T_NUMERIC:
			case T_NUMBER:
			case T_OBJECT:
			case T_OFF:
			case T_ON:
			case T_ONLY:
			case T_OPEN:
			case T_OR:
			case T_OUT:
			case T_OUTER:
			case T_OVER:
			case T_OVERWRITE:
			case T_OWNER:
			case T_PACKAGE:
			case T_PARTITION:
			case T_PCTFREE:
			case T_PCTUSED:
			case T_PRECISION:
			case T_PRESERVE:
			case T_PRIMARY:
			case T_PRINT:
			case T_PROC:
			case T_PROCEDURE:
			case T_QUALIFY:
			case T_QUERY_BAND:
			case T_QUIT:
			case T_QUOTED_IDENTIFIER:
			case T_RAISE:
			case T_REAL:
			case T_REFERENCES:
			case T_REGEXP:
			case T_REPLACE:
			case T_RESIGNAL:
			case T_RESTRICT:
			case T_RESULT:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_RETURNS:
			case T_REVERSE:
			case T_RIGHT:
			case T_RLIKE:
			case T_ROLE:
			case T_ROLLBACK:
			case T_ROW:
			case T_ROWS:
			case T_ROW_COUNT:
			case T_RR:
			case T_RS:
			case T_PWD:
			case T_TRIM:
			case T_SCHEMA:
			case T_SECOND:
			case T_SECONDS:
			case T_SECURITY:
			case T_SEGMENT:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_SESSION:
			case T_SESSIONS:
			case T_SETS:
			case T_SHARE:
			case T_SIGNAL:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_SQL:
			case T_SQLEXCEPTION:
			case T_SQLINSERT:
			case T_SQLSTATE:
			case T_SQLWARNING:
			case T_STATS:
			case T_STATISTICS:
			case T_STEP:
			case T_STORAGE:
			case T_STORED:
			case T_STRING:
			case T_SUBDIR:
			case T_SUBSTRING:
			case T_SUM:
			case T_SUMMARY:
			case T_SYS_REFCURSOR:
			case T_TABLE:
			case T_TABLESPACE:
			case T_TEMPORARY:
			case T_TERMINATED:
			case T_TEXTIMAGE_ON:
			case T_THEN:
			case T_TIMESTAMP:
			case T_TITLE:
			case T_TO:
			case T_TOP:
			case T_TRANSACTION:
			case T_TRUE:
			case T_TRUNCATE:
			case T_TYPE:
			case T_UNIQUE:
			case T_UPDATE:
			case T_UR:
			case T_USE:
			case T_USING:
			case T_VALUE:
			case T_VALUES:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VARYING:
			case T_VOLATILE:
			case T_WHILE:
			case T_WITHOUT:
			case T_WORK:
			case T_XACT_ABORT:
			case T_XML:
			case T_YES:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
				{
				setState(3781);
				non_reserved_words();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QidentContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_DOT() { return getTokens(HplsqlParser.T_DOT); }
		public TerminalNode T_DOT(int i) {
			return getToken(HplsqlParser.T_DOT, i);
		}
		public QidentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qident; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitQident(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QidentContext qident() throws RecognitionException {
		QidentContext _localctx = new QidentContext(_ctx, getState());
		enterRule(_localctx, 508, RULE_qident);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3784);
			ident();
			setState(3789);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,483,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3785);
					match(T_DOT);
					setState(3786);
					ident();
					}
					} 
				}
				setState(3791);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,483,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Double_quotedStringContext extends StringContext {
		public TerminalNode L_D_STRING() { return getToken(HplsqlParser.L_D_STRING, 0); }
		public Double_quotedStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDouble_quotedString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Single_quotedStringContext extends StringContext {
		public TerminalNode L_S_STRING() { return getToken(HplsqlParser.L_S_STRING, 0); }
		public Single_quotedStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitSingle_quotedString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 510, RULE_string);
		try {
			setState(3794);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING:
				_localctx = new Single_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3792);
				match(L_S_STRING);
				}
				break;
			case L_D_STRING:
				_localctx = new Double_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3793);
				match(L_D_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_numberContext extends ParserRuleContext {
		public TerminalNode L_INT() { return getToken(HplsqlParser.L_INT, 0); }
		public TerminalNode T_SUB() { return getToken(HplsqlParser.T_SUB, 0); }
		public TerminalNode T_ADD() { return getToken(HplsqlParser.T_ADD, 0); }
		public Int_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitInt_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_numberContext int_number() throws RecognitionException {
		Int_numberContext _localctx = new Int_numberContext(_ctx, getState());
		enterRule(_localctx, 512, RULE_int_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(3796);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(3799);
			match(L_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dec_numberContext extends ParserRuleContext {
		public TerminalNode L_DEC() { return getToken(HplsqlParser.L_DEC, 0); }
		public TerminalNode T_SUB() { return getToken(HplsqlParser.T_SUB, 0); }
		public TerminalNode T_ADD() { return getToken(HplsqlParser.T_ADD, 0); }
		public Dec_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitDec_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_numberContext dec_number() throws RecognitionException {
		Dec_numberContext _localctx = new Dec_numberContext(_ctx, getState());
		enterRule(_localctx, 514, RULE_dec_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(3801);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(3804);
			match(L_DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode T_TRUE() { return getToken(HplsqlParser.T_TRUE, 0); }
		public TerminalNode T_FALSE() { return getToken(HplsqlParser.T_FALSE, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitBool_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 516, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3806);
			_la = _input.LA(1);
			if ( !(_la==T_FALSE || _la==T_TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_constContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(HplsqlParser.T_NULL, 0); }
		public Null_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_const; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitNull_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_constContext null_const() throws RecognitionException {
		Null_constContext _localctx = new Null_constContext(_ctx, getState());
		enterRule(_localctx, 518, RULE_null_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3808);
			match(T_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_reserved_wordsContext extends ParserRuleContext {
		public TerminalNode T_ACTION() { return getToken(HplsqlParser.T_ACTION, 0); }
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(HplsqlParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_ADD2() { return getToken(HplsqlParser.T_ADD2, 0); }
		public TerminalNode T_ALL() { return getToken(HplsqlParser.T_ALL, 0); }
		public TerminalNode T_ALLOCATE() { return getToken(HplsqlParser.T_ALLOCATE, 0); }
		public TerminalNode T_ALTER() { return getToken(HplsqlParser.T_ALTER, 0); }
		public TerminalNode T_AND() { return getToken(HplsqlParser.T_AND, 0); }
		public TerminalNode T_ANSI_NULLS() { return getToken(HplsqlParser.T_ANSI_NULLS, 0); }
		public TerminalNode T_ANSI_PADDING() { return getToken(HplsqlParser.T_ANSI_PADDING, 0); }
		public TerminalNode T_AS() { return getToken(HplsqlParser.T_AS, 0); }
		public TerminalNode T_ASC() { return getToken(HplsqlParser.T_ASC, 0); }
		public TerminalNode T_ASSOCIATE() { return getToken(HplsqlParser.T_ASSOCIATE, 0); }
		public TerminalNode T_AT() { return getToken(HplsqlParser.T_AT, 0); }
		public TerminalNode T_AUTO_INCREMENT() { return getToken(HplsqlParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_AVG() { return getToken(HplsqlParser.T_AVG, 0); }
		public TerminalNode T_BATCHSIZE() { return getToken(HplsqlParser.T_BATCHSIZE, 0); }
		public TerminalNode T_BEGIN() { return getToken(HplsqlParser.T_BEGIN, 0); }
		public TerminalNode T_BETWEEN() { return getToken(HplsqlParser.T_BETWEEN, 0); }
		public TerminalNode T_BIGINT() { return getToken(HplsqlParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(HplsqlParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(HplsqlParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BIT() { return getToken(HplsqlParser.T_BIT, 0); }
		public TerminalNode T_BODY() { return getToken(HplsqlParser.T_BODY, 0); }
		public TerminalNode T_BREAK() { return getToken(HplsqlParser.T_BREAK, 0); }
		public TerminalNode T_BULK() { return getToken(HplsqlParser.T_BULK, 0); }
		public TerminalNode T_BY() { return getToken(HplsqlParser.T_BY, 0); }
		public TerminalNode T_BYTE() { return getToken(HplsqlParser.T_BYTE, 0); }
		public TerminalNode T_CALL() { return getToken(HplsqlParser.T_CALL, 0); }
		public TerminalNode T_CALLER() { return getToken(HplsqlParser.T_CALLER, 0); }
		public TerminalNode T_CASCADE() { return getToken(HplsqlParser.T_CASCADE, 0); }
		public TerminalNode T_CASE() { return getToken(HplsqlParser.T_CASE, 0); }
		public TerminalNode T_CASESPECIFIC() { return getToken(HplsqlParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CAST() { return getToken(HplsqlParser.T_CAST, 0); }
		public TerminalNode T_CHAR() { return getToken(HplsqlParser.T_CHAR, 0); }
		public TerminalNode T_CHARACTER() { return getToken(HplsqlParser.T_CHARACTER, 0); }
		public TerminalNode T_CHARSET() { return getToken(HplsqlParser.T_CHARSET, 0); }
		public TerminalNode T_CLIENT() { return getToken(HplsqlParser.T_CLIENT, 0); }
		public TerminalNode T_CLOSE() { return getToken(HplsqlParser.T_CLOSE, 0); }
		public TerminalNode T_CLUSTERED() { return getToken(HplsqlParser.T_CLUSTERED, 0); }
		public TerminalNode T_CMP() { return getToken(HplsqlParser.T_CMP, 0); }
		public TerminalNode T_COLLECT() { return getToken(HplsqlParser.T_COLLECT, 0); }
		public TerminalNode T_COLLECTION() { return getToken(HplsqlParser.T_COLLECTION, 0); }
		public TerminalNode T_COLUMN() { return getToken(HplsqlParser.T_COLUMN, 0); }
		public TerminalNode T_COMMENT() { return getToken(HplsqlParser.T_COMMENT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(HplsqlParser.T_COMPRESS, 0); }
		public TerminalNode T_CONSTANT() { return getToken(HplsqlParser.T_CONSTANT, 0); }
		public TerminalNode T_COPY() { return getToken(HplsqlParser.T_COPY, 0); }
		public TerminalNode T_COMMIT() { return getToken(HplsqlParser.T_COMMIT, 0); }
		public TerminalNode T_CONCAT() { return getToken(HplsqlParser.T_CONCAT, 0); }
		public TerminalNode T_CONDITION() { return getToken(HplsqlParser.T_CONDITION, 0); }
		public TerminalNode T_CONSTRAINT() { return getToken(HplsqlParser.T_CONSTRAINT, 0); }
		public TerminalNode T_CONTINUE() { return getToken(HplsqlParser.T_CONTINUE, 0); }
		public TerminalNode T_COUNT() { return getToken(HplsqlParser.T_COUNT, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(HplsqlParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CREATE() { return getToken(HplsqlParser.T_CREATE, 0); }
		public TerminalNode T_CREATION() { return getToken(HplsqlParser.T_CREATION, 0); }
		public TerminalNode T_CREATOR() { return getToken(HplsqlParser.T_CREATOR, 0); }
		public TerminalNode T_CS() { return getToken(HplsqlParser.T_CS, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(HplsqlParser.T_CUME_DIST, 0); }
		public TerminalNode T_CURRENT() { return getToken(HplsqlParser.T_CURRENT, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(HplsqlParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT_SCHEMA() { return getToken(HplsqlParser.T_CURRENT_SCHEMA, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(HplsqlParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(HplsqlParser.T_CURRENT_USER, 0); }
		public TerminalNode T_CURSOR() { return getToken(HplsqlParser.T_CURSOR, 0); }
		public TerminalNode T_DATA() { return getToken(HplsqlParser.T_DATA, 0); }
		public TerminalNode T_DATABASE() { return getToken(HplsqlParser.T_DATABASE, 0); }
		public TerminalNode T_DATE() { return getToken(HplsqlParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(HplsqlParser.T_DATETIME, 0); }
		public TerminalNode T_DAY() { return getToken(HplsqlParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(HplsqlParser.T_DAYS, 0); }
		public TerminalNode T_DEC() { return getToken(HplsqlParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(HplsqlParser.T_DECIMAL, 0); }
		public TerminalNode T_DECLARE() { return getToken(HplsqlParser.T_DECLARE, 0); }
		public TerminalNode T_DEFAULT() { return getToken(HplsqlParser.T_DEFAULT, 0); }
		public TerminalNode T_DEFERRED() { return getToken(HplsqlParser.T_DEFERRED, 0); }
		public TerminalNode T_DEFINED() { return getToken(HplsqlParser.T_DEFINED, 0); }
		public TerminalNode T_DEFINER() { return getToken(HplsqlParser.T_DEFINER, 0); }
		public TerminalNode T_DEFINITION() { return getToken(HplsqlParser.T_DEFINITION, 0); }
		public TerminalNode T_DELETE() { return getToken(HplsqlParser.T_DELETE, 0); }
		public TerminalNode T_DELIMITED() { return getToken(HplsqlParser.T_DELIMITED, 0); }
		public TerminalNode T_DELIMITER() { return getToken(HplsqlParser.T_DELIMITER, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(HplsqlParser.T_DENSE_RANK, 0); }
		public TerminalNode T_DESC() { return getToken(HplsqlParser.T_DESC, 0); }
		public TerminalNode T_DESCRIBE() { return getToken(HplsqlParser.T_DESCRIBE, 0); }
		public TerminalNode T_DIAGNOSTICS() { return getToken(HplsqlParser.T_DIAGNOSTICS, 0); }
		public TerminalNode T_DIR() { return getToken(HplsqlParser.T_DIR, 0); }
		public TerminalNode T_DIRECTORY() { return getToken(HplsqlParser.T_DIRECTORY, 0); }
		public TerminalNode T_DISTINCT() { return getToken(HplsqlParser.T_DISTINCT, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(HplsqlParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_DO() { return getToken(HplsqlParser.T_DO, 0); }
		public TerminalNode T_DOUBLE() { return getToken(HplsqlParser.T_DOUBLE, 0); }
		public TerminalNode T_DROP() { return getToken(HplsqlParser.T_DROP, 0); }
		public TerminalNode T_DYNAMIC() { return getToken(HplsqlParser.T_DYNAMIC, 0); }
		public TerminalNode T_ENABLE() { return getToken(HplsqlParser.T_ENABLE, 0); }
		public TerminalNode T_ENGINE() { return getToken(HplsqlParser.T_ENGINE, 0); }
		public TerminalNode T_ESCAPED() { return getToken(HplsqlParser.T_ESCAPED, 0); }
		public TerminalNode T_EXCEPT() { return getToken(HplsqlParser.T_EXCEPT, 0); }
		public TerminalNode T_EXCEPTION() { return getToken(HplsqlParser.T_EXCEPTION, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(HplsqlParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_EXISTS() { return getToken(HplsqlParser.T_EXISTS, 0); }
		public TerminalNode T_EXIT() { return getToken(HplsqlParser.T_EXIT, 0); }
		public TerminalNode T_FALLBACK() { return getToken(HplsqlParser.T_FALLBACK, 0); }
		public TerminalNode T_FALSE() { return getToken(HplsqlParser.T_FALSE, 0); }
		public TerminalNode T_FETCH() { return getToken(HplsqlParser.T_FETCH, 0); }
		public TerminalNode T_FIELDS() { return getToken(HplsqlParser.T_FIELDS, 0); }
		public TerminalNode T_FILE() { return getToken(HplsqlParser.T_FILE, 0); }
		public TerminalNode T_FILES() { return getToken(HplsqlParser.T_FILES, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(HplsqlParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_FLOAT() { return getToken(HplsqlParser.T_FLOAT, 0); }
		public TerminalNode T_FOR() { return getToken(HplsqlParser.T_FOR, 0); }
		public TerminalNode T_FOREIGN() { return getToken(HplsqlParser.T_FOREIGN, 0); }
		public TerminalNode T_FORMAT() { return getToken(HplsqlParser.T_FORMAT, 0); }
		public TerminalNode T_FOUND() { return getToken(HplsqlParser.T_FOUND, 0); }
		public TerminalNode T_FULL() { return getToken(HplsqlParser.T_FULL, 0); }
		public TerminalNode T_FUNCTION() { return getToken(HplsqlParser.T_FUNCTION, 0); }
		public TerminalNode T_GET() { return getToken(HplsqlParser.T_GET, 0); }
		public TerminalNode T_GLOBAL() { return getToken(HplsqlParser.T_GLOBAL, 0); }
		public TerminalNode T_GO() { return getToken(HplsqlParser.T_GO, 0); }
		public TerminalNode T_GRANT() { return getToken(HplsqlParser.T_GRANT, 0); }
		public TerminalNode T_HANDLER() { return getToken(HplsqlParser.T_HANDLER, 0); }
		public TerminalNode T_HASH() { return getToken(HplsqlParser.T_HASH, 0); }
		public TerminalNode T_HAVING() { return getToken(HplsqlParser.T_HAVING, 0); }
		public TerminalNode T_HDFS() { return getToken(HplsqlParser.T_HDFS, 0); }
		public TerminalNode T_HIVE() { return getToken(HplsqlParser.T_HIVE, 0); }
		public TerminalNode T_HOST() { return getToken(HplsqlParser.T_HOST, 0); }
		public TerminalNode T_IDENTITY() { return getToken(HplsqlParser.T_IDENTITY, 0); }
		public TerminalNode T_IF() { return getToken(HplsqlParser.T_IF, 0); }
		public TerminalNode T_IGNORE() { return getToken(HplsqlParser.T_IGNORE, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(HplsqlParser.T_IMMEDIATE, 0); }
		public TerminalNode T_IN() { return getToken(HplsqlParser.T_IN, 0); }
		public TerminalNode T_INCLUDE() { return getToken(HplsqlParser.T_INCLUDE, 0); }
		public TerminalNode T_INDEX() { return getToken(HplsqlParser.T_INDEX, 0); }
		public TerminalNode T_INITRANS() { return getToken(HplsqlParser.T_INITRANS, 0); }
		public TerminalNode T_INOUT() { return getToken(HplsqlParser.T_INOUT, 0); }
		public TerminalNode T_INSERT() { return getToken(HplsqlParser.T_INSERT, 0); }
		public TerminalNode T_INT() { return getToken(HplsqlParser.T_INT, 0); }
		public TerminalNode T_INT2() { return getToken(HplsqlParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(HplsqlParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(HplsqlParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(HplsqlParser.T_INTEGER, 0); }
		public TerminalNode T_INTERSECT() { return getToken(HplsqlParser.T_INTERSECT, 0); }
		public TerminalNode T_INTERVAL() { return getToken(HplsqlParser.T_INTERVAL, 0); }
		public TerminalNode T_INVOKER() { return getToken(HplsqlParser.T_INVOKER, 0); }
		public TerminalNode T_ITEMS() { return getToken(HplsqlParser.T_ITEMS, 0); }
		public TerminalNode T_IS() { return getToken(HplsqlParser.T_IS, 0); }
		public TerminalNode T_ISOPEN() { return getToken(HplsqlParser.T_ISOPEN, 0); }
		public TerminalNode T_JOIN() { return getToken(HplsqlParser.T_JOIN, 0); }
		public TerminalNode T_KEEP() { return getToken(HplsqlParser.T_KEEP, 0); }
		public TerminalNode T_KEY() { return getToken(HplsqlParser.T_KEY, 0); }
		public TerminalNode T_KEYS() { return getToken(HplsqlParser.T_KEYS, 0); }
		public TerminalNode T_LAG() { return getToken(HplsqlParser.T_LAG, 0); }
		public TerminalNode T_LANGUAGE() { return getToken(HplsqlParser.T_LANGUAGE, 0); }
		public TerminalNode T_LAST_VALUE() { return getToken(HplsqlParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(HplsqlParser.T_LEAD, 0); }
		public TerminalNode T_LEAVE() { return getToken(HplsqlParser.T_LEAVE, 0); }
		public TerminalNode T_LIKE() { return getToken(HplsqlParser.T_LIKE, 0); }
		public TerminalNode T_LINES() { return getToken(HplsqlParser.T_LINES, 0); }
		public TerminalNode T_LOCAL() { return getToken(HplsqlParser.T_LOCAL, 0); }
		public TerminalNode T_LOCATION() { return getToken(HplsqlParser.T_LOCATION, 0); }
		public TerminalNode T_LOCATOR() { return getToken(HplsqlParser.T_LOCATOR, 0); }
		public TerminalNode T_LOCATORS() { return getToken(HplsqlParser.T_LOCATORS, 0); }
		public TerminalNode T_LOCKS() { return getToken(HplsqlParser.T_LOCKS, 0); }
		public TerminalNode T_LOG() { return getToken(HplsqlParser.T_LOG, 0); }
		public TerminalNode T_LOGGED() { return getToken(HplsqlParser.T_LOGGED, 0); }
		public TerminalNode T_LOGGING() { return getToken(HplsqlParser.T_LOGGING, 0); }
		public TerminalNode T_LOOP() { return getToken(HplsqlParser.T_LOOP, 0); }
		public TerminalNode T_MAP() { return getToken(HplsqlParser.T_MAP, 0); }
		public TerminalNode T_MATCHED() { return getToken(HplsqlParser.T_MATCHED, 0); }
		public TerminalNode T_MAX() { return getToken(HplsqlParser.T_MAX, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(HplsqlParser.T_MAXTRANS, 0); }
		public TerminalNode T_MERGE() { return getToken(HplsqlParser.T_MERGE, 0); }
		public TerminalNode T_MESSAGE_TEXT() { return getToken(HplsqlParser.T_MESSAGE_TEXT, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(HplsqlParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(HplsqlParser.T_MICROSECONDS, 0); }
		public TerminalNode T_MIN() { return getToken(HplsqlParser.T_MIN, 0); }
		public TerminalNode T_MULTISET() { return getToken(HplsqlParser.T_MULTISET, 0); }
		public TerminalNode T_NCHAR() { return getToken(HplsqlParser.T_NCHAR, 0); }
		public TerminalNode T_NEW() { return getToken(HplsqlParser.T_NEW, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(HplsqlParser.T_NVARCHAR, 0); }
		public TerminalNode T_NO() { return getToken(HplsqlParser.T_NO, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(HplsqlParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_NOCOUNT() { return getToken(HplsqlParser.T_NOCOUNT, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(HplsqlParser.T_NOLOGGING, 0); }
		public TerminalNode T_NONE() { return getToken(HplsqlParser.T_NONE, 0); }
		public TerminalNode T_NOT() { return getToken(HplsqlParser.T_NOT, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(HplsqlParser.T_NOTFOUND, 0); }
		public TerminalNode T_NUMERIC() { return getToken(HplsqlParser.T_NUMERIC, 0); }
		public TerminalNode T_NUMBER() { return getToken(HplsqlParser.T_NUMBER, 0); }
		public TerminalNode T_OBJECT() { return getToken(HplsqlParser.T_OBJECT, 0); }
		public TerminalNode T_OFF() { return getToken(HplsqlParser.T_OFF, 0); }
		public TerminalNode T_ON() { return getToken(HplsqlParser.T_ON, 0); }
		public TerminalNode T_ONLY() { return getToken(HplsqlParser.T_ONLY, 0); }
		public TerminalNode T_OPEN() { return getToken(HplsqlParser.T_OPEN, 0); }
		public TerminalNode T_OR() { return getToken(HplsqlParser.T_OR, 0); }
		public TerminalNode T_OUT() { return getToken(HplsqlParser.T_OUT, 0); }
		public TerminalNode T_OUTER() { return getToken(HplsqlParser.T_OUTER, 0); }
		public TerminalNode T_OVER() { return getToken(HplsqlParser.T_OVER, 0); }
		public TerminalNode T_OVERWRITE() { return getToken(HplsqlParser.T_OVERWRITE, 0); }
		public TerminalNode T_OWNER() { return getToken(HplsqlParser.T_OWNER, 0); }
		public TerminalNode T_PACKAGE() { return getToken(HplsqlParser.T_PACKAGE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(HplsqlParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(HplsqlParser.T_PART_LOC, 0); }
		public TerminalNode T_PARTITION() { return getToken(HplsqlParser.T_PARTITION, 0); }
		public TerminalNode T_PCTFREE() { return getToken(HplsqlParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(HplsqlParser.T_PCTUSED, 0); }
		public TerminalNode T_PRECISION() { return getToken(HplsqlParser.T_PRECISION, 0); }
		public TerminalNode T_PRESERVE() { return getToken(HplsqlParser.T_PRESERVE, 0); }
		public TerminalNode T_PRIMARY() { return getToken(HplsqlParser.T_PRIMARY, 0); }
		public TerminalNode T_PRINT() { return getToken(HplsqlParser.T_PRINT, 0); }
		public TerminalNode T_PROC() { return getToken(HplsqlParser.T_PROC, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(HplsqlParser.T_PROCEDURE, 0); }
		public TerminalNode T_PWD() { return getToken(HplsqlParser.T_PWD, 0); }
		public TerminalNode T_QUALIFY() { return getToken(HplsqlParser.T_QUALIFY, 0); }
		public TerminalNode T_QUERY_BAND() { return getToken(HplsqlParser.T_QUERY_BAND, 0); }
		public TerminalNode T_QUIT() { return getToken(HplsqlParser.T_QUIT, 0); }
		public TerminalNode T_QUOTED_IDENTIFIER() { return getToken(HplsqlParser.T_QUOTED_IDENTIFIER, 0); }
		public TerminalNode T_RAISE() { return getToken(HplsqlParser.T_RAISE, 0); }
		public TerminalNode T_RANK() { return getToken(HplsqlParser.T_RANK, 0); }
		public TerminalNode T_REAL() { return getToken(HplsqlParser.T_REAL, 0); }
		public TerminalNode T_REFERENCES() { return getToken(HplsqlParser.T_REFERENCES, 0); }
		public TerminalNode T_REGEXP() { return getToken(HplsqlParser.T_REGEXP, 0); }
		public TerminalNode T_RR() { return getToken(HplsqlParser.T_RR, 0); }
		public TerminalNode T_REPLACE() { return getToken(HplsqlParser.T_REPLACE, 0); }
		public TerminalNode T_RESIGNAL() { return getToken(HplsqlParser.T_RESIGNAL, 0); }
		public TerminalNode T_RESTRICT() { return getToken(HplsqlParser.T_RESTRICT, 0); }
		public TerminalNode T_RESULT() { return getToken(HplsqlParser.T_RESULT, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(HplsqlParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_RETURN() { return getToken(HplsqlParser.T_RETURN, 0); }
		public TerminalNode T_RETURNS() { return getToken(HplsqlParser.T_RETURNS, 0); }
		public TerminalNode T_REVERSE() { return getToken(HplsqlParser.T_REVERSE, 0); }
		public TerminalNode T_RIGHT() { return getToken(HplsqlParser.T_RIGHT, 0); }
		public TerminalNode T_RLIKE() { return getToken(HplsqlParser.T_RLIKE, 0); }
		public TerminalNode T_RS() { return getToken(HplsqlParser.T_RS, 0); }
		public TerminalNode T_ROLE() { return getToken(HplsqlParser.T_ROLE, 0); }
		public TerminalNode T_ROLLBACK() { return getToken(HplsqlParser.T_ROLLBACK, 0); }
		public TerminalNode T_ROW() { return getToken(HplsqlParser.T_ROW, 0); }
		public TerminalNode T_ROWS() { return getToken(HplsqlParser.T_ROWS, 0); }
		public TerminalNode T_ROW_COUNT() { return getToken(HplsqlParser.T_ROW_COUNT, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(HplsqlParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_SCHEMA() { return getToken(HplsqlParser.T_SCHEMA, 0); }
		public TerminalNode T_SECOND() { return getToken(HplsqlParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(HplsqlParser.T_SECONDS, 0); }
		public TerminalNode T_SECURITY() { return getToken(HplsqlParser.T_SECURITY, 0); }
		public TerminalNode T_SEGMENT() { return getToken(HplsqlParser.T_SEGMENT, 0); }
		public TerminalNode T_SEL() { return getToken(HplsqlParser.T_SEL, 0); }
		public TerminalNode T_SELECT() { return getToken(HplsqlParser.T_SELECT, 0); }
		public TerminalNode T_SESSION() { return getToken(HplsqlParser.T_SESSION, 0); }
		public TerminalNode T_SESSIONS() { return getToken(HplsqlParser.T_SESSIONS, 0); }
		public TerminalNode T_SET() { return getToken(HplsqlParser.T_SET, 0); }
		public TerminalNode T_SETS() { return getToken(HplsqlParser.T_SETS, 0); }
		public TerminalNode T_SHARE() { return getToken(HplsqlParser.T_SHARE, 0); }
		public TerminalNode T_SIGNAL() { return getToken(HplsqlParser.T_SIGNAL, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(HplsqlParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(HplsqlParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(HplsqlParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_SMALLINT() { return getToken(HplsqlParser.T_SMALLINT, 0); }
		public TerminalNode T_SQL() { return getToken(HplsqlParser.T_SQL, 0); }
		public TerminalNode T_SQLEXCEPTION() { return getToken(HplsqlParser.T_SQLEXCEPTION, 0); }
		public TerminalNode T_SQLINSERT() { return getToken(HplsqlParser.T_SQLINSERT, 0); }
		public TerminalNode T_SQLSTATE() { return getToken(HplsqlParser.T_SQLSTATE, 0); }
		public TerminalNode T_SQLWARNING() { return getToken(HplsqlParser.T_SQLWARNING, 0); }
		public TerminalNode T_STATS() { return getToken(HplsqlParser.T_STATS, 0); }
		public TerminalNode T_STATISTICS() { return getToken(HplsqlParser.T_STATISTICS, 0); }
		public TerminalNode T_STEP() { return getToken(HplsqlParser.T_STEP, 0); }
		public TerminalNode T_STDEV() { return getToken(HplsqlParser.T_STDEV, 0); }
		public TerminalNode T_STORAGE() { return getToken(HplsqlParser.T_STORAGE, 0); }
		public TerminalNode T_STORED() { return getToken(HplsqlParser.T_STORED, 0); }
		public TerminalNode T_STRING() { return getToken(HplsqlParser.T_STRING, 0); }
		public TerminalNode T_SUBDIR() { return getToken(HplsqlParser.T_SUBDIR, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(HplsqlParser.T_SUBSTRING, 0); }
		public TerminalNode T_SUM() { return getToken(HplsqlParser.T_SUM, 0); }
		public TerminalNode T_SUMMARY() { return getToken(HplsqlParser.T_SUMMARY, 0); }
		public TerminalNode T_SYSDATE() { return getToken(HplsqlParser.T_SYSDATE, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(HplsqlParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TABLE() { return getToken(HplsqlParser.T_TABLE, 0); }
		public TerminalNode T_TABLESPACE() { return getToken(HplsqlParser.T_TABLESPACE, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(HplsqlParser.T_TEMPORARY, 0); }
		public TerminalNode T_TERMINATED() { return getToken(HplsqlParser.T_TERMINATED, 0); }
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(HplsqlParser.T_TEXTIMAGE_ON, 0); }
		public TerminalNode T_THEN() { return getToken(HplsqlParser.T_THEN, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(HplsqlParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TITLE() { return getToken(HplsqlParser.T_TITLE, 0); }
		public TerminalNode T_TO() { return getToken(HplsqlParser.T_TO, 0); }
		public TerminalNode T_TOP() { return getToken(HplsqlParser.T_TOP, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(HplsqlParser.T_TRANSACTION, 0); }
		public TerminalNode T_TRIM() { return getToken(HplsqlParser.T_TRIM, 0); }
		public TerminalNode T_TRUE() { return getToken(HplsqlParser.T_TRUE, 0); }
		public TerminalNode T_TRUNCATE() { return getToken(HplsqlParser.T_TRUNCATE, 0); }
		public TerminalNode T_TYPE() { return getToken(HplsqlParser.T_TYPE, 0); }
		public TerminalNode T_UNIQUE() { return getToken(HplsqlParser.T_UNIQUE, 0); }
		public TerminalNode T_UPDATE() { return getToken(HplsqlParser.T_UPDATE, 0); }
		public TerminalNode T_UR() { return getToken(HplsqlParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(HplsqlParser.T_USE, 0); }
		public TerminalNode T_USER() { return getToken(HplsqlParser.T_USER, 0); }
		public TerminalNode T_USING() { return getToken(HplsqlParser.T_USING, 0); }
		public TerminalNode T_VALUE() { return getToken(HplsqlParser.T_VALUE, 0); }
		public TerminalNode T_VALUES() { return getToken(HplsqlParser.T_VALUES, 0); }
		public TerminalNode T_VAR() { return getToken(HplsqlParser.T_VAR, 0); }
		public TerminalNode T_VARCHAR() { return getToken(HplsqlParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(HplsqlParser.T_VARCHAR2, 0); }
		public TerminalNode T_VARYING() { return getToken(HplsqlParser.T_VARYING, 0); }
		public TerminalNode T_VARIANCE() { return getToken(HplsqlParser.T_VARIANCE, 0); }
		public TerminalNode T_VOLATILE() { return getToken(HplsqlParser.T_VOLATILE, 0); }
		public TerminalNode T_WHILE() { return getToken(HplsqlParser.T_WHILE, 0); }
		public TerminalNode T_WITHOUT() { return getToken(HplsqlParser.T_WITHOUT, 0); }
		public TerminalNode T_WORK() { return getToken(HplsqlParser.T_WORK, 0); }
		public TerminalNode T_XACT_ABORT() { return getToken(HplsqlParser.T_XACT_ABORT, 0); }
		public TerminalNode T_XML() { return getToken(HplsqlParser.T_XML, 0); }
		public TerminalNode T_YES() { return getToken(HplsqlParser.T_YES, 0); }
		public Non_reserved_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_reserved_words; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HplsqlVisitor ) return ((HplsqlVisitor<? extends T>)visitor).visitNon_reserved_words(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_reserved_wordsContext non_reserved_words() throws RecognitionException {
		Non_reserved_wordsContext _localctx = new Non_reserved_wordsContext(_ctx, getState());
		enterRule(_localctx, 520, RULE_non_reserved_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3810);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BULK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURRENT_SCHEMA - 64)) | (1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HANDLER - 128)) | (1L << (T_HASH - 128)) | (1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOCOUNT - 192)) | (1L << (T_NOCOMPRESS - 192)) | (1L << (T_NOLOGGING - 192)) | (1L << (T_NONE - 192)) | (1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SECURITY - 256)) | (1L << (T_SEGMENT - 256)) | (1L << (T_SEL - 256)) | (1L << (T_SELECT - 256)) | (1L << (T_SET - 256)) | (1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_TYPE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITHOUT - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_WORK - 320)) | (1L << (T_XACT_ABORT - 320)) | (1L << (T_XML - 320)) | (1L << (T_YES - 320)) | (1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return block_end_sempred((Block_endContext)_localctx, predIndex);
		case 11:
			return expr_stmt_sempred((Expr_stmtContext)_localctx, predIndex);
		case 77:
			return create_routine_params_sempred((Create_routine_paramsContext)_localctx, predIndex);
		case 166:
			return select_list_alias_sempred((Select_list_aliasContext)_localctx, predIndex);
		case 181:
			return from_alias_clause_sempred((From_alias_clauseContext)_localctx, predIndex);
		case 208:
			return delete_alias_sempred((Delete_aliasContext)_localctx, predIndex);
		case 210:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 218:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 242:
			return func_param_sempred((Func_paramContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean block_end_sempred(Block_endContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !_input.LT(2).getText().equalsIgnoreCase("TRANSACTION");
		}
		return true;
	}
	private boolean expr_stmt_sempred(Expr_stmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return !_input.LT(1).getText().equalsIgnoreCase("GO");
		}
		return true;
	}
	private boolean create_routine_params_sempred(Create_routine_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return !_input.LT(1).getText().equalsIgnoreCase("IS") &&
		        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
		        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
		        ;
		}
		return true;
	}
	private boolean select_list_alias_sempred(Select_list_aliasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM");
		}
		return true;
	}
	private boolean from_alias_clause_sempred(From_alias_clauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return !_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
		        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
		        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
		        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
		        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
		        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
		        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
		        !_input.LT(1).getText().equalsIgnoreCase("WITH");
		}
		return true;
	}
	private boolean delete_alias_sempred(Delete_aliasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return !_input.LT(1).getText().equalsIgnoreCase("ALL");
		}
		return true;
	}
	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 16);
		case 8:
			return precpred(_ctx, 15);
		case 9:
			return precpred(_ctx, 14);
		case 10:
			return precpred(_ctx, 17);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean func_param_sempred(Func_paramContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO");
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u018f\u0ee7\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\4\u00fd\t\u00fd\4\u00fe\t\u00fe"+
		"\4\u00ff\t\u00ff\4\u0100\t\u0100\4\u0101\t\u0101\4\u0102\t\u0102\4\u0103"+
		"\t\u0103\4\u0104\t\u0104\4\u0105\t\u0105\4\u0106\t\u0106\3\2\3\2\3\2\3"+
		"\3\3\3\5\3\u0212\n\3\3\3\5\3\u0215\n\3\6\3\u0217\n\3\r\3\16\3\u0218\3"+
		"\4\5\4\u021c\n\4\3\4\3\4\3\4\5\4\u0221\n\4\3\4\3\4\3\5\3\5\3\5\5\5\u0228"+
		"\n\5\3\5\3\5\3\5\3\5\5\5\u022e\n\5\5\5\u0230\n\5\3\6\3\6\3\6\3\7\3\7\6"+
		"\7\u0237\n\7\r\7\16\7\u0238\3\7\5\7\u023c\n\7\5\7\u023e\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0280\n\b\3\t\3\t\3\n\3\n\6\n"+
		"\u0286\n\n\r\n\16\n\u0287\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\5\16\u0298\n\16\3\16\3\16\3\16\7\16\u029d\n\16\f"+
		"\16\16\16\u02a0\13\16\5\16\u02a2\n\16\3\17\3\17\3\17\3\17\5\17\u02a8\n"+
		"\17\3\20\3\20\5\20\u02ac\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u02b5\n\20\3\20\3\20\3\20\5\20\u02ba\n\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\7\22\u02c5\n\22\f\22\16\22\u02c8\13\22\3\22\3\22\5"+
		"\22\u02cc\n\22\3\22\3\22\3\22\3\22\3\22\7\22\u02d3\n\22\f\22\16\22\u02d6"+
		"\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u02df\n\23\f\23\16\23\u02e2"+
		"\13\23\3\23\3\23\5\23\u02e6\n\23\3\23\5\23\u02e9\n\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u02f7\n\24\3\24\3\24"+
		"\3\25\3\25\3\25\5\25\u02fe\n\25\3\25\3\25\3\25\3\25\3\25\7\25\u0305\n"+
		"\25\f\25\16\25\u0308\13\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\5\30\u0318\n\30\3\31\3\31\3\31\3\31\7\31\u031e"+
		"\n\31\f\31\16\31\u0321\13\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0329"+
		"\n\32\f\32\16\32\u032c\13\32\3\33\3\33\3\33\3\33\3\33\7\33\u0333\n\33"+
		"\f\33\16\33\u0336\13\33\3\34\3\34\3\34\3\34\3\34\5\34\u033d\n\34\3\35"+
		"\3\35\3\35\7\35\u0342\n\35\f\35\16\35\u0345\13\35\3\35\5\35\u0348\n\35"+
		"\3\35\3\35\5\35\u034c\n\35\3\35\7\35\u034f\n\35\f\35\16\35\u0352\13\35"+
		"\3\35\5\35\u0355\n\35\3\35\3\35\3\35\5\35\u035a\n\35\3\35\3\35\5\35\u035e"+
		"\n\35\3\35\3\35\5\35\u0362\n\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u036c\n\37\3\37\3\37\5\37\u0370\n\37\3\37\3\37\3\37\5\37\u0375\n"+
		"\37\3 \3 \3 \5 \u037a\n \3 \3 \5 \u037e\n \3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\5\"\u038b\n\"\3\"\3\"\3#\5#\u0390\n#\3#\3#\3#\3#\5#\u0396"+
		"\n#\3#\3#\3$\3$\3$\3$\3$\5$\u039f\n$\3$\3$\5$\u03a3\n$\3$\3$\3%\3%\3%"+
		"\3%\5%\u03ab\n%\3%\5%\u03ae\n%\3%\3%\3%\5%\u03b3\n%\3%\3%\3&\5&\u03b8"+
		"\n&\3&\3&\3&\3&\3&\5&\u03bf\n&\3&\3&\3&\3&\3&\3&\3&\5&\u03c8\n&\3&\5&"+
		"\u03cb\n&\3\'\3\'\3\'\7\'\u03d0\n\'\f\'\16\'\u03d3\13\'\3(\3(\3(\5(\u03d8"+
		"\n(\3(\7(\u03db\n(\f(\16(\u03de\13(\3(\7(\u03e1\n(\f(\16(\u03e4\13(\3"+
		"(\3(\5(\u03e8\n(\3(\5(\u03eb\n(\3)\3)\3)\3)\3)\3)\3)\3)\5)\u03f5\n)\3"+
		")\3)\3)\3)\3*\3*\5*\u03fd\n*\3+\3+\3+\3+\3,\3,\5,\u0405\n,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\7,\u0411\n,\f,\16,\u0414\13,\3,\3,\3,\3,\3,\7,\u041b"+
		"\n,\f,\16,\u041e\13,\3,\3,\3,\5,\u0423\n,\3-\3-\3-\5-\u0428\n-\3-\3-\3"+
		"-\5-\u042d\n-\3-\3-\3-\5-\u0432\n-\7-\u0434\n-\f-\16-\u0437\13-\3-\3-"+
		"\5-\u043b\n-\3-\5-\u043e\n-\3-\3-\3-\3-\3-\3-\7-\u0446\n-\f-\16-\u0449"+
		"\13-\3-\3-\3-\3-\3-\3-\3-\7-\u0452\n-\f-\16-\u0455\13-\3-\3-\7-\u0459"+
		"\n-\f-\16-\u045c\13-\5-\u045e\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u046a"+
		"\n.\3/\6/\u046d\n/\r/\16/\u046e\3\60\3\60\3\60\5\60\u0474\n\60\3\61\5"+
		"\61\u0477\n\61\3\61\3\61\3\62\6\62\u047c\n\62\r\62\16\62\u047d\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u048a\n\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\6\64\u0497\n\64\r\64\16"+
		"\64\u0498\3\64\3\64\3\64\5\64\u049e\n\64\3\65\5\65\u04a1\n\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u04ae\n\65\f\65\16"+
		"\65\u04b1\13\65\3\65\3\65\3\65\5\65\u04b6\n\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\5\65\u04c1\n\65\3\66\5\66\u04c4\n\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\7\66\u04cc\n\66\f\66\16\66\u04cf\13\66\3\66\3\66\3"+
		"\66\3\66\5\66\u04d5\n\66\3\67\3\67\3\67\3\67\5\67\u04db\n\67\38\38\38"+
		"\38\78\u04e1\n8\f8\168\u04e4\138\39\39\39\39\39\39\39\59\u04ed\n9\39\3"+
		"9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u0501\n9\3:\3:\3"+
		":\3:\5:\u0507\n:\3;\3;\5;\u050b\n;\3;\3;\3;\5;\u0510\n;\3;\3;\5;\u0514"+
		"\n;\3;\3;\3;\5;\u0519\n;\3;\5;\u051c\n;\3;\3;\3;\5;\u0521\n;\3;\5;\u0524"+
		"\n;\3<\3<\3<\3<\3<\3=\3=\3>\3>\3>\5>\u0530\n>\3>\3>\3?\3?\3?\5?\u0537"+
		"\n?\3?\3?\3?\5?\u053c\n?\3?\3?\3?\5?\u0541\n?\7?\u0543\n?\f?\16?\u0546"+
		"\13?\3?\3?\5?\u054a\n?\3?\5?\u054d\n?\3?\3?\3?\3?\3?\3?\7?\u0555\n?\f"+
		"?\16?\u0558\13?\3?\3?\3?\3?\3?\3?\3?\7?\u0561\n?\f?\16?\u0564\13?\3?\3"+
		"?\7?\u0568\n?\f?\16?\u056b\13?\3?\3?\3?\3?\3?\5?\u0572\n?\3@\3@\3@\3@"+
		"\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0581\n@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@"+
		"\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u05a0\n@"+
		"\5@\u05a2\n@\3A\3A\3A\5A\u05a7\nA\3A\3A\5A\u05ab\nA\3A\3A\3B\5B\u05b0"+
		"\nB\3B\3B\3B\3B\3B\5B\u05b7\nB\3B\5B\u05ba\nB\3C\5C\u05bd\nC\3C\3C\3C"+
		"\5C\u05c2\nC\3C\3C\5C\u05c6\nC\5C\u05c8\nC\3D\3D\3D\3D\3D\5D\u05cf\nD"+
		"\3D\3D\7D\u05d3\nD\fD\16D\u05d6\13D\3E\3E\3E\3E\5E\u05dc\nE\3F\3F\3F\3"+
		"F\5F\u05e2\nF\3F\5F\u05e5\nF\3F\3F\3F\5F\u05ea\nF\3F\3F\5F\u05ee\nF\3"+
		"F\5F\u05f1\nF\3F\3F\3G\3G\3G\5G\u05f8\nG\3H\3H\3H\3H\5H\u05fe\nH\3H\5"+
		"H\u0601\nH\3H\3H\3H\3H\3H\3H\3H\3H\5H\u060b\nH\3I\3I\3I\3I\3I\7I\u0612"+
		"\nI\fI\16I\u0615\13I\3J\3J\3J\3J\5J\u061b\nJ\3J\3J\3J\3J\3J\5J\u0622\n"+
		"J\5J\u0624\nJ\3K\3K\3K\3K\5K\u062a\nK\3K\5K\u062d\nK\3K\3K\3K\3K\3K\3"+
		"K\3K\3K\3K\5K\u0638\nK\3L\3L\3L\3L\3L\7L\u063f\nL\fL\16L\u0642\13L\3M"+
		"\3M\3M\5M\u0647\nM\3N\3N\3N\3N\5N\u064d\nN\3N\5N\u0650\nN\3N\3N\3N\5N"+
		"\u0655\nN\3N\5N\u0658\nN\3N\5N\u065b\nN\3N\5N\u065e\nN\3N\5N\u0661\nN"+
		"\3N\3N\3N\3N\5N\u0667\nN\3O\3O\3O\3O\3O\3O\7O\u066f\nO\fO\16O\u0672\13"+
		"O\3O\3O\3O\3O\3O\3O\7O\u067a\nO\fO\16O\u067d\13O\5O\u067f\nO\3P\3P\3P"+
		"\3P\3P\5P\u0686\nP\3P\3P\3P\5P\u068b\nP\3P\7P\u068e\nP\fP\16P\u0691\13"+
		"P\3P\5P\u0694\nP\3P\3P\3P\3P\3P\3P\5P\u069c\nP\3P\3P\5P\u06a0\nP\3P\7"+
		"P\u06a3\nP\fP\16P\u06a6\13P\3P\5P\u06a9\nP\5P\u06ab\nP\3Q\6Q\u06ae\nQ"+
		"\rQ\16Q\u06af\3R\3R\3R\3R\3R\3R\5R\u06b8\nR\3R\3R\3R\5R\u06bd\nR\3S\3"+
		"S\3S\3S\5S\u06c3\nS\3S\3S\3S\3S\3S\5S\u06ca\nS\3S\3S\3S\3S\3S\5S\u06d1"+
		"\nS\3S\3S\3S\3S\3S\5S\u06d8\nS\3S\5S\u06db\nS\3T\3T\3T\3U\3U\5U\u06e2"+
		"\nU\3U\3U\3U\3U\3U\3U\5U\u06ea\nU\3U\3U\3U\3U\7U\u06f0\nU\fU\16U\u06f3"+
		"\13U\5U\u06f5\nU\3U\5U\u06f8\nU\3V\3V\3V\5V\u06fd\nV\3W\3W\3W\3W\3W\7"+
		"W\u0704\nW\fW\16W\u0707\13W\3W\5W\u070a\nW\3W\3W\3W\3X\3X\3X\3X\3X\5X"+
		"\u0714\nX\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3\\\3\\\3\\\5\\\u0727"+
		"\n\\\3]\3]\3]\3]\7]\u072d\n]\f]\16]\u0730\13]\3]\3]\3^\3^\3^\3^\3_\3_"+
		"\3_\3_\3_\5_\u073d\n_\5_\u073f\n_\3_\3_\3_\5_\u0744\n_\3`\3`\3a\3a\5a"+
		"\u074a\na\3a\5a\u074d\na\3b\3b\3b\3b\3b\7b\u0754\nb\fb\16b\u0757\13b\3"+
		"b\3b\5b\u075b\nb\3c\3c\3c\5c\u0760\nc\3d\3d\3d\3d\7d\u0766\nd\fd\16d\u0769"+
		"\13d\3d\3d\3e\3e\3e\3e\7e\u0771\ne\fe\16e\u0774\13e\3f\3f\3f\3f\7f\u077a"+
		"\nf\ff\16f\u077d\13f\3f\3f\3g\3g\3g\5g\u0784\ng\3g\3g\3g\3g\3h\3h\5h\u078c"+
		"\nh\3h\3h\5h\u0790\nh\3i\3i\3i\3i\3j\3j\5j\u0798\nj\3k\3k\3k\3k\3k\3k"+
		"\3l\3l\3l\3l\3m\3m\3m\3m\7m\u07a8\nm\fm\16m\u07ab\13m\3m\3m\3m\3m\3n\3"+
		"n\3n\3n\3n\3o\3o\5o\u07b8\no\3p\3p\3p\3p\3p\5p\u07bf\np\3p\3p\5p\u07c3"+
		"\np\3q\3q\3q\3q\3q\5q\u07ca\nq\5q\u07cc\nq\3r\3r\5r\u07d0\nr\3r\3r\5r"+
		"\u07d4\nr\3r\3r\3r\3r\7r\u07da\nr\fr\16r\u07dd\13r\3r\5r\u07e0\nr\3s\3"+
		"s\3s\3t\3t\3t\3t\3t\5t\u07ea\nt\3u\3u\3u\3u\3u\7u\u07f1\nu\fu\16u\u07f4"+
		"\13u\3u\3u\3v\3v\3v\3w\3w\3w\3w\3w\3w\3x\3x\5x\u0803\nx\3x\3x\3x\3x\5"+
		"x\u0809\nx\3x\3x\5x\u080d\nx\3y\3y\3y\3y\3y\3y\7y\u0815\ny\fy\16y\u0818"+
		"\13y\3y\3y\3y\7y\u081d\ny\fy\16y\u0820\13y\3z\3z\3z\3z\3z\3z\5z\u0828"+
		"\nz\3z\3z\5z\u082c\nz\3z\3z\7z\u0830\nz\fz\16z\u0833\13z\3{\3{\5{\u0837"+
		"\n{\3|\3|\5|\u083b\n|\3}\3}\3}\3}\3}\3}\3}\3}\5}\u0845\n}\3~\3~\3\177"+
		"\3\177\5\177\u084b\n\177\3\u0080\3\u0080\5\u0080\u084f\n\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\7\u0080\u0859"+
		"\n\u0080\f\u0080\16\u0080\u085c\13\u0080\3\u0080\3\u0080\3\u0081\3\u0081"+
		"\5\u0081\u0862\n\u0081\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\7\u0083\u0870\n\u0083"+
		"\f\u0083\16\u0083\u0873\13\u0083\3\u0083\3\u0083\7\u0083\u0877\n\u0083"+
		"\f\u0083\16\u0083\u087a\13\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\5\u0084\u0883\n\u0084\3\u0085\5\u0085\u0886\n\u0085\3"+
		"\u0085\3\u0085\5\u0085\u088a\n\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3"+
		"\u0087\5\u0087\u0891\n\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5"+
		"\u0087\u0898\n\u0087\5\u0087\u089a\n\u0087\3\u0088\3\u0088\5\u0088\u089e"+
		"\n\u0088\3\u0089\3\u0089\5\u0089\u08a2\n\u0089\3\u008a\3\u008a\3\u008a"+
		"\5\u008a\u08a7\n\u008a\3\u008b\5\u008b\u08aa\n\u008b\3\u008b\3\u008b\5"+
		"\u008b\u08ae\n\u008b\3\u008b\5\u008b\u08b1\n\u008b\3\u008b\3\u008b\3\u008c"+
		"\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u08bc\n\u008d"+
		"\3\u008d\5\u008d\u08bf\n\u008d\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e"+
		"\3\u008e\3\u008f\3\u008f\3\u008f\5\u008f\u08ca\n\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\5\u008f\u08d0\n\u008f\3\u008f\3\u008f\5\u008f\u08d4\n"+
		"\u008f\5\u008f\u08d6\n\u008f\3\u0090\3\u0090\5\u0090\u08da\n\u0090\3\u0090"+
		"\3\u0090\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\5\u0092\u08e3\n\u0092"+
		"\3\u0092\3\u0092\3\u0092\7\u0092\u08e8\n\u0092\f\u0092\16\u0092\u08eb"+
		"\13\u0092\3\u0092\5\u0092\u08ee\n\u0092\3\u0092\3\u0092\5\u0092\u08f2"+
		"\n\u0092\3\u0092\3\u0092\3\u0092\7\u0092\u08f7\n\u0092\f\u0092\16\u0092"+
		"\u08fa\13\u0092\3\u0092\5\u0092\u08fd\n\u0092\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\5\u0093\u0905\n\u0093\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u0910\n\u0095"+
		"\3\u0095\3\u0095\5\u0095\u0914\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u091f\n\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\5\u0096\u0926\n\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\5\u0097\u0933\n\u0097\3\u0098\3\u0098\3\u0098\3\u0098\7\u0098\u0939\n"+
		"\u0098\f\u0098\16\u0098\u093c\13\u0098\3\u0099\5\u0099\u093f\n\u0099\3"+
		"\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a\7\u009a\u0947\n\u009a\f"+
		"\u009a\16\u009a\u094a\13\u009a\3\u009b\3\u009b\5\u009b\u094e\n\u009b\3"+
		"\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\7\u009c\u0959\n\u009c\f\u009c\16\u009c\u095c\13\u009c\3\u009c\3\u009c"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\7\u009d\u0964\n\u009d\f\u009d\16\u009d"+
		"\u0967\13\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u096e"+
		"\n\u009e\3\u009f\3\u009f\5\u009f\u0972\n\u009f\3\u009f\3\u009f\5\u009f"+
		"\u0976\n\u009f\3\u009f\3\u009f\5\u009f\u097a\n\u009f\5\u009f\u097c\n\u009f"+
		"\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u0981\n\u00a0\3\u00a0\5\u00a0\u0984\n"+
		"\u00a0\3\u00a0\5\u00a0\u0987\n\u00a0\3\u00a0\5\u00a0\u098a\n\u00a0\3\u00a0"+
		"\5\u00a0\u098d\n\u00a0\3\u00a0\3\u00a0\5\u00a0\u0991\n\u00a0\3\u00a0\5"+
		"\u00a0\u0994\n\u00a0\3\u00a0\5\u00a0\u0997\n\u00a0\3\u00a0\5\u00a0\u099a"+
		"\n\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\7\u00a1\u09a0\n\u00a1\f\u00a1"+
		"\16\u00a1\u09a3\13\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3"+
		"\5\u00a3\u09ab\n\u00a3\3\u00a3\5\u00a3\u09ae\n\u00a3\3\u00a3\5\u00a3\u09b1"+
		"\n\u00a3\3\u00a3\3\u00a3\3\u00a4\5\u00a4\u09b6\n\u00a4\3\u00a4\5\u00a4"+
		"\u09b9\n\u00a4\3\u00a4\3\u00a4\3\u00a4\7\u00a4\u09be\n\u00a4\f\u00a4\16"+
		"\u00a4\u09c1\13\u00a4\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a7"+
		"\3\u00a7\3\u00a7\5\u00a7\u09cb\n\u00a7\3\u00a7\3\u00a7\5\u00a7\u09cf\n"+
		"\u00a7\3\u00a7\5\u00a7\u09d2\n\u00a7\3\u00a8\3\u00a8\5\u00a8\u09d6\n\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\7\u00a8\u09dd\n\u00a8\f\u00a8"+
		"\16\u00a8\u09e0\13\u00a8\3\u00a8\3\u00a8\5\u00a8\u09e4\n\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u09ea\n\u00a8\3\u00a9\5\u00a9\u09ed\n"+
		"\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u09f2\n\u00a9\3\u00a9\3\u00a9\5"+
		"\u00a9\u09f6\n\u00a9\3\u00a9\3\u00a9\5\u00a9\u09fa\n\u00a9\7\u00a9\u09fc"+
		"\n\u00a9\f\u00a9\16\u00a9\u09ff\13\u00a9\3\u00aa\3\u00aa\5\u00aa\u0a03"+
		"\n\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ac"+
		"\5\u00ac\u0a0d\n\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u0a12\n\u00ac\3"+
		"\u00ac\3\u00ac\3\u00ac\5\u00ac\u0a17\n\u00ac\7\u00ac\u0a19\n\u00ac\f\u00ac"+
		"\16\u00ac\u0a1c\13\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00ae"+
		"\7\u00ae\u0a24\n\u00ae\f\u00ae\16\u00ae\u0a27\13\u00ae\3\u00ae\7\u00ae"+
		"\u0a2a\n\u00ae\f\u00ae\16\u00ae\u0a2d\13\u00ae\3\u00af\3\u00af\3\u00af"+
		"\5\u00af\u0a32\n\u00af\3\u00b0\3\u00b0\5\u00b0\u0a36\n\u00b0\3\u00b1\3"+
		"\u00b1\3\u00b1\3\u00b1\5\u00b1\u0a3c\n\u00b1\3\u00b2\3\u00b2\3\u00b2\3"+
		"\u00b2\3\u00b2\3\u00b2\5\u00b2\u0a44\n\u00b2\3\u00b2\3\u00b2\3\u00b2\3"+
		"\u00b2\5\u00b2\u0a4a\n\u00b2\5\u00b2\u0a4c\n\u00b2\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b4\5\u00b4\u0a52\n\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u0a57\n"+
		"\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u0a5e\n\u00b4\3"+
		"\u00b4\3\u00b4\5\u00b4\u0a62\n\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3"+
		"\u00b5\3\u00b5\7\u00b5\u0a6a\n\u00b5\f\u00b5\16\u00b5\u0a6d\13\u00b5\3"+
		"\u00b5\3\u00b5\5\u00b5\u0a71\n\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3"+
		"\u00b6\7\u00b6\u0a78\n\u00b6\f\u00b6\16\u00b6\u0a7b\13\u00b6\3\u00b6\3"+
		"\u00b6\5\u00b6\u0a7f\n\u00b6\3\u00b7\3\u00b7\5\u00b7\u0a83\n\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\7\u00b7\u0a8a\n\u00b7\f\u00b7\16\u00b7"+
		"\u0a8d\13\u00b7\3\u00b7\5\u00b7\u0a90\n\u00b7\3\u00b8\5\u00b8\u0a93\n"+
		"\u00b8\3\u00b8\3\u00b8\3\u00b8\5\u00b8\u0a98\n\u00b8\3\u00b8\3\u00b8\5"+
		"\u00b8\u0a9c\n\u00b8\3\u00b8\3\u00b8\5\u00b8\u0aa0\n\u00b8\7\u00b8\u0aa2"+
		"\n\u00b8\f\u00b8\16\u00b8\u0aa5\13\u00b8\3\u00b9\3\u00b9\3\u00b9\5\u00b9"+
		"\u0aaa\n\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\7\u00b9\u0ab1\n"+
		"\u00b9\f\u00b9\16\u00b9\u0ab4\13\u00b9\3\u00ba\3\u00ba\3\u00ba\5\u00ba"+
		"\u0ab9\n\u00ba\3\u00ba\3\u00ba\3\u00bb\5\u00bb\u0abe\n\u00bb\3\u00bb\3"+
		"\u00bb\3\u00bb\5\u00bb\u0ac3\n\u00bb\3\u00bc\5\u00bc\u0ac6\n\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\5\u00bc\u0acb\n\u00bc\3\u00bd\5\u00bd\u0ace\n\u00bd\3"+
		"\u00bd\3\u00bd\3\u00bd\5\u00bd\u0ad3\n\u00bd\3\u00bd\3\u00bd\3\u00be\5"+
		"\u00be\u0ad8\n\u00be\3\u00be\3\u00be\3\u00be\5\u00be\u0add\n\u00be\3\u00bf"+
		"\3\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\7\u00c0\u0ae7"+
		"\n\u00c0\f\u00c0\16\u00c0\u0aea\13\u00c0\3\u00c0\5\u00c0\u0aed\n\u00c0"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\7\u00c2\u0af8\n\u00c2\f\u00c2\16\u00c2\u0afb\13\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u0b02\n\u00c3\3\u00c3\3\u00c3\7\u00c3"+
		"\u0b06\n\u00c3\f\u00c3\16\u00c3\u0b09\13\u00c3\3\u00c3\5\u00c3\u0b0c\n"+
		"\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\5\u00c6\u0b18\n\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6"+
		"\u0b1d\n\u00c6\7\u00c6\u0b1f\n\u00c6\f\u00c6\16\u00c6\u0b22\13\u00c6\3"+
		"\u00c7\6\u00c7\u0b25\n\u00c7\r\u00c7\16\u00c7\u0b26\3\u00c8\3\u00c8\3"+
		"\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0b32\n"+
		"\u00c8\5\u00c8\u0b34\n\u00c8\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5"+
		"\u00c9\u0b3b\n\u00c9\3\u00c9\5\u00c9\u0b3e\n\u00c9\3\u00ca\3\u00ca\3\u00ca"+
		"\7\u00ca\u0b43\n\u00ca\f\u00ca\16\u00ca\u0b46\13\u00ca\3\u00cb\3\u00cb"+
		"\5\u00cb\u0b4a\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0b50\n"+
		"\u00cb\3\u00cb\5\u00cb\u0b53\n\u00cb\3\u00cb\5\u00cb\u0b56\n\u00cb\3\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\6\u00cd\u0b63\n\u00cd\r\u00cd\16\u00cd\u0b64\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u0b6c\n\u00ce\3\u00ce\5\u00ce\u0b6f\n"+
		"\u00ce\3\u00ce\5\u00ce\u0b72\n\u00ce\3\u00cf\3\u00cf\5\u00cf\u0b76\n\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u0b7b\n\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\5\u00cf\u0b81\n\u00cf\3\u00d0\3\u00d0\5\u00d0\u0b85\n\u00d0\3"+
		"\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\7\u00d0\u0b8e\n"+
		"\u00d0\f\u00d0\16\u00d0\u0b91\13\u00d0\3\u00d0\5\u00d0\u0b94\n\u00d0\3"+
		"\u00d0\5\u00d0\u0b97\n\u00d0\3\u00d1\3\u00d1\5\u00d1\u0b9b\n\u00d1\3\u00d1"+
		"\3\u00d1\5\u00d1\u0b9f\n\u00d1\3\u00d1\3\u00d1\5\u00d1\u0ba3\n\u00d1\3"+
		"\u00d2\3\u00d2\5\u00d2\u0ba7\n\u00d2\3\u00d2\3\u00d2\3\u00d3\3\u00d3\5"+
		"\u00d3\u0bad\n\u00d3\3\u00d3\3\u00d3\3\u00d4\3\u00d4\5\u00d4\u0bb3\n\u00d4"+
		"\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\5\u00d4\u0bbb\n\u00d4"+
		"\3\u00d4\5\u00d4\u0bbe\n\u00d4\3\u00d4\3\u00d4\3\u00d4\3\u00d4\7\u00d4"+
		"\u0bc4\n\u00d4\f\u00d4\16\u00d4\u0bc7\13\u00d4\3\u00d5\3\u00d5\3\u00d5"+
		"\5\u00d5\u0bcc\n\u00d5\3\u00d6\3\u00d6\3\u00d6\5\u00d6\u0bd1\n\u00d6\3"+
		"\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\5\u00d6\u0bdc\n\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d6"+
		"\3\u00d6\5\u00d6\u0be5\n\u00d6\3\u00d7\3\u00d7\5\u00d7\u0be9\n\u00d7\3"+
		"\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d7\7\u00d7\u0bf0\n\u00d7\f\u00d7\16"+
		"\u00d7\u0bf3\13\u00d7\3\u00d7\5\u00d7\u0bf6\n\u00d7\3\u00d7\3\u00d7\3"+
		"\u00d8\3\u00d8\3\u00d8\3\u00d8\7\u00d8\u0bfe\n\u00d8\f\u00d8\16\u00d8"+
		"\u0c01\13\u00d8\3\u00d8\3\u00d8\5\u00d8\u0c05\n\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00da\3\u00da"+
		"\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db"+
		"\5\u00db\u0c1b\n\u00db\3\u00db\5\u00db\u0c1e\n\u00db\3\u00dc\3\u00dc\5"+
		"\u00dc\u0c22\n\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\5\u00dc\u0c29"+
		"\n\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc"+
		"\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\5\u00dc\u0c39\n\u00dc"+
		"\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc"+
		"\3\u00dc\3\u00dc\3\u00dc\3\u00dc\7\u00dc\u0c48\n\u00dc\f\u00dc\16\u00dc"+
		"\u0c4b\13\u00dc\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\5\u00dd\u0c55\n\u00dd\3\u00de\3\u00de\3\u00de\3\u00de\3\u00df"+
		"\3\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\7\u00e0\u0c62\n\u00e0"+
		"\f\u00e0\16\u00e0\u0c65\13\u00e0\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\5\u00e1\u0c72\n\u00e1"+
		"\3\u00e2\3\u00e2\5\u00e2\u0c76\n\u00e2\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\3\u00e3\3\u00e3\6\u00e3\u0c7f\n\u00e3\r\u00e3\16\u00e3\u0c80"+
		"\3\u00e3\3\u00e3\5\u00e3\u0c85\n\u00e3\3\u00e3\3\u00e3\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\6\u00e4\u0c8f\n\u00e4\r\u00e4\16\u00e4"+
		"\u0c90\3\u00e4\3\u00e4\5\u00e4\u0c95\n\u00e4\3\u00e4\3\u00e4\3\u00e5\3"+
		"\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e6"+
		"\3\u00e6\3\u00e6\3\u00e6\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u0ca9\n\u00e7"+
		"\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u0cae\n\u00e7\3\u00e7\3\u00e7\3\u00e7"+
		"\5\u00e7\u0cb3\n\u00e7\3\u00e7\3\u00e7\5\u00e7\u0cb7\n\u00e7\3\u00e7\3"+
		"\u00e7\5\u00e7\u0cbb\n\u00e7\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u0cc0\n\u00e7"+
		"\3\u00e7\3\u00e7\5\u00e7\u0cc4\n\u00e7\3\u00e7\3\u00e7\5\u00e7\u0cc8\n"+
		"\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7"+
		"\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7"+
		"\3\u00e7\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u0cdf\n\u00e7\5\u00e7\u0ce1\n"+
		"\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7"+
		"\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\5\u00e7"+
		"\u0cf3\n\u00e7\5\u00e7\u0cf5\n\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3"+
		"\u00e7\3\u00e7\5\u00e7\u0cfd\n\u00e7\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u0d02"+
		"\n\u00e7\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u0d07\n\u00e7\3\u00e7\3\u00e7"+
		"\3\u00e7\5\u00e7\u0d0c\n\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7"+
		"\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\5\u00e7"+
		"\u0d1b\n\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u0d22\n"+
		"\u00e7\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u0d27\n\u00e7\3\u00e7\3\u00e7\3"+
		"\u00e7\5\u00e7\u0d2c\n\u00e7\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u0d31\n\u00e7"+
		"\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u0d36\n\u00e7\3\u00e7\3\u00e7\3\u00e7"+
		"\5\u00e7\u0d3b\n\u00e7\3\u00e7\3\u00e7\3\u00e7\5\u00e7\u0d40\n\u00e7\3"+
		"\u00e7\3\u00e7\3\u00e7\5\u00e7\u0d45\n\u00e7\3\u00e7\3\u00e7\3\u00e7\5"+
		"\u00e7\u0d4a\n\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3"+
		"\u00e7\5\u00e7\u0d53\n\u00e7\5\u00e7\u0d55\n\u00e7\3\u00e8\3\u00e8\3\u00e9"+
		"\3\u00e9\3\u00e9\3\u00e9\5\u00e9\u0d5d\n\u00e9\3\u00e9\5\u00e9\u0d60\n"+
		"\u00e9\3\u00e9\5\u00e9\u0d63\n\u00e9\3\u00e9\5\u00e9\u0d66\n\u00e9\3\u00ea"+
		"\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00eb\3\u00eb\3\u00eb\3\u00eb"+
		"\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00eb\5\u00eb\u0d78\n\u00eb"+
		"\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\7\u00ec\u0d7f\n\u00ec\f\u00ec"+
		"\16\u00ec\u0d82\13\u00ec\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ed\5\u00ed\u0d8b\n\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ed\5\u00ed\u0d93\n\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ed\3\u00ed\5\u00ed\u0d9c\n\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed"+
		"\5\u00ed\u0da2\n\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\7\u00ed\u0db1"+
		"\n\u00ed\f\u00ed\16\u00ed\u0db4\13\u00ed\5\u00ed\u0db6\n\u00ed\3\u00ed"+
		"\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ed\3\u00ed\7\u00ed\u0dc4\n\u00ed\f\u00ed\16\u00ed\u0dc7\13\u00ed"+
		"\5\u00ed\u0dc9\n\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\7\u00ed\u0dd7\n\u00ed"+
		"\f\u00ed\16\u00ed\u0dda\13\u00ed\5\u00ed\u0ddc\n\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ed\7\u00ed\u0dea\n\u00ed\f\u00ed\16\u00ed\u0ded\13\u00ed\5\u00ed"+
		"\u0def\n\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\7\u00ed\u0dfd\n\u00ed\f\u00ed"+
		"\16\u00ed\u0e00\13\u00ed\5\u00ed\u0e02\n\u00ed\3\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed"+
		"\7\u00ed\u0e10\n\u00ed\f\u00ed\16\u00ed\u0e13\13\u00ed\5\u00ed\u0e15\n"+
		"\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ed\3\u00ed\7\u00ed\u0e21\n\u00ed\f\u00ed\16\u00ed\u0e24\13\u00ed"+
		"\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ed\6\u00ed\u0e30\n\u00ed\r\u00ed\16\u00ed\u0e31\3\u00ed\3\u00ed"+
		"\5\u00ed\u0e36\n\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\5\u00ed"+
		"\u0e46\n\u00ed\3\u00ed\3\u00ed\3\u00ed\3\u00ed\5\u00ed\u0e4c\n\u00ed\3"+
		"\u00ee\3\u00ee\3\u00ee\5\u00ee\u0e51\n\u00ee\3\u00ee\3\u00ee\5\u00ee\u0e55"+
		"\n\u00ee\3\u00ef\3\u00ef\3\u00ef\3\u00ef\3\u00ef\5\u00ef\u0e5c\n\u00ef"+
		"\3\u00ef\3\u00ef\3\u00f0\3\u00f0\5\u00f0\u0e62\n\u00f0\3\u00f1\3\u00f1"+
		"\5\u00f1\u0e66\n\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f2\3\u00f2\3\u00f2"+
		"\3\u00f2\3\u00f3\3\u00f3\3\u00f3\7\u00f3\u0e72\n\u00f3\f\u00f3\16\u00f3"+
		"\u0e75\13\u00f3\3\u00f4\3\u00f4\3\u00f4\3\u00f4\5\u00f4\u0e7b\n\u00f4"+
		"\5\u00f4\u0e7d\n\u00f4\3\u00f4\3\u00f4\3\u00f5\3\u00f5\5\u00f5\u0e83\n"+
		"\u00f5\3\u00f6\3\u00f6\5\u00f6\u0e87\n\u00f6\3\u00f7\3\u00f7\7\u00f7\u0e8b"+
		"\n\u00f7\f\u00f7\16\u00f7\u0e8e\13\u00f7\3\u00f8\3\u00f8\3\u00f8\3\u00f8"+
		"\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8\3\u00f8\5\u00f8"+
		"\u0e9c\n\u00f8\3\u00f9\3\u00f9\3\u00f9\3\u00f9\3\u00f9\5\u00f9\u0ea3\n"+
		"\u00f9\3\u00fa\7\u00fa\u0ea6\n\u00fa\f\u00fa\16\u00fa\u0ea9\13\u00fa\3"+
		"\u00fb\3\u00fb\3\u00fb\3\u00fc\3\u00fc\3\u00fc\3\u00fc\5\u00fc\u0eb2\n"+
		"\u00fc\3\u00fc\3\u00fc\3\u00fc\7\u00fc\u0eb7\n\u00fc\f\u00fc\16\u00fc"+
		"\u0eba\13\u00fc\5\u00fc\u0ebc\n\u00fc\3\u00fd\3\u00fd\3\u00fd\3\u00fe"+
		"\3\u00fe\3\u00fe\3\u00ff\5\u00ff\u0ec5\n\u00ff\3\u00ff\3\u00ff\5\u00ff"+
		"\u0ec9\n\u00ff\3\u0100\3\u0100\3\u0100\7\u0100\u0ece\n\u0100\f\u0100\16"+
		"\u0100\u0ed1\13\u0100\3\u0101\3\u0101\5\u0101\u0ed5\n\u0101\3\u0102\5"+
		"\u0102\u0ed8\n\u0102\3\u0102\3\u0102\3\u0103\5\u0103\u0edd\n\u0103\3\u0103"+
		"\3\u0103\3\u0104\3\u0104\3\u0105\3\u0105\3\u0106\3\u0106\3\u0106\3\u0ea7"+
		"\4\u01a6\u01b6\u0107\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6"+
		"\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe"+
		"\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116"+
		"\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e"+
		"\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146"+
		"\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e"+
		"\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176"+
		"\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e"+
		"\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6"+
		"\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be"+
		"\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6"+
		"\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee"+
		"\u01f0\u01f2\u01f4\u01f6\u01f8\u01fa\u01fc\u01fe\u0200\u0202\u0204\u0206"+
		"\u0208\u020a\2\66\5\2\3\4\u016d\u016d\u017f\u017f\4\2dd\u013d\u013d\3"+
		"\2\u00ad\u00ae\5\2\16\16uu\u009c\u009c\4\2\"\"**\4\288mm\4\2\u00bd\u00bd"+
		"\u0106\u0106\4\2\u00f9\u00f9\u012f\u012f\4\2\17\17UU\4\2RR\u0132\u0132"+
		"\4\2nn\u00b0\u00b0\4\2RR\u00de\u00de\4\2NN\u008b\u008b\5\2\u008f\u008f"+
		"\u00b7\u00b7\u00da\u00db\4\2\u00b2\u00b2\u00c4\u00c4\4\2\u00c1\u00c1\u0145"+
		"\u0145\4\2\u00b6\u00b6\u0186\u0186\4\2  \'\'\4\2%%@@\4\2DD\u00ff\u00ff"+
		"\4\2\16\16\u009c\u009c\3\2\u00f0\u00f1\3\2\u00e1\u00e2\6\2>>PP\u009b\u009b"+
		"\u00d7\u00d7\4\2{{\u00e2\u00e2\3\2hi\3\2ab\3\2\u0116\u0117\4\2\u00fa\u00fa"+
		"\u011e\u011e\5\2RR\u008a\u008a\u00d6\u00d6\6\2\f\r\u00c2\u00c2\u00e6\u00e6"+
		"\u0143\u0143\4\2\u00cc\u00cc\u00ce\u00ce\4\2\u0107\u0107\u012c\u012c\6"+
		"\2\25\25\\\\\u00b3\u00b3\u0126\u0126\4\2\u00b3\u00b3\u013f\u013f\4\2\37"+
		"\37\u0118\u0118\3\2\u0104\u0105\4\2\b\bZZ\5\2zz\u00a7\u00a7\u00f3\u00f3"+
		"\3\2\u0149\u014a\5\2@@\u00fb\u00fc\u0133\u0133\5\2kk\u010a\u010a\u0132"+
		"\u0132\3\2UV\4\2\13\13\u00d1\u00d1\5\2\u00a8\u00a8\u00ea\u00ea\u00f4\u00f4"+
		"\4\2\u016d\u016d\u0178\u0178\4\2\u0169\u0169\u0180\u0180\5\2HI\u00ba\u00bb"+
		"\u0100\u0101\4\2\65\65\u016c\u016c\5\2xx\u009d\u009d\u00c7\u00c7\4\2o"+
		"o\u012d\u012d\35\2\6\31\33>@_ccegjxz\177\u0082\u008f\u0091\u0099\u009b"+
		"\u009f\u00a2\u00a6\u00a8\u00a8\u00aa\u00c7\u00c9\u00cc\u00ce\u00d1\u00d3"+
		"\u00db\u00dd\u00f8\u00fa\u010d\u010f\u0127\u0129\u012f\u0131\u013c\u013f"+
		"\u013f\u0141\u0145\u014b\u0154\u015b\u015e\u0161\u0163\u0165\u0165\2\u10ca"+
		"\2\u020c\3\2\2\2\4\u0216\3\2\2\2\6\u021b\3\2\2\2\b\u022f\3\2\2\2\n\u0231"+
		"\3\2\2\2\f\u023d\3\2\2\2\16\u027f\3\2\2\2\20\u0281\3\2\2\2\22\u0283\3"+
		"\2\2\2\24\u0289\3\2\2\2\26\u028f\3\2\2\2\30\u0291\3\2\2\2\32\u02a1\3\2"+
		"\2\2\34\u02a7\3\2\2\2\36\u02b9\3\2\2\2 \u02bb\3\2\2\2\"\u02c0\3\2\2\2"+
		"$\u02e5\3\2\2\2&\u02ef\3\2\2\2(\u02fa\3\2\2\2*\u030e\3\2\2\2,\u0311\3"+
		"\2\2\2.\u0313\3\2\2\2\60\u0319\3\2\2\2\62\u0322\3\2\2\2\64\u032d\3\2\2"+
		"\2\66\u033c\3\2\2\28\u0361\3\2\2\2:\u0363\3\2\2\2<\u036b\3\2\2\2>\u0376"+
		"\3\2\2\2@\u037f\3\2\2\2B\u0382\3\2\2\2D\u038f\3\2\2\2F\u0399\3\2\2\2H"+
		"\u03a6\3\2\2\2J\u03c7\3\2\2\2L\u03cc\3\2\2\2N\u03ea\3\2\2\2P\u03ec\3\2"+
		"\2\2R\u03fc\3\2\2\2T\u03fe\3\2\2\2V\u0422\3\2\2\2X\u045d\3\2\2\2Z\u045f"+
		"\3\2\2\2\\\u046c\3\2\2\2^\u0473\3\2\2\2`\u0476\3\2\2\2b\u047b\3\2\2\2"+
		"d\u0489\3\2\2\2f\u049d\3\2\2\2h\u04c0\3\2\2\2j\u04d4\3\2\2\2l\u04da\3"+
		"\2\2\2n\u04dc\3\2\2\2p\u0500\3\2\2\2r\u0506\3\2\2\2t\u0523\3\2\2\2v\u0525"+
		"\3\2\2\2x\u052a\3\2\2\2z\u052c\3\2\2\2|\u0571\3\2\2\2~\u05a1\3\2\2\2\u0080"+
		"\u05a3\3\2\2\2\u0082\u05b9\3\2\2\2\u0084\u05c7\3\2\2\2\u0086\u05c9\3\2"+
		"\2\2\u0088\u05db\3\2\2\2\u008a\u05e4\3\2\2\2\u008c\u05f4\3\2\2\2\u008e"+
		"\u0600\3\2\2\2\u0090\u060c\3\2\2\2\u0092\u0623\3\2\2\2\u0094\u062c\3\2"+
		"\2\2\u0096\u0639\3\2\2\2\u0098\u0646\3\2\2\2\u009a\u064f\3\2\2\2\u009c"+
		"\u067e\3\2\2\2\u009e\u06aa\3\2\2\2\u00a0\u06ad\3\2\2\2\u00a2\u06bc\3\2"+
		"\2\2\u00a4\u06da\3\2\2\2\u00a6\u06dc\3\2\2\2\u00a8\u06df\3\2\2\2\u00aa"+
		"\u06fc\3\2\2\2\u00ac\u06fe\3\2\2\2\u00ae\u070e\3\2\2\2\u00b0\u0715\3\2"+
		"\2\2\u00b2\u071b\3\2\2\2\u00b4\u0720\3\2\2\2\u00b6\u0723\3\2\2\2\u00b8"+
		"\u0728\3\2\2\2\u00ba\u0733\3\2\2\2\u00bc\u0737\3\2\2\2\u00be\u0745\3\2"+
		"\2\2\u00c0\u0747\3\2\2\2\u00c2\u074e\3\2\2\2\u00c4\u075c\3\2\2\2\u00c6"+
		"\u0761\3\2\2\2\u00c8\u076c\3\2\2\2\u00ca\u0775\3\2\2\2\u00cc\u0780\3\2"+
		"\2\2\u00ce\u0789\3\2\2\2\u00d0\u0791\3\2\2\2\u00d2\u0797\3\2\2\2\u00d4"+
		"\u0799\3\2\2\2\u00d6\u079f\3\2\2\2\u00d8\u07a3\3\2\2\2\u00da\u07b0\3\2"+
		"\2\2\u00dc\u07b5\3\2\2\2\u00de\u07b9\3\2\2\2\u00e0\u07c4\3\2\2\2\u00e2"+
		"\u07cd\3\2\2\2\u00e4\u07e1\3\2\2\2\u00e6\u07e4\3\2\2\2\u00e8\u07eb\3\2"+
		"\2\2\u00ea\u07f7\3\2\2\2\u00ec\u07fa\3\2\2\2\u00ee\u0808\3\2\2\2\u00f0"+
		"\u080e\3\2\2\2\u00f2\u0821\3\2\2\2\u00f4\u0836\3\2\2\2\u00f6\u083a\3\2"+
		"\2\2\u00f8\u0844\3\2\2\2\u00fa\u0846\3\2\2\2\u00fc\u0848\3\2\2\2\u00fe"+
		"\u084c\3\2\2\2\u0100\u085f\3\2\2\2\u0102\u0863\3\2\2\2\u0104\u0865\3\2"+
		"\2\2\u0106\u0882\3\2\2\2\u0108\u0885\3\2\2\2\u010a\u088b\3\2\2\2\u010c"+
		"\u088d\3\2\2\2\u010e\u089b\3\2\2\2\u0110\u089f\3\2\2\2\u0112\u08a6\3\2"+
		"\2\2\u0114\u08ad\3\2\2\2\u0116\u08b4\3\2\2\2\u0118\u08b7\3\2\2\2\u011a"+
		"\u08c3\3\2\2\2\u011c\u08c6\3\2\2\2\u011e\u08d7\3\2\2\2\u0120\u08dd\3\2"+
		"\2\2\u0122\u08e0\3\2\2\2\u0124\u08fe\3\2\2\2\u0126\u0906\3\2\2\2\u0128"+
		"\u090b\3\2\2\2\u012a\u091a\3\2\2\2\u012c\u0932\3\2\2\2\u012e\u0934\3\2"+
		"\2\2\u0130\u093e\3\2\2\2\u0132\u0942\3\2\2\2\u0134\u094b\3\2\2\2\u0136"+
		"\u0954\3\2\2\2\u0138\u095f\3\2\2\2\u013a\u096d\3\2\2\2\u013c\u097b\3\2"+
		"\2\2\u013e\u097d\3\2\2\2\u0140\u099b\3\2\2\2\u0142\u09a4\3\2\2\2\u0144"+
		"\u09a8\3\2\2\2\u0146\u09b5\3\2\2\2\u0148\u09c2\3\2\2\2\u014a\u09c4\3\2"+
		"\2\2\u014c\u09d1\3\2\2\2\u014e\u09e9\3\2\2\2\u0150\u09ec\3\2\2\2\u0152"+
		"\u0a02\3\2\2\2\u0154\u0a06\3\2\2\2\u0156\u0a0c\3\2\2\2\u0158\u0a1d\3\2"+
		"\2\2\u015a\u0a20\3\2\2\2\u015c\u0a31\3\2\2\2\u015e\u0a33\3\2\2\2\u0160"+
		"\u0a37\3\2\2\2\u0162\u0a4b\3\2\2\2\u0164\u0a4d\3\2\2\2\u0166\u0a61\3\2"+
		"\2\2\u0168\u0a63\3\2\2\2\u016a\u0a7e\3\2\2\2\u016c\u0a80\3\2\2\2\u016e"+
		"\u0a92\3\2\2\2\u0170\u0aa6\3\2\2\2\u0172\u0ab8\3\2\2\2\u0174\u0abd\3\2"+
		"\2\2\u0176\u0ac5\3\2\2\2\u0178\u0acd\3\2\2\2\u017a\u0ad7\3\2\2\2\u017c"+
		"\u0ade\3\2\2\2\u017e\u0ae1\3\2\2\2\u0180\u0aee\3\2\2\2\u0182\u0af1\3\2"+
		"\2\2\u0184\u0b0b\3\2\2\2\u0186\u0b0d\3\2\2\2\u0188\u0b10\3\2\2\2\u018a"+
		"\u0b13\3\2\2\2\u018c\u0b24\3\2\2\2\u018e\u0b33\3\2\2\2\u0190\u0b35\3\2"+
		"\2\2\u0192\u0b3f\3\2\2\2\u0194\u0b4f\3\2\2\2\u0196\u0b57\3\2\2\2\u0198"+
		"\u0b5a\3\2\2\2\u019a\u0b6b\3\2\2\2\u019c\u0b80\3\2\2\2\u019e\u0b96\3\2"+
		"\2\2\u01a0\u0b98\3\2\2\2\u01a2\u0ba4\3\2\2\2\u01a4\u0baa\3\2\2\2\u01a6"+
		"\u0bbd\3\2\2\2\u01a8\u0bcb\3\2\2\2\u01aa\u0be4\3\2\2\2\u01ac\u0be6\3\2"+
		"\2\2\u01ae\u0bf9\3\2\2\2\u01b0\u0c0b\3\2\2\2\u01b2\u0c0f\3\2\2\2\u01b4"+
		"\u0c1d\3\2\2\2\u01b6\u0c38\3\2\2\2\u01b8\u0c54\3\2\2\2\u01ba\u0c56\3\2"+
		"\2\2\u01bc\u0c5a\3\2\2\2\u01be\u0c5c\3\2\2\2\u01c0\u0c71\3\2\2\2\u01c2"+
		"\u0c75\3\2\2\2\u01c4\u0c77\3\2\2\2\u01c6\u0c88\3\2\2\2\u01c8\u0c98\3\2"+
		"\2\2\u01ca\u0ca1\3\2\2\2\u01cc\u0d54\3\2\2\2\u01ce\u0d56\3\2\2\2\u01d0"+
		"\u0d58\3\2\2\2\u01d2\u0d67\3\2\2\2\u01d4\u0d77\3\2\2\2\u01d6\u0d79\3\2"+
		"\2\2\u01d8\u0e4b\3\2\2\2\u01da\u0e4d\3\2\2\2\u01dc\u0e56\3\2\2\2\u01de"+
		"\u0e61\3\2\2\2\u01e0\u0e65\3\2\2\2\u01e2\u0e6a\3\2\2\2\u01e4\u0e6e\3\2"+
		"\2\2\u01e6\u0e76\3\2\2\2\u01e8\u0e82\3\2\2\2\u01ea\u0e86\3\2\2\2\u01ec"+
		"\u0e88\3\2\2\2\u01ee\u0e9b\3\2\2\2\u01f0\u0ea2\3\2\2\2\u01f2\u0ea7\3\2"+
		"\2\2\u01f4\u0eaa\3\2\2\2\u01f6\u0ebb\3\2\2\2\u01f8\u0ebd\3\2\2\2\u01fa"+
		"\u0ec0\3\2\2\2\u01fc\u0ec4\3\2\2\2\u01fe\u0eca\3\2\2\2\u0200\u0ed4\3\2"+
		"\2\2\u0202\u0ed7\3\2\2\2\u0204\u0edc\3\2\2\2\u0206\u0ee0\3\2\2\2\u0208"+
		"\u0ee2\3\2\2\2\u020a\u0ee4\3\2\2\2\u020c\u020d\5\4\3\2\u020d\u020e\7\2"+
		"\2\3\u020e\3\3\2\2\2\u020f\u0212\5\6\4\2\u0210\u0212\5\16\b\2\u0211\u020f"+
		"\3\2\2\2\u0211\u0210\3\2\2\2\u0212\u0214\3\2\2\2\u0213\u0215\7~\2\2\u0214"+
		"\u0213\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0211\3\2"+
		"\2\2\u0217\u0218\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219"+
		"\5\3\2\2\2\u021a\u021c\5\62\32\2\u021b\u021a\3\2\2\2\u021b\u021c\3\2\2"+
		"\2\u021c\u021d\3\2\2\2\u021d\u021e\7\25\2\2\u021e\u0220\5\4\3\2\u021f"+
		"\u0221\5\22\n\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0222\3"+
		"\2\2\2\u0222\u0223\5\n\6\2\u0223\7\3\2\2\2\u0224\u0225\7\25\2\2\u0225"+
		"\u0227\5\4\3\2\u0226\u0228\5\22\n\2\u0227\u0226\3\2\2\2\u0227\u0228\3"+
		"\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\5\n\6\2\u022a\u0230\3\2\2\2\u022b"+
		"\u022d\5\16\b\2\u022c\u022e\7\u017f\2\2\u022d\u022c\3\2\2\2\u022d\u022e"+
		"\3\2\2\2\u022e\u0230\3\2\2\2\u022f\u0224\3\2\2\2\u022f\u022b\3\2\2\2\u0230"+
		"\t\3\2\2\2\u0231\u0232\6\6\2\2\u0232\u0233\7d\2\2\u0233\13\3\2\2\2\u0234"+
		"\u023e\5\6\4\2\u0235\u0237\5\16\b\2\u0236\u0235\3\2\2\2\u0237\u0238\3"+
		"\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b\3\2\2\2\u023a"+
		"\u023c\7~\2\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023e\3\2"+
		"\2\2\u023d\u0234\3\2\2\2\u023d\u0236\3\2\2\2\u023e\r\3\2\2\2\u023f\u0280"+
		"\5\32\16\2\u0240\u0280\5&\24\2\u0241\u0280\5v<\2\u0242\u0280\5(\25\2\u0243"+
		"\u0280\5*\26\2\u0244\u0280\5,\27\2\u0245\u0280\5.\30\2\u0246\u0280\5\u00e6"+
		"t\2\u0247\u0280\5\u00eav\2\u0248\u0280\5\u00ecw\2\u0249\u0280\5\u00f0"+
		"y\2\u024a\u0280\5\u00f2z\2\u024b\u0280\5\u00fc\177\2\u024c\u0280\5\u0086"+
		"D\2\u024d\u0280\5\u008aF\2\u024e\u0280\5\u00fe\u0080\2\u024f\u0280\5H"+
		"%\2\u0250\u0280\5\u008eH\2\u0251\u0280\5\u0094K\2\u0252\u0280\5\u009a"+
		"N\2\u0253\u0280\5F$\2\u0254\u0280\5P)\2\u0255\u0280\5\60\31\2\u0256\u0280"+
		"\5\u01a0\u00d1\2\u0257\u0280\5\u01a4\u00d3\2\u0258\u0280\5\u00a4S\2\u0259"+
		"\u0280\5\u00a6T\2\u025a\u0280\5\u00a8U\2\u025b\u0280\5\u00ceh\2\u025c"+
		"\u0280\5\u00e2r\2\u025d\u0280\5\u0128\u0095\2\u025e\u0280\5\u012a\u0096"+
		"\2\u025f\u0280\5\u00aaV\2\u0260\u0280\5\u00b6\\\2\u0261\u0280\5\u00bc"+
		"_\2\u0262\u0280\5\u00b8]\2\u0263\u0280\5\u00ccg\2\u0264\u0280\5\u00d0"+
		"i\2\u0265\u0280\5\u00d8m\2\u0266\u0280\5\u00dco\2\u0267\u0280\5\u00de"+
		"p\2\u0268\u0280\5\u0198\u00cd\2\u0269\u0280\5\u00e0q\2\u026a\u0280\5\u0106"+
		"\u0084\2\u026b\u0280\5\u0108\u0085\2\u026c\u0280\5\u010a\u0086\2\u026d"+
		"\u0280\5\u010c\u0087\2\u026e\u0280\5\u010e\u0088\2\u026f\u0280\5\u0110"+
		"\u0089\2\u0270\u0280\5\u0130\u0099\2\u0271\u0280\5\u011a\u008e\2\u0272"+
		"\u0280\5\u011c\u008f\2\u0273\u0280\5\u0190\u00c9\2\u0274\u0280\5\u0120"+
		"\u0091\2\u0275\u0280\5\u011e\u0090\2\u0276\u0280\5\u0122\u0092\2\u0277"+
		"\u0280\5\u0124\u0093\2\u0278\u0280\5\u0126\u0094\2\u0279\u0280\5\u012c"+
		"\u0097\2\u027a\u0280\5\u01ec\u00f7\2\u027b\u0280\5\u01f0\u00f9\2\u027c"+
		"\u0280\5\26\f\2\u027d\u0280\5\30\r\2\u027e\u0280\5\20\t\2\u027f\u023f"+
		"\3\2\2\2\u027f\u0240\3\2\2\2\u027f\u0241\3\2\2\2\u027f\u0242\3\2\2\2\u027f"+
		"\u0243\3\2\2\2\u027f\u0244\3\2\2\2\u027f\u0245\3\2\2\2\u027f\u0246\3\2"+
		"\2\2\u027f\u0247\3\2\2\2\u027f\u0248\3\2\2\2\u027f\u0249\3\2\2\2\u027f"+
		"\u024a\3\2\2\2\u027f\u024b\3\2\2\2\u027f\u024c\3\2\2\2\u027f\u024d\3\2"+
		"\2\2\u027f\u024e\3\2\2\2\u027f\u024f\3\2\2\2\u027f\u0250\3\2\2\2\u027f"+
		"\u0251\3\2\2\2\u027f\u0252\3\2\2\2\u027f\u0253\3\2\2\2\u027f\u0254\3\2"+
		"\2\2\u027f\u0255\3\2\2\2\u027f\u0256\3\2\2\2\u027f\u0257\3\2\2\2\u027f"+
		"\u0258\3\2\2\2\u027f\u0259\3\2\2\2\u027f\u025a\3\2\2\2\u027f\u025b\3\2"+
		"\2\2\u027f\u025c\3\2\2\2\u027f\u025d\3\2\2\2\u027f\u025e\3\2\2\2\u027f"+
		"\u025f\3\2\2\2\u027f\u0260\3\2\2\2\u027f\u0261\3\2\2\2\u027f\u0262\3\2"+
		"\2\2\u027f\u0263\3\2\2\2\u027f\u0264\3\2\2\2\u027f\u0265\3\2\2\2\u027f"+
		"\u0266\3\2\2\2\u027f\u0267\3\2\2\2\u027f\u0268\3\2\2\2\u027f\u0269\3\2"+
		"\2\2\u027f\u026a\3\2\2\2\u027f\u026b\3\2\2\2\u027f\u026c\3\2\2\2\u027f"+
		"\u026d\3\2\2\2\u027f\u026e\3\2\2\2\u027f\u026f\3\2\2\2\u027f\u0270\3\2"+
		"\2\2\u027f\u0271\3\2\2\2\u027f\u0272\3\2\2\2\u027f\u0273\3\2\2\2\u027f"+
		"\u0274\3\2\2\2\u027f\u0275\3\2\2\2\u027f\u0276\3\2\2\2\u027f\u0277\3\2"+
		"\2\2\u027f\u0278\3\2\2\2\u027f\u0279\3\2\2\2\u027f\u027a\3\2\2\2\u027f"+
		"\u027b\3\2\2\2\u027f\u027c\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u027e\3\2"+
		"\2\2\u0280\17\3\2\2\2\u0281\u0282\t\2\2\2\u0282\21\3\2\2\2\u0283\u0285"+
		"\7j\2\2\u0284\u0286\5\24\13\2\u0285\u0284\3\2\2\2\u0286\u0287\3\2\2\2"+
		"\u0287\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288\23\3\2\2\2\u0289\u028a"+
		"\7\u013d\2\2\u028a\u028b\7\u0182\2\2\u028b\u028c\7\u0126\2\2\u028c\u028d"+
		"\5\4\3\2\u028d\u028e\n\3\2\2\u028e\25\3\2\2\2\u028f\u0290\7\u00c8\2\2"+
		"\u0290\27\3\2\2\2\u0291\u0292\6\r\3\2\u0292\u0293\5\u01b6\u00dc\2\u0293"+
		"\31\3\2\2\2\u0294\u0295\7\u0106\2\2\u0295\u02a2\5\u0112\u008a\2\u0296"+
		"\u0298\7\u0106\2\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299"+
		"\3\2\2\2\u0299\u029e\5\34\17\2\u029a\u029b\7\u016b\2\2\u029b\u029d\5\34"+
		"\17\2\u029c\u029a\3\2\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029e"+
		"\u029f\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u0294\3\2"+
		"\2\2\u02a1\u0297\3\2\2\2\u02a2\33\3\2\2\2\u02a3\u02a8\5\36\20\2\u02a4"+
		"\u02a8\5\"\22\2\u02a5\u02a8\5$\23\2\u02a6\u02a8\5 \21\2\u02a7\u02a3\3"+
		"\2\2\2\u02a7\u02a4\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a6\3\2\2\2\u02a8"+
		"\35\3\2\2\2\u02a9\u02ab\5\u01fc\u00ff\2\u02aa\u02ac\7\u016a\2\2\u02ab"+
		"\u02aa\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\7\u0170"+
		"\2\2\u02ae\u02af\5\u01b6\u00dc\2\u02af\u02ba\3\2\2\2\u02b0\u02b1\7\u017a"+
		"\2\2\u02b1\u02b2\5\u01fc\u00ff\2\u02b2\u02b4\7\u017c\2\2\u02b3\u02b5\7"+
		"\u016a\2\2\u02b4\u02b3\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6\3\2\2\2"+
		"\u02b6\u02b7\7\u0170\2\2\u02b7\u02b8\5\u01b6\u00dc\2\u02b8\u02ba\3\2\2"+
		"\2\u02b9\u02a9\3\2\2\2\u02b9\u02b0\3\2\2\2\u02ba\37\3\2\2\2\u02bb\u02bc"+
		"\5\u01da\u00ee\2\u02bc\u02bd\7\u016a\2\2\u02bd\u02be\7\u0170\2\2\u02be"+
		"\u02bf\5\u01b6\u00dc\2\u02bf!\3\2\2\2\u02c0\u02c1\7\u017a\2\2\u02c1\u02c6"+
		"\5\u01fc\u00ff\2\u02c2\u02c3\7\u016b\2\2\u02c3\u02c5\5\u01fc\u00ff\2\u02c4"+
		"\u02c2\3\2\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2"+
		"\2\2\u02c7\u02c9\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02cb\7\u017c\2\2\u02ca"+
		"\u02cc\7\u016a\2\2\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd"+
		"\3\2\2\2\u02cd\u02ce\7\u0170\2\2\u02ce\u02cf\7\u017a\2\2\u02cf\u02d4\5"+
		"\u01b6\u00dc\2\u02d0\u02d1\7\u016b\2\2\u02d1\u02d3\5\u01b6\u00dc\2\u02d2"+
		"\u02d0\3\2\2\2\u02d3\u02d6\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d5\3\2"+
		"\2\2\u02d5\u02d7\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d7\u02d8\7\u017c\2\2\u02d8"+
		"#\3\2\2\2\u02d9\u02e6\5\u01fc\u00ff\2\u02da\u02db\7\u017a\2\2\u02db\u02e0"+
		"\5\u01fc\u00ff\2\u02dc\u02dd\7\u016b\2\2\u02dd\u02df\5\u01fc\u00ff\2\u02de"+
		"\u02dc\3\2\2\2\u02df\u02e2\3\2\2\2\u02e0\u02de\3\2\2\2\u02e0\u02e1\3\2"+
		"\2\2\u02e1\u02e3\3\2\2\2\u02e2\u02e0\3\2\2\2\u02e3\u02e4\7\u017c\2\2\u02e4"+
		"\u02e6\3\2\2\2\u02e5\u02d9\3\2\2\2\u02e5\u02da\3\2\2\2\u02e6\u02e8\3\2"+
		"\2\2\u02e7\u02e9\7\u016a\2\2\u02e8\u02e7\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9"+
		"\u02ea\3\2\2\2\u02ea\u02eb\7\u0170\2\2\u02eb\u02ec\7\u017a\2\2\u02ec\u02ed"+
		"\5\u0130\u0099\2\u02ed\u02ee\7\u017c\2\2\u02ee%\3\2\2\2\u02ef\u02f0\7"+
		"\t\2\2\u02f0\u02f1\5\u01fc\u00ff\2\u02f1\u02f2\7C\2\2\u02f2\u02f6\7u\2"+
		"\2\u02f3\u02f4\7\u00ee\2\2\u02f4\u02f7\7\u0106\2\2\u02f5\u02f7\7\u00e2"+
		"\2\2\u02f6\u02f3\3\2\2\2\u02f6\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8"+
		"\u02f9\5\u01fc\u00ff\2\u02f9\'\3\2\2\2\u02fa\u02fd\7\20\2\2\u02fb\u02fc"+
		"\7\u00ee\2\2\u02fc\u02fe\7\u0106\2\2\u02fd\u02fb\3\2\2\2\u02fd\u02fe\3"+
		"\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0300\t\4\2\2\u0300\u0301\7\u017a\2\2"+
		"\u0301\u0306\5\u01fc\u00ff\2\u0302\u0303\7\u016b\2\2\u0303\u0305\5\u01fc"+
		"\u00ff\2\u0304\u0302\3\2\2\2\u0305\u0308\3\2\2\2\u0306\u0304\3\2\2\2\u0306"+
		"\u0307\3\2\2\2\u0307\u0309\3\2\2\2\u0308\u0306\3\2\2\2\u0309\u030a\7\u017c"+
		"\2\2\u030a\u030b\7\u0140\2\2\u030b\u030c\7\u00e2\2\2\u030c\u030d\5\u01fc"+
		"\u00ff\2\u030d)\3\2\2\2\u030e\u030f\7\25\2\2\u030f\u0310\7\u012c\2\2\u0310"+
		"+\3\2\2\2\u0311\u0312\7\35\2\2\u0312-\3\2\2\2\u0313\u0317\7!\2\2\u0314"+
		"\u0318\5\u01de\u00f0\2\u0315\u0318\5\u01da\u00ee\2\u0316\u0318\5\u01fc"+
		"\u00ff\2\u0317\u0314\3\2\2\2\u0317\u0315\3\2\2\2\u0317\u0316\3\2\2\2\u0318"+
		"/\3\2\2\2\u0319\u031a\7L\2\2\u031a\u031f\5\66\34\2\u031b\u031c\7\u016b"+
		"\2\2\u031c\u031e\5\66\34\2\u031d\u031b\3\2\2\2\u031e\u0321\3\2\2\2\u031f"+
		"\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320\61\3\2\2\2\u0321\u031f\3\2\2"+
		"\2\u0322\u0323\7L\2\2\u0323\u0324\5\66\34\2\u0324\u032a\7\u017f\2\2\u0325"+
		"\u0326\5\66\34\2\u0326\u0327\7\u017f\2\2\u0327\u0329\3\2\2\2\u0328\u0325"+
		"\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2\2\2\u032b"+
		"\63\3\2\2\2\u032c\u032a\3\2\2\2\u032d\u032e\5\66\34\2\u032e\u0334\7\u017f"+
		"\2\2\u032f\u0330\5\66\34\2\u0330\u0331\7\u017f\2\2\u0331\u0333\3\2\2\2"+
		"\u0332\u032f\3\2\2\2\u0333\u0336\3\2\2\2\u0334\u0332\3\2\2\2\u0334\u0335"+
		"\3\2\2\2\u0335\65\3\2\2\2\u0336\u0334\3\2\2\2\u0337\u033d\5<\37\2\u0338"+
		"\u033d\5:\36\2\u0339\u033d\5B\"\2\u033a\u033d\58\35\2\u033b\u033d\5D#"+
		"\2\u033c\u0337\3\2\2\2\u033c\u0338\3\2\2\2\u033c\u0339\3\2\2\2\u033c\u033a"+
		"\3\2\2\2\u033c\u033b\3\2\2\2\u033d\67\3\2\2\2\u033e\u0343\5\u01fc\u00ff"+
		"\2\u033f\u0340\7\u016b\2\2\u0340\u0342\5\u01fc\u00ff\2\u0341\u033f\3\2"+
		"\2\2\u0342\u0345\3\2\2\2\u0343\u0341\3\2\2\2\u0343\u0344\3\2\2\2\u0344"+
		"\u0347\3\2\2\2\u0345\u0343\3\2\2\2\u0346\u0348\7\16\2\2\u0347\u0346\3"+
		"\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034b\5~@\2\u034a"+
		"\u034c\5\u0080A\2\u034b\u034a\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u0350"+
		"\3\2\2\2\u034d\u034f\5\u0082B\2\u034e\u034d\3\2\2\2\u034f\u0352\3\2\2"+
		"\2\u0350\u034e\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0354\3\2\2\2\u0352\u0350"+
		"\3\2\2\2\u0353\u0355\5\u0084C\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2"+
		"\2\u0355\u0362\3\2\2\2\u0356\u0357\5\u01fc\u00ff\2\u0357\u0359\7\62\2"+
		"\2\u0358\u035a\7\16\2\2\u0359\u0358\3\2\2\2\u0359\u035a\3\2\2\2\u035a"+
		"\u035b\3\2\2\2\u035b\u035d\5~@\2\u035c\u035e\5\u0080A\2\u035d\u035c\3"+
		"\2\2\2\u035d\u035e\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0360\5\u0084C\2"+
		"\u0360\u0362\3\2\2\2\u0361\u033e\3\2\2\2\u0361\u0356\3\2\2\2\u03629\3"+
		"\2\2\2\u0363\u0364\5\u01fc\u00ff\2\u0364\u0365\7\66\2\2\u0365;\3\2\2\2"+
		"\u0366\u0367\7C\2\2\u0367\u036c\5\u01fc\u00ff\2\u0368\u0369\5\u01fc\u00ff"+
		"\2\u0369\u036a\7C\2\2\u036a\u036c\3\2\2\2\u036b\u0366\3\2\2\2\u036b\u0368"+
		"\3\2\2\2\u036c\u036f\3\2\2\2\u036d\u0370\5> \2\u036e\u0370\5@!\2\u036f"+
		"\u036d\3\2\2\2\u036f\u036e\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0371\3\2"+
		"\2\2\u0371\u0374\t\5\2\2\u0372\u0375\5\u0130\u0099\2\u0373\u0375\5\u01b6"+
		"\u00dc\2\u0374\u0372\3\2\2\2\u0374\u0373\3\2\2\2\u0375=\3\2\2\2\u0376"+
		"\u0377\7\u0140\2\2\u0377\u0379\7\u00f0\2\2\u0378\u037a\7\u00cf\2\2\u0379"+
		"\u0378\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037d\3\2\2\2\u037b\u037c\7\u012a"+
		"\2\2\u037c\u037e\t\6\2\2\u037d\u037b\3\2\2\2\u037d\u037e\3\2\2\2\u037e"+
		"?\3\2\2\2\u037f\u0380\7\u0141\2\2\u0380\u0381\7\u00f0\2\2\u0381A\3\2\2"+
		"\2\u0382\u0383\t\7\2\2\u0383\u0384\7\u0082\2\2\u0384\u038a\7u\2\2\u0385"+
		"\u038b\7\u0112\2\2\u0386\u038b\7\u0115\2\2\u0387\u0388\7\u00c6\2\2\u0388"+
		"\u038b\7x\2\2\u0389\u038b\5\u01fc\u00ff\2\u038a\u0385\3\2\2\2\u038a\u0386"+
		"\3\2\2\2\u038a\u0387\3\2\2\2\u038a\u0389\3\2\2\2\u038b\u038c\3\2\2\2\u038c"+
		"\u038d\5\b\5\2\u038dC\3\2\2\2\u038e\u0390\7}\2\2\u038f\u038e\3\2\2\2\u038f"+
		"\u0390\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0392\7\u0123\2\2\u0392\u0393"+
		"\7\u0121\2\2\u0393\u0395\5\u01fe\u0100\2\u0394\u0396\5\\/\2\u0395\u0394"+
		"\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0398\5J&\2\u0398"+
		"E\3\2\2\2\u0399\u039a\7<\2\2\u039a\u039e\7\u0121\2\2\u039b\u039c\7\u0089"+
		"\2\2\u039c\u039d\7\u00c6\2\2\u039d\u039f\7l\2\2\u039e\u039b\3\2\2\2\u039e"+
		"\u039f\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a2\5\u0172\u00ba\2\u03a1\u03a3"+
		"\5\\/\2\u03a2\u03a1\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4"+
		"\u03a5\5J&\2\u03a5G\3\2\2\2\u03a6\u03ad\7<\2\2\u03a7\u03a8\7\u00ab\2\2"+
		"\u03a8\u03ae\7\u0123\2\2\u03a9\u03ab\t\b\2\2\u03aa\u03a9\3\2\2\2\u03aa"+
		"\u03ab\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ae\7\u013c\2\2\u03ad\u03a7"+
		"\3\2\2\2\u03ad\u03aa\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\7\u0121\2"+
		"\2\u03b0\u03b2\5\u01fe\u0100\2\u03b1\u03b3\5\\/\2\u03b2\u03b1\3\2\2\2"+
		"\u03b2\u03b3\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b5\5J&\2\u03b5I\3\2"+
		"\2\2\u03b6\u03b8\7\16\2\2\u03b7\u03b6\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8"+
		"\u03b9\3\2\2\2\u03b9\u03ba\7\u017a\2\2\u03ba\u03bb\5\u0130\u0099\2\u03bb"+
		"\u03bc\7\u017c\2\2\u03bc\u03c8\3\2\2\2\u03bd\u03bf\7\16\2\2\u03be\u03bd"+
		"\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c8\5\u0130\u0099"+
		"\2\u03c1\u03c2\7\u017a\2\2\u03c2\u03c3\5L\'\2\u03c3\u03c4\7\u017c\2\2"+
		"\u03c4\u03c8\3\2\2\2\u03c5\u03c6\7\u00a8\2\2\u03c6\u03c8\5\u0172\u00ba"+
		"\2\u03c7\u03b7\3\2\2\2\u03c7\u03be\3\2\2\2\u03c7\u03c1\3\2\2\2\u03c7\u03c5"+
		"\3\2\2\2\u03c8\u03ca\3\2\2\2\u03c9\u03cb\5b\62\2\u03ca\u03c9\3\2\2\2\u03ca"+
		"\u03cb\3\2\2\2\u03cbK\3\2\2\2\u03cc\u03d1\5N(\2\u03cd\u03ce\7\u016b\2"+
		"\2\u03ce\u03d0\5N(\2\u03cf\u03cd\3\2\2\2\u03d0\u03d3\3\2\2\2\u03d1\u03cf"+
		"\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2M\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d4"+
		"\u03d5\5\u0178\u00bd\2\u03d5\u03d7\5~@\2\u03d6\u03d8\5\u0080A\2\u03d7"+
		"\u03d6\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03dc\3\2\2\2\u03d9\u03db\5\u0082"+
		"B\2\u03da\u03d9\3\2\2\2\u03db\u03de\3\2\2\2\u03dc\u03da\3\2\2\2\u03dc"+
		"\u03dd\3\2\2\2\u03dd\u03e2\3\2\2\2\u03de\u03dc\3\2\2\2\u03df\u03e1\5V"+
		",\2\u03e0\u03df\3\2\2\2\u03e1\u03e4\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e2"+
		"\u03e3\3\2\2\2\u03e3\u03eb\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e5\u03e6\7\67"+
		"\2\2\u03e6\u03e8\5\u01fe\u0100\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2\2"+
		"\2\u03e8\u03e9\3\2\2\2\u03e9\u03eb\5X-\2\u03ea\u03d4\3\2\2\2\u03ea\u03e7"+
		"\3\2\2\2\u03ebO\3\2\2\2\u03ec\u03ed\7\u012f\2\2\u03ed\u03ee\5\u01fc\u00ff"+
		"\2\u03ee\u03ef\7\u009c\2\2\u03ef\u03f0\7\u0121\2\2\u03f0\u03f1\7\u00cd"+
		"\2\2\u03f1\u03f4\5R*\2\u03f2\u03f3\7\u00c6\2\2\u03f3\u03f5\7\u00c8\2\2"+
		"\u03f4\u03f2\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f7"+
		"\7\u008e\2\2\u03f7\u03f8\7\37\2\2\u03f8\u03f9\5~@\2\u03f9Q\3\2\2\2\u03fa"+
		"\u03fd\5T+\2\u03fb\u03fd\5~@\2\u03fc\u03fa\3\2\2\2\u03fc\u03fb\3\2\2\2"+
		"\u03fdS\3\2\2\2\u03fe\u03ff\5\u01fe\u0100\2\u03ff\u0400\7\u0181\2\2\u0400"+
		"\u0401\t\t\2\2\u0401U\3\2\2\2\u0402\u0423\5\u0084C\2\u0403\u0405\7\u00c6"+
		"\2\2\u0404\u0403\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0406\3\2\2\2\u0406"+
		"\u0423\7\u00c8\2\2\u0407\u0408\7\u00df\2\2\u0408\u0423\7\u00a3\2\2\u0409"+
		"\u0423\7\u0131\2\2\u040a\u040b\7\u00e9\2\2\u040b\u040c\5\u0172\u00ba\2"+
		"\u040c\u040d\7\u017a\2\2\u040d\u040e\5\u01fe\u0100\2\u040e\u0412\7\u017c"+
		"\2\2\u040f\u0411\5Z.\2\u0410\u040f\3\2\2\2\u0411\u0414\3\2\2\2\u0412\u0410"+
		"\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0423\3\2\2\2\u0414\u0412\3\2\2\2\u0415"+
		"\u0416\7\u0088\2\2\u0416\u0417\7\u017a\2\2\u0417\u041c\7\u0186\2\2\u0418"+
		"\u0419\7\u016b\2\2\u0419\u041b\7\u0186\2\2\u041a\u0418\3\2\2\2\u041b\u041e"+
		"\3\2\2\2\u041c\u041a\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u041f\3\2\2\2\u041e"+
		"\u041c\3\2\2\2\u041f\u0423\7\u017c\2\2\u0420\u0423\7\22\2\2\u0421\u0423"+
		"\7c\2\2\u0422\u0402\3\2\2\2\u0422\u0404\3\2\2\2\u0422\u0407\3\2\2\2\u0422"+
		"\u0409\3\2\2\2\u0422\u040a\3\2\2\2\u0422\u0415\3\2\2\2\u0422\u0420\3\2"+
		"\2\2\u0422\u0421\3\2\2\2\u0423W\3\2\2\2\u0424\u0425\7\u00df\2\2\u0425"+
		"\u0427\7\u00a3\2\2\u0426\u0428\7,\2\2\u0427\u0426\3\2\2\2\u0427\u0428"+
		"\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042a\7\u017a\2\2\u042a\u042c\5\u01fe"+
		"\u0100\2\u042b\u042d\t\n\2\2\u042c\u042b\3\2\2\2\u042c\u042d\3\2\2\2\u042d"+
		"\u0435\3\2\2\2\u042e\u042f\7\u016b\2\2\u042f\u0431\5\u01fe\u0100\2\u0430"+
		"\u0432\t\n\2\2\u0431\u0430\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0434\3\2"+
		"\2\2\u0433\u042e\3\2\2\2\u0434\u0437\3\2\2\2\u0435\u0433\3\2\2\2\u0435"+
		"\u0436\3\2\2\2\u0436\u0438\3\2\2\2\u0437\u0435\3\2\2\2\u0438\u043a\7\u017c"+
		"\2\2\u0439\u043b\7c\2\2\u043a\u0439\3\2\2\2\u043a\u043b\3\2\2\2\u043b"+
		"\u043d\3\2\2\2\u043c\u043e\5\u0102\u0082\2\u043d\u043c\3\2\2\2\u043d\u043e"+
		"\3\2\2\2\u043e\u045e\3\2\2\2\u043f\u0440\7v\2\2\u0440\u0441\7\u00a3\2"+
		"\2\u0441\u0442\7\u017a\2\2\u0442\u0447\5\u01fe\u0100\2\u0443\u0444\7\u016b"+
		"\2\2\u0444\u0446\5\u01fe\u0100\2\u0445\u0443\3\2\2\2\u0446\u0449\3\2\2"+
		"\2\u0447\u0445\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u044a\3\2\2\2\u0449\u0447"+
		"\3\2\2\2\u044a\u044b\7\u017c\2\2\u044b\u044c\7\u00e9\2\2\u044c\u044d\5"+
		"\u0172\u00ba\2\u044d\u044e\7\u017a\2\2\u044e\u0453\5\u01fe\u0100\2\u044f"+
		"\u0450\7\u016b\2\2\u0450\u0452\5\u01fe\u0100\2\u0451\u044f\3\2\2\2\u0452"+
		"\u0455\3\2\2\2\u0453\u0451\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0456\3\2"+
		"\2\2\u0455\u0453\3\2\2\2\u0456\u045a\7\u017c\2\2\u0457\u0459\5Z.\2\u0458"+
		"\u0457\3\2\2\2\u0459\u045c\3\2\2\2\u045a\u0458\3\2\2\2\u045a\u045b\3\2"+
		"\2\2\u045b\u045e\3\2\2\2\u045c\u045a\3\2\2\2\u045d\u0424\3\2\2\2\u045d"+
		"\u043f\3\2\2\2\u045eY\3\2\2\2\u045f\u0460\7\u00ce\2\2\u0460\u0469\t\13"+
		"\2\2\u0461\u0462\7\u00c1\2\2\u0462\u046a\7\6\2\2\u0463\u046a\7\u00ed\2"+
		"\2\u0464\u0465\7\u0106\2\2\u0465\u046a\7\u00c8\2\2\u0466\u0467\7\u0106"+
		"\2\2\u0467\u046a\7M\2\2\u0468\u046a\7#\2\2\u0469\u0461\3\2\2\2\u0469\u0463"+
		"\3\2\2\2\u0469\u0464\3\2\2\2\u0469\u0466\3\2\2\2\u0469\u0468\3\2\2\2\u046a"+
		"[\3\2\2\2\u046b\u046d\5^\60\2\u046c\u046b\3\2\2\2\u046d\u046e\3\2\2\2"+
		"\u046e\u046c\3\2\2\2\u046e\u046f\3\2\2\2\u046f]\3\2\2\2\u0470\u0471\7"+
		"\u016b\2\2\u0471\u0474\5`\61\2\u0472\u0474\5l\67\2\u0473\u0470\3\2\2\2"+
		"\u0473\u0472\3\2\2\2\u0474_\3\2\2\2\u0475\u0477\7\u00c1\2\2\u0476\u0475"+
		"\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479\t\f\2\2\u0479"+
		"a\3\2\2\2\u047a\u047c\5d\63\2\u047b\u047a\3\2\2\2\u047c\u047d\3\2\2\2"+
		"\u047d\u047b\3\2\2\2\u047d\u047e\3\2\2\2\u047ec\3\2\2\2\u047f\u0480\7"+
		"\u00ce\2\2\u0480\u0481\7\63\2\2\u0481\u0482\t\r\2\2\u0482\u048a\7\u00f8"+
		"\2\2\u0483\u048a\5f\64\2\u0484\u048a\5h\65\2\u0485\u048a\5j\66\2\u0486"+
		"\u048a\5l\67\2\u0487\u048a\5r:\2\u0488\u048a\5t;\2\u0489\u047f\3\2\2\2"+
		"\u0489\u0483\3\2\2\2\u0489\u0484\3\2\2\2\u0489\u0485\3\2\2\2\u0489\u0486"+
		"\3\2\2\2\u0489\u0487\3\2\2\2\u0489\u0488\3\2\2\2\u048ae\3\2\2\2\u048b"+
		"\u048c\7\u0103\2\2\u048c\u048d\7=\2\2\u048d\u049e\t\16\2\2\u048e\u048f"+
		"\t\17\2\2\u048f\u049e\7\u0186\2\2\u0490\u049e\7\u00c3\2\2\u0491\u049e"+
		"\t\20\2\2\u0492\u0493\7\u0119\2\2\u0493\u0496\7\u017a\2\2\u0494\u0497"+
		"\5\u01fe\u0100\2\u0495\u0497\7\u0186\2\2\u0496\u0494\3\2\2\2\u0496\u0495"+
		"\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u0496\3\2\2\2\u0498\u0499\3\2\2\2\u0499"+
		"\u049a\3\2\2\2\u049a\u049e\7\u017c\2\2\u049b\u049c\7\u0122\2\2\u049c\u049e"+
		"\5\u01fe\u0100\2\u049d\u048b\3\2\2\2\u049d\u048e\3\2\2\2\u049d\u0490\3"+
		"\2\2\2\u049d\u0491\3\2\2\2\u049d\u0492\3\2\2\2\u049d\u049b\3\2\2\2\u049e"+
		"g\3\2\2\2\u049f\u04a1\7\u008e\2\2\u04a0\u049f\3\2\2\2\u04a0\u04a1\3\2"+
		"\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a3\7\u008c\2\2\u04a3\u04c1\5\u01fe\u0100"+
		"\2\u04a4\u04a5\7\u0140\2\2\u04a5\u04c1\7\u00eb\2\2\u04a6\u04a7\7[\2\2"+
		"\u04a7\u04a8\7\37\2\2\u04a8\u04a9\7\u0083\2\2\u04a9\u04aa\7\u017a\2\2"+
		"\u04aa\u04af\5\u01fe\u0100\2\u04ab\u04ac\7\u016b\2\2\u04ac\u04ae\5\u01fe"+
		"\u0100\2\u04ad\u04ab\3\2\2\2\u04ae\u04b1\3\2\2\2\u04af\u04ad\3\2\2\2\u04af"+
		"\u04b0\3\2\2\2\u04b0\u04b2\3\2\2\2\u04b1\u04af\3\2\2\2\u04b2\u04b3\7\u017c"+
		"\2\2\u04b3\u04c1\3\2\2\2\u04b4\u04b6\7\u00c6\2\2\u04b5\u04b4\3\2\2\2\u04b5"+
		"\u04b6\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04c1\7\u00b1\2\2\u04b8\u04b9"+
		"\7\64\2\2\u04b9\u04c1\t\21\2\2\u04ba\u04bb\7Q\2\2\u04bb\u04c1\7\u00cf"+
		"\2\2\u04bc\u04bd\7\u0140\2\2\u04bd\u04be\7\u00ed\2\2\u04be\u04bf\7\u00ce"+
		"\2\2\u04bf\u04c1\7^\2\2\u04c0\u04a0\3\2\2\2\u04c0\u04a4\3\2\2\2\u04c0"+
		"\u04a6\3\2\2\2\u04c0\u04b5\3\2\2\2\u04c0\u04b8\3\2\2\2\u04c0\u04ba\3\2"+
		"\2\2\u04c0\u04bc\3\2\2\2\u04c1i\3\2\2\2\u04c2\u04c4\7\u0131\2\2\u04c3"+
		"\u04c2\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c6\7\u00df"+
		"\2\2\u04c6\u04c7\7\u008e\2\2\u04c7\u04c8\7\u017a\2\2\u04c8\u04cd\5\u01fe"+
		"\u0100\2\u04c9\u04ca\7\u016b\2\2\u04ca\u04cc\5\u01fe\u0100\2\u04cb\u04c9"+
		"\3\2\2\2\u04cc\u04cf\3\2\2\2\u04cd\u04cb\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce"+
		"\u04d0\3\2\2\2\u04cf\u04cd\3\2\2\2\u04d0\u04d1\7\u017c\2\2\u04d1\u04d5"+
		"\3\2\2\2\u04d2\u04d3\7\u0140\2\2\u04d3\u04d5\7E\2\2\u04d4\u04c3\3\2\2"+
		"\2\u04d4\u04d2\3\2\2\2\u04d5k\3\2\2\2\u04d6\u04db\5n8\2\u04d7\u04d8\7"+
		"\u011a\2\2\u04d8\u04d9\7\16\2\2\u04d9\u04db\5\u01fe\u0100\2\u04da\u04d6"+
		"\3\2\2\2\u04da\u04d7\3\2\2\2\u04dbm\3\2\2\2\u04dc\u04dd\7\u00f7\2\2\u04dd"+
		"\u04de\7w\2\2\u04de\u04e2\7S\2\2\u04df\u04e1\5p9\2\u04e0\u04df\3\2\2\2"+
		"\u04e1\u04e4\3\2\2\2\u04e2\u04e0\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3o\3"+
		"\2\2\2\u04e4\u04e2\3\2\2\2\u04e5\u04e6\7q\2\2\u04e6\u04e7\7\u0124\2\2"+
		"\u04e7\u04e8\7\37\2\2\u04e8\u04ec\5\u01b6\u00dc\2\u04e9\u04ea\7f\2\2\u04ea"+
		"\u04eb\7\37\2\2\u04eb\u04ed\5\u01b6\u00dc\2\u04ec\u04e9\3\2\2\2\u04ec"+
		"\u04ed\3\2\2\2\u04ed\u0501\3\2\2\2\u04ee\u04ef\7/\2\2\u04ef\u04f0\7\u009e"+
		"\2\2\u04f0\u04f1\7\u0124\2\2\u04f1\u04f2\7\37\2\2\u04f2\u0501\5\u01b6"+
		"\u00dc\2\u04f3\u04f4\7\u00b4\2\2\u04f4\u04f5\7\u00a4\2\2\u04f5\u04f6\7"+
		"\u0124\2\2\u04f6\u04f7\7\37\2\2\u04f7\u0501\5\u01b6\u00dc\2\u04f8\u04f9"+
		"\7\u00aa\2\2\u04f9\u04fa\7\u0124\2\2\u04fa\u04fb\7\37\2\2\u04fb\u0501"+
		"\5\u01b6\u00dc\2\u04fc\u04fd\7\u00c8\2\2\u04fd\u04fe\7O\2\2\u04fe\u04ff"+
		"\7\16\2\2\u04ff\u0501\5\u01b6\u00dc\2\u0500\u04e5\3\2\2\2\u0500\u04ee"+
		"\3\2\2\2\u0500\u04f3\3\2\2\2\u0500\u04f8\3\2\2\2\u0500\u04fc\3\2\2\2\u0501"+
		"q\3\2\2\2\u0502\u0503\7\u00ce\2\2\u0503\u0507\5\u01fe\u0100\2\u0504\u0505"+
		"\7\u0125\2\2\u0505\u0507\5\u01fe\u0100\2\u0506\u0502\3\2\2\2\u0506\u0504"+
		"\3\2\2\2\u0507s\3\2\2\2\u0508\u050a\7\22\2\2\u0509\u050b\7\u0170\2\2\u050a"+
		"\u0509\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u0524\5\u01b6"+
		"\u00dc\2\u050d\u050f\7\61\2\2\u050e\u0510\7\u0170\2\2\u050f\u050e\3\2"+
		"\2\2\u050f\u0510\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0524\5\u01b6\u00dc"+
		"\2\u0512\u0514\7M\2\2\u0513\u0512\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0518"+
		"\3\2\2\2\u0515\u0516\7(\2\2\u0516\u0519\7\u0106\2\2\u0517\u0519\7)\2\2"+
		"\u0518\u0515\3\2\2\2\u0518\u0517\3\2\2\2\u0519\u051b\3\2\2\2\u051a\u051c"+
		"\7\u0170\2\2\u051b\u051a\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051d\3\2\2"+
		"\2\u051d\u0524\5\u01b6\u00dc\2\u051e\u0520\7e\2\2\u051f\u0521\7\u0170"+
		"\2\2\u0520\u051f\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0522\3\2\2\2\u0522"+
		"\u0524\5\u01b6\u00dc\2\u0523\u0508\3\2\2\2\u0523\u050d\3\2\2\2\u0523\u0513"+
		"\3\2\2\2\u0523\u051e\3\2\2\2\u0524u\3\2\2\2\u0525\u0526\7\n\2\2\u0526"+
		"\u0527\7\u0121\2\2\u0527\u0528\5\u0172\u00ba\2\u0528\u0529\5x=\2\u0529"+
		"w\3\2\2\2\u052a\u052b\5z>\2\u052by\3\2\2\2\u052c\u052f\7\7\2\2\u052d\u052e"+
		"\7\67\2\2\u052e\u0530\5\u01fe\u0100\2\u052f\u052d\3\2\2\2\u052f\u0530"+
		"\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0532\5|?\2\u0532{\3\2\2\2\u0533\u0534"+
		"\7\u00df\2\2\u0534\u0536\7\u00a3\2\2\u0535\u0537\7,\2\2\u0536\u0535\3"+
		"\2\2\2\u0536\u0537\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u0539\7\u017a\2\2"+
		"\u0539\u053b\5\u01fe\u0100\2\u053a\u053c\t\n\2\2\u053b\u053a\3\2\2\2\u053b"+
		"\u053c\3\2\2\2\u053c\u0544\3\2\2\2\u053d\u053e\7\u016b\2\2\u053e\u0540"+
		"\5\u01fe\u0100\2\u053f\u0541\t\n\2\2\u0540\u053f\3\2\2\2\u0540\u0541\3"+
		"\2\2\2\u0541\u0543\3\2\2\2\u0542\u053d\3\2\2\2\u0543\u0546\3\2\2\2\u0544"+
		"\u0542\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0547\3\2\2\2\u0546\u0544\3\2"+
		"\2\2\u0547\u0549\7\u017c\2\2\u0548\u054a\7c\2\2\u0549\u0548\3\2\2\2\u0549"+
		"\u054a\3\2\2\2\u054a\u054c\3\2\2\2\u054b\u054d\5\u0102\u0082\2\u054c\u054b"+
		"\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u0572\3\2\2\2\u054e\u054f\7v\2\2\u054f"+
		"\u0550\7\u00a3\2\2\u0550\u0551\7\u017a\2\2\u0551\u0556\5\u01fe\u0100\2"+
		"\u0552\u0553\7\u016b\2\2\u0553\u0555\5\u01fe\u0100\2\u0554\u0552\3\2\2"+
		"\2\u0555\u0558\3\2\2\2\u0556\u0554\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0559"+
		"\3\2\2\2\u0558\u0556\3\2\2\2\u0559\u055a\7\u017c\2\2\u055a\u055b\7\u00e9"+
		"\2\2\u055b\u055c\5\u0172\u00ba\2\u055c\u055d\7\u017a\2\2\u055d\u0562\5"+
		"\u01fe\u0100\2\u055e\u055f\7\u016b\2\2\u055f\u0561\5\u01fe\u0100\2\u0560"+
		"\u055e\3\2\2\2\u0561\u0564\3\2\2\2\u0562\u0560\3\2\2\2\u0562\u0563\3\2"+
		"\2\2\u0563\u0565\3\2\2\2\u0564\u0562\3\2\2\2\u0565\u0569\7\u017c\2\2\u0566"+
		"\u0568\5Z.\2\u0567\u0566\3\2\2\2\u0568\u056b\3\2\2\2\u0569\u0567\3\2\2"+
		"\2\u0569\u056a\3\2\2\2\u056a\u0572\3\2\2\2\u056b\u0569\3\2\2\2\u056c\u056d"+
		"\7M\2\2\u056d\u056e\5\u01b6\u00dc\2\u056e\u056f\7u\2\2\u056f\u0570\5\u01fe"+
		"\u0100\2\u0570\u0572\3\2\2\2\u0571\u0533\3\2\2\2\u0571\u054e\3\2\2\2\u0571"+
		"\u056c\3\2\2\2\u0572}\3\2\2\2\u0573\u05a2\7\'\2\2\u0574\u05a2\7(\2\2\u0575"+
		"\u05a2\7\27\2\2\u0576\u05a2\7\30\2\2\u0577\u05a2\7\31\2\2\u0578\u05a2"+
		"\7\32\2\2\u0579\u05a2\7\33\2\2\u057a\u05a2\7F\2\2\u057b\u05a2\7G\2\2\u057c"+
		"\u05a2\7J\2\2\u057d\u05a2\7K\2\2\u057e\u0580\7]\2\2\u057f\u0581\7\u00dd"+
		"\2\2\u0580\u057f\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u05a2\3\2\2\2\u0582"+
		"\u05a2\7t\2\2\u0583\u05a2\7\u0093\2\2\u0584\u05a2\7\u0094\2\2\u0585\u05a2"+
		"\7\u0095\2\2\u0586\u05a2\7\u0096\2\2\u0587\u05a2\7\u0097\2\2\u0588\u05a2"+
		"\7\u00be\2\2\u0589\u05a2\7\u00c0\2\2\u058a\u05a2\7\u00ca\2\2\u058b\u05a2"+
		"\7\u00c9\2\2\u058c\u05a2\7\u00dc\2\2\u058d\u05a2\7\u00e8\2\2\u058e\u058f"+
		"\7\u00ef\2\2\u058f\u05a2\7\u013b\2\2\u0590\u05a2\7\u010d\2\2\u0591\u05a2"+
		"\7\u010c\2\2\u0592\u05a2\7\u010e\2\2\u0593\u05a2\7\u0110\2\2\u0594\u05a2"+
		"\7\u010f\2\2\u0595\u05a2\7\u011b\2\2\u0596\u05a2\7\u0120\2\2\u0597\u05a2"+
		"\7\u0127\2\2\u0598\u05a2\7\u0128\2\2\u0599\u05a2\7\u0139\2\2\u059a\u05a2"+
		"\7\u013a\2\2\u059b\u05a2\7\u0144\2\2\u059c\u059f\5\u01fe\u0100\2\u059d"+
		"\u059e\7\u0181\2\2\u059e\u05a0\t\t\2\2\u059f\u059d\3\2\2\2\u059f\u05a0"+
		"\3\2\2\2\u05a0\u05a2\3\2\2\2\u05a1\u0573\3\2\2\2\u05a1\u0574\3\2\2\2\u05a1"+
		"\u0575\3\2\2\2\u05a1\u0576\3\2\2\2\u05a1\u0577\3\2\2\2\u05a1\u0578\3\2"+
		"\2\2\u05a1\u0579\3\2\2\2\u05a1\u057a\3\2\2\2\u05a1\u057b\3\2\2\2\u05a1"+
		"\u057c\3\2\2\2\u05a1\u057d\3\2\2\2\u05a1\u057e\3\2\2\2\u05a1\u0582\3\2"+
		"\2\2\u05a1\u0583\3\2\2\2\u05a1\u0584\3\2\2\2\u05a1\u0585\3\2\2\2\u05a1"+
		"\u0586\3\2\2\2\u05a1\u0587\3\2\2\2\u05a1\u0588\3\2\2\2\u05a1\u0589\3\2"+
		"\2\2\u05a1\u058a\3\2\2\2\u05a1\u058b\3\2\2\2\u05a1\u058c\3\2\2\2\u05a1"+
		"\u058d\3\2\2\2\u05a1\u058e\3\2\2\2\u05a1\u0590\3\2\2\2\u05a1\u0591\3\2"+
		"\2\2\u05a1\u0592\3\2\2\2\u05a1\u0593\3\2\2\2\u05a1\u0594\3\2\2\2\u05a1"+
		"\u0595\3\2\2\2\u05a1\u0596\3\2\2\2\u05a1\u0597\3\2\2\2\u05a1\u0598\3\2"+
		"\2\2\u05a1\u0599\3\2\2\2\u05a1\u059a\3\2\2\2\u05a1\u059b\3\2\2\2\u05a1"+
		"\u059c\3\2\2\2\u05a2\177\3\2\2\2\u05a3\u05a4\7\u017a\2\2\u05a4\u05a6\t"+
		"\22\2\2\u05a5\u05a7\t\23\2\2\u05a6\u05a5\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7"+
		"\u05aa\3\2\2\2\u05a8\u05a9\7\u016b\2\2\u05a9\u05ab\7\u0186\2\2\u05aa\u05a8"+
		"\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac\u05ad\7\u017c\2"+
		"\2\u05ad\u0081\3\2\2\2\u05ae\u05b0\7\u00c6\2\2\u05af\u05ae\3\2\2\2\u05af"+
		"\u05b0\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05ba\7\u00c8\2\2\u05b2\u05b3"+
		"\7(\2\2\u05b3\u05b4\7\u0106\2\2\u05b4\u05ba\5\u01fc\u00ff\2\u05b5\u05b7"+
		"\7\u00c6\2\2\u05b6\u05b5\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05b8\3\2\2"+
		"\2\u05b8\u05ba\t\24\2\2\u05b9\u05af\3\2\2\2\u05b9\u05b2\3\2\2\2\u05b9"+
		"\u05b6\3\2\2\2\u05ba\u0083\3\2\2\2\u05bb\u05bd\7\u016a\2\2\u05bc\u05bb"+
		"\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05be\3\2\2\2\u05be\u05bf\7\u0170\2"+
		"\2\u05bf\u05c8\5\u01b6\u00dc\2\u05c0\u05c2\7\u0140\2\2\u05c1\u05c0\3\2"+
		"\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c5\7M\2\2\u05c4"+
		"\u05c6\5\u01b6\u00dc\2\u05c5\u05c4\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c8"+
		"\3\2\2\2\u05c7\u05bc\3\2\2\2\u05c7\u05c1\3\2\2\2\u05c8\u0085\3\2\2\2\u05c9"+
		"\u05ca\7<\2\2\u05ca\u05ce\t\25\2\2\u05cb\u05cc\7\u0089\2\2\u05cc\u05cd"+
		"\7\u00c6\2\2\u05cd\u05cf\7l\2\2\u05ce\u05cb\3\2\2\2\u05ce\u05cf\3\2\2"+
		"\2\u05cf\u05d0\3\2\2\2\u05d0\u05d4\5\u01b6\u00dc\2\u05d1\u05d3\5\u0088"+
		"E\2\u05d2\u05d1\3\2\2\2\u05d3\u05d6\3\2\2\2\u05d4\u05d2\3\2\2\2\u05d4"+
		"\u05d5\3\2\2\2\u05d5\u0087\3\2\2\2\u05d6\u05d4\3\2\2\2\u05d7\u05d8\7\61"+
		"\2\2\u05d8\u05dc\5\u01b6\u00dc\2\u05d9\u05da\7\u00ac\2\2\u05da\u05dc\5"+
		"\u01b6\u00dc\2\u05db\u05d7\3\2\2\2\u05db\u05d9\3\2\2\2\u05dc\u0089\3\2"+
		"\2\2\u05dd\u05e5\7\n\2\2\u05de\u05e1\7<\2\2\u05df\u05e0\7\u00d1\2\2\u05e0"+
		"\u05e2\7\u00eb\2\2\u05e1\u05df\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2\u05e5"+
		"\3\2\2\2\u05e3\u05e5\7\u00eb\2\2\u05e4\u05dd\3\2\2\2\u05e4\u05de\3\2\2"+
		"\2\u05e4\u05e3\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05e7"+
		"\7{\2\2\u05e7\u05e9\5\u01fc\u00ff\2\u05e8\u05ea\5\u009cO\2\u05e9\u05e8"+
		"\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05ed\5\u008cG"+
		"\2\u05ec\u05ee\t\26\2\2\u05ed\u05ec\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee"+
		"\u05f0\3\2\2\2\u05ef\u05f1\5\64\33\2\u05f0\u05ef\3\2\2\2\u05f0\u05f1\3"+
		"\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u05f3\5\b\5\2\u05f3\u008b\3\2\2\2\u05f4"+
		"\u05f5\t\27\2\2\u05f5\u05f7\5~@\2\u05f6\u05f8\5\u0080A\2\u05f7\u05f6\3"+
		"\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u008d\3\2\2\2\u05f9\u0601\7\n\2\2\u05fa"+
		"\u05fd\7<\2\2\u05fb\u05fc\7\u00d1\2\2\u05fc\u05fe\7\u00eb\2\2\u05fd\u05fb"+
		"\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe\u0601\3\2\2\2\u05ff\u0601\7\u00eb\2"+
		"\2\u0600\u05f9\3\2\2\2\u0600\u05fa\3\2\2\2\u0600\u05ff\3\2\2\2\u0600\u0601"+
		"\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0603\7\u00d8\2\2\u0603\u0604\5\u01fc"+
		"\u00ff\2\u0604\u0605\t\26\2\2\u0605\u0606\5\u0090I\2\u0606\u060a\7d\2"+
		"\2\u0607\u0608\5\u01fc\u00ff\2\u0608\u0609\7\u017f\2\2\u0609\u060b\3\2"+
		"\2\2\u060a\u0607\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u008f\3\2\2\2\u060c"+
		"\u060d\5\u0092J\2\u060d\u0613\7\u017f\2\2\u060e\u060f\5\u0092J\2\u060f"+
		"\u0610\7\u017f\2\2\u0610\u0612\3\2\2\2\u0611\u060e\3\2\2\2\u0612\u0615"+
		"\3\2\2\2\u0613\u0611\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u0091\3\2\2\2\u0615"+
		"\u0613\3\2\2\2\u0616\u0624\5\66\34\2\u0617\u0618\7{\2\2\u0618\u061a\5"+
		"\u01fc\u00ff\2\u0619\u061b\5\u009cO\2\u061a\u0619\3\2\2\2\u061a\u061b"+
		"\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u061d\5\u008cG\2\u061d\u0624\3\2\2"+
		"\2\u061e\u061f\t\30\2\2\u061f\u0621\5\u01fc\u00ff\2\u0620\u0622\5\u009c"+
		"O\2\u0621\u0620\3\2\2\2\u0621\u0622\3\2\2\2\u0622\u0624\3\2\2\2\u0623"+
		"\u0616\3\2\2\2\u0623\u0617\3\2\2\2\u0623\u061e\3\2\2\2\u0624\u0093\3\2"+
		"\2\2\u0625\u062d\7\n\2\2\u0626\u0629\7<\2\2\u0627\u0628\7\u00d1\2\2\u0628"+
		"\u062a\7\u00eb\2\2\u0629\u0627\3\2\2\2\u0629\u062a\3\2\2\2\u062a\u062d"+
		"\3\2\2\2\u062b\u062d\7\u00eb\2\2\u062c\u0625\3\2\2\2\u062c\u0626\3\2\2"+
		"\2\u062c\u062b\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u062e\3\2\2\2\u062e\u062f"+
		"\7\u00d8\2\2\u062f\u0630\7\34\2\2\u0630\u0631\5\u01fc\u00ff\2\u0631\u0632"+
		"\t\26\2\2\u0632\u0633\5\u0096L\2\u0633\u0637\7d\2\2\u0634\u0635\5\u01fc"+
		"\u00ff\2\u0635\u0636\7\u017f\2\2\u0636\u0638\3\2\2\2\u0637\u0634\3\2\2"+
		"\2\u0637\u0638\3\2\2\2\u0638\u0095\3\2\2\2\u0639\u063a\5\u0098M\2\u063a"+
		"\u0640\7\u017f\2\2\u063b\u063c\5\u0098M\2\u063c\u063d\7\u017f\2\2\u063d"+
		"\u063f\3\2\2\2\u063e\u063b\3\2\2\2\u063f\u0642\3\2\2\2\u0640\u063e\3\2"+
		"\2\2\u0640\u0641\3\2\2\2\u0641\u0097\3\2\2\2\u0642\u0640\3\2\2\2\u0643"+
		"\u0647\5\66\34\2\u0644\u0647\5\u008aF\2\u0645\u0647\5\u009aN\2\u0646\u0643"+
		"\3\2\2\2\u0646\u0644\3\2\2\2\u0646\u0645\3\2\2\2\u0647\u0099\3\2\2\2\u0648"+
		"\u0650\7\n\2\2\u0649\u064c\7<\2\2\u064a\u064b\7\u00d1\2\2\u064b\u064d"+
		"\7\u00eb\2\2\u064c\u064a\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u0650\3\2\2"+
		"\2\u064e\u0650\7\u00eb\2\2\u064f\u0648\3\2\2\2\u064f\u0649\3\2\2\2\u064f"+
		"\u064e\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0652\t\30"+
		"\2\2\u0652\u0654\5\u01fc\u00ff\2\u0653\u0655\5\u009cO\2\u0654\u0653\3"+
		"\2\2\2\u0654\u0655\3\2\2\2\u0655\u0657\3\2\2\2\u0656\u0658\5\u00a0Q\2"+
		"\u0657\u0656\3\2\2\2\u0657\u0658\3\2\2\2\u0658\u065a\3\2\2\2\u0659\u065b"+
		"\t\26\2\2\u065a\u0659\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u065d\3\2\2\2"+
		"\u065c\u065e\5\64\33\2\u065d\u065c\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u0660"+
		"\3\2\2\2\u065f\u0661\5\u012c\u0097\2\u0660\u065f\3\2\2\2\u0660\u0661\3"+
		"\2\2\2\u0661\u0662\3\2\2\2\u0662\u0666\5\f\7\2\u0663\u0664\5\u01fc\u00ff"+
		"\2\u0664\u0665\7\u017f\2\2\u0665\u0667\3\2\2\2\u0666\u0663\3\2\2\2\u0666"+
		"\u0667\3\2\2\2\u0667\u009b\3\2\2\2\u0668\u0669\7\u017a\2\2\u0669\u067f"+
		"\7\u017c\2\2\u066a\u066b\7\u017a\2\2\u066b\u0670\5\u009eP\2\u066c\u066d"+
		"\7\u016b\2\2\u066d\u066f\5\u009eP\2\u066e\u066c\3\2\2\2\u066f\u0672\3"+
		"\2\2\2\u0670\u066e\3\2\2\2\u0670\u0671\3\2\2\2\u0671\u0673\3\2\2\2\u0672"+
		"\u0670\3\2\2\2\u0673\u0674\7\u017c\2\2\u0674\u067f\3\2\2\2\u0675\u0676"+
		"\6O\4\2\u0676\u067b\5\u009eP\2\u0677\u0678\7\u016b\2\2\u0678\u067a\5\u009e"+
		"P\2\u0679\u0677\3\2\2\2\u067a\u067d\3\2\2\2\u067b\u0679\3\2\2\2\u067b"+
		"\u067c\3\2\2\2\u067c\u067f\3\2\2\2\u067d\u067b\3\2\2\2\u067e\u0668\3\2"+
		"\2\2\u067e\u066a\3\2\2\2\u067e\u0675\3\2\2\2\u067f\u009d\3\2\2\2\u0680"+
		"\u0686\7\u008c\2\2\u0681\u0686\7\u00d3\2\2\u0682\u0686\7\u0091\2\2\u0683"+
		"\u0684\7\u008c\2\2\u0684\u0686\7\u00d3\2\2\u0685\u0680\3\2\2\2\u0685\u0681"+
		"\3\2\2\2\u0685\u0682\3\2\2\2\u0685\u0683\3\2\2\2\u0685\u0686\3\2\2\2\u0686"+
		"\u0687\3\2\2\2\u0687\u0688\5\u01fc\u00ff\2\u0688\u068a\5~@\2\u0689\u068b"+
		"\5\u0080A\2\u068a\u0689\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u068f\3\2\2"+
		"\2\u068c\u068e\5\u0082B\2\u068d\u068c\3\2\2\2\u068e\u0691\3\2\2\2\u068f"+
		"\u068d\3\2\2\2\u068f\u0690\3\2\2\2\u0690\u0693\3\2\2\2\u0691\u068f\3\2"+
		"\2\2\u0692\u0694\5\u0084C\2\u0693\u0692\3\2\2\2\u0693\u0694\3\2\2\2\u0694"+
		"\u06ab\3\2\2\2\u0695\u069b\5\u01fc\u00ff\2\u0696\u069c\7\u008c\2\2\u0697"+
		"\u069c\7\u00d3\2\2\u0698\u069c\7\u0091\2\2\u0699\u069a\7\u008c\2\2\u069a"+
		"\u069c\7\u00d3\2\2\u069b\u0696\3\2\2\2\u069b\u0697\3\2\2\2\u069b\u0698"+
		"\3\2\2\2\u069b\u0699\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069d\3\2\2\2\u069d"+
		"\u069f\5~@\2\u069e\u06a0\5\u0080A\2\u069f\u069e\3\2\2\2\u069f\u06a0\3"+
		"\2\2\2\u06a0\u06a4\3\2\2\2\u06a1\u06a3\5\u0082B\2\u06a2\u06a1\3\2\2\2"+
		"\u06a3\u06a6\3\2\2\2\u06a4\u06a2\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u06a8"+
		"\3\2\2\2\u06a6\u06a4\3\2\2\2\u06a7\u06a9\5\u0084C\2\u06a8\u06a7\3\2\2"+
		"\2\u06a8\u06a9\3\2\2\2\u06a9\u06ab\3\2\2\2\u06aa\u0685\3\2\2\2\u06aa\u0695"+
		"\3\2\2\2\u06ab\u009f\3\2\2\2\u06ac\u06ae\5\u00a2R\2\u06ad\u06ac\3\2\2"+
		"\2\u06ae\u06af\3\2\2\2\u06af\u06ad\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0\u00a1"+
		"\3\2\2\2\u06b1\u06b2\7\u00a5\2\2\u06b2\u06bd\7\u0111\2\2\u06b3\u06b4\7"+
		"\u0111\2\2\u06b4\u06b5\7\u0102\2\2\u06b5\u06bd\t\31\2\2\u06b6\u06b8\7"+
		"_\2\2\u06b7\u06b6\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9"+
		"\u06ba\7\u00ee\2\2\u06ba\u06bb\7\u0109\2\2\u06bb\u06bd\7\u0186\2\2\u06bc"+
		"\u06b1\3\2\2\2\u06bc\u06b3\3\2\2\2\u06bc\u06b7\3\2\2\2\u06bd\u00a3\3\2"+
		"\2\2\u06be\u06bf\7^\2\2\u06bf\u06c2\7\u0121\2\2\u06c0\u06c1\7\u0089\2"+
		"\2\u06c1\u06c3\7l\2\2\u06c2\u06c0\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06c4"+
		"\3\2\2\2\u06c4\u06db\5\u0172\u00ba\2\u06c5\u06c6\7^\2\2\u06c6\u06c9\7"+
		"\u00d8\2\2\u06c7\u06c8\7\u0089\2\2\u06c8\u06ca\7l\2\2\u06c9\u06c7\3\2"+
		"\2\2\u06c9\u06ca\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb\u06db\5\u01fc\u00ff"+
		"\2\u06cc\u06cd\7^\2\2\u06cd\u06d0\t\32\2\2\u06ce\u06cf\7\u0089\2\2\u06cf"+
		"\u06d1\7l\2\2\u06d0\u06ce\3\2\2\2\u06d0\u06d1\3\2\2\2\u06d1\u06d2\3\2"+
		"\2\2\u06d2\u06db\5\u01fc\u00ff\2\u06d3\u06d4\7^\2\2\u06d4\u06d7\t\25\2"+
		"\2\u06d5\u06d6\7\u0089\2\2\u06d6\u06d8\7l\2\2\u06d7\u06d5\3\2\2\2\u06d7"+
		"\u06d8\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9\u06db\5\u01b6\u00dc\2\u06da\u06be"+
		"\3\2\2\2\u06da\u06c5\3\2\2\2\u06da\u06cc\3\2\2\2\u06da\u06d3\3\2\2\2\u06db"+
		"\u00a5\3\2\2\2\u06dc\u06dd\7d\2\2\u06dd\u06de\7\u012c\2\2\u06de\u00a7"+
		"\3\2\2\2\u06df\u06e1\t\33\2\2\u06e0\u06e2\7\u008b\2\2\u06e1\u06e0\3\2"+
		"\2\2\u06e1\u06e2\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u06e9\5\u01b6\u00dc"+
		"\2\u06e4\u06e5\7\u017a\2\2\u06e5\u06e6\5\u01e4\u00f3\2\u06e6\u06e7\7\u017c"+
		"\2\2\u06e7\u06ea\3\2\2\2\u06e8\u06ea\5\u01e4\u00f3\2\u06e9\u06e4\3\2\2"+
		"\2\u06e9\u06e8\3\2\2\2\u06e9\u06ea\3\2\2\2\u06ea\u06f4\3\2\2\2\u06eb\u06ec"+
		"\7\u009a\2\2\u06ec\u06f1\7\u0182\2\2\u06ed\u06ee\7\u016b\2\2\u06ee\u06f0"+
		"\7\u0182\2\2\u06ef\u06ed\3\2\2\2\u06f0\u06f3\3\2\2\2\u06f1\u06ef\3\2\2"+
		"\2\u06f1\u06f2\3\2\2\2\u06f2\u06f5\3\2\2\2\u06f3\u06f1\3\2\2\2\u06f4\u06eb"+
		"\3\2\2\2\u06f4\u06f5\3\2\2\2\u06f5\u06f7\3\2\2\2\u06f6\u06f8\5\u012e\u0098"+
		"\2\u06f7\u06f6\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u00a9\3\2\2\2\u06f9\u06fd"+
		"\5\u00acW\2\u06fa\u06fd\5\u00aeX\2\u06fb\u06fd\5\u00b0Y\2\u06fc\u06f9"+
		"\3\2\2\2\u06fc\u06fa\3\2\2\2\u06fc\u06fb\3\2\2\2\u06fd\u00ab\3\2\2\2\u06fe"+
		"\u06ff\7\u0089\2\2\u06ff\u0700\5\u01a6\u00d4\2\u0700\u0701\7\u0126\2\2"+
		"\u0701\u0705\5\4\3\2\u0702\u0704\5\u00b2Z\2\u0703\u0702\3\2\2\2\u0704"+
		"\u0707\3\2\2\2\u0705\u0703\3\2\2\2\u0705\u0706\3\2\2\2\u0706\u0709\3\2"+
		"\2\2\u0707\u0705\3\2\2\2\u0708\u070a\5\u00b4[\2\u0709\u0708\3\2\2\2\u0709"+
		"\u070a\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u070c\7d\2\2\u070c\u070d\7\u0089"+
		"\2\2\u070d\u00ad\3\2\2\2\u070e\u070f\7\u0089\2\2\u070f\u0710\5\u01a6\u00d4"+
		"\2\u0710\u0713\5\b\5\2\u0711\u0712\7`\2\2\u0712\u0714\5\b\5\2\u0713\u0711"+
		"\3\2\2\2\u0713\u0714\3\2\2\2\u0714\u00af\3\2\2\2\u0715\u0716\7\u016e\2"+
		"\2\u0716\u0717\7\u0089\2\2\u0717\u0718\5\u01a6\u00d4\2\u0718\u0719\7\u0126"+
		"\2\2\u0719\u071a\5\b\5\2\u071a\u00b1\3\2\2\2\u071b\u071c\t\34\2\2\u071c"+
		"\u071d\5\u01a6\u00d4\2\u071d\u071e\7\u0126\2\2\u071e\u071f\5\4\3\2\u071f"+
		"\u00b3\3\2\2\2\u0720\u0721\7`\2\2\u0721\u0722\5\4\3\2\u0722\u00b5\3\2"+
		"\2\2\u0723\u0726\7\u008d\2\2\u0724\u0727\5\u01f6\u00fc\2\u0725\u0727\5"+
		"\u01b6\u00dc\2\u0726\u0724\3\2\2\2\u0726\u0725\3\2\2\2\u0727\u00b7\3\2"+
		"\2\2\u0728\u0729\7\u0140\2\2\u0729\u072e\5\u00ba^\2\u072a\u072b\7\u016b"+
		"\2\2\u072b\u072d\5\u00ba^\2\u072c\u072a\3\2\2\2\u072d\u0730\3\2\2\2\u072e"+
		"\u072c\3\2\2\2\u072e\u072f\3\2\2\2\u072f\u0731\3\2\2\2\u0730\u072e\3\2"+
		"\2\2\u0731\u0732\5\u00bc_\2\u0732\u00b9\3\2\2\2\u0733\u0734\5\u0176\u00bc"+
		"\2\u0734\u0735\7\16\2\2\u0735\u0736\5\u0138\u009d\2\u0736\u00bb\3\2\2"+
		"\2\u0737\u073e\7\u0092\2\2\u0738\u0739\7\u00d6\2\2\u0739\u073f\7\u0121"+
		"\2\2\u073a\u073c\7\u009a\2\2\u073b\u073d\7\u0121\2\2\u073c\u073b\3\2\2"+
		"\2\u073c\u073d\3\2\2\2\u073d\u073f\3\2\2\2\u073e\u0738\3\2\2\2\u073e\u073a"+
		"\3\2\2\2\u073f\u0740\3\2\2\2\u0740\u0743\5\u00be`\2\u0741\u0744\5\u0130"+
		"\u0099\2\u0742\u0744\5\u00c8e\2\u0743\u0741\3\2\2\2\u0743\u0742\3\2\2"+
		"\2\u0744\u00bd\3\2\2\2\u0745\u0746\5\u00c0a\2\u0746\u00bf\3\2\2\2\u0747"+
		"\u0749\5\u0172\u00ba\2\u0748\u074a\5\u00c6d\2\u0749\u0748\3\2\2\2\u0749"+
		"\u074a\3\2\2\2\u074a\u074c\3\2\2\2\u074b\u074d\5\u00c2b\2\u074c\u074b"+
		"\3\2\2\2\u074c\u074d\3\2\2\2\u074d\u00c1\3\2\2\2\u074e\u075a\7\u00d9\2"+
		"\2\u074f\u0750\7\u017a\2\2\u0750\u0755\5\u00c4c\2\u0751\u0752\7\u016b"+
		"\2\2\u0752\u0754\5\u00c4c\2\u0753\u0751\3\2\2\2\u0754\u0757\3\2\2\2\u0755"+
		"\u0753\3\2\2\2\u0755\u0756\3\2\2\2\u0756\u0758\3\2\2\2\u0757\u0755\3\2"+
		"\2\2\u0758\u0759\7\u017c\2\2\u0759\u075b\3\2\2\2\u075a\u074f\3\2\2\2\u075a"+
		"\u075b\3\2\2\2\u075b\u00c3\3\2\2\2\u075c\u075f\5\u01fc\u00ff\2\u075d\u075e"+
		"\7\u0170\2\2\u075e\u0760\5\u01b8\u00dd\2\u075f\u075d\3\2\2\2\u075f\u0760"+
		"\3\2\2\2\u0760\u00c5\3\2\2\2\u0761\u0762\7\u017a\2\2\u0762\u0767\5\u0178"+
		"\u00bd\2\u0763\u0764\7\u016b\2\2\u0764\u0766\5\u0178\u00bd\2\u0765\u0763"+
		"\3\2\2\2\u0766\u0769\3\2\2\2\u0767\u0765\3\2\2\2\u0767\u0768\3\2\2\2\u0768"+
		"\u076a\3\2\2\2\u0769\u0767\3\2\2\2\u076a\u076b\7\u017c\2\2\u076b\u00c7"+
		"\3\2\2\2\u076c\u076d\7\u0137\2\2\u076d\u0772\5\u00caf\2\u076e\u076f\7"+
		"\u016b\2\2\u076f\u0771\5\u00caf\2\u0770\u076e\3\2\2\2\u0771\u0774\3\2"+
		"\2\2\u0772\u0770\3\2\2\2\u0772\u0773\3\2\2\2\u0773\u00c9\3\2\2\2\u0774"+
		"\u0772\3\2\2\2\u0775\u0776\7\u017a\2\2\u0776\u077b\5\u01b6\u00dc\2\u0777"+
		"\u0778\7\u016b\2\2\u0778\u077a\5\u01b6\u00dc\2\u0779\u0777\3\2\2\2\u077a"+
		"\u077d\3\2\2\2\u077b\u0779\3\2\2\2\u077b\u077c\3\2\2\2\u077c\u077e\3\2"+
		"\2\2\u077d\u077b\3\2\2\2\u077e\u077f\7\u017c\2\2\u077f\u00cb\3\2\2\2\u0780"+
		"\u0781\7\u0092\2\2\u0781\u0783\7\u00d6\2\2\u0782\u0784\7\u00ab\2\2\u0783"+
		"\u0782\3\2\2\2\u0783\u0784\3\2\2\2\u0784\u0785\3\2\2\2\u0785\u0786\7Y"+
		"\2\2\u0786\u0787\5\u01ea\u00f6\2\u0787\u0788\5\u01e8\u00f5\2\u0788\u00cd"+
		"\3\2\2\2\u0789\u078b\7m\2\2\u078a\u078c\7\u0182\2\2\u078b\u078a\3\2\2"+
		"\2\u078b\u078c\3\2\2\2\u078c\u078f\3\2\2\2\u078d\u078e\7\u013d\2\2\u078e"+
		"\u0790\5\u01a6\u00d4\2\u078f\u078d\3\2\2\2\u078f\u0790\3\2\2\2\u0790\u00cf"+
		"\3\2\2\2\u0791\u0792\7|\2\2\u0792\u0793\7W\2\2\u0793\u0794\5\u00d2j\2"+
		"\u0794\u00d1\3\2\2\2\u0795\u0798\5\u00d4k\2\u0796\u0798\5\u00d6l\2\u0797"+
		"\u0795\3\2\2\2\u0797\u0796\3\2\2\2\u0798\u00d3\3\2\2\2\u0799\u079a\7j"+
		"\2\2\u079a\u079b\7\u0186\2\2\u079b\u079c\5\u01fe\u0100\2\u079c\u079d\7"+
		"\u0170\2\2\u079d\u079e\7\u00b9\2\2\u079e\u00d5\3\2\2\2\u079f\u07a0\5\u01fe"+
		"\u0100\2\u07a0\u07a1\7\u0170\2\2\u07a1\u07a2\7\u00fa\2\2\u07a2\u00d7\3"+
		"\2\2\2\u07a3\u07a4\7\177\2\2\u07a4\u07a9\5\u00dan\2\u07a5\u07a6\7\u016b"+
		"\2\2\u07a6\u07a8\5\u00dan\2\u07a7\u07a5\3\2\2\2\u07a8\u07ab\3\2\2\2\u07a9"+
		"\u07a7\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa\u07ac\3\2\2\2\u07ab\u07a9\3\2"+
		"\2\2\u07ac\u07ad\7\u012a\2\2\u07ad\u07ae\7\u00f5\2\2\u07ae\u07af\5\u01fe"+
		"\u0100\2\u07af\u00d9\3\2\2\2\u07b0\u07b1\7i\2\2\u07b1\u07b2\7\u00ce\2"+
		"\2\u07b2\u07b3\7\u00e2\2\2\u07b3\u07b4\5\u01fe\u0100\2\u07b4\u00db\3\2"+
		"\2\2\u07b5\u07b7\7\u00a6\2\2\u07b6\u07b8\7\u0182\2\2\u07b7\u07b6\3\2\2"+
		"\2\u07b7\u07b8\3\2\2\2\u07b8\u00dd\3\2\2\2\u07b9\u07ba\7\u00b4\2\2\u07ba"+
		"\u07bb\7\u00cb\2\2\u07bb\u07be\5\u01fc\u00ff\2\u07bc\u07bd\7\u012a\2\2"+
		"\u07bd\u07bf\5\u01fc\u00ff\2\u07be\u07bc\3\2\2\2\u07be\u07bf\3\2\2\2\u07bf"+
		"\u07c2\3\2\2\2\u07c0\u07c1\7\21\2\2\u07c1\u07c3\5\u01fc\u00ff\2\u07c2"+
		"\u07c0\3\2\2\2\u07c2\u07c3\3\2\2\2\u07c3\u00df\3\2\2\2\u07c4\u07c5\7\u00d0"+
		"\2\2\u07c5\u07cb\5\u01fc\u00ff\2\u07c6\u07c9\7u\2\2\u07c7\u07ca\5\u0130"+
		"\u0099\2\u07c8\u07ca\5\u01b6\u00dc\2\u07c9\u07c7\3\2\2\2\u07c9\u07c8\3"+
		"\2\2\2\u07ca\u07cc\3\2\2\2\u07cb\u07c6\3\2\2\2\u07cb\u07cc\3\2\2\2\u07cc"+
		"\u00e1\3\2\2\2\u07cd\u07cf\7p\2\2\u07ce\u07d0\7y\2\2\u07cf\u07ce\3\2\2"+
		"\2\u07cf\u07d0\3\2\2\2\u07d0\u07d1\3\2\2\2\u07d1\u07d3\5\u01fc\u00ff\2"+
		"\u07d2\u07d4\5\u0158\u00ad\2\u07d3\u07d2\3\2\2\2\u07d3\u07d4\3\2\2\2\u07d4"+
		"\u07d5\3\2\2\2\u07d5\u07d6\7\u009a\2\2\u07d6\u07db\5\u01fc\u00ff\2\u07d7"+
		"\u07d8\7\u016b\2\2\u07d8\u07da\5\u01fc\u00ff\2\u07d9\u07d7\3\2\2\2\u07da"+
		"\u07dd\3\2\2\2\u07db\u07d9\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u07df\3\2"+
		"\2\2\u07dd\u07db\3\2\2\2\u07de\u07e0\5\u00e4s\2\u07df\u07de\3\2\2\2\u07df"+
		"\u07e0\3\2\2\2\u07e0\u00e3\3\2\2\2\u07e1\u07e2\7\u00a9\2\2\u07e2\u07e3"+
		"\5\u01b6\u00dc\2\u07e3\u00e5\3\2\2\2\u07e4\u07e5\7.\2\2\u07e5\u07e6\t"+
		"\35\2\2\u07e6\u07e7\7\u00ce\2\2\u07e7\u07e9\5\u0172\u00ba\2\u07e8\u07ea"+
		"\5\u00e8u\2\u07e9\u07e8\3\2\2\2\u07e9\u07ea\3\2\2\2\u07ea\u00e7\3\2\2"+
		"\2\u07eb\u07ec\7\60\2\2\u07ec\u07ed\7\u017a\2\2\u07ed\u07f2\5\u01fe\u0100"+
		"\2\u07ee\u07ef\7\u016b\2\2\u07ef\u07f1\5\u01fe\u0100\2\u07f0\u07ee\3\2"+
		"\2\2\u07f1\u07f4\3\2\2\2\u07f2\u07f0\3\2\2\2\u07f2\u07f3\3\2\2\2\u07f3"+
		"\u07f5\3\2\2\2\u07f4\u07f2\3\2\2\2\u07f5\u07f6\7\u017c\2\2\u07f6\u00e9"+
		"\3\2\2\2\u07f7\u07f8\7+\2\2\u07f8\u07f9\7\u0182\2\2\u07f9\u00eb\3\2\2"+
		"\2\u07fa\u07fb\7-\2\2\u07fb\u07fc\t\36\2\2\u07fc\u07fd\5\u00eex\2";
	private static final String _serializedATNSegment1 =
		"\u07fd\u07fe\7\u016b\2\2\u07fe\u07ff\5\u00eex\2\u07ff\u00ed\3\2\2\2\u0800"+
		"\u0802\5\u0172\u00ba\2\u0801\u0803\5\u017c\u00bf\2\u0802\u0801\3\2\2\2"+
		"\u0802\u0803\3\2\2\2\u0803\u0809\3\2\2\2\u0804\u0805\7\u017a\2\2\u0805"+
		"\u0806\5\u0130\u0099\2\u0806\u0807\7\u017c\2\2\u0807\u0809\3\2\2\2\u0808"+
		"\u0800\3\2\2\2\u0808\u0804\3\2\2\2\u0809\u080c\3\2\2\2\u080a\u080b\7\21"+
		"\2\2\u080b\u080d\5\u01fe\u0100\2\u080c\u080a\3\2\2\2\u080c\u080d\3\2\2"+
		"\2\u080d\u00ef\3\2\2\2\u080e\u080f\79\2\2\u080f\u0810\7y\2\2\u0810\u0811"+
		"\7\u00ab\2\2\u0811\u0816\5\u00f4{\2\u0812\u0813\7\u016b\2\2\u0813\u0815"+
		"\5\u00f4{\2\u0814\u0812\3\2\2\2\u0815\u0818\3\2\2\2\u0816\u0814\3\2\2"+
		"\2\u0816\u0817\3\2\2\2\u0817\u0819\3\2\2\2\u0818\u0816\3\2\2\2\u0819\u081a"+
		"\7\u012a\2\2\u081a\u081e\5\u00f6|\2\u081b\u081d\5\u00fa~\2\u081c\u081b"+
		"\3\2\2\2\u081d\u0820\3\2\2\2\u081e\u081c\3\2\2\2\u081e\u081f\3\2\2\2\u081f"+
		"\u00f1\3\2\2\2\u0820\u081e\3\2\2\2\u0821\u0827\79\2\2\u0822\u0828\5\u0172"+
		"\u00ba\2\u0823\u0824\7\u017a\2\2\u0824\u0825\5\u0130\u0099\2\u0825\u0826"+
		"\7\u017c\2\2\u0826\u0828\3\2\2\2\u0827\u0822\3\2\2\2\u0827\u0823\3\2\2"+
		"\2\u0828\u0829\3\2\2\2\u0829\u082b\7\u012a\2\2\u082a\u082c\7\u0085\2\2"+
		"\u082b\u082a\3\2\2\2\u082b\u082c\3\2\2\2\u082c\u082d\3\2\2\2\u082d\u0831"+
		"\5\u00f6|\2\u082e\u0830\5\u00f8}\2\u082f\u082e\3\2\2\2\u0830\u0833\3\2"+
		"\2\2\u0831\u082f\3\2\2\2\u0831\u0832\3\2\2\2\u0832\u00f3\3\2\2\2\u0833"+
		"\u0831\3\2\2\2\u0834\u0837\5\u01f6\u00fc\2\u0835\u0837\5\u01b6\u00dc\2"+
		"\u0836\u0834\3\2\2\2\u0836\u0835\3\2\2\2\u0837\u00f5\3\2\2\2\u0838\u083b"+
		"\5\u01f6\u00fc\2\u0839\u083b\5\u01b6\u00dc\2\u083a\u0838\3\2\2\2\u083a"+
		"\u0839\3\2\2\2\u083b\u00f7\3\2\2\2\u083c\u083d\7\21\2\2\u083d\u0845\5"+
		"\u01fe\u0100\2\u083e\u083f\7\24\2\2\u083f\u0845\5\u01b6\u00dc\2\u0840"+
		"\u0841\7T\2\2\u0841\u0845\5\u01b6\u00dc\2\u0842\u0843\7\u0113\2\2\u0843"+
		"\u0845\5\u01fe\u0100\2\u0844\u083c\3\2\2\2\u0844\u083e\3\2\2\2\u0844\u0840"+
		"\3\2\2\2\u0844\u0842\3\2\2\2\u0845\u00f9\3\2\2\2\u0846\u0847\t\37\2\2"+
		"\u0847\u00fb\3\2\2\2\u0848\u084a\7\63\2\2\u0849\u084b\7\u0142\2\2\u084a"+
		"\u0849\3\2\2\2\u084a\u084b\3\2\2\2\u084b\u00fd\3\2\2\2\u084c\u084e\7<"+
		"\2\2\u084d\u084f\7\u0131\2\2\u084e\u084d\3\2\2\2\u084e\u084f\3\2\2\2\u084f"+
		"\u0850\3\2\2\2\u0850\u0851\7\u008e\2\2\u0851\u0852\5\u01fe\u0100\2\u0852"+
		"\u0853\7\u00ce\2\2\u0853\u0854\5\u0172\u00ba\2\u0854\u0855\7\u017a\2\2"+
		"\u0855\u085a\5\u0100\u0081\2\u0856\u0857\7\u016b\2\2\u0857\u0859\5\u0100"+
		"\u0081\2\u0858\u0856\3\2\2\2\u0859\u085c\3\2\2\2\u085a\u0858\3\2\2\2\u085a"+
		"\u085b\3\2\2\2\u085b\u085d\3\2\2\2\u085c\u085a\3\2\2\2\u085d\u085e\7\u017c"+
		"\2\2\u085e\u00ff\3\2\2\2\u085f\u0861\5\u01fe\u0100\2\u0860\u0862\t\n\2"+
		"\2\u0861\u0860\3\2\2\2\u0861\u0862\3\2\2\2\u0862\u0101\3\2\2\2\u0863\u0864"+
		"\5\u0104\u0083\2\u0864\u0103\3\2\2\2\u0865\u0866\7\u0140\2\2\u0866\u0867"+
		"\7\u017a\2\2\u0867\u0868\5\u01fe\u0100\2\u0868\u0869\7\u0170\2\2\u0869"+
		"\u0871\5\u01fe\u0100\2\u086a\u086b\7\u016b\2\2\u086b\u086c\5\u01fe\u0100"+
		"\2\u086c\u086d\7\u0170\2\2\u086d\u086e\5\u01fe\u0100\2\u086e\u0870\3\2"+
		"\2\2\u086f\u086a\3\2\2\2\u0870\u0873\3\2\2\2\u0871\u086f\3\2\2\2\u0871"+
		"\u0872\3\2\2\2\u0872\u0874\3\2\2\2\u0873\u0871\3\2\2\2\u0874\u0878\7\u017c"+
		"\2\2\u0875\u0877\5r:\2\u0876\u0875\3\2\2\2\u0877\u087a\3\2\2\2\u0878\u0876"+
		"\3\2\2\2\u0878\u0879\3\2\2\2\u0879\u0105\3\2\2\2\u087a\u0878\3\2\2\2\u087b"+
		"\u087c\7\u00e0\2\2\u087c\u0883\5\u01b6\u00dc\2\u087d\u087e\7\u00e0\2\2"+
		"\u087e\u087f\7\u017a\2\2\u087f\u0880\5\u01b6\u00dc\2\u0880\u0881\7\u017c"+
		"\2\2\u0881\u0883\3\2\2\2\u0882\u087b\3\2\2\2\u0882\u087d\3\2\2\2\u0883"+
		"\u0107\3\2\2\2\u0884\u0886\7\u016e\2\2\u0885\u0884\3\2\2\2\u0885\u0886"+
		"\3\2\2\2\u0886\u0887\3\2\2\2\u0887\u0889\7\u00e5\2\2\u0888\u088a\5\u01b6"+
		"\u00dc\2\u0889\u0888\3\2\2\2\u0889\u088a\3\2\2\2\u088a\u0109\3\2\2\2\u088b"+
		"\u088c\7\u00e7\2\2\u088c\u010b\3\2\2\2\u088d\u0899\7\u00ec\2\2\u088e\u0890"+
		"\7\u0114\2\2\u088f\u0891\7\u0136\2\2\u0890\u088f\3\2\2\2\u0890\u0891\3"+
		"\2\2\2\u0891\u0892\3\2\2\2\u0892\u0897\5\u01b6\u00dc\2\u0893\u0894\7\u0106"+
		"\2\2\u0894\u0895\7\u00b9\2\2\u0895\u0896\7\u0170\2\2\u0896\u0898\5\u01b6"+
		"\u00dc\2\u0897\u0893\3\2\2\2\u0897\u0898\3\2\2\2\u0898\u089a\3\2\2\2\u0899"+
		"\u088e\3\2\2\2\u0899\u089a\3\2\2\2\u089a\u010d\3\2\2\2\u089b\u089d\7\u00f0"+
		"\2\2\u089c\u089e\5\u01b6\u00dc\2\u089d\u089c\3\2\2\2\u089d\u089e\3\2\2"+
		"\2\u089e\u010f\3\2\2\2\u089f\u08a1\7\u00f6\2\2\u08a0\u08a2\7\u0142\2\2"+
		"\u08a1\u08a0\3\2\2\2\u08a1\u08a2\3\2\2\2\u08a2\u0111\3\2\2\2\u08a3\u08a7"+
		"\5\u0114\u008b\2\u08a4\u08a7\5\u0116\u008c\2\u08a5\u08a7\5\u0118\u008d"+
		"\2\u08a6\u08a3\3\2\2\2\u08a6\u08a4\3\2\2\2\u08a6\u08a5\3\2\2\2\u08a7\u0113"+
		"\3\2\2\2\u08a8\u08aa\7A\2\2\u08a9\u08a8\3\2\2\2\u08a9\u08aa\3\2\2\2\u08aa"+
		"\u08ab\3\2\2\2\u08ab\u08ae\7\u00ff\2\2\u08ac\u08ae\7B\2\2\u08ad\u08a9"+
		"\3\2\2\2\u08ad\u08ac\3\2\2\2\u08ae\u08b0\3\2\2\2\u08af\u08b1\7\u0170\2"+
		"\2\u08b0\u08af\3\2\2\2\u08b0\u08b1\3\2\2\2\u08b1\u08b2\3\2\2\2\u08b2\u08b3"+
		"\5\u01b6\u00dc\2\u08b3\u0115\3\2\2\2\u08b4\u08b5\t \2\2\u08b5\u08b6\t"+
		"!\2\2\u08b6\u0117\3\2\2\2\u08b7\u08b8\7\u00e4\2\2\u08b8\u08bb\7\u0170"+
		"\2\2\u08b9\u08bc\5\u01b6\u00dc\2\u08ba\u08bc\7\u00c5\2\2\u08bb\u08b9\3"+
		"\2\2\2\u08bb\u08ba\3\2\2\2\u08bc\u08be\3\2\2\2\u08bd\u08bf\7\u0132\2\2"+
		"\u08be\u08bd\3\2\2\2\u08be\u08bf\3\2\2\2\u08bf\u08c0\3\2\2\2\u08c0\u08c1"+
		"\7u\2\2\u08c1\u08c2\t\"\2\2\u08c2\u0119\3\2\2\2\u08c3\u08c4\7\u010b\2"+
		"\2\u08c4\u08c5\5\u01fc\u00ff\2\u08c5\u011b\3\2\2\2\u08c6\u08c9\7\u011f"+
		"\2\2\u08c7\u08c8\7\u012b\2\2\u08c8\u08ca\5\u01b6\u00dc\2\u08c9\u08c7\3"+
		"\2\2\2\u08c9\u08ca\3\2\2\2\u08ca\u08cb\3\2\2\2\u08cb\u08d5\7u\2\2\u08cc"+
		"\u08d6\5\u0130\u0099\2\u08cd\u08cf\5\u0172\u00ba\2\u08ce\u08d0\5\u017c"+
		"\u00bf\2\u08cf\u08ce\3\2\2\2\u08cf\u08d0\3\2\2\2\u08d0\u08d3\3\2\2\2\u08d1"+
		"\u08d2\7\u00a9\2\2\u08d2\u08d4\5\u01b6\u00dc\2\u08d3\u08d1\3\2\2\2\u08d3"+
		"\u08d4\3\2\2\2\u08d4\u08d6\3\2\2\2\u08d5\u08cc\3\2\2\2\u08d5\u08cd\3\2"+
		"\2\2\u08d6\u011d\3\2\2\2\u08d7\u08d9\7\u012e\2\2\u08d8\u08da\7\u0121\2"+
		"\2\u08d9\u08d8\3\2\2\2\u08d9\u08da\3\2\2\2\u08da\u08db\3\2\2\2\u08db\u08dc"+
		"\5\u0172\u00ba\2\u08dc\u011f\3\2\2\2\u08dd\u08de\7\u0134\2\2\u08de\u08df"+
		"\5\u01b6\u00dc\2\u08df\u0121\3\2\2\2\u08e0\u08e2\7\u0137\2\2\u08e1\u08e3"+
		"\7\u017a\2\2\u08e2\u08e1\3\2\2\2\u08e2\u08e3\3\2\2\2\u08e3\u08e4\3\2\2"+
		"\2\u08e4\u08e9\5\u01b6\u00dc\2\u08e5\u08e6\7\u016b\2\2\u08e6\u08e8\5\u01b6"+
		"\u00dc\2\u08e7\u08e5\3\2\2\2\u08e8\u08eb\3\2\2\2\u08e9\u08e7\3\2\2\2\u08e9"+
		"\u08ea\3\2\2\2\u08ea\u08ed\3\2\2\2\u08eb\u08e9\3\2\2\2\u08ec\u08ee\7\u017c"+
		"\2\2\u08ed\u08ec\3\2\2\2\u08ed\u08ee\3\2\2\2\u08ee\u08ef\3\2\2\2\u08ef"+
		"\u08f1\7\u009a\2\2\u08f0\u08f2\7\u017a\2\2\u08f1\u08f0\3\2\2\2\u08f1\u08f2"+
		"\3\2\2\2\u08f2\u08f3\3\2\2\2\u08f3\u08f8\5\u01fc\u00ff\2\u08f4\u08f5\7"+
		"\u016b\2\2\u08f5\u08f7\5\u01fc\u00ff\2\u08f6\u08f4\3\2\2\2\u08f7\u08fa"+
		"\3\2\2\2\u08f8\u08f6\3\2\2\2\u08f8\u08f9\3\2\2\2\u08f9\u08fc\3\2\2\2\u08fa"+
		"\u08f8\3\2\2\2\u08fb\u08fd\7\u017c\2\2\u08fc\u08fb\3\2\2\2\u08fc\u08fd"+
		"\3\2\2\2\u08fd\u0123\3\2\2\2\u08fe\u08ff\7\u013f\2\2\u08ff\u0900\5\u01a6"+
		"\u00d4\2\u0900\u0901\t#\2\2\u0901\u0902\5\4\3\2\u0902\u0904\7d\2\2\u0903"+
		"\u0905\t$\2\2\u0904\u0903\3\2\2\2\u0904\u0905\3\2\2\2\u0905\u0125\3\2"+
		"\2\2\u0906\u0907\7\u00b3\2\2\u0907\u0908\5\4\3\2\u0908\u0909\7d\2\2\u0909"+
		"\u090a\7\u00b3\2\2\u090a\u0127\3\2\2\2\u090b\u090c\7u\2\2\u090c\u090d"+
		"\7\u0182\2\2\u090d\u090f\7\u008c\2\2\u090e\u0910\7\u017a\2\2\u090f\u090e"+
		"\3\2\2\2\u090f\u0910\3\2\2\2\u0910\u0911\3\2\2\2\u0911\u0913\5\u0130\u0099"+
		"\2\u0912\u0914\7\u017c\2\2\u0913\u0912\3\2\2\2\u0913\u0914\3\2\2\2\u0914"+
		"\u0915\3\2\2\2\u0915\u0916\7\u00b3\2\2\u0916\u0917\5\4\3\2\u0917\u0918"+
		"\7d\2\2\u0918\u0919\7\u00b3\2\2\u0919\u0129\3\2\2\2\u091a\u091b\7u\2\2"+
		"\u091b\u091c\7\u0182\2\2\u091c\u091e\7\u008c\2\2\u091d\u091f\7\u00f2\2"+
		"\2\u091e\u091d\3\2\2\2\u091e\u091f\3\2\2\2\u091f\u0920\3\2\2\2\u0920\u0921"+
		"\5\u01b6\u00dc\2\u0921\u0922\7\u016f\2\2\u0922\u0925\5\u01b6\u00dc\2\u0923"+
		"\u0924\t%\2\2\u0924\u0926\5\u01b6\u00dc\2\u0925\u0923\3\2\2\2\u0925\u0926"+
		"\3\2\2\2\u0926\u0927\3\2\2\2\u0927\u0928\7\u00b3\2\2\u0928\u0929\5\4\3"+
		"\2\u0929\u092a\7d\2\2\u092a\u092b\7\u00b3\2\2\u092b\u012b\3\2\2\2\u092c"+
		"\u0933\7\u018d\2\2\u092d\u092e\7\u0176\2\2\u092e\u092f\7\u0176\2\2\u092f"+
		"\u0930\7\u0182\2\2\u0930\u0931\7\u0174\2\2\u0931\u0933\7\u0174\2\2\u0932"+
		"\u092c\3\2\2\2\u0932\u092d\3\2\2\2\u0933\u012d\3\2\2\2\u0934\u0935\7\u0135"+
		"\2\2\u0935\u093a\5\u01b6\u00dc\2\u0936\u0937\7\u016b\2\2\u0937\u0939\5"+
		"\u01b6\u00dc\2\u0938\u0936\3\2\2\2\u0939\u093c\3\2\2\2\u093a\u0938\3\2"+
		"\2\2\u093a\u093b\3\2\2\2\u093b\u012f\3\2\2\2\u093c\u093a\3\2\2\2\u093d"+
		"\u093f\5\u0132\u009a\2\u093e\u093d\3\2\2\2\u093e\u093f\3\2\2\2\u093f\u0940"+
		"\3\2\2\2\u0940\u0941\5\u0138\u009d\2\u0941\u0131\3\2\2\2\u0942\u0943\7"+
		"\u0140\2\2\u0943\u0948\5\u0134\u009b\2\u0944\u0945\7\u016b\2\2\u0945\u0947"+
		"\5\u0134\u009b\2\u0946\u0944\3\2\2\2\u0947\u094a\3\2\2\2\u0948\u0946\3"+
		"\2\2\2\u0948\u0949\3\2\2\2\u0949\u0133\3\2\2\2\u094a\u0948\3\2\2\2\u094b"+
		"\u094d\5\u01fe\u0100\2\u094c\u094e\5\u0136\u009c\2\u094d\u094c\3\2\2\2"+
		"\u094d\u094e\3\2\2\2\u094e\u094f\3\2\2\2\u094f\u0950\7\16\2\2\u0950\u0951"+
		"\7\u017a\2\2\u0951\u0952\5\u0138\u009d\2\u0952\u0953\7\u017c\2\2\u0953"+
		"\u0135\3\2\2\2\u0954\u0955\7\u017a\2\2\u0955\u095a\5\u01fe\u0100\2\u0956"+
		"\u0957\7\u016b\2\2\u0957\u0959\5\u01fe\u0100\2\u0958\u0956\3\2\2\2\u0959"+
		"\u095c\3\2\2\2\u095a\u0958\3\2\2\2\u095a\u095b\3\2\2\2\u095b\u095d\3\2"+
		"\2\2\u095c\u095a\3\2\2\2\u095d\u095e\7\u017c\2\2\u095e\u0137\3\2\2\2\u095f"+
		"\u0965\5\u013a\u009e\2\u0960\u0961\5\u013c\u009f\2\u0961\u0962\5\u013a"+
		"\u009e\2\u0962\u0964\3\2\2\2\u0963\u0960\3\2\2\2\u0964\u0967\3\2\2\2\u0965"+
		"\u0963\3\2\2\2\u0965\u0966\3\2\2\2\u0966\u0139\3\2\2\2\u0967\u0965\3\2"+
		"\2\2\u0968\u096e\5\u013e\u00a0\2\u0969\u096a\7\u017a\2\2\u096a\u096b\5"+
		"\u0138\u009d\2\u096b\u096c\7\u017c\2\2\u096c\u096e\3\2\2\2\u096d\u0968"+
		"\3\2\2\2\u096d\u0969\3\2\2\2\u096e\u013b\3\2\2\2\u096f\u0971\7\u0130\2"+
		"\2\u0970\u0972\7\b\2\2\u0971\u0970\3\2\2\2\u0971\u0972\3\2\2\2\u0972\u097c"+
		"\3\2\2\2\u0973\u0975\7g\2\2\u0974\u0976\7\b\2\2\u0975\u0974\3\2\2\2\u0975"+
		"\u0976\3\2\2\2\u0976\u097c\3\2\2\2\u0977\u0979\7\u0098\2\2\u0978\u097a"+
		"\7\b\2\2\u0979\u0978\3\2\2\2\u0979\u097a\3\2\2\2\u097a\u097c\3\2\2\2\u097b"+
		"\u096f\3\2\2\2\u097b\u0973\3\2\2\2\u097b\u0977\3\2\2\2\u097c\u013d\3\2"+
		"\2\2\u097d\u097e\t&\2\2\u097e\u0980\5\u0146\u00a4\2\u097f\u0981\5\u0156"+
		"\u00ac\2\u0980\u097f\3\2\2\2\u0980\u0981\3\2\2\2\u0981\u0983\3\2\2\2\u0982"+
		"\u0984\5\u015a\u00ae\2\u0983\u0982\3\2\2\2\u0983\u0984\3\2\2\2\u0984\u0986"+
		"\3\2\2\2\u0985\u0987\5\u017c\u00bf\2\u0986\u0985\3\2\2\2\u0986\u0987\3"+
		"\2\2\2\u0987\u0989\3\2\2\2\u0988\u098a\5\u017e\u00c0\2\u0989\u0988\3\2"+
		"\2\2\u0989\u098a\3\2\2\2\u098a\u098c\3\2\2\2\u098b\u098d\5\u0182\u00c2"+
		"\2\u098c\u098b\3\2\2\2\u098c\u098d\3\2\2\2\u098d\u0990\3\2\2\2\u098e\u0991"+
		"\5\u0186\u00c4\2\u098f\u0991\5\u0188\u00c5\2\u0990\u098e\3\2\2\2\u0990"+
		"\u098f\3\2\2\2\u0990\u0991\3\2\2\2\u0991\u0993\3\2\2\2\u0992\u0994\5\u018a"+
		"\u00c6\2\u0993\u0992\3\2\2\2\u0993\u0994\3\2\2\2\u0994\u0996\3\2\2\2\u0995"+
		"\u0997\5\u018c\u00c7\2\u0996\u0995\3\2\2\2\u0996\u0997\3\2\2\2\u0997\u0999"+
		"\3\2\2\2\u0998\u099a\5\u0140\u00a1\2\u0999\u0998\3\2\2\2\u0999\u099a\3"+
		"\2\2\2\u099a\u013f\3\2\2\2\u099b\u099c\7\u0166\2\2\u099c\u09a1\5\u0142"+
		"\u00a2\2\u099d\u099e\7\u016b\2\2\u099e\u09a0\5\u0142\u00a2\2\u099f\u099d"+
		"\3\2\2\2\u09a0\u09a3\3\2\2\2\u09a1\u099f\3\2\2\2\u09a1\u09a2\3\2\2\2\u09a2"+
		"\u0141\3\2\2\2\u09a3\u09a1\3\2\2\2\u09a4\u09a5\5\u01fc\u00ff\2\u09a5\u09a6"+
		"\7\16\2\2\u09a6\u09a7\5\u0144\u00a3\2\u09a7\u0143\3\2\2\2\u09a8\u09aa"+
		"\7\u017a\2\2\u09a9\u09ab\5\u01d6\u00ec\2\u09aa\u09a9\3\2\2\2\u09aa\u09ab"+
		"\3\2\2\2\u09ab\u09ad\3\2\2\2\u09ac\u09ae\5\u018a\u00c6\2\u09ad\u09ac\3"+
		"\2\2\2\u09ad\u09ae\3\2\2\2\u09ae\u09b0\3\2\2\2\u09af\u09b1\5\u01d2\u00ea"+
		"\2\u09b0\u09af\3\2\2\2\u09b0\u09b1\3\2\2\2\u09b1\u09b2\3\2\2\2\u09b2\u09b3"+
		"\7\u017c\2\2\u09b3\u0145\3\2\2\2\u09b4\u09b6\5\u0148\u00a5\2\u09b5\u09b4"+
		"\3\2\2\2\u09b5\u09b6\3\2\2\2\u09b6\u09b8\3\2\2\2\u09b7\u09b9\5\u014a\u00a6"+
		"\2\u09b8\u09b7\3\2\2\2\u09b8\u09b9\3\2\2\2\u09b9\u09ba\3\2\2\2\u09ba\u09bf"+
		"\5\u014c\u00a7\2\u09bb\u09bc\7\u016b\2\2\u09bc\u09be\5\u014c\u00a7\2\u09bd"+
		"\u09bb\3\2\2\2\u09be\u09c1\3\2\2\2\u09bf\u09bd\3\2\2\2\u09bf\u09c0\3\2"+
		"\2\2\u09c0\u0147\3\2\2\2\u09c1\u09bf\3\2\2\2\u09c2\u09c3\t\'\2\2\u09c3"+
		"\u0149\3\2\2\2\u09c4\u09c5\7\u012b\2\2\u09c5\u09c6\5\u01b6\u00dc\2\u09c6"+
		"\u014b\3\2\2\2\u09c7\u09c8\5\u01fe\u0100\2\u09c8\u09c9\7\u0170\2\2\u09c9"+
		"\u09cb\3\2\2\2\u09ca\u09c7\3\2\2\2\u09ca\u09cb\3\2\2\2\u09cb\u09cc\3\2"+
		"\2\2\u09cc\u09ce\5\u01b6\u00dc\2\u09cd\u09cf\5\u014e\u00a8\2\u09ce\u09cd"+
		"\3\2\2\2\u09ce\u09cf\3\2\2\2\u09cf\u09d2\3\2\2\2\u09d0\u09d2\5\u0152\u00aa"+
		"\2\u09d1\u09ca\3\2\2\2\u09d1\u09d0\3\2\2\2\u09d2\u014d\3\2\2\2\u09d3\u09d5"+
		"\6\u00a8\5\2\u09d4\u09d6\7\16\2\2\u09d5\u09d4\3\2\2\2\u09d5\u09d6\3\2"+
		"\2\2\u09d6\u09e3\3\2\2\2\u09d7\u09e4\5\u0150\u00a9\2\u09d8\u09d9\7\u017a"+
		"\2\2\u09d9\u09de\5\u0150\u00a9\2\u09da\u09db\7\u016b\2\2\u09db\u09dd\5"+
		"\u0150\u00a9\2\u09dc\u09da\3\2\2\2\u09dd\u09e0\3\2\2\2\u09de\u09dc\3\2"+
		"\2\2\u09de\u09df\3\2\2\2\u09df\u09e1\3\2\2\2\u09e0\u09de\3\2\2\2\u09e1"+
		"\u09e2\7\u017c\2\2\u09e2\u09e4\3\2\2\2\u09e3\u09d7\3\2\2\2\u09e3\u09d8"+
		"\3\2\2\2\u09e4\u09ea\3\2\2\2\u09e5\u09e6\7\u017a\2\2\u09e6\u09e7\7\u0129"+
		"\2\2\u09e7\u09e8\7\u0184\2\2\u09e8\u09ea\7\u017c\2\2\u09e9\u09d3\3\2\2"+
		"\2\u09e9\u09e5\3\2\2\2\u09ea\u014f\3\2\2\2\u09eb\u09ed\7\u0180\2\2\u09ec"+
		"\u09eb\3\2\2\2\u09ec\u09ed\3\2\2\2\u09ed\u09f1\3\2\2\2\u09ee\u09f2\7\u0182"+
		"\2\2\u09ef\u09f2\7\u018e\2\2\u09f0\u09f2\5\u020a\u0106\2\u09f1\u09ee\3"+
		"\2\2\2\u09f1\u09ef\3\2\2\2\u09f1\u09f0\3\2\2\2\u09f2\u09fd\3\2\2\2\u09f3"+
		"\u09f5\7\u016e\2\2\u09f4\u09f6\7\u0180\2\2\u09f5\u09f4\3\2\2\2\u09f5\u09f6"+
		"\3\2\2\2\u09f6\u09f9\3\2\2\2\u09f7\u09fa\7\u0182\2\2\u09f8\u09fa\5\u020a"+
		"\u0106\2\u09f9\u09f7\3\2\2\2\u09f9\u09f8\3\2\2\2\u09fa\u09fc\3\2\2\2\u09fb"+
		"\u09f3\3\2\2\2\u09fc\u09ff\3\2\2\2\u09fd\u09fb\3\2\2\2\u09fd\u09fe\3\2"+
		"\2\2\u09fe\u0151\3\2\2\2\u09ff\u09fd\3\2\2\2\u0a00\u0a01\7\u0182\2\2\u0a01"+
		"\u0a03\7\u016e\2\2\u0a02\u0a00\3\2\2\2\u0a02\u0a03\3\2\2\2\u0a03\u0a04"+
		"\3\2\2\2\u0a04\u0a05\7\u0178\2\2\u0a05\u0153\3\2\2\2\u0a06\u0a07\5\u01fc"+
		"\u00ff\2\u0a07\u0a08\7\u017a\2\2\u0a08\u0a09\7\u0186\2\2\u0a09\u0a0a\7"+
		"\u017c\2\2\u0a0a\u0155\3\2\2\2\u0a0b\u0a0d\5\u0158\u00ad\2\u0a0c\u0a0b"+
		"\3\2\2\2\u0a0c\u0a0d\3\2\2\2\u0a0d\u0a0e\3\2\2\2\u0a0e\u0a11\7\u009a\2"+
		"\2\u0a0f\u0a12\5\u0154\u00ab\2\u0a10\u0a12\5\u01fc\u00ff\2\u0a11\u0a0f"+
		"\3\2\2\2\u0a11\u0a10\3\2\2\2\u0a12\u0a1a\3\2\2\2\u0a13\u0a16\7\u016b\2"+
		"\2\u0a14\u0a17\5\u0154\u00ab\2\u0a15\u0a17\5\u01fc\u00ff\2\u0a16\u0a14"+
		"\3\2\2\2\u0a16\u0a15\3\2\2\2\u0a17\u0a19\3\2\2\2\u0a18\u0a13\3\2\2\2\u0a19"+
		"\u0a1c\3\2\2\2\u0a1a\u0a18\3\2\2\2\u0a1a\u0a1b\3\2\2\2\u0a1b\u0157\3\2"+
		"\2\2\u0a1c\u0a1a\3\2\2\2\u0a1d\u0a1e\7\36\2\2\u0a1e\u0a1f\7.\2\2\u0a1f"+
		"\u0159\3\2\2\2\u0a20\u0a21\7y\2\2\u0a21\u0a25\5\u015c\u00af\2\u0a22\u0a24"+
		"\5\u0162\u00b2\2\u0a23\u0a22\3\2\2\2\u0a24\u0a27\3\2\2\2\u0a25\u0a23\3"+
		"\2\2\2\u0a25\u0a26\3\2\2\2\u0a26\u0a2b\3\2\2\2\u0a27\u0a25\3\2\2\2\u0a28"+
		"\u0a2a\5\u0170\u00b9\2\u0a29\u0a28\3\2\2\2\u0a2a\u0a2d\3\2\2\2\u0a2b\u0a29"+
		"\3\2\2\2\u0a2b\u0a2c\3\2\2\2\u0a2c\u015b\3\2\2\2\u0a2d\u0a2b\3\2\2\2\u0a2e"+
		"\u0a32\5\u015e\u00b0\2\u0a2f\u0a32\5\u0160\u00b1\2\u0a30\u0a32\5\u0168"+
		"\u00b5\2\u0a31\u0a2e\3\2\2\2\u0a31\u0a2f\3\2\2\2\u0a31\u0a30\3\2\2\2\u0a32"+
		"\u015d\3\2\2\2\u0a33\u0a35\5\u0172\u00ba\2\u0a34\u0a36\5\u016c\u00b7\2"+
		"\u0a35\u0a34\3\2\2\2\u0a35\u0a36\3\2\2\2\u0a36\u015f\3\2\2\2\u0a37\u0a38"+
		"\7\u017a\2\2\u0a38\u0a39\5\u0130\u0099\2\u0a39\u0a3b\7\u017c\2\2\u0a3a"+
		"\u0a3c\5\u016c\u00b7\2\u0a3b\u0a3a\3\2\2\2\u0a3b\u0a3c\3\2\2\2\u0a3c\u0161"+
		"\3\2\2\2\u0a3d\u0a3e\7\u016b\2\2\u0a3e\u0a4c\5\u015c\u00af\2\u0a3f\u0a40"+
		"\5\u0166\u00b4\2\u0a40\u0a43\5\u015c\u00af\2\u0a41\u0a42\7\u00ce\2\2\u0a42"+
		"\u0a44\5\u01a6\u00d4\2\u0a43\u0a41\3\2\2\2\u0a43\u0a44\3\2\2\2\u0a44\u0a4c"+
		"\3\2\2\2\u0a45\u0a46\5\u0164\u00b3\2\u0a46\u0a49\5\u015c\u00af\2\u0a47"+
		"\u0a48\7\u00ce\2\2\u0a48\u0a4a\5\u01a6\u00d4\2\u0a49\u0a47\3\2\2\2\u0a49"+
		"\u0a4a\3\2\2\2\u0a4a\u0a4c\3\2\2\2\u0a4b\u0a3d\3\2\2\2\u0a4b\u0a3f\3\2"+
		"\2\2\u0a4b\u0a45\3\2\2\2\u0a4c\u0163\3\2\2\2\u0a4d\u0a4e\7?\2\2\u0a4e"+
		"\u0a4f\7\u009f\2\2\u0a4f\u0165\3\2\2\2\u0a50\u0a52\7\u0090\2\2\u0a51\u0a50"+
		"\3\2\2\2\u0a51\u0a52\3\2\2\2\u0a52\u0a53\3\2\2\2\u0a53\u0a62\7\u009f\2"+
		"\2\u0a54\u0a56\t(\2\2\u0a55\u0a57\7\u00d4\2\2\u0a56\u0a55\3\2\2\2\u0a56"+
		"\u0a57\3\2\2\2\u0a57\u0a58\3\2\2\2\u0a58\u0a62\7\u009f\2\2\u0a59\u0a5a"+
		"\7\u00a7\2\2\u0a5a\u0a5b\7\u00a0\2\2\u0a5b\u0a62\7\u009f\2\2\u0a5c\u0a5e"+
		"\7\u00a7\2\2\u0a5d\u0a5c\3\2\2\2\u0a5d\u0a5e\3\2\2\2\u0a5e\u0a5f\3\2\2"+
		"\2\u0a5f\u0a60\7\u018f\2\2\u0a60\u0a62\7\u009f\2\2\u0a61\u0a51\3\2\2\2"+
		"\u0a61\u0a54\3\2\2\2\u0a61\u0a59\3\2\2\2\u0a61\u0a5d\3\2\2\2\u0a62\u0167"+
		"\3\2\2\2\u0a63\u0a64\7\u0121\2\2\u0a64\u0a65\7\u017a\2\2\u0a65\u0a66\7"+
		"\u0137\2\2\u0a66\u0a6b\5\u016a\u00b6\2\u0a67\u0a68\7\u016b\2\2\u0a68\u0a6a"+
		"\5\u016a\u00b6\2\u0a69\u0a67\3\2\2\2\u0a6a\u0a6d\3\2\2\2\u0a6b\u0a69\3"+
		"\2\2\2\u0a6b\u0a6c\3\2\2\2\u0a6c\u0a6e\3\2\2\2\u0a6d\u0a6b\3\2\2\2\u0a6e"+
		"\u0a70\7\u017c\2\2\u0a6f\u0a71\5\u016c\u00b7\2\u0a70\u0a6f\3\2\2\2\u0a70"+
		"\u0a71\3\2\2\2\u0a71\u0169\3\2\2\2\u0a72\u0a7f\5\u01b6\u00dc\2\u0a73\u0a74"+
		"\7\u017a\2\2\u0a74\u0a79\5\u01b6\u00dc\2\u0a75\u0a76\7\u016b\2\2\u0a76"+
		"\u0a78\5\u01b6\u00dc\2\u0a77\u0a75\3\2\2\2\u0a78\u0a7b\3\2\2\2\u0a79\u0a77"+
		"\3\2\2\2\u0a79\u0a7a\3\2\2\2\u0a7a\u0a7c\3\2\2\2\u0a7b\u0a79\3\2\2\2\u0a7c"+
		"\u0a7d\7\u017c\2\2\u0a7d\u0a7f\3\2\2\2\u0a7e\u0a72\3\2\2\2\u0a7e\u0a73"+
		"\3\2\2\2\u0a7f\u016b\3\2\2\2\u0a80\u0a82\6\u00b7\6\2\u0a81\u0a83\7\16"+
		"\2\2\u0a82\u0a81\3\2\2\2\u0a82\u0a83\3\2\2\2\u0a83\u0a84\3\2\2\2\u0a84"+
		"\u0a8f\5\u016e\u00b8\2\u0a85\u0a86\7\u017a\2\2\u0a86\u0a8b\7\u0182\2\2"+
		"\u0a87\u0a88\7\u016b\2\2\u0a88\u0a8a\7\u0182\2\2\u0a89\u0a87\3\2\2\2\u0a8a"+
		"\u0a8d\3\2\2\2\u0a8b\u0a89\3\2\2\2\u0a8b\u0a8c\3\2\2\2\u0a8c\u0a8e\3\2"+
		"\2\2\u0a8d\u0a8b\3\2\2\2\u0a8e\u0a90\7\u017c\2\2\u0a8f\u0a85\3\2\2\2\u0a8f"+
		"\u0a90\3\2\2\2\u0a90\u016d\3\2\2\2\u0a91\u0a93\7\u0180\2\2\u0a92\u0a91"+
		"\3\2\2\2\u0a92\u0a93\3\2\2\2\u0a93\u0a97\3\2\2\2\u0a94\u0a98\7\u0182\2"+
		"\2\u0a95\u0a98\7\u018e\2\2\u0a96\u0a98\5\u020a\u0106\2\u0a97\u0a94\3\2"+
		"\2\2\u0a97\u0a95\3\2\2\2\u0a97\u0a96\3\2\2\2\u0a98\u0aa3\3\2\2\2\u0a99"+
		"\u0a9b\7\u016e\2\2\u0a9a\u0a9c\7\u0180\2\2\u0a9b\u0a9a\3\2\2\2\u0a9b\u0a9c"+
		"\3\2\2\2\u0a9c\u0a9f\3\2\2\2\u0a9d\u0aa0\7\u0182\2\2\u0a9e\u0aa0\5\u020a"+
		"\u0106\2\u0a9f\u0a9d\3\2\2\2\u0a9f\u0a9e\3\2\2\2\u0aa0\u0aa2\3\2\2\2\u0aa1"+
		"\u0a99\3\2\2\2\u0aa2\u0aa5\3\2\2\2\u0aa3\u0aa1\3\2\2\2\u0aa3\u0aa4\3\2"+
		"\2\2\u0aa4\u016f\3\2\2\2\u0aa5\u0aa3\3\2\2\2\u0aa6\u0aa7\7\u0167\2\2\u0aa7"+
		"\u0aa9\7\u0168\2\2\u0aa8\u0aaa\7\u00d4\2\2\u0aa9\u0aa8\3\2\2\2\u0aa9\u0aaa"+
		"\3\2\2\2\u0aaa\u0aab\3\2\2\2\u0aab\u0aac\5\u01da\u00ee\2\u0aac\u0aad\5"+
		"\u016c\u00b7\2\u0aad\u0ab2\5\u014e\u00a8\2\u0aae\u0aaf\7\u016b\2\2\u0aaf"+
		"\u0ab1\5\u014e\u00a8\2\u0ab0\u0aae\3\2\2\2\u0ab1\u0ab4\3\2\2\2\u0ab2\u0ab0"+
		"\3\2\2\2\u0ab2\u0ab3\3\2\2\2\u0ab3\u0171\3\2\2\2\u0ab4\u0ab2\3\2\2\2\u0ab5"+
		"\u0ab6\5\u0174\u00bb\2\u0ab6\u0ab7\7\u016e\2\2\u0ab7\u0ab9\3\2\2\2\u0ab8"+
		"\u0ab5\3\2\2\2\u0ab8\u0ab9\3\2\2\2\u0ab9\u0aba\3\2\2\2\u0aba\u0abb\5\u0176"+
		"\u00bc\2\u0abb\u0173\3\2\2\2\u0abc\u0abe\7\u0180\2\2\u0abd\u0abc\3\2\2"+
		"\2\u0abd\u0abe\3\2\2\2\u0abe\u0ac2\3\2\2\2\u0abf\u0ac3\7\u0182\2\2\u0ac0"+
		"\u0ac3\7\u018e\2\2\u0ac1\u0ac3\5\u020a\u0106\2\u0ac2\u0abf\3\2\2\2\u0ac2"+
		"\u0ac0\3\2\2\2\u0ac2\u0ac1\3\2\2\2\u0ac3\u0175\3\2\2\2\u0ac4\u0ac6\7\u0180"+
		"\2\2\u0ac5\u0ac4\3\2\2\2\u0ac5\u0ac6\3\2\2\2\u0ac6\u0aca\3\2\2\2\u0ac7"+
		"\u0acb\7\u0182\2\2\u0ac8\u0acb\7\u018e\2\2\u0ac9\u0acb\5\u020a\u0106\2"+
		"\u0aca\u0ac7\3\2\2\2\u0aca\u0ac8\3\2\2\2\u0aca\u0ac9\3\2\2\2\u0acb\u0177"+
		"\3\2\2\2\u0acc\u0ace\7\u0180\2\2\u0acd\u0acc\3\2\2\2\u0acd\u0ace\3\2\2"+
		"\2\u0ace\u0ad2\3\2\2\2\u0acf\u0ad0\5\u0172\u00ba\2\u0ad0\u0ad1\7\u016e"+
		"\2\2\u0ad1\u0ad3\3\2\2\2\u0ad2\u0acf\3\2\2\2\u0ad2\u0ad3\3\2\2\2\u0ad3"+
		"\u0ad4\3\2\2\2\u0ad4\u0ad5\5\u017a\u00be\2\u0ad5\u0179\3\2\2\2\u0ad6\u0ad8"+
		"\7\u0180\2\2\u0ad7\u0ad6\3\2\2\2\u0ad7\u0ad8\3\2\2\2\u0ad8\u0adc\3\2\2"+
		"\2\u0ad9\u0add\7\u0182\2\2\u0ada\u0add\7\u018e\2\2\u0adb\u0add\5\u020a"+
		"\u0106\2\u0adc\u0ad9\3\2\2\2\u0adc\u0ada\3\2\2\2\u0adc\u0adb\3\2\2\2\u0add"+
		"\u017b\3\2\2\2\u0ade\u0adf\7\u013e\2\2\u0adf\u0ae0\5\u01a6\u00d4\2\u0ae0"+
		"\u017d\3\2\2\2\u0ae1\u0ae2\7\u0080\2\2\u0ae2\u0ae3\7\37\2\2\u0ae3\u0ae8"+
		"\5\u01b6\u00dc\2\u0ae4\u0ae5\7\u016b\2\2\u0ae5\u0ae7\5\u01b6\u00dc\2\u0ae6"+
		"\u0ae4\3\2\2\2\u0ae7\u0aea\3\2\2\2\u0ae8\u0ae6\3\2\2\2\u0ae8\u0ae9\3\2"+
		"\2\2\u0ae9\u0aec\3\2\2\2\u0aea\u0ae8\3\2\2\2\u0aeb\u0aed\5\u0180\u00c1"+
		"\2\u0aec\u0aeb\3\2\2\2\u0aec\u0aed\3\2\2\2\u0aed\u017f\3\2\2\2\u0aee\u0aef"+
		"\7\u0140\2\2\u0aef\u0af0\t)\2\2\u0af0\u0181\3\2\2\2\u0af1\u0af2\7\u0081"+
		"\2\2\u0af2\u0af3\7\u0109\2\2\u0af3\u0af4\7\u017a\2\2\u0af4\u0af9\5\u0184"+
		"\u00c3\2\u0af5\u0af6\7\u016b\2\2\u0af6\u0af8\5\u0184\u00c3\2\u0af7\u0af5"+
		"\3\2\2\2\u0af8\u0afb\3\2\2\2\u0af9\u0af7\3\2\2\2\u0af9\u0afa\3\2\2\2\u0afa"+
		"\u0afc\3\2\2\2\u0afb\u0af9\3\2\2\2\u0afc\u0afd\7\u017c\2\2\u0afd\u0183"+
		"\3\2\2\2\u0afe\u0b0c\5\u01b6\u00dc\2\u0aff\u0b01\7\u017a\2\2\u0b00\u0b02"+
		"\5\u01b6\u00dc\2\u0b01\u0b00\3\2\2\2\u0b01\u0b02\3\2\2\2\u0b02\u0b07\3"+
		"\2\2\2\u0b03\u0b04\7\u016b\2\2\u0b04\u0b06\5\u0184\u00c3\2\u0b05\u0b03"+
		"\3\2\2\2\u0b06\u0b09\3\2\2\2\u0b07\u0b05\3\2\2\2\u0b07\u0b08\3\2\2\2\u0b08"+
		"\u0b0a\3\2\2\2\u0b09\u0b07\3\2\2\2\u0b0a\u0b0c\7\u017c\2\2\u0b0b\u0afe"+
		"\3\2\2\2\u0b0b\u0aff\3\2\2\2\u0b0c\u0185\3\2\2\2\u0b0d\u0b0e\7\u0084\2"+
		"\2\u0b0e\u0b0f\5\u01a6\u00d4\2\u0b0f\u0187\3\2\2\2\u0b10\u0b11\7\u00e3"+
		"\2\2\u0b11\u0b12\5\u01a6\u00d4\2\u0b12\u0189\3\2\2\2\u0b13\u0b14\7\u00d2"+
		"\2\2\u0b14\u0b15\7\37\2\2\u0b15\u0b17\5\u01b6\u00dc\2\u0b16\u0b18\t\n"+
		"\2\2\u0b17\u0b16\3\2\2\2\u0b17\u0b18\3\2\2\2\u0b18\u0b20\3\2\2\2\u0b19"+
		"\u0b1a\7\u016b\2\2\u0b1a\u0b1c\5\u01b6\u00dc\2\u0b1b\u0b1d\t\n\2\2\u0b1c"+
		"\u0b1b\3\2\2\2\u0b1c\u0b1d\3\2\2\2\u0b1d\u0b1f\3\2\2\2\u0b1e\u0b19\3\2"+
		"\2\2\u0b1f\u0b22\3\2\2\2\u0b20\u0b1e\3\2\2\2\u0b20\u0b21\3\2\2\2\u0b21"+
		"\u018b\3\2\2\2\u0b22\u0b20\3\2\2\2\u0b23\u0b25\5\u018e\u00c8\2\u0b24\u0b23"+
		"\3\2\2\2\u0b25\u0b26\3\2\2\2\u0b26\u0b24\3\2\2\2\u0b26\u0b27\3\2\2\2\u0b27"+
		"\u018d\3\2\2\2\u0b28\u0b29\7\u00a9\2\2\u0b29\u0b34\5\u01b6\u00dc\2\u0b2a"+
		"\u0b2b\7\u0140\2\2\u0b2b\u0b31\t*\2\2\u0b2c\u0b2d\7\u0134\2\2\u0b2d\u0b2e"+
		"\7\13\2\2\u0b2e\u0b2f\7\u00a2\2\2\u0b2f\u0b30\t+\2\2\u0b30\u0b32\7\u00af"+
		"\2\2\u0b31\u0b2c\3\2\2\2\u0b31\u0b32\3\2\2\2\u0b32\u0b34\3\2\2\2\u0b33"+
		"\u0b28\3\2\2\2\u0b33\u0b2a\3\2\2\2\u0b34\u018f\3\2\2\2\u0b35\u0b36\7\u0132"+
		"\2\2\u0b36\u0b37\5\u0194\u00cb\2\u0b37\u0b38\7\u0106\2\2\u0b38\u0b3a\5"+
		"\u0192\u00ca\2\u0b39\u0b3b\5\u017c\u00bf\2\u0b3a\u0b39\3\2\2\2\u0b3a\u0b3b"+
		"\3\2\2\2\u0b3b\u0b3d\3\2\2\2\u0b3c\u0b3e\5\u0196\u00cc\2\u0b3d\u0b3c\3"+
		"\2\2\2\u0b3d\u0b3e\3\2\2\2\u0b3e\u0191\3\2\2\2\u0b3f\u0b44\5\34\17\2\u0b40"+
		"\u0b41\7\u016b\2\2\u0b41\u0b43\5\34\17\2\u0b42\u0b40\3\2\2\2\u0b43\u0b46"+
		"\3\2\2\2\u0b44\u0b42\3\2\2\2\u0b44\u0b45\3\2\2\2\u0b45\u0193\3\2\2\2\u0b46"+
		"\u0b44\3\2\2\2\u0b47\u0b49\5\u0172\u00ba\2\u0b48\u0b4a\5\u015a\u00ae\2"+
		"\u0b49\u0b48\3\2\2\2\u0b49\u0b4a\3\2\2\2\u0b4a\u0b50\3\2\2\2\u0b4b\u0b4c"+
		"\7\u017a\2\2\u0b4c\u0b4d\5\u0130\u0099\2\u0b4d\u0b4e\7\u017c\2\2\u0b4e"+
		"\u0b50\3\2\2\2\u0b4f\u0b47\3\2\2\2\u0b4f\u0b4b\3\2\2\2\u0b50\u0b55\3\2"+
		"\2\2\u0b51\u0b53\7\16\2\2\u0b52\u0b51\3\2\2\2\u0b52\u0b53\3\2\2\2\u0b53"+
		"\u0b54\3\2\2\2\u0b54\u0b56\5\u01fe\u0100\2\u0b55\u0b52\3\2\2\2\u0b55\u0b56"+
		"\3\2\2\2\u0b56\u0195\3\2\2\2\u0b57\u0b58\7`\2\2\u0b58\u0b59\5\u00bc_\2"+
		"\u0b59\u0197\3\2\2\2\u0b5a\u0b5b\7\u00b8\2\2\u0b5b\u0b5c\7\u009a\2\2\u0b5c"+
		"\u0b5d\5\u019a\u00ce\2\u0b5d\u0b5e\7\u0135\2\2\u0b5e\u0b5f\5\u019a\u00ce"+
		"\2\u0b5f\u0b60\7\u00ce\2\2\u0b60\u0b62\5\u01a6\u00d4\2\u0b61\u0b63\5\u019c"+
		"\u00cf\2\u0b62\u0b61\3\2\2\2\u0b63\u0b64\3\2\2\2\u0b64\u0b62\3\2\2\2\u0b64"+
		"\u0b65\3\2\2\2\u0b65\u0199\3\2\2\2\u0b66\u0b6c\5\u0172\u00ba\2\u0b67\u0b68"+
		"\7\u017a\2\2\u0b68\u0b69\5\u0130\u0099\2\u0b69\u0b6a\7\u017c\2\2\u0b6a"+
		"\u0b6c\3\2\2\2\u0b6b\u0b66\3\2\2\2\u0b6b\u0b67\3\2\2\2\u0b6c\u0b71\3\2"+
		"\2\2\u0b6d\u0b6f\7\16\2\2\u0b6e\u0b6d\3\2\2\2\u0b6e\u0b6f\3\2\2\2\u0b6f"+
		"\u0b70\3\2\2\2\u0b70\u0b72\5\u01fe\u0100\2\u0b71\u0b6e\3\2\2\2\u0b71\u0b72"+
		"\3\2\2\2\u0b72\u019b\3\2\2\2\u0b73\u0b75\7\u013d\2\2\u0b74\u0b76\7\u00c6"+
		"\2\2\u0b75\u0b74\3\2\2\2\u0b75\u0b76\3\2\2\2\u0b76\u0b77\3\2\2\2\u0b77"+
		"\u0b7a\7\u00b5\2\2\u0b78\u0b79\7\13\2\2\u0b79\u0b7b\5\u01a6\u00d4\2\u0b7a"+
		"\u0b78\3\2\2\2\u0b7a\u0b7b\3\2\2\2\u0b7b\u0b7c\3\2\2\2\u0b7c\u0b7d\7\u0126"+
		"\2\2\u0b7d\u0b81\5\u019e\u00d0\2\u0b7e\u0b7f\7`\2\2\u0b7f\u0b81\7\u008a"+
		"\2\2\u0b80\u0b73\3\2\2\2\u0b80\u0b7e\3\2\2\2\u0b81\u019d\3\2\2\2\u0b82"+
		"\u0b84\7\u0092\2\2\u0b83\u0b85\5\u00c6d\2\u0b84\u0b83\3\2\2\2\u0b84\u0b85"+
		"\3\2\2\2\u0b85\u0b86\3\2\2\2\u0b86\u0b87\7\u0137\2\2\u0b87\u0b97\5\u00ca"+
		"f\2\u0b88\u0b89\7\u0132\2\2\u0b89\u0b8a\7\u0106\2\2\u0b8a\u0b8f\5\34\17"+
		"\2\u0b8b\u0b8c\7\u016b\2\2\u0b8c\u0b8e\5\34\17\2\u0b8d\u0b8b\3\2\2\2\u0b8e"+
		"\u0b91\3\2\2\2\u0b8f\u0b8d\3\2\2\2\u0b8f\u0b90\3\2\2\2\u0b90\u0b93\3\2"+
		"\2\2\u0b91\u0b8f\3\2\2\2\u0b92\u0b94\5\u017c\u00bf\2\u0b93\u0b92\3\2\2"+
		"\2\u0b93\u0b94\3\2\2\2\u0b94\u0b97\3\2\2\2\u0b95\u0b97\7R\2\2\u0b96\u0b82"+
		"\3\2\2\2\u0b96\u0b88\3\2\2\2\u0b96\u0b95\3\2\2\2\u0b97\u019f\3\2\2\2\u0b98"+
		"\u0b9a\7R\2\2\u0b99\u0b9b\7y\2\2\u0b9a\u0b99\3\2\2\2\u0b9a\u0b9b\3\2\2"+
		"\2\u0b9b\u0b9c\3\2\2\2\u0b9c\u0b9e\5\u0172\u00ba\2\u0b9d\u0b9f\5\u01a2"+
		"\u00d2\2\u0b9e\u0b9d\3\2\2\2\u0b9e\u0b9f\3\2\2\2\u0b9f\u0ba2\3\2\2\2\u0ba0"+
		"\u0ba3\5\u017c\u00bf\2\u0ba1\u0ba3\7\b\2\2\u0ba2\u0ba0\3\2\2\2\u0ba2\u0ba1"+
		"\3\2\2\2\u0ba2\u0ba3\3\2\2\2\u0ba3\u01a1\3\2\2\2\u0ba4\u0ba6\6\u00d2\7"+
		"\2\u0ba5\u0ba7\7\16\2\2\u0ba6\u0ba5\3\2\2\2\u0ba6\u0ba7\3\2\2\2\u0ba7"+
		"\u0ba8\3\2\2\2\u0ba8\u0ba9\5\u01fe\u0100\2\u0ba9\u01a3\3\2\2\2\u0baa\u0bac"+
		"\t,\2\2\u0bab\u0bad\7\u0121\2\2\u0bac\u0bab\3\2\2\2\u0bac\u0bad\3\2\2"+
		"\2\u0bad\u0bae\3\2\2\2\u0bae\u0baf\5\u0172\u00ba\2\u0baf\u01a5\3\2\2\2"+
		"\u0bb0\u0bb2\b\u00d4\1\2\u0bb1\u0bb3\7\u00c6\2\2\u0bb2\u0bb1\3\2\2\2\u0bb2"+
		"\u0bb3\3\2\2\2\u0bb3\u0bb4\3\2\2\2\u0bb4\u0bb5\7\u017a\2\2\u0bb5\u0bb6"+
		"\5\u01a6\u00d4\2\u0bb6\u0bb7\7\u017c\2\2\u0bb7\u0bbe\3\2\2\2\u0bb8\u0bbe"+
		"\5\u01a8\u00d5\2\u0bb9\u0bbb\7\u00c6\2\2\u0bba\u0bb9\3\2\2\2\u0bba\u0bbb"+
		"\3\2\2\2\u0bbb\u0bbc\3\2\2\2\u0bbc\u0bbe\5\u01a8\u00d5\2\u0bbd\u0bb0\3"+
		"\2\2\2\u0bbd\u0bb8\3\2\2\2\u0bbd\u0bba\3\2\2\2\u0bbe\u0bc5\3\2\2\2\u0bbf"+
		"\u0bc0\f\5\2\2\u0bc0\u0bc1\5\u01b2\u00da\2\u0bc1\u0bc2\5\u01a6\u00d4\6"+
		"\u0bc2\u0bc4\3\2\2\2\u0bc3\u0bbf\3\2\2\2\u0bc4\u0bc7\3\2\2\2\u0bc5\u0bc3"+
		"\3\2\2\2\u0bc5\u0bc6\3\2\2\2\u0bc6\u01a7\3\2\2\2\u0bc7\u0bc5\3\2\2\2\u0bc8"+
		"\u0bcc\5\u01aa\u00d6\2\u0bc9\u0bcc\5\u01b0\u00d9\2\u0bca\u0bcc\5\u01b6"+
		"\u00dc\2\u0bcb\u0bc8\3\2\2\2\u0bcb\u0bc9\3\2\2\2\u0bcb\u0bca\3\2\2\2\u0bcc"+
		"\u01a9\3\2\2\2\u0bcd\u0bce\5\u01b6\u00dc\2\u0bce\u0bd0\7\u009c\2\2\u0bcf"+
		"\u0bd1\7\u00c6\2\2\u0bd0\u0bcf\3\2\2\2\u0bd0\u0bd1\3\2\2\2\u0bd1\u0bd2"+
		"\3\2\2\2\u0bd2\u0bd3\7\u00c8\2\2\u0bd3\u0be5\3\2\2\2\u0bd4\u0bd5\5\u01b6"+
		"\u00dc\2\u0bd5\u0bd6\7\26\2\2\u0bd6\u0bd7\5\u01b6\u00dc\2\u0bd7\u0bd8"+
		"\7\13\2\2\u0bd8\u0bd9\5\u01b6\u00dc\2\u0bd9\u0be5\3\2\2\2\u0bda\u0bdc"+
		"\7\u00c6\2\2\u0bdb\u0bda\3\2\2\2\u0bdb\u0bdc\3\2\2\2\u0bdc\u0bdd\3\2\2"+
		"\2\u0bdd\u0bde\7l\2\2\u0bde\u0bdf\7\u017a\2\2\u0bdf\u0be0\5\u0130\u0099"+
		"\2\u0be0\u0be1\7\u017c\2\2\u0be1\u0be5\3\2\2\2\u0be2\u0be5\5\u01ac\u00d7"+
		"\2\u0be3\u0be5\5\u01ae\u00d8\2\u0be4\u0bcd\3\2\2\2\u0be4\u0bd4\3\2\2\2"+
		"\u0be4\u0bdb\3\2\2\2\u0be4\u0be2\3\2\2\2\u0be4\u0be3\3\2\2\2\u0be5\u01ab"+
		"\3\2\2\2\u0be6\u0be8\5\u01b6\u00dc\2\u0be7\u0be9\7\u00c6\2\2\u0be8\u0be7"+
		"\3\2\2\2\u0be8\u0be9\3\2\2\2\u0be9\u0bea\3\2\2\2\u0bea\u0beb\7\u008c\2"+
		"\2\u0beb\u0bf5\7\u017a\2\2\u0bec\u0bf1\5\u01b6\u00dc\2\u0bed\u0bee\7\u016b"+
		"\2\2\u0bee\u0bf0\5\u01b6\u00dc\2\u0bef\u0bed\3\2\2\2\u0bf0\u0bf3\3\2\2"+
		"\2\u0bf1\u0bef\3\2\2\2\u0bf1\u0bf2\3\2\2\2\u0bf2\u0bf6\3\2\2\2\u0bf3\u0bf1"+
		"\3\2\2\2\u0bf4\u0bf6\5\u0130\u0099\2\u0bf5\u0bec\3\2\2\2\u0bf5\u0bf4\3"+
		"\2\2\2\u0bf6\u0bf7\3\2\2\2\u0bf7\u0bf8\7\u017c\2\2\u0bf8\u01ad\3\2\2\2"+
		"\u0bf9\u0bfa\7\u017a\2\2\u0bfa\u0bff\5\u01b6\u00dc\2\u0bfb\u0bfc\7\u016b"+
		"\2\2\u0bfc\u0bfe\5\u01b6\u00dc\2\u0bfd\u0bfb\3\2\2\2\u0bfe\u0c01\3\2\2"+
		"\2\u0bff\u0bfd\3\2\2\2\u0bff\u0c00\3\2\2\2\u0c00\u0c02\3\2\2\2\u0c01\u0bff"+
		"\3\2\2\2\u0c02\u0c04\7\u017c\2\2\u0c03\u0c05\7\u00c6\2\2\u0c04\u0c03\3"+
		"\2\2\2\u0c04\u0c05\3\2\2\2\u0c05\u0c06\3\2\2\2\u0c06\u0c07\7\u008c\2\2"+
		"\u0c07\u0c08\7\u017a\2\2\u0c08\u0c09\5\u0130\u0099\2\u0c09\u0c0a\7\u017c"+
		"\2\2\u0c0a\u01af\3\2\2\2\u0c0b\u0c0c\5\u01b6\u00dc\2\u0c0c\u0c0d\5\u01b4"+
		"\u00db\2\u0c0d\u0c0e\5\u01b6\u00dc\2\u0c0e\u01b1\3\2\2\2\u0c0f\u0c10\t"+
		"-\2\2\u0c10\u01b3\3\2\2\2\u0c11\u0c1e\7\u0170\2\2\u0c12\u0c1e\7\u0171"+
		"\2\2\u0c13\u0c1e\7\u0172\2\2\u0c14\u0c1e\7\u0173\2\2\u0c15\u0c1e\7\u0176"+
		"\2\2\u0c16\u0c1e\7\u0177\2\2\u0c17\u0c1e\7\u0174\2\2\u0c18\u0c1e\7\u0175"+
		"\2\2\u0c19\u0c1b\7\u00c6\2\2\u0c1a\u0c19\3\2\2\2\u0c1a\u0c1b\3\2\2\2\u0c1b"+
		"\u0c1c\3\2\2\2\u0c1c\u0c1e\t.\2\2\u0c1d\u0c11\3\2\2\2\u0c1d\u0c12\3\2"+
		"\2\2\u0c1d\u0c13\3\2\2\2\u0c1d\u0c14\3\2\2\2\u0c1d\u0c15\3\2\2\2\u0c1d"+
		"\u0c16\3\2\2\2\u0c1d\u0c17\3\2\2\2\u0c1d\u0c18\3\2\2\2\u0c1d\u0c1a\3\2"+
		"\2\2\u0c1e\u01b5\3\2\2\2\u0c1f\u0c21\b\u00dc\1\2\u0c20\u0c22\7\u0180\2"+
		"\2\u0c21\u0c20\3\2\2\2\u0c21\u0c22\3\2\2\2\u0c22\u0c23\3\2\2\2\u0c23\u0c24"+
		"\7\u017a\2\2\u0c24\u0c25\5\u0130\u0099\2\u0c25\u0c26\7\u017c\2\2\u0c26"+
		"\u0c39\3\2\2\2\u0c27\u0c29\7\u0180\2\2\u0c28\u0c27\3\2\2\2\u0c28\u0c29"+
		"\3\2\2\2\u0c29\u0c2a\3\2\2\2\u0c2a\u0c2b\7\u017a\2\2\u0c2b\u0c2c\5\u01b6"+
		"\u00dc\2\u0c2c\u0c2d\7\u017c\2\2\u0c2d\u0c39\3\2\2\2\u0c2e\u0c39\5\u01ba"+
		"\u00de\2\u0c2f\u0c39\5\u01be\u00e0\2\u0c30\u0c39\5\u01de\u00f0\2\u0c31"+
		"\u0c39\5\u01c2\u00e2\2\u0c32\u0c39\5\u01c8\u00e5\2\u0c33\u0c39\5\u01ca"+
		"\u00e6\2\u0c34\u0c39\5\u01cc\u00e7\2\u0c35\u0c39\5\u01d8\u00ed\2\u0c36"+
		"\u0c39\5\u01da\u00ee\2\u0c37\u0c39\5\u01b8\u00dd\2\u0c38\u0c1f\3\2\2\2"+
		"\u0c38\u0c28\3\2\2\2\u0c38\u0c2e\3\2\2\2\u0c38\u0c2f\3\2\2\2\u0c38\u0c30"+
		"\3\2\2\2\u0c38\u0c31\3\2\2\2\u0c38\u0c32\3\2\2\2\u0c38\u0c33\3\2\2\2\u0c38"+
		"\u0c34\3\2\2\2\u0c38\u0c35\3\2\2\2\u0c38\u0c36\3\2\2\2\u0c38\u0c37\3\2"+
		"\2\2\u0c39\u0c49\3\2\2\2\u0c3a\u0c3b\f\22\2\2\u0c3b\u0c3c\t/\2\2\u0c3c"+
		"\u0c48\5\u01b6\u00dc\23\u0c3d\u0c3e\f\21\2\2\u0c3e\u0c3f\t\60\2\2\u0c3f"+
		"\u0c48\5\u01b6\u00dc\22\u0c40\u0c41\f\20\2\2\u0c41\u0c42\7\u0181\2\2\u0c42"+
		"\u0c48\5\u01b6\u00dc\21\u0c43\u0c44\f\23\2\2\u0c44\u0c48\5\u01bc\u00df"+
		"\2\u0c45\u0c46\f\3\2\2\u0c46\u0c48\5\u01dc\u00ef\2\u0c47\u0c3a\3\2\2\2"+
		"\u0c47\u0c3d\3\2\2\2\u0c47\u0c40\3\2\2\2\u0c47\u0c43\3\2\2\2\u0c47\u0c45"+
		"\3\2\2\2\u0c48\u0c4b\3\2\2\2\u0c49\u0c47\3\2\2\2\u0c49\u0c4a\3\2\2\2\u0c4a"+
		"\u01b7\3\2\2\2\u0c4b\u0c49\3\2\2\2\u0c4c\u0c55\5\u01f8\u00fd\2\u0c4d\u0c55"+
		"\5\u01fa\u00fe\2\u0c4e\u0c55\5\u0206\u0104\2\u0c4f\u0c55\5\u0178\u00bd"+
		"\2\u0c50\u0c55\5\u0200\u0101\2\u0c51\u0c55\5\u0204\u0103\2\u0c52\u0c55"+
		"\5\u0202\u0102\2\u0c53\u0c55\5\u0208\u0105\2\u0c54\u0c4c\3\2\2\2\u0c54"+
		"\u0c4d\3\2\2\2\u0c54\u0c4e\3\2\2\2\u0c54\u0c4f\3\2\2\2\u0c54\u0c50\3\2"+
		"\2\2\u0c54\u0c51\3\2\2\2\u0c54\u0c52\3\2\2\2\u0c54\u0c53\3\2\2\2\u0c55"+
		"\u01b9\3\2\2\2\u0c56\u0c57\7\u0099\2\2\u0c57\u0c58\5\u01b6\u00dc\2\u0c58"+
		"\u0c59\5\u01bc\u00df\2\u0c59\u01bb\3\2\2\2\u0c5a\u0c5b\t\61\2\2\u0c5b"+
		"\u01bd\3\2\2\2\u0c5c\u0c5d\5\u01c0\u00e1\2\u0c5d\u0c5e\t\62\2\2\u0c5e"+
		"\u0c63\5\u01c0\u00e1\2\u0c5f\u0c60\t\62\2\2\u0c60\u0c62\5\u01c0\u00e1"+
		"\2\u0c61\u0c5f\3\2\2\2\u0c62\u0c65\3\2\2\2\u0c63\u0c61\3\2\2\2\u0c63\u0c64"+
		"\3\2\2\2\u0c64\u01bf\3\2\2\2\u0c65\u0c63\3\2\2\2\u0c66\u0c67\7\u017a\2"+
		"\2\u0c67\u0c68\5\u01b6\u00dc\2\u0c68\u0c69\7\u017c\2\2\u0c69\u0c72\3\2"+
		"\2\2\u0c6a\u0c72\5\u01c2\u00e2\2\u0c6b\u0c72\5\u01c8\u00e5\2\u0c6c\u0c72"+
		"\5\u01cc\u00e7\2\u0c6d\u0c72\5\u01d8\u00ed\2\u0c6e\u0c72\5\u01de\u00f0"+
		"\2\u0c6f\u0c72\5\u01da\u00ee\2\u0c70\u0c72\5\u01b8\u00dd\2\u0c71\u0c66"+
		"\3\2\2\2\u0c71\u0c6a\3\2\2\2\u0c71\u0c6b\3\2\2\2\u0c71\u0c6c\3\2\2\2\u0c71"+
		"\u0c6d\3\2\2\2\u0c71\u0c6e\3\2\2\2\u0c71\u0c6f\3\2\2\2\u0c71\u0c70\3\2"+
		"\2\2\u0c72\u01c1\3\2\2\2\u0c73\u0c76\5\u01c4\u00e3\2\u0c74\u0c76\5\u01c6"+
		"\u00e4\2\u0c75\u0c73\3\2\2\2\u0c75\u0c74\3\2\2\2\u0c76\u01c3\3\2\2\2\u0c77"+
		"\u0c78\7$\2\2\u0c78\u0c7e\5\u01b6\u00dc\2\u0c79\u0c7a\7\u013d\2\2\u0c7a"+
		"\u0c7b\5\u01b6\u00dc\2\u0c7b\u0c7c\7\u0126\2\2\u0c7c\u0c7d\5\u01b6\u00dc"+
		"\2\u0c7d\u0c7f\3\2\2\2\u0c7e\u0c79\3\2\2\2\u0c7f\u0c80\3\2\2\2\u0c80\u0c7e"+
		"\3\2\2\2\u0c80\u0c81\3\2\2\2\u0c81\u0c84\3\2\2\2\u0c82\u0c83\7`\2\2\u0c83"+
		"\u0c85\5\u01b6\u00dc\2\u0c84\u0c82\3\2\2\2\u0c84\u0c85\3\2\2\2\u0c85\u0c86"+
		"\3\2\2\2\u0c86\u0c87\7d\2\2\u0c87\u01c5\3\2\2\2\u0c88\u0c8e\7$\2\2\u0c89"+
		"\u0c8a\7\u013d\2\2\u0c8a\u0c8b\5\u01a6\u00d4\2\u0c8b\u0c8c\7\u0126\2\2"+
		"\u0c8c\u0c8d\5\u01b6\u00dc\2\u0c8d\u0c8f\3\2\2\2\u0c8e\u0c89\3\2\2\2\u0c8f"+
		"\u0c90\3\2\2\2\u0c90\u0c8e\3\2\2\2\u0c90\u0c91\3\2\2\2\u0c91\u0c94\3\2"+
		"\2\2\u0c92\u0c93\7`\2\2\u0c93\u0c95\5\u01b6\u00dc\2\u0c94\u0c92\3\2\2"+
		"\2\u0c94\u0c95\3\2\2\2\u0c95\u0c96\3\2\2\2\u0c96\u0c97\7d\2\2\u0c97\u01c7"+
		"\3\2\2\2\u0c98\u0c99\7\u0089\2\2\u0c99\u0c9a\7\u017a\2\2\u0c9a\u0c9b\5"+
		"\u01a6\u00d4\2\u0c9b\u0c9c\7\u016b\2\2\u0c9c\u0c9d\5\u01b6\u00dc\2\u0c9d"+
		"\u0c9e\7\u016b\2\2\u0c9e\u0c9f\5\u01b6\u00dc\2\u0c9f\u0ca0\7\u017c\2\2"+
		"\u0ca0\u01c9\3\2\2\2\u0ca1\u0ca2\5\u01fc\u00ff\2\u0ca2\u0ca3\7\u0181\2"+
		"\2\u0ca3\u0ca4\t\63\2\2\u0ca4\u01cb\3\2\2\2\u0ca5\u0ca6\7\23\2\2\u0ca6"+
		"\u0ca8\7\u017a\2\2\u0ca7\u0ca9\5\u01ce\u00e8\2\u0ca8\u0ca7\3\2\2\2\u0ca8"+
		"\u0ca9\3\2\2\2\u0ca9\u0caa\3\2\2\2\u0caa\u0cab\5\u01b6\u00dc\2\u0cab\u0cad"+
		"\7\u017c\2\2\u0cac\u0cae\5\u01d0\u00e9\2\u0cad\u0cac\3\2\2\2\u0cad\u0cae"+
		"\3\2\2\2\u0cae\u0d55\3\2\2\2\u0caf\u0cb0\7:\2\2\u0cb0\u0cb6\7\u017a\2"+
		"\2\u0cb1\u0cb3\5\u01ce\u00e8\2\u0cb2\u0cb1\3\2\2\2\u0cb2\u0cb3\3\2\2\2"+
		"\u0cb3\u0cb4\3\2\2\2\u0cb4\u0cb7\5\u01b6\u00dc\2\u0cb5\u0cb7\7\u0178\2"+
		"\2\u0cb6\u0cb2\3\2\2\2\u0cb6\u0cb5\3\2\2\2\u0cb7\u0cb8\3\2\2\2\u0cb8\u0cba"+
		"\7\u017c\2\2\u0cb9\u0cbb\5\u01d0\u00e9\2\u0cba\u0cb9\3\2\2\2\u0cba\u0cbb"+
		"\3\2\2\2\u0cbb\u0d55\3\2\2\2\u0cbc\u0cbd\7;\2\2\u0cbd\u0cc3\7\u017a\2"+
		"\2\u0cbe\u0cc0\5\u01ce\u00e8\2\u0cbf\u0cbe\3\2\2\2\u0cbf\u0cc0\3\2\2\2"+
		"\u0cc0\u0cc1\3\2\2\2\u0cc1\u0cc4\5\u01b6\u00dc\2\u0cc2\u0cc4\7\u0178\2"+
		"\2\u0cc3\u0cbf\3\2\2\2\u0cc3\u0cc2\3\2\2\2\u0cc4\u0cc5\3\2\2\2\u0cc5\u0cc7"+
		"\7\u017c\2\2\u0cc6\u0cc8\5\u01d0\u00e9\2\u0cc7\u0cc6\3\2\2\2\u0cc7\u0cc8"+
		"\3\2\2\2\u0cc8\u0d55\3\2\2\2\u0cc9\u0cca\7\u014c\2\2\u0cca\u0ccb\7\u017a"+
		"\2\2\u0ccb\u0ccc\7\u017c\2\2\u0ccc\u0d55\5\u01d0\u00e9\2\u0ccd\u0cce\7"+
		"\u0150\2\2\u0cce\u0ccf\7\u017a\2\2\u0ccf\u0cd0\7\u017c\2\2\u0cd0\u0d55"+
		"\5\u01d0\u00e9\2\u0cd1\u0cd2\7\u0151\2\2\u0cd2\u0cd3\7\u017a\2\2\u0cd3"+
		"\u0cd4\5\u01b6\u00dc\2\u0cd4\u0cd5\7\u017c\2\2\u0cd5\u0cd6\5\u01d0\u00e9"+
		"\2\u0cd6\u0d55\3\2\2\2\u0cd7\u0cd8\7\u0152\2\2\u0cd8\u0cd9\7\u017a\2\2"+
		"\u0cd9\u0ce0\5\u01b6\u00dc\2\u0cda\u0cdb\7\u016b\2\2\u0cdb\u0cde\5\u01b6"+
		"\u00dc\2\u0cdc\u0cdd\7\u016b\2\2\u0cdd\u0cdf\5\u01b6\u00dc\2\u0cde\u0cdc"+
		"\3\2\2\2\u0cde\u0cdf\3\2\2\2\u0cdf\u0ce1\3\2\2\2\u0ce0\u0cda\3\2\2\2\u0ce0"+
		"\u0ce1\3\2\2\2\u0ce1\u0ce2\3\2\2\2\u0ce2\u0ce3\7\u017c\2\2\u0ce3\u0ce4"+
		"\5\u01d0\u00e9\2\u0ce4\u0d55\3\2\2\2\u0ce5\u0ce6\7\u0153\2\2\u0ce6\u0ce7"+
		"\7\u017a\2\2\u0ce7\u0ce8\5\u01b6\u00dc\2\u0ce8\u0ce9\7\u017c\2\2\u0ce9"+
		"\u0cea\5\u01d0\u00e9\2\u0cea\u0d55\3\2\2\2\u0ceb\u0cec\7\u0154\2\2\u0cec"+
		"\u0ced\7\u017a\2\2\u0ced\u0cf4\5\u01b6\u00dc\2\u0cee\u0cef\7\u016b\2\2"+
		"\u0cef\u0cf2\5\u01b6\u00dc\2\u0cf0\u0cf1\7\u016b\2\2\u0cf1\u0cf3\5\u01b6"+
		"\u00dc\2\u0cf2\u0cf0\3\2\2\2\u0cf2\u0cf3\3\2\2\2\u0cf3\u0cf5\3\2\2\2\u0cf4"+
		"\u0cee\3\2\2\2\u0cf4\u0cf5\3\2\2\2\u0cf5\u0cf6\3\2\2\2\u0cf6\u0cf7\7\u017c"+
		"\2\2\u0cf7\u0cf8\5\u01d0\u00e9\2\u0cf8\u0d55\3\2\2\2\u0cf9\u0cfa\7\u00b6"+
		"\2\2\u0cfa\u0cfc\7\u017a\2\2\u0cfb\u0cfd\5\u01ce\u00e8\2\u0cfc\u0cfb\3"+
		"\2\2\2\u0cfc\u0cfd\3\2\2\2\u0cfd\u0cfe\3\2\2\2\u0cfe\u0cff\5\u01b6\u00dc"+
		"\2\u0cff\u0d01\7\u017c\2\2\u0d00\u0d02\5\u01d0\u00e9\2\u0d01\u0d00\3\2"+
		"\2\2\u0d01\u0d02\3\2\2\2\u0d02\u0d55\3\2\2\2\u0d03\u0d04\7\u00bc\2\2\u0d04"+
		"\u0d06\7\u017a\2\2\u0d05\u0d07\5\u01ce\u00e8\2\u0d06\u0d05\3\2\2\2\u0d06"+
		"\u0d07\3\2\2\2\u0d07\u0d08\3\2\2\2\u0d08\u0d09\5\u01b6\u00dc\2\u0d09\u0d0b"+
		"\7\u017c\2\2\u0d0a\u0d0c\5\u01d0\u00e9\2\u0d0b\u0d0a\3\2\2\2\u0d0b\u0d0c"+
		"\3\2\2\2\u0d0c\u0d55\3\2\2\2\u0d0d\u0d0e\7\u015d\2\2\u0d0e\u0d0f\7\u017a"+
		"\2\2\u0d0f\u0d10\7\u017c\2\2\u0d10\u0d55\5\u01d0\u00e9\2\u0d11\u0d12\7"+
		"\u015e\2\2\u0d12\u0d13\7\u017a\2\2\u0d13\u0d14\7\u017c\2\2\u0d14\u0d55"+
		"\5\u01d0\u00e9\2\u0d15\u0d16\7\u015f\2\2\u0d16\u0d17\7\u017a\2\2\u0d17"+
		"\u0d18\5\u01b6\u00dc\2\u0d18\u0d1a\7\u017c\2\2\u0d19\u0d1b\5\u01d0\u00e9"+
		"\2\u0d1a\u0d19\3\2\2\2\u0d1a\u0d1b\3\2\2\2\u0d1b\u0d55\3\2\2\2\u0d1c\u0d1d"+
		"\7\u0160\2\2\u0d1d\u0d1e\7\u017a\2\2\u0d1e\u0d1f\5\u01b6\u00dc\2\u0d1f"+
		"\u0d21\7\u017c\2\2\u0d20\u0d22\5\u01d0\u00e9\2\u0d21\u0d20\3\2\2\2\u0d21"+
		"\u0d22\3\2\2\2\u0d22\u0d55\3\2\2\2\u0d23\u0d24\7\u0161\2\2\u0d24\u0d26"+
		"\7\u017a\2\2\u0d25\u0d27\5\u01ce\u00e8\2\u0d26\u0d25\3\2\2\2\u0d26\u0d27"+
		"\3\2\2\2\u0d27\u0d28\3\2\2\2\u0d28\u0d29\5\u01b6\u00dc\2\u0d29\u0d2b\7"+
		"\u017c\2\2\u0d2a\u0d2c\5\u01d0\u00e9\2\u0d2b\u0d2a\3\2\2\2\u0d2b\u0d2c"+
		"\3\2\2\2\u0d2c\u0d55\3\2\2\2\u0d2d\u0d2e\7\u011e\2\2\u0d2e\u0d30\7\u017a"+
		"\2\2\u0d2f\u0d31\5\u01ce\u00e8\2\u0d30\u0d2f\3\2\2\2\u0d30\u0d31\3\2\2"+
		"\2\u0d31\u0d32\3\2\2\2\u0d32\u0d33\5\u01b6\u00dc\2\u0d33\u0d35\7\u017c"+
		"\2\2\u0d34\u0d36\5\u01d0\u00e9\2\u0d35\u0d34\3\2\2\2\u0d35\u0d36\3\2\2"+
		"\2\u0d36\u0d55\3\2\2\2\u0d37\u0d38\7\u0138\2\2\u0d38\u0d3a\7\u017a\2\2"+
		"\u0d39\u0d3b\5\u01ce\u00e8\2\u0d3a\u0d39\3\2\2\2\u0d3a\u0d3b\3\2\2\2\u0d3b"+
		"\u0d3c\3\2\2\2\u0d3c\u0d3d\5\u01b6\u00dc\2\u0d3d\u0d3f\7\u017c\2\2\u0d3e"+
		"\u0d40\5\u01d0\u00e9\2\u0d3f\u0d3e\3\2\2\2\u0d3f\u0d40\3\2\2\2\u0d40\u0d55"+
		"\3\2\2\2\u0d41\u0d42\7\u0163\2\2\u0d42\u0d44\7\u017a\2\2\u0d43\u0d45\5"+
		"\u01ce\u00e8\2\u0d44\u0d43\3\2\2\2\u0d44\u0d45\3\2\2\2\u0d45\u0d46\3\2"+
		"\2\2\u0d46\u0d47\5\u01b6\u00dc\2\u0d47\u0d49\7\u017c\2\2\u0d48\u0d4a\5"+
		"\u01d0\u00e9\2\u0d49\u0d48\3\2\2\2\u0d49\u0d4a\3\2\2\2\u0d4a\u0d55\3\2"+
		"\2\2\u0d4b\u0d4c\7\u0164\2\2\u0d4c\u0d4d\7\u017a\2\2\u0d4d\u0d4e\5\u01b6"+
		"\u00dc\2\u0d4e\u0d4f\7\u016b\2\2\u0d4f\u0d50\5\u01b6\u00dc\2\u0d50\u0d52"+
		"\7\u017c\2\2\u0d51\u0d53\5\u01d0\u00e9\2\u0d52\u0d51\3\2\2\2\u0d52\u0d53"+
		"\3\2\2\2\u0d53\u0d55\3\2\2\2\u0d54\u0ca5\3\2\2\2\u0d54\u0caf\3\2\2\2\u0d54"+
		"\u0cbc\3\2\2\2\u0d54\u0cc9\3\2\2\2\u0d54\u0ccd\3\2\2\2\u0d54\u0cd1\3\2"+
		"\2\2\u0d54\u0cd7\3\2\2\2\u0d54\u0ce5\3\2\2\2\u0d54\u0ceb\3\2\2\2\u0d54"+
		"\u0cf9\3\2\2\2\u0d54\u0d03\3\2\2\2\u0d54\u0d0d\3\2\2\2\u0d54\u0d11\3\2"+
		"\2\2\u0d54\u0d15\3\2\2\2\u0d54\u0d1c\3\2\2\2\u0d54\u0d23\3\2\2\2\u0d54"+
		"\u0d2d\3\2\2\2\u0d54\u0d37\3\2\2\2\u0d54\u0d41\3\2\2\2\u0d54\u0d4b\3\2"+
		"\2\2\u0d55\u01cd\3\2\2\2\u0d56\u0d57\t\'\2\2\u0d57\u01cf\3\2\2\2\u0d58"+
		"\u0d65\7\u00d5\2\2\u0d59\u0d66\5\u01fc\u00ff\2\u0d5a\u0d5c\7\u017a\2\2"+
		"\u0d5b\u0d5d\5\u01d6\u00ec\2\u0d5c\u0d5b\3\2\2\2\u0d5c\u0d5d\3\2\2\2\u0d5d"+
		"\u0d5f\3\2\2\2\u0d5e\u0d60\5\u018a\u00c6\2\u0d5f\u0d5e\3\2\2\2\u0d5f\u0d60"+
		"\3\2\2\2\u0d60\u0d62\3\2\2\2\u0d61\u0d63\5\u01d2\u00ea\2\u0d62\u0d61\3"+
		"\2\2\2\u0d62\u0d63\3\2\2\2\u0d63\u0d64\3\2\2\2\u0d64\u0d66\7\u017c\2\2"+
		"\u0d65\u0d59\3\2\2\2\u0d65\u0d5a\3\2\2\2\u0d66\u01d1\3\2\2\2\u0d67\u0d68"+
		"\7\u00f8\2\2\u0d68\u0d69\7\26\2\2\u0d69\u0d6a\5\u01d4\u00eb\2\u0d6a\u0d6b"+
		"\7\13\2\2\u0d6b\u0d6c\5\u01d4\u00eb\2\u0d6c\u01d3\3\2\2\2\u0d6d\u0d6e"+
		"\7\u0146\2\2\u0d6e\u0d78\7\u0147\2\2\u0d6f\u0d70\7\u0146\2\2\u0d70\u0d78"+
		"\7\u0148\2\2\u0d71\u0d72\7A\2\2\u0d72\u0d78\7\u00f7\2\2\u0d73\u0d74\7"+
		"\u0186\2\2\u0d74\u0d78\7\u0148\2\2\u0d75\u0d76\7\u0186\2\2\u0d76\u0d78"+
		"\7\u0147\2\2\u0d77\u0d6d\3\2\2\2\u0d77\u0d6f\3\2\2\2\u0d77\u0d71\3\2\2"+
		"\2\u0d77\u0d73\3\2\2\2\u0d77\u0d75\3\2\2\2\u0d78\u01d5\3\2\2\2\u0d79\u0d7a"+
		"\7\u00d9\2\2\u0d7a\u0d7b\7\37\2\2\u0d7b\u0d80\5\u01b6\u00dc\2\u0d7c\u0d7d"+
		"\7\u016b\2\2\u0d7d\u0d7f\5\u01b6\u00dc\2\u0d7e\u0d7c\3\2\2\2\u0d7f\u0d82"+
		"\3\2\2\2\u0d80\u0d7e\3\2\2\2\u0d80\u0d81\3\2\2\2\u0d81\u01d7\3\2\2\2\u0d82"+
		"\u0d80\3\2\2\2\u0d83\u0e4c\7\u014b\2\2\u0d84\u0d85\7&\2\2\u0d85\u0d86"+
		"\7\u017a\2\2\u0d86\u0d87\5\u01b6\u00dc\2\u0d87\u0d88\7\16\2\2\u0d88\u0d8a"+
		"\5~@\2\u0d89\u0d8b\5\u0080A\2\u0d8a\u0d89\3\2\2\2\u0d8a\u0d8b\3\2\2\2"+
		"\u0d8b\u0d8c\3\2\2\2\u0d8c\u0d8d\7\u017c\2\2\u0d8d\u0e4c\3\2\2\2\u0d8e"+
		"\u0d8f\7:\2\2\u0d8f\u0d92\7\u017a\2\2\u0d90\u0d93\5\u01b6\u00dc\2\u0d91"+
		"\u0d93\7\u0178\2\2\u0d92\u0d90\3\2\2\2\u0d92\u0d91\3\2\2\2\u0d93\u0d94"+
		"\3\2\2\2\u0d94\u0e4c\7\u017c\2\2\u0d95\u0e4c\7\u014d\2\2\u0d96\u0d97\7"+
		"A\2\2\u0d97\u0e4c\7F\2\2\u0d98\u0d9c\7\u014e\2\2\u0d99\u0d9a\7A\2\2\u0d9a"+
		"\u0d9c\7\u0127\2\2\u0d9b\u0d98\3\2\2\2\u0d9b\u0d99\3\2\2\2\u0d9c\u0da1"+
		"\3\2\2\2\u0d9d\u0d9e\7\u017a\2\2\u0d9e\u0d9f\5\u01b6\u00dc\2\u0d9f\u0da0"+
		"\7\u017c\2\2\u0da0\u0da2\3\2\2\2\u0da1\u0d9d\3\2\2\2\u0da1\u0da2\3\2\2"+
		"\2\u0da2\u0e4c\3\2\2\2\u0da3\u0e4c\7\u014f\2\2\u0da4\u0da5\7A\2\2\u0da5"+
		"\u0e4c\7\u0165\2\2\u0da6\u0da7\7\u0155\2\2\u0da7\u0da8\7\u017a\2\2\u0da8"+
		"\u0db5\5\u01b6\u00dc\2\u0da9\u0daa\7\u016b\2\2\u0daa\u0db2\5\u01b6\u00dc"+
		"\2\u0dab\u0dac\7\u016b\2\2\u0dac\u0dad\5\u01b6\u00dc\2\u0dad\u0dae\7\u0170"+
		"\2\2\u0dae\u0daf\5\u01b6\u00dc\2\u0daf\u0db1\3\2\2\2\u0db0\u0dab\3\2\2"+
		"\2\u0db1\u0db4\3\2\2\2\u0db2\u0db0\3\2\2\2\u0db2\u0db3\3\2\2\2\u0db3\u0db6"+
		"\3\2\2\2\u0db4\u0db2\3\2\2\2\u0db5\u0da9\3\2\2\2\u0db5\u0db6\3\2\2\2\u0db6"+
		"\u0db7\3\2\2\2\u0db7\u0db8\7\u017c\2\2\u0db8\u0e4c\3\2\2\2\u0db9\u0dba"+
		"\7\u0156\2\2\u0dba\u0dbb\7\u017a\2\2\u0dbb\u0dc8\5\u01b6\u00dc\2\u0dbc"+
		"\u0dbd\7\u016b\2\2\u0dbd\u0dc5\5\u01b6\u00dc\2\u0dbe\u0dbf\7\u016b\2\2"+
		"\u0dbf\u0dc0\5\u01b6\u00dc\2\u0dc0\u0dc1\7\u0170\2\2\u0dc1\u0dc2\5\u01b6"+
		"\u00dc\2\u0dc2\u0dc4\3\2\2\2\u0dc3\u0dbe\3\2\2\2\u0dc4\u0dc7\3\2\2\2\u0dc5"+
		"\u0dc3\3\2\2\2\u0dc5\u0dc6\3\2\2\2\u0dc6\u0dc9\3\2\2\2\u0dc7\u0dc5\3\2"+
		"\2\2\u0dc8\u0dbc\3\2\2\2\u0dc8\u0dc9\3\2\2\2\u0dc9\u0dca\3\2\2\2\u0dca"+
		"\u0dcb\7\u017c\2\2\u0dcb\u0e4c\3\2\2\2\u0dcc\u0dcd\7\u0157\2\2\u0dcd\u0dce"+
		"\7\u017a\2\2\u0dce\u0ddb\5\u01b6\u00dc\2\u0dcf\u0dd0\7\u016b\2\2\u0dd0"+
		"\u0dd8\5\u01b6\u00dc\2\u0dd1\u0dd2\7\u016b\2\2\u0dd2\u0dd3\5\u01b6\u00dc"+
		"\2\u0dd3\u0dd4\7\u0170\2\2\u0dd4\u0dd5\5\u01b6\u00dc\2\u0dd5\u0dd7\3\2"+
		"\2\2\u0dd6\u0dd1\3\2\2\2\u0dd7\u0dda\3\2\2\2\u0dd8\u0dd6\3\2\2\2\u0dd8"+
		"\u0dd9\3\2\2\2\u0dd9\u0ddc\3\2\2\2\u0dda\u0dd8\3\2\2\2\u0ddb\u0dcf\3\2"+
		"\2\2\u0ddb\u0ddc\3\2\2\2\u0ddc\u0ddd\3\2\2\2\u0ddd\u0dde\7\u017c\2\2\u0dde"+
		"\u0e4c\3\2\2\2\u0ddf\u0de0\7\u0158\2\2\u0de0\u0de1\7\u017a\2\2\u0de1\u0dee"+
		"\5\u01b6\u00dc\2\u0de2\u0de3\7\u016b\2\2\u0de3\u0deb\5\u01b6\u00dc\2\u0de4"+
		"\u0de5\7\u016b\2\2\u0de5\u0de6\5\u01b6\u00dc\2\u0de6\u0de7\7\u0170\2\2"+
		"\u0de7\u0de8\5\u01b6\u00dc\2\u0de8\u0dea\3\2\2\2\u0de9\u0de4\3\2\2\2\u0dea"+
		"\u0ded\3\2\2\2\u0deb\u0de9\3\2\2\2\u0deb\u0dec\3\2\2\2\u0dec\u0def\3\2"+
		"\2\2\u0ded\u0deb\3\2\2\2\u0dee\u0de2\3\2\2\2\u0dee\u0def\3\2\2\2\u0def"+
		"\u0df0\3\2\2\2\u0df0\u0df1\7\u017c\2\2\u0df1\u0e4c\3\2\2\2\u0df2\u0df3"+
		"\7\u0159\2\2\u0df3\u0df4\7\u017a\2\2\u0df4\u0e01\5\u01b6\u00dc\2\u0df5"+
		"\u0df6\7\u016b\2\2\u0df6\u0dfe\5\u01b6\u00dc\2\u0df7\u0df8\7\u016b\2\2"+
		"\u0df8\u0df9\5\u01b6\u00dc\2\u0df9\u0dfa\7\u0170\2\2\u0dfa\u0dfb\5\u01b6"+
		"\u00dc\2\u0dfb\u0dfd\3\2\2\2\u0dfc\u0df7\3\2\2\2\u0dfd\u0e00\3\2\2\2\u0dfe"+
		"\u0dfc\3\2\2\2\u0dfe\u0dff\3\2\2\2\u0dff\u0e02\3\2\2\2\u0e00\u0dfe\3\2"+
		"\2\2\u0e01\u0df5\3\2\2\2\u0e01\u0e02\3\2\2\2\u0e02\u0e03\3\2\2\2\u0e03"+
		"\u0e04\7\u017c\2\2\u0e04\u0e4c\3\2\2\2\u0e05\u0e06\7\u015a\2\2\u0e06\u0e07"+
		"\7\u017a\2\2\u0e07\u0e14\5\u01b6\u00dc\2\u0e08\u0e09\7\u016b\2\2\u0e09"+
		"\u0e11\5\u01b6\u00dc\2\u0e0a\u0e0b\7\u016b\2\2\u0e0b\u0e0c\5\u01b6\u00dc"+
		"\2\u0e0c\u0e0d\7\u0170\2\2\u0e0d\u0e0e\5\u01b6\u00dc\2\u0e0e\u0e10\3\2"+
		"\2\2\u0e0f\u0e0a\3\2\2\2\u0e10\u0e13\3\2\2\2\u0e11\u0e0f\3\2\2\2\u0e11"+
		"\u0e12\3\2\2\2\u0e12\u0e15\3\2\2\2\u0e13\u0e11\3\2\2\2\u0e14\u0e08\3\2"+
		"\2\2\u0e14\u0e15\3\2\2\2\u0e15\u0e16\3\2\2\2\u0e16\u0e17\7\u017c\2\2\u0e17"+
		"\u0e4c\3\2\2\2\u0e18\u0e19\7\u015b\2\2\u0e19\u0e1a\7\u017a\2\2\u0e1a\u0e22"+
		"\5\u01b6\u00dc\2\u0e1b\u0e1c\7\u016b\2\2\u0e1c\u0e1d\5\u01b6\u00dc\2\u0e1d"+
		"\u0e1e\7\u0170\2\2\u0e1e\u0e1f\5\u01b6\u00dc\2\u0e1f\u0e21\3\2\2\2\u0e20"+
		"\u0e1b\3\2\2\2\u0e21\u0e24\3\2\2\2\u0e22\u0e20\3\2\2\2\u0e22\u0e23\3\2"+
		"\2\2\u0e23\u0e25\3\2\2\2\u0e24\u0e22\3\2\2\2\u0e25\u0e26\7\u017c\2\2\u0e26"+
		"\u0e4c\3\2\2\2\u0e27\u0e28\7\u015c\2\2\u0e28\u0e29\7\u017a\2\2\u0e29\u0e2f"+
		"\5\u01b6\u00dc\2\u0e2a\u0e2b\7\u016b\2\2\u0e2b\u0e2c\5\u01b6\u00dc\2\u0e2c"+
		"\u0e2d\7\u0170\2\2\u0e2d\u0e2e\5\u01b6\u00dc\2\u0e2e\u0e30\3\2\2\2\u0e2f"+
		"\u0e2a\3\2\2\2\u0e30\u0e31\3\2\2\2\u0e31\u0e2f\3\2\2\2\u0e31\u0e32\3\2"+
		"\2\2\u0e32\u0e35\3\2\2\2\u0e33\u0e34\7\u016b\2\2\u0e34\u0e36\5\u01b6\u00dc"+
		"\2\u0e35\u0e33\3\2\2\2\u0e35\u0e36\3\2\2\2\u0e36\u0e37\3\2\2\2\u0e37\u0e38"+
		"\7\u017c\2\2\u0e38\u0e4c\3\2\2\2\u0e39\u0e3a\7\u00fe\2\2\u0e3a\u0e3b\7"+
		"\u017a\2\2\u0e3b\u0e3c\5\u01b6\u00dc\2\u0e3c\u0e3d\7\u017c\2\2\u0e3d\u0e4c"+
		"\3\2\2\2\u0e3e\u0e3f\7\u011d\2\2\u0e3f\u0e40\7\u017a\2\2\u0e40\u0e41\5"+
		"\u01b6\u00dc\2\u0e41\u0e42\7y\2\2\u0e42\u0e45\5\u01b6\u00dc\2\u0e43\u0e44"+
		"\7u\2\2\u0e44\u0e46\5\u01b6\u00dc\2\u0e45\u0e43\3\2\2\2\u0e45\u0e46\3"+
		"\2\2\2\u0e46\u0e47\3\2\2\2\u0e47\u0e48\7\u017c\2\2\u0e48\u0e4c\3\2\2\2"+
		"\u0e49\u0e4c\7\u0162\2\2\u0e4a\u0e4c\7\u0165\2\2\u0e4b\u0d83\3\2\2\2\u0e4b"+
		"\u0d84\3\2\2\2\u0e4b\u0d8e\3\2\2\2\u0e4b\u0d95\3\2\2\2\u0e4b\u0d96\3\2"+
		"\2\2\u0e4b\u0d9b\3\2\2\2\u0e4b\u0da3\3\2\2\2\u0e4b\u0da4\3\2\2\2\u0e4b"+
		"\u0da6\3\2\2\2\u0e4b\u0db9\3\2\2\2\u0e4b\u0dcc\3\2\2\2\u0e4b\u0ddf\3\2"+
		"\2\2\u0e4b\u0df2\3\2\2\2\u0e4b\u0e05\3\2\2\2\u0e4b\u0e18\3\2\2\2\u0e4b"+
		"\u0e27\3\2\2\2\u0e4b\u0e39\3\2\2\2\u0e4b\u0e3e\3\2\2\2\u0e4b\u0e49\3\2"+
		"\2\2\u0e4b\u0e4a\3\2\2\2\u0e4c\u01d9\3\2\2\2\u0e4d\u0e4e\5\u01fc\u00ff"+
		"\2\u0e4e\u0e50\7\u017a\2\2\u0e4f\u0e51\5\u01e4\u00f3\2\u0e50\u0e4f\3\2"+
		"\2\2\u0e50\u0e51\3\2\2\2\u0e51\u0e52\3\2\2\2\u0e52\u0e54\7\u017c\2\2\u0e53"+
		"\u0e55\5\u01dc\u00ef\2\u0e54\u0e53\3\2\2\2\u0e54\u0e55\3\2\2\2\u0e55\u01db"+
		"\3\2\2\2\u0e56\u0e5b\7\u017d\2\2\u0e57\u0e5c\7\u0186\2\2\u0e58\u0e5c\7"+
		"\u0184\2\2\u0e59\u0e5c\7\u0185\2\2\u0e5a\u0e5c\5\u01fe\u0100\2\u0e5b\u0e57"+
		"\3\2\2\2\u0e5b\u0e58\3\2\2\2\u0e5b\u0e59\3\2\2\2\u0e5b\u0e5a\3\2\2\2\u0e5b"+
		"\u0e5c\3\2\2\2\u0e5c\u0e5d\3\2\2\2\u0e5d\u0e5e\7\u017e\2\2\u0e5e\u01dd"+
		"\3\2\2\2\u0e5f\u0e62\5\u01e0\u00f1\2\u0e60\u0e62\5\u01e2\u00f2\2\u0e61"+
		"\u0e5f\3\2\2\2\u0e61\u0e60\3\2\2\2\u0e62\u01df\3\2\2\2\u0e63\u0e66\5\u01fc"+
		"\u00ff\2\u0e64\u0e66\5\u01da\u00ee\2\u0e65\u0e63\3\2\2\2\u0e65\u0e64\3"+
		"\2\2\2\u0e66\u0e67\3\2\2\2\u0e67\u0e68\7\u016e\2\2\u0e68\u0e69\5\u01da"+
		"\u00ee\2\u0e69\u01e1\3\2\2\2\u0e6a\u0e6b\5\u01da\u00ee\2\u0e6b\u0e6c\7"+
		"\u016e\2\2\u0e6c\u0e6d\5\u0178\u00bd\2\u0e6d\u01e3\3\2\2\2\u0e6e\u0e73"+
		"\5\u01e6\u00f4\2\u0e6f\u0e70\7\u016b\2\2\u0e70\u0e72\5\u01e6\u00f4\2\u0e71"+
		"\u0e6f\3\2\2\2\u0e72\u0e75\3\2\2\2\u0e73\u0e71\3\2\2\2\u0e73\u0e74\3\2"+
		"\2\2\u0e74\u01e5\3\2\2\2\u0e75\u0e73\3\2\2\2\u0e76\u0e7c\6\u00f4\16\2"+
		"\u0e77\u0e78\5\u01fc\u00ff\2\u0e78\u0e7a\7\u0170\2\2\u0e79\u0e7b\7\u0174"+
		"\2\2\u0e7a\u0e79\3\2\2\2\u0e7a\u0e7b\3\2\2\2\u0e7b\u0e7d\3\2\2\2\u0e7c"+
		"\u0e77\3\2\2\2\u0e7c\u0e7d\3\2\2\2\u0e7d\u0e7e\3\2\2\2\u0e7e\u0e7f\5\u01b6"+
		"\u00dc\2\u0e7f\u01e7\3\2\2\2\u0e80\u0e83\5\u0130\u0099\2\u0e81\u0e83\5"+
		"\u01b6\u00dc\2\u0e82\u0e80\3\2\2\2\u0e82\u0e81\3\2\2\2\u0e83\u01e9\3\2"+
		"\2\2\u0e84\u0e87\5\u01f6\u00fc\2\u0e85\u0e87\5\u01b6\u00dc\2\u0e86\u0e84"+
		"\3\2\2\2\u0e86\u0e85\3\2\2\2\u0e87\u01eb\3\2\2\2\u0e88\u0e8c\7\u0086\2"+
		"\2\u0e89\u0e8b\5\u01ee\u00f8\2\u0e8a\u0e89\3\2\2\2\u0e8b\u0e8e\3\2\2\2"+
		"\u0e8c\u0e8a\3\2\2\2\u0e8c\u0e8d\3\2\2\2\u0e8d\u01ed\3\2\2\2\u0e8e\u0e8c"+
		"\3\2\2\2\u0e8f\u0e90\7\u0180\2\2\u0e90\u0e91\5\u01fe\u0100\2\u0e91\u0e92"+
		"\5\u01b6\u00dc\2\u0e92\u0e9c\3\2\2\2\u0e93\u0e94\7\u0180\2\2\u0e94\u0e95"+
		"\5\u01fe\u0100\2\u0e95\u0e96\7\u0182\2\2\u0e96\u0e97\7\u0170\2\2\u0e97"+
		"\u0e98\5\u01b6\u00dc\2\u0e98\u0e9c\3\2\2\2\u0e99\u0e9a\7\u0180\2\2\u0e9a"+
		"\u0e9c\5\u01fe\u0100\2\u0e9b\u0e8f\3\2\2\2\u0e9b\u0e93\3\2\2\2\u0e9b\u0e99"+
		"\3\2\2\2\u0e9c\u01ef\3\2\2\2\u0e9d\u0e9e\7\5\2\2\u0e9e\u0e9f\5\u01f2\u00fa"+
		"\2\u0e9f\u0ea0\7\u017f\2\2\u0ea0\u0ea3\3\2\2\2\u0ea1\u0ea3\5\u01f4\u00fb"+
		"\2\u0ea2\u0e9d\3\2\2\2\u0ea2\u0ea1\3\2\2\2\u0ea3\u01f1\3\2\2\2\u0ea4\u0ea6"+
		"\13\2\2\2\u0ea5\u0ea4\3\2\2\2\u0ea6\u0ea9\3\2\2\2\u0ea7\u0ea8\3\2\2\2"+
		"\u0ea7\u0ea5\3\2\2\2\u0ea8\u01f3\3\2\2\2\u0ea9\u0ea7\3\2\2\2\u0eaa\u0eab"+
		"\7\u0087\2\2\u0eab\u0eac\5\u01b6\u00dc\2\u0eac\u01f5\3\2\2\2\u0ead\u0ebc"+
		"\7\u018c\2\2\u0eae\u0eb2\7\u016d\2\2\u0eaf\u0eb0\7\u016e\2\2\u0eb0\u0eb2"+
		"\7\u016d\2\2\u0eb1\u0eae\3\2\2\2\u0eb1\u0eaf\3\2\2\2\u0eb1\u0eb2\3\2\2"+
		"\2\u0eb2\u0eb3\3\2\2\2\u0eb3\u0eb8\5\u01fe\u0100\2\u0eb4\u0eb5\7\u016d"+
		"\2\2\u0eb5\u0eb7\5\u01fe\u0100\2\u0eb6\u0eb4\3\2\2\2\u0eb7\u0eba\3\2\2"+
		"\2\u0eb8\u0eb6\3\2\2\2\u0eb8\u0eb9\3\2\2\2\u0eb9\u0ebc\3\2\2\2\u0eba\u0eb8"+
		"\3\2\2\2\u0ebb\u0ead\3\2\2\2\u0ebb\u0eb1\3\2\2\2\u0ebc\u01f7\3\2\2\2\u0ebd"+
		"\u0ebe\7F\2\2\u0ebe\u0ebf\5\u0200\u0101\2\u0ebf\u01f9\3\2\2\2\u0ec0\u0ec1"+
		"\7\u0127\2\2\u0ec1\u0ec2\5\u0200\u0101\2\u0ec2\u01fb\3\2\2\2\u0ec3\u0ec5"+
		"\7\u0180\2\2\u0ec4\u0ec3\3\2\2\2\u0ec4\u0ec5\3\2\2\2\u0ec5\u0ec8\3\2\2"+
		"\2\u0ec6\u0ec9\7\u0182\2\2\u0ec7\u0ec9\5\u020a\u0106\2\u0ec8\u0ec6\3\2"+
		"\2\2\u0ec8\u0ec7\3\2\2\2\u0ec9\u01fd\3\2\2\2\u0eca\u0ecf\5\u01fc\u00ff"+
		"\2\u0ecb\u0ecc\7\u016e\2\2\u0ecc\u0ece\5\u01fc\u00ff\2\u0ecd\u0ecb\3\2"+
		"\2\2\u0ece\u0ed1\3\2\2\2\u0ecf\u0ecd\3\2\2\2\u0ecf\u0ed0\3\2\2\2\u0ed0"+
		"\u01ff\3\2\2\2\u0ed1\u0ecf\3\2\2\2\u0ed2\u0ed5\7\u0184\2\2\u0ed3\u0ed5"+
		"\7\u0185\2\2\u0ed4\u0ed2\3\2\2\2\u0ed4\u0ed3\3\2\2\2\u0ed5\u0201\3\2\2"+
		"\2\u0ed6\u0ed8\t\60\2\2\u0ed7\u0ed6\3\2\2\2\u0ed7\u0ed8\3\2\2\2\u0ed8"+
		"\u0ed9\3\2\2\2\u0ed9\u0eda\7\u0186\2\2\u0eda\u0203\3\2\2\2\u0edb\u0edd"+
		"\t\60\2\2\u0edc\u0edb\3\2\2\2\u0edc\u0edd\3\2\2\2\u0edd\u0ede\3\2\2\2"+
		"\u0ede\u0edf\7\u0187\2\2\u0edf\u0205\3\2\2\2\u0ee0\u0ee1\t\64\2\2\u0ee1"+
		"\u0207\3\2\2\2\u0ee2\u0ee3\7\u00c8\2\2\u0ee3\u0209\3\2\2\2\u0ee4\u0ee5"+
		"\t\65\2\2\u0ee5\u020b\3\2\2\2\u01e9\u0211\u0214\u0218\u021b\u0220\u0227"+
		"\u022d\u022f\u0238\u023b\u023d\u027f\u0287\u0297\u029e\u02a1\u02a7\u02ab"+
		"\u02b4\u02b9\u02c6\u02cb\u02d4\u02e0\u02e5\u02e8\u02f6\u02fd\u0306\u0317"+
		"\u031f\u032a\u0334\u033c\u0343\u0347\u034b\u0350\u0354\u0359\u035d\u0361"+
		"\u036b\u036f\u0374\u0379\u037d\u038a\u038f\u0395\u039e\u03a2\u03aa\u03ad"+
		"\u03b2\u03b7\u03be\u03c7\u03ca\u03d1\u03d7\u03dc\u03e2\u03e7\u03ea\u03f4"+
		"\u03fc\u0404\u0412\u041c\u0422\u0427\u042c\u0431\u0435\u043a\u043d\u0447"+
		"\u0453\u045a\u045d\u0469\u046e\u0473\u0476\u047d\u0489\u0496\u0498\u049d"+
		"\u04a0\u04af\u04b5\u04c0\u04c3\u04cd\u04d4\u04da\u04e2\u04ec\u0500\u0506"+
		"\u050a\u050f\u0513\u0518\u051b\u0520\u0523\u052f\u0536\u053b\u0540\u0544"+
		"\u0549\u054c\u0556\u0562\u0569\u0571\u0580\u059f\u05a1\u05a6\u05aa\u05af"+
		"\u05b6\u05b9\u05bc\u05c1\u05c5\u05c7\u05ce\u05d4\u05db\u05e1\u05e4\u05e9"+
		"\u05ed\u05f0\u05f7\u05fd\u0600\u060a\u0613\u061a\u0621\u0623\u0629\u062c"+
		"\u0637\u0640\u0646\u064c\u064f\u0654\u0657\u065a\u065d\u0660\u0666\u0670"+
		"\u067b\u067e\u0685\u068a\u068f\u0693\u069b\u069f\u06a4\u06a8\u06aa\u06af"+
		"\u06b7\u06bc\u06c2\u06c9\u06d0\u06d7\u06da\u06e1\u06e9\u06f1\u06f4\u06f7"+
		"\u06fc\u0705\u0709\u0713\u0726\u072e\u073c\u073e\u0743\u0749\u074c\u0755"+
		"\u075a\u075f\u0767\u0772\u077b\u0783\u078b\u078f\u0797\u07a9\u07b7\u07be"+
		"\u07c2\u07c9\u07cb\u07cf\u07d3\u07db\u07df\u07e9\u07f2\u0802\u0808\u080c"+
		"\u0816\u081e\u0827\u082b\u0831\u0836\u083a\u0844\u084a\u084e\u085a\u0861"+
		"\u0871\u0878\u0882\u0885\u0889\u0890\u0897\u0899\u089d\u08a1\u08a6\u08a9"+
		"\u08ad\u08b0\u08bb\u08be\u08c9\u08cf\u08d3\u08d5\u08d9\u08e2\u08e9\u08ed"+
		"\u08f1\u08f8\u08fc\u0904\u090f\u0913\u091e\u0925\u0932\u093a\u093e\u0948"+
		"\u094d\u095a\u0965\u096d\u0971\u0975\u0979\u097b\u0980\u0983\u0986\u0989"+
		"\u098c\u0990\u0993\u0996\u0999\u09a1\u09aa\u09ad\u09b0\u09b5\u09b8\u09bf"+
		"\u09ca\u09ce\u09d1\u09d5\u09de\u09e3\u09e9\u09ec\u09f1\u09f5\u09f9\u09fd"+
		"\u0a02\u0a0c\u0a11\u0a16\u0a1a\u0a25\u0a2b\u0a31\u0a35\u0a3b\u0a43\u0a49"+
		"\u0a4b\u0a51\u0a56\u0a5d\u0a61\u0a6b\u0a70\u0a79\u0a7e\u0a82\u0a8b\u0a8f"+
		"\u0a92\u0a97\u0a9b\u0a9f\u0aa3\u0aa9\u0ab2\u0ab8\u0abd\u0ac2\u0ac5\u0aca"+
		"\u0acd\u0ad2\u0ad7\u0adc\u0ae8\u0aec\u0af9\u0b01\u0b07\u0b0b\u0b17\u0b1c"+
		"\u0b20\u0b26\u0b31\u0b33\u0b3a\u0b3d\u0b44\u0b49\u0b4f\u0b52\u0b55\u0b64"+
		"\u0b6b\u0b6e\u0b71\u0b75\u0b7a\u0b80\u0b84\u0b8f\u0b93\u0b96\u0b9a\u0b9e"+
		"\u0ba2\u0ba6\u0bac\u0bb2\u0bba\u0bbd\u0bc5\u0bcb\u0bd0\u0bdb\u0be4\u0be8"+
		"\u0bf1\u0bf5\u0bff\u0c04\u0c1a\u0c1d\u0c21\u0c28\u0c38\u0c47\u0c49\u0c54"+
		"\u0c63\u0c71\u0c75\u0c80\u0c84\u0c90\u0c94\u0ca8\u0cad\u0cb2\u0cb6\u0cba"+
		"\u0cbf\u0cc3\u0cc7\u0cde\u0ce0\u0cf2\u0cf4\u0cfc\u0d01\u0d06\u0d0b\u0d1a"+
		"\u0d21\u0d26\u0d2b\u0d30\u0d35\u0d3a\u0d3f\u0d44\u0d49\u0d52\u0d54\u0d5c"+
		"\u0d5f\u0d62\u0d65\u0d77\u0d80\u0d8a\u0d92\u0d9b\u0da1\u0db2\u0db5\u0dc5"+
		"\u0dc8\u0dd8\u0ddb\u0deb\u0dee\u0dfe\u0e01\u0e11\u0e14\u0e22\u0e31\u0e35"+
		"\u0e45\u0e4b\u0e50\u0e54\u0e5b\u0e61\u0e65\u0e73\u0e7a\u0e7c\u0e82\u0e86"+
		"\u0e8c\u0e9b\u0ea2\u0ea7\u0eb1\u0eb8\u0ebb\u0ec4\u0ec8\u0ecf\u0ed4\u0ed7"+
		"\u0edc";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}