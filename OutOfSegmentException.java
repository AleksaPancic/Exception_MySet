package aleksa;

public class OutOfSegmentException extends Exception {
	private static final long serialVersionUID = 1L;

	public OutOfSegmentException() {
		super();
	}

	public OutOfSegmentException(String message) {
		super(message);
	}
	
}
