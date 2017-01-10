package module09;

import java.util.ArrayList;
import java.util.List;

import module07.Currency;
import module07.Order;
import module07.User;
import static module09.OrderPredicates.*;
import static module09.OrderUtils.*;

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
		
		//-------------------------------------------------------
		orders=sortedMaxMin(orders);	
		System.out.println(orders);
		
		//-------------------------------------------------------
		orders=sortedMinMaxCity(orders);
		System.out.println(orders);		
		
		//-------------------------------------------------------
		orders=sortedItemNameIdCity(orders);
		System.out.println(orders);	
		
		//-------------------------------------------------------
		orders=distinct(orders);
		System.out.println(orders);
		
		//-------------------------------------------------------
		List<Order> orders1=filterOrders(orders, is1500());
		System.out.println(orders1);
		
		//-------------------------------------------------------
		System.out.println(filterOrders(orders, isUSD()));
		System.out.println(filterOrders(orders, isEUR()));
		
		//-------------------------------------------------------
		System.out.println(groupByCity(orders));
		
		//-------------------------------------------------------
		System.out.println(filterOrders(orders, isPetrov()).isEmpty());
		
		//-------------------------------------------------------
		System.out.println(filterOrders(orders, isNotUSD()));
	}
	
	
}

