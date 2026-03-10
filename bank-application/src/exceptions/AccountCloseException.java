package exceptions;

public class AccountCloseException extends Exception {
    public AccountCloseException(String message) {
        super(message);
    }
}
