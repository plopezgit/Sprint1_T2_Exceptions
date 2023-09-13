package N3Exe1.Exceptions;

public class TakenSeatException extends Exception {

	private static final long serialVersionUID = 1L;

	public TakenSeatException () {

	}

	public TakenSeatException (String message) {
		super(message);
	}


}
