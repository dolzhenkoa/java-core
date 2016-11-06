package module02;

public class Task02 {
	
	/*
	Continue with BANK example
	2.1 Write method which withdraw money from account and takes commision 5% of the transaction. Print OK + commision + balance after withdrawal. Print NO is withdrawal is not possible.

	Example
------------------------
	Input

	balance = 100
	withdrawal = 10

	Output
	OK 0.5 89.5
------------------------
	Input

	balance = 100
	withdrawal = 99

	Output
	NO
	*/
	private static double balance=0;
	private static double commision=0;
	private static final double percent=5;
	
	public static void main(String[] args) {
		balance=100;
		withdrawal(10);
				
		balance=100;
		withdrawal(99);
	}
	
	public static void withdrawal(int sum) {
		commision=sum*(percent/100d);
		if(commision+sum <= balance) {
			balance=balance-commision-sum;
			System.out.printf("OK %.3f %.3f %n",commision,balance);
		} else {
			System.out.printf("NO%n");
		}
	}

}
