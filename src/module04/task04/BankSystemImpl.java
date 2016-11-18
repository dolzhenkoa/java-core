package module04.task04;

import module04.task03.User;

public class BankSystemImpl implements BankSystem {

	@Override
	public void withdrawOfUser(User user, int amount) {
		if(user.getBalance()-amount>=0) {
			user.setBalance(user.getBalance()-amount);
		} else {
			System.out.println("transaction not allowed");
		}
	}

	@Override
	public void fundUser(User user, int amount) {
		user.setBalance(user.getBalance()+amount);
	}

	@Override
	public void transferMoney(User fromUser, User toUser, int amount) {
		if(fromUser.getBalance()-amount>=0) {
			withdrawOfUser(fromUser,amount);
			fundUser(toUser,amount);
		} else {
			System.out.println("transaction not allowed");
		}
	}

	@Override
	public void paySalary(User user) {
		user.setBalance(user.getBalance()+user.getSalary());
	}
}
