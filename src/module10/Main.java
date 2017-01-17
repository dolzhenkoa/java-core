package module10;

import module10.Test01Exception;
import module10.Test02Exception;
import module10.Test03Exception;

public class Main {

	public static void main(String[] args) {
		
		//1---------------------------------------
		try {
			throw new Exception("test1");
		} catch(Exception e) {
			try {
				throw new Exception("test2");
			} catch(Exception e1) {
				System.out.println("catch to catch");
			}
		} finally {
			System.out.println("finally");
		}
		
		//2---------------------------------------
		
		TestException exc= new TestException("my exception 1");
		try {
			throw new TestException("my exception 2");
		} catch(Exception e) {
			System.out.println(exc.getReference());
		}
		
		//3----------------------------------------
		
		try {
			TestException reference=null;
			reference.getReference();
		} catch(NullPointerException e) {
			System.out.println(e);
		}

		//4----------------------------------------
		
		try {
			Test test=new Test();
			test.f();
		} catch(Exception e) {
			System.out.println("exception 'Test'");
		}
		
		//5----------------------------------------
		
		try {
			//TestThrow test=new TestThrow(1);
			//TestThrow test=new TestThrow(2);
			TestThrow test=new TestThrow(3);
		} catch(Exception e) {
			System.out.println("TestThrow()");		
		}
	}

}
