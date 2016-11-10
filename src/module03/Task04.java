package module03;

public class Task04 {
	/**
	 Create User class with the following fields: String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency.

	Create getters and setters and constructor with all fileds.
	
	Write methods:
	
	void paySalary() -  that add salary to the balance of the user
	withdraw(int summ) - takes money from the balance with 5% commision if summ < 1000 and 10% commision in other cases
	companyNameLenght - calculates name of the company name
	monthIncreaser(int addMonth) - increase monthsOfEmployment by addMonth
	 */
	
	public static void main(String[] args) {
		User user=new User();
		user.setCompanyName("Enterprise");
		user.setMonthsOfEmployment(7);
		
		System.out.println("balance: "+user.getBalance());
		user.paySalary();
		System.out.println("balance: "+user.getBalance());
		user.withdraw(100);
		System.out.println("balance: "+user.getBalance());
		user.withdraw(1100);
		System.out.println("balance: "+user.getBalance());
		
		System.out.println("companyNameLenght: "+user.companyNameLenght());
		
		System.out.println("monthsOfEmployment: "+user.getMonthsOfEmployment());
		user.monthIncreaser(3);
		System.out.println("monthsOfEmployment: "+user.getMonthsOfEmployment());
	}

}
