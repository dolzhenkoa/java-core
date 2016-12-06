package module06;

public class UserUtils {
	
	private User[] addItemToArray(User[] users, User user) {
		if(users==null) {
			User[] result={user};
			return result;
		} else {
			User[] result=new User[users.length+1];
		
			System.arraycopy(users, 0, result, 0, users.length);
			result[result.length-1]=user;
			return result;
		}
	}
	
	//users are equal when all their field are equal
	public User[] uniqueUsers(User[] users) {
		User[] result = null;
		for(User user1:users) {
			int i=0;
			for(User user2:users) {
				if(user1.equals(user2)) {
					i++;
				}
			}
			if(i>1) {
				result=addItemToArray(result,user1).clone();
			}
		}
		return result;
	}
	
	//user’s balance == balance
	public User[] usersWithContitionalBalance(User[] users, int balance) {
		User[] result = null;
		for(User user:users) {
			if(user.getBalance()==balance) {
				result=addItemToArray(result,user).clone();
			}
		}
		return result;
	}
	
	public final User[] paySalaryToUsers(User[] users) {
		for(User user:users) {
			user.paySalary();
		}
		return users;
	}
	
	public final long[] getUsersId(User[] users) {
		long[] result= new long[users.length];
		int i=0;
		for(User user:users) {
			result[i++]=user.getId();
		}
		return result;	
	}
	
	public User[] deleteEmptyUsers(User[] users) {
		User[] result = null;
		for(User user:users) {
			if(user.getFirstName()!=null) {
				result=addItemToArray(result,user).clone();
			}
		}
		return result;
	}

}
