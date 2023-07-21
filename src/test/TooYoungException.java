package test;

public class TooYoungException extends RuntimeException {
    public TooYoungException() {
        super();
    }

    public TooYoungException(String message) {
        super(message);
    }

    public TooYoungException(String message, Throwable cause) {
        super(message, cause);
    }

    public TooYoungException(Throwable cause) {
        super(cause);
    }

    protected TooYoungException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
