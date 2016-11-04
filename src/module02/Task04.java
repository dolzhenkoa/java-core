package module02;

public class Task04 {
	
	/*
	You need to write method which will fund (пополнение) balance of particular user. Print name + balance after funding
------------------------
	Input
	
	int[] balances = {1200, 250, 2000, 500, 3200};
	
	String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
	
	String ownerName = Oww
	double withdrawal = 100;
	
	Output
	Oww 600
	*/
		
	private static int[] balances = {1200, 250, 2000, 500, 3200};
	private static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
	
	public static void main(String[] args) {
		fund("Oww",100);
	}
	
	public static void fund(String owner, double sum) {
	
		for(int i=0;i<ownerNames.length;i++) {
			if(ownerNames[i]==owner) {
				balances[i]+=sum;
				System.out.printf("%s %d%n",owner,balances[i]);
			}
		}
	}

}
