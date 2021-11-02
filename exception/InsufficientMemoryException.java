package exception;

public class InsufficientMemoryException extends Exception {
	int space;

	

	public InsufficientMemoryException(int sum) {
		// TODO Auto-generated constructor stub
		super();
		this.space = space;
	}

	@Override
	public String toString() {
		return "InsufficientMemoryException [space=" + space + "]";
	}
	

}