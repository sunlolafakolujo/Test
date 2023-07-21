package test;

public class TooOldException extends RuntimeException {
    public TooOldException() {
        super();
    }

    public TooOldException(String message) {
        super(message);
    }

    public TooOldException(String message, Throwable cause) {
        super(message, cause);
    }

    public TooOldException(Throwable cause) {
        super(cause);
    }

    protected TooOldException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
