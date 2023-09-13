package N1Exe1.Exceptions;

public class EmptySaleListException extends Exception {

	private static final long serialVersionUID = 1L;

	public EmptySaleListException() {
		
	}

	public EmptySaleListException(String errorMessage) {
		super(errorMessage);

	}

}
