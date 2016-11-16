package cn.mtoke.exceptions;

public class ActException extends RuntimeException {

	public ActException(String message) {
        super(message);
    }

    public ActException(String message, Throwable cause) {
        super(message, cause);
    }
	
}
