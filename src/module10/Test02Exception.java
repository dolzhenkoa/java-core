package module10;

public class Test02Exception extends Exception {

	public Test02Exception() {

	}

	public Test02Exception(String message) {
		super(message);
	}

	public Test02Exception(Throwable cause) {
		super(cause);
	}

	public Test02Exception(String message, Throwable cause) {
		super(message, cause);
	}

	public Test02Exception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
