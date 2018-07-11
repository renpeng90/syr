package common.rest.exception;

import common.rest.error.ServiceError;

/**
 * Created by WangGang on 2017/2/22.
 */
public class RestException extends RuntimeException {
    private String errorCode;

    public RestException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public RestException(ServiceError error) {
        super(error.getMessage());
        this.errorCode = error.getCode();
    }

    public RestException(String errorCode, String message, Throwable throwable) {
        super(message, throwable);
        this.errorCode = errorCode;
    }

    public RestException(ServiceError error, Throwable throwable) {
        super(error.getMessage(), throwable);
        this.errorCode = error.getCode();
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return this.errorCode;
    }
}

