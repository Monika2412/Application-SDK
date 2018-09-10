package Exceptions;

public class InvalidArgumentException extends BaseException{
	
	private static final long serialVersionUID = 7318479874248138781L;

    public InvalidArgumentException(String message, Exception parent) {
        super(message, parent);
    }

    public InvalidArgumentException(String message) {
        super(message);
    }

    public InvalidArgumentException(Throwable t) {
        super(t);
}

}
