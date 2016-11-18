package module04.task05;

import module04.task01.ChinaBank;
import module04.task01.EUBank;
import module04.task01.USBank;
import module04.task02.Currency;
import module04.task03.User;

public class Main {

	public static void main(String[] args) {
		USBank usBank=new USBank(1, "us", Currency.USD, 110, 11000d, 10l, 2000000);
		EUBank euBank=new EUBank(2, "eu", Currency.USD, 75, 10000d, 9l, 1800000);
		ChinaBank chinaBank=new ChinaBank(3, "china", Currency.USD, 250, 5000d, 5l, 300000);
		
		User user1=new User(1, "Jane", 3500.45, 120, "Enterprise1", 5000, usBank);
		User user2=new User(2, "Ann", 2078.0, 25, "Enterprise2", 7000, usBank);
		User user3=new User(3, "Tom", 4800.0, 47, "Enterprise3", 4000, euBank);
		User user4=new User(4, "Jack", 5480.99, 12, "Enterprise4", 8000, euBank);
		User user5=new User(5, "Oww", 785.25, 3, "Enterprise5", 6000, chinaBank);
		User user6=new User(6, "Lane", 5698.75, 275, "Enterprise6", 10000, chinaBank);
	}

}
