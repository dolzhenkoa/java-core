package module03;

public class User {
	private String name;
	private int balance; 
	private int monthsOfEmployment; 
	private String companyName; 
	private int salary; 
	private String currency;
	
	public void paySalary() {
		balance+=salary;
	}
	
	public void withdraw(int summ) {
		int percent = summ<1000?5:10;
		double commision=summ*(percent/100d);
		if(balance>=commision+summ) {
			balance-=commision+summ;
		} else {
			System.out.println("not enough money for the transaction");
		}
		
	}
	
	public int companyNameLenght() {
		return companyName.length();
	}
	
	public void monthIncreaser(int addMonth) {
		monthsOfEmployment+=addMonth;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getMonthsOfEmployment() {
		return monthsOfEmployment;
	}
	public void setMonthsOfEmployment(int monthsOfEmployment) {
		this.monthsOfEmployment = monthsOfEmployment;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
