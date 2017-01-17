package module10;

public class TestException extends Exception {

	private String reference;
	
	public TestException(String exc) {
		reference=exc;
	}

	public String getReference() {
		return reference;
	}
}
