package module03;

public class Task02 {
	/**
	Write class named Arithmetic with a method named add that takes  integers as parameters and returns an integer denoting their sum.

	Write class named Adder that inherits from a superclass named Arithmetic. Also class Adder must contain method check that compare two numbers and returns true if a>=b and false in other cases. 
	
	Methods signature:
	int add(Integer a, Integer b)
	boolean check(Integer a, Integer b)
	 */
	
	public static void main(String[] args) {
		
		Arithmetic arithmetic=new Arithmetic();
		Adder adder=new Adder();
		System.out.println("Aarithmetic add(7, 10) :"+adder.add(7, 10));
		System.out.println("Adder add(5, 5) :"+adder.add(5, 5));
		System.out.println("Adder check(3, 7) :"+adder.check(3, 7));
		System.out.println("Adder check(7, 3) :"+adder.check(7, 3));
	}

}
