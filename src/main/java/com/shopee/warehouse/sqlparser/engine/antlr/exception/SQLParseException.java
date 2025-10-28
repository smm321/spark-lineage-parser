package com.shopee.warehouse.sqlparser.engine.antlr.exception;

public class SQLParseException extends RuntimeException{

    public SQLParseException() {
        super();
    }

    public SQLParseException(String message, Throwable cause) {
        super(message, cause);
    }

    public SQLParseException(String message) {
        super(message);
    }

    public SQLParseException(Throwable cause) {
        super(cause);
    }
}
