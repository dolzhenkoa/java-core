package module10;

public class Test03Exception extends Exception {

	public Test03Exception() {

	}

	public Test03Exception(String message) {
		super(message);
	}

	public Test03Exception(Throwable cause) {
		super(cause);
	}

	public Test03Exception(String message, Throwable cause) {
		super(message, cause);
	}

	public Test03Exception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
