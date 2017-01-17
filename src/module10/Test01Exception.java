package module10;

public class Test01Exception extends Exception {

	public Test01Exception() {

	}

	public Test01Exception(String message) {
		super(message);
	}

	public Test01Exception(Throwable cause) {
		super(cause);
	}

	public Test01Exception(String message, Throwable cause) {
		super(message, cause);
	}

	public Test01Exception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
