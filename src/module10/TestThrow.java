package module10;

public class TestThrow {

	public TestThrow(int step) throws Test01Exception, Test02Exception, Test03Exception {
		
		switch(step) {
			case 1:
				System.out.println("Test01Exception");
				throw new Test01Exception();
			case 2:
				System.out.println("Test02Exception");
				throw new Test02Exception();
			case 3:
				System.out.println("Test03Exception");
				throw new Test03Exception();
			default:
				System.out.println("try step");
				break;
		}
	}
}
