package N3Exe1.Exceptions;

public class IncorrectClientNameException extends Exception {

	private static final long serialVersionUID = 1L;

	public IncorrectClientNameException () {

	}

	public IncorrectClientNameException (String message) {
		super(message);
	}


}
