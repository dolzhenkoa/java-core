package module04.task04;

import module04.task03.User;

public class BankSystemImpl implements BankSystem {

	@Override
	public void withdrawOfUser(User user, int amount) {
	
		if(amount<=user.getBank().getLimitOfWithdrawal()) {
			double commission = amount*(user.getBank().getCommission(amount)/100d);
			double summ=user.getBalance()-(commission+amount);
			
			if(summ>=0) {
				user.setBalance(summ);
			} else {
				System.out.println("withdraw: transaction not allowed");
			}
		} else {
			System.out.println(user.getName()+" withdraw limit: transaction not allowed");
		}
	}

	@Override
	public void fundUser(User user, int amount) {
		if(amount<=user.getBank().getLimitOfFunding()) {
			double commission = amount*(user.getBank().getCommission(amount)/100d);
			double summ=user.getBalance()+(amount-commission);
			
			user.setBalance(summ);
		} else {
			System.out.println(user.getName()+" fund limit: transaction not allowed");
		}
	}

	@Override
	public void transferMoney(User fromUser, User toUser, int amount) {
		double fromUserBalance=fromUser.getBalance();
		withdrawOfUser(fromUser,amount);
		
		if(fromUserBalance!=fromUser.getBalance()) {
			fundUser(toUser,amount);
		} else {
			System.out.println("transfer: transaction not allowed");
		}
	}

	@Override
	public void paySalary(User user) {
		user.setBalance(user.getBalance()+user.getSalary());
	}
}
