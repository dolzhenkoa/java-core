package module06;

import java.util.Arrays;

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
	
	private boolean isNullArray(User[] users) {
		if(users==null||users.length==0) {
			return true;
		}
		return false;
	}
	
	//users are equal when all their field are equal
	public User[] uniqueUsers(User[] users) {
		if(isNullArray(users)) return users;
		
		boolean[] marks=new boolean[users.length];
		Arrays.fill(marks,false);
		
		
		for(int i=0;i<users.length;i++) {
			for(int j=0;j<users.length;j++) {
				if(users[i].equals(users[j])&&i!=j) {
					marks[i]=true;
					marks[j]=true;
				}
			}
		}
		
	 	int count=0;
		for(boolean mark:marks) {
			if(mark==false) {
				count++;
			}
		}
		User[] result=new User[count];
		
		count=0;
		for(int i=0;i<users.length;i++) {
			if(marks[i]==false) {
				result[count++]=users[i];
			}
		}
		
		return result;
	}
	
	//user’s balance == balance
	public User[] usersWithContitionalBalance(User[] users, int balance) {
		if(isNullArray(users)) return users;
		
		User[] result = null;
		for(User user:users) {
			if(user.getBalance()==balance) {
				result=addItemToArray(result,user).clone();
			}
		}
		return result;
	}
	
	public final User[] paySalaryToUsers(User[] users) {
		if(isNullArray(users)) return users;
		
		for(User user:users) {
			user.paySalary();
		}
		return users;
	}
	
	public final long[] getUsersId(User[] users) {
		if(isNullArray(users)) return null;
		
		long[] result= new long[users.length];
		int i=0;
		for(User user:users) {
			result[i++]=user.getId();
		}
		return result;	
	}
	
	public User[] deleteEmptyUsers(User[] users) {
		if(isNullArray(users)) return users;
		
		User[] result = null;
		for(User user:users) {
			if(user.getFirstName()!=null) {
				result=addItemToArray(result,user).clone();
			}
		}
		return result;
	}

}
