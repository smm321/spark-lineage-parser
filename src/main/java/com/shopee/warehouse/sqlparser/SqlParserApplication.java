package com.shopee.warehouse.sqlparser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.shopee.warehouse.sqlparser"}, exclude={com.shopee.banking.starter.config.BankingCommonAutoConfig.class})
public class SqlParserApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SqlParserApplication.class, args);
    }

}
