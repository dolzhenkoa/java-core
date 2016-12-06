package module06;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		UserUtils userUtils=new UserUtils();
		
		User user1=new User(1, "user1-firstname", "user1-lastname", 1000, 2000);
		User user2=new User(2, "user2-firstname", "user2-lastname", 2000, 3000);
		User user3=new User(3, "user3-firstname", "user3-lastname", 3000, 2000);
		User user4=new User(4, "user1-firstname", "user1-lastname", 1000, 2000);
		User user5=new User(0, null, null, 0, 0);
		
		User[] users={user1, user2, user3, user4, user5};
		System.out.println(Arrays.toString(users));
		System.out.println(Arrays.toString(userUtils.deleteEmptyUsers(users)));
		System.out.println(Arrays.toString(userUtils.uniqueUsers(users)));
		System.out.println(Arrays.toString(userUtils.usersWithContitionalBalance(users, 2000)));
		userUtils.paySalaryToUsers(users);
		System.out.println(Arrays.toString(users));
	}

}
