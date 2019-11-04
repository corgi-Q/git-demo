package corgi.demo.exception;

public class ToDoException extends Exception {

	private static final long serialVersionUID = 1L;

	public ToDoException(String errorMessage) {
		super(errorMessage);
	}
}
