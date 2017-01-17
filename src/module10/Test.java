package module10;

public class Test {
	public void g() throws TestException {
		System.out.println("my exception 'g()'");
		throw new TestException("my exception 'g()'");
	}
	
	public void f() throws TestException {
		try {
			g();
		} catch(Exception e) {
			System.out.println("my exception 'f()'");
			throw new TestException("my exception 'f()'");
		}
	}
}