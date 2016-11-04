package module02;

public class Task03 {
	
	/*
	You need to write method which withdraw money of particular account owner if he/she can. Print name + NO of withdrawal fs not possible and name + sum of withdrawal + balance after withdrawal in other case. Commision is 5% for all cases.

	Example
--------------------------	
	Input
	
	int[] balances = {1200, 250, 2000, 500, 3200};
	String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
	
	String ownerName = Ann
	double withdrawal = 100;
	
	Output
	Ann 100 145
--------------------------	
	Input
	
	int[] balances = {1200, 250, 2000, 500, 3200};
	String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
	
	String ownerName = Oww
	double withdrawal = 490;
	
	Output
	Oww NO
	*/
	
	private static double balance=0;
	private static double commision=0;
	private static double percent=5;
	
	private static int[] balances = {1200, 250, 2000, 500, 3200};
	private static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
	
	public static void main(String[] args) {
		withdrawal("Ann",100);
		withdrawal("Oww",490);
	}
	
	public static void withdrawal(String owner, double sum) {
	
		for(int i=0;i<ownerNames.length;i++) {
			if(ownerNames[i]==owner) {
				balance=balances[i];
				commision=sum*(percent/100d);
				if(commision+sum <= balance) {
					balance=balance-commision-sum;
					System.out.printf("%s %.3f %.3f%n",owner,sum,balance);
				} else {
					System.out.printf("%s NO%n",owner);
				}
			}
		}
	}

}
