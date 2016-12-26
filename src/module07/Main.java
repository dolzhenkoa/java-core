package module07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		User user1=new User(1,"user","1","city 1",1000);
		User user2=new User(2,"user","1","city 2",2000);
		User user3=new User(3,"user","1","city 3",3000);
		User user4=new User(4,"user","1","city 1",4000);
		User user5=new User(5,"user","1","city 2",5000);
		User user6=new User(6,"user","1","city 4",6000);
		User user7=new User(7,"user","1","city 3",7000);
		User user8=new User(8,"user","1","city 2",8000);
		User user9=new User(1,"user","1","city 1",1000);
		User user10=new User(2,"user","1","city 2",2000);

		List<Order> orders=new ArrayList<Order>();
		orders.add(new Order(1,1200,Currency.USD,"thing1","shop 1",user1));
		orders.add(new Order(2,1220,Currency.EUR,"thing1","shop 2",user2));
		orders.add(new Order(3,1200,Currency.USD,"thing2","shop 1",user3));
		orders.add(new Order(4,1500,Currency.EUR,"thing1","shop 2",user4));
		orders.add(new Order(5,2000,Currency.USD,"thing2","shop 1",user5));
		orders.add(new Order(6,3200,Currency.EUR,"thing2","shop 2",user6));
		orders.add(new Order(7,200,Currency.USD,"thing2","shop 2",user7));
		orders.add(new Order(8,1200,Currency.USD,"thing1","shop 1",user1));
		orders.add(new Order(9,1220,Currency.EUR,"thing1","shop 2",user2));
		orders.add(new Order(10,7000,Currency.EUR,"thing1","shop 1",user10));
		
		System.out.println(orders);
		
		//-------------------------------------------------------
		Collections.sort(orders, new Comparator<Order>() {
	        public int compare(Order o1, Order o2) {
	        	if (o1.getPrice()>o2.getPrice())
	                return -1;
	            else if (o1.getPrice()<o2.getPrice())
	                return 1;
	            else
	                return 0;
	        }
		});
		
		System.out.println(orders);
		
		//-------------------------------------------------------
		Collections.sort(orders, new Comparator<Order>() {
	        public int compare(Order o1, Order o2) {
	        	int result=o1.getUser().getCity().compareTo(o2.getUser().getCity());
	        	
	        	if(result != 0) return result;
	        	
	        	if (o1.getUser().getCity().equals(o2.getUser().getCity())==false)
	                return -1;
	            else if (o1.getUser().getCity().equals(o2.getUser().getCity())==true)
	                return 1;
	            else
	                return 0;      	
	        }
		});
		
		System.out.println(orders);
		
		//-------------------------------------------------------
		Collections.sort(orders, new Comparator<Order>() {
	        public int compare(Order o1, Order o2) {
	        	int result=o1.getUser().getCity().compareTo(o2.getUser().getCity());
	        	if(result != 0) return result;
	        	
	        	result=o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
	        	if(result != 0) return result;
	        	
	        	result=o1.getItemName().compareTo(o2.getItemName());
	        	if(result != 0) return result;
	        	
	        	return 0;
	        }
		});
		
		System.out.println(orders);
		
		//-------------------------------------------------------
		Set orders1=new HashSet(orders);
		System.out.println(orders1);
		System.out.println("size = "+orders1.size());
		
		//-------------------------------------------------------
		Predicate<Order> filter = p-> p.getPrice() < 1500;
		orders1.removeIf(filter);
		System.out.println(orders1);
		System.out.println("size = "+orders1.size());
		
		//-------------------------------------------------------
		List listEUR=orders.stream().filter((p)-> p.getCurrency()==Currency.EUR).collect(Collectors.toList());
		List listUSD=orders.stream().filter((p)-> p.getCurrency()==Currency.USD).collect(Collectors.toList());
		System.out.println(listEUR);
		System.out.println(listUSD);
		
		
	}

}
