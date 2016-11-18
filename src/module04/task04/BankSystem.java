package module04.task04;

import module04.task03.User;

public interface BankSystem {
	void withdrawOfUser(User user, int amount);
	void fundUser(User user, int amount);
	void transferMoney(User fromUser, User toUser, int amount);
	void paySalary(User user);
}
