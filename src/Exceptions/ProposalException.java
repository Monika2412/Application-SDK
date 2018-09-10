package Exceptions;

public class ProposalException extends BaseException {
	
	private static final long serialVersionUID = 1L;

    public ProposalException(String message, Exception parent) {
        super(message, parent);
    }

    public ProposalException(String message) {
        super(message);
    }

    public ProposalException(Throwable t) {
        super(t);
}

}
