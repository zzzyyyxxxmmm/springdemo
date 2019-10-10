package com.wjk.common;

/**
 * @author jikangwang
 */
public enum ResultCode implements IErrorCode {
    SUCCESS(200, "success"),
    FAILED(500, "Internal Server Error"),
    VALIDATE_FAILED(404, "Page Not Found"),
    UNAUTHORIZED(401, "Unauthorized"),
    FORBIDDEN(403, "Forbidden");
    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
