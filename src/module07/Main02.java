package module07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import module05.api.API;
import module05.api.BookingComAPI;
import module05.api.GoogleAPI;
import module05.api.TripAdvisorAPI;
import module05.controller.Controller;
import module05.model.Room;

public class Main02 {

	public static void main(String[] args) {
		User user1=new User(1,"user","1","city 1",1000);
		User user2=new User(2,"user","1","city 2",2000);
		User user3=new User(3,"user","1","city 3",3000);
		User user4=new User(4,"user","1","city 1",4000);
		User user5=new User(5,"user","1","city 2",5000);
		User user6=new User(6,"user","1","city 4",6000);
		User user7=new User(7,"Petrov","1","city 3",7000);
		User user8=new User(8,"user","1","city 2",8000);
		User user9=new User(9,"user","1","city 1",1000);
		User user10=new User(10,"user","1","city 2",2000);

		Set<Order> orders=new TreeSet();
		orders.add(new Order(1,1205,Currency.USD,"thing1","shop 1",user1));
		orders.add(new Order(2,1220,Currency.EUR,"thing1","shop 2",user2));
		orders.add(new Order(3,1300,Currency.USD,"thing2","shop 1",user3));
		orders.add(new Order(4,1500,Currency.EUR,"thing1","shop 2",user4));
		orders.add(new Order(5,2000,Currency.USD,"thing2","shop 1",user5));
		orders.add(new Order(6,3200,Currency.EUR,"thing2","shop 2",user6));
		orders.add(new Order(7,200,Currency.USD,"thing2","shop 2",user7));
		orders.add(new Order(8,1200,Currency.USD,"thing1","shop 1",user1));
		orders.add(new Order(9,1220,Currency.EUR,"thing1","shop 2",user2));
		orders.add(new Order(10,7000,Currency.EUR,"thing1","shop 1",user10));
		
		System.out.println(orders);
		System.out.println("size = "+orders.size());
		
		//-------------------------------------------------------
		List listPetrov=orders.stream().filter((p)-> p.getUser().getFirstName().equals("Petrov")).collect(Collectors.toList());
		System.out.println("Petrov = "+listPetrov.size());
				
		//-------------------------------------------------------
		List<Room> rooms=new ArrayList<>();
		rooms.addAll(Arrays.asList(new BookingComAPI().findRooms(15, 1, "city2", "hotel2")));
		rooms.addAll(Arrays.asList(new TripAdvisorAPI().findRooms(15, 1, "city2", "hotel2")));
		rooms.addAll(Arrays.asList(new GoogleAPI().findRooms(15, 1, "city2", "hotel2")));
		System.out.println(rooms);
				
		//-------------------------------------------------------
		System.out.println(orders.iterator().next().getPrice());
		
		//-------------------------------------------------------
		
		Iterator<Order> order = orders.iterator();
		while (order.hasNext()) {
		   Order item=order.next();
		   if(item.getCurrency().equals(Currency.USD)) order.remove();
		}
		System.out.println(orders);
		
		//-------------------------------------------------------
		testArray(1000);
		testArray(10000);
		testLinked(1000);
		testLinked(10000);
	}

	public static void testArray(int size) {
		List<Integer> intArray=new ArrayList();
		List<String> strArray=new ArrayList();
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------");
		long startTime = System.nanoTime();
		for(int i=0;i<size;i++) intArray.add(i);
		elapsedTimeInMillis(startTime,"Integer-ArrayList()-add");
		
		startTime = System.nanoTime();
		for(int i=0;i<size;i++) intArray.set(i,i);
		elapsedTimeInMillis(startTime,"Integer-ArrayList()-set");
		
		startTime = System.nanoTime();
		for(int i=0;i<1000;i++) intArray.get(i);
		elapsedTimeInMillis(startTime,"Integer-ArrayList()-get");
		
		startTime = System.nanoTime();
		for(int i=0;i<size;i++) intArray.remove(intArray.size()-1);
		elapsedTimeInMillis(startTime,"Integer-ArrayList()-remove");
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------");
		for(int i=0;i<size;i++) strArray.add(String.valueOf(i));
		elapsedTimeInMillis(startTime,"String-ArrayList()-add");
		
		startTime = System.nanoTime();
		for(int i=0;i<size;i++) strArray.set(i,String.valueOf(i));
		elapsedTimeInMillis(startTime,"String-ArrayList()-set");
		
		startTime = System.nanoTime();
		for(int i=0;i<size;i++) strArray.get(i);
		elapsedTimeInMillis(startTime,"String-ArrayList()-get");
		
		startTime = System.nanoTime();
		for(int i=0;i<size;i++) strArray.remove(strArray.size()-1);
		elapsedTimeInMillis(startTime,"String-ArrayList()-remove");
	}
	
	public static void testLinked(int size) {
		List<Integer> intLinked=new LinkedList();
		List<String> strLinked=new LinkedList();	
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------");
		long startTime = System.nanoTime();
		for(int i=0;i<size;i++) intLinked.add(i);
		elapsedTimeInMillis(startTime,"Integer-LinkedList()-add");
		
		startTime = System.nanoTime();
		for(int i=0;i<size;i++) intLinked.set(i,i);
		elapsedTimeInMillis(startTime,"Integer-LinkedList()-set");
		
		startTime = System.nanoTime();
		for(int i=0;i<1000;i++) intLinked.get(i);
		elapsedTimeInMillis(startTime,"Integer-LinkedList()-get");
		
		startTime = System.nanoTime();
		for(int i=0;i<size;i++) intLinked.remove(intLinked.size()-1);
		elapsedTimeInMillis(startTime,"Integer-LinkedList()-remove");
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------------");
		for(int i=0;i<size;i++) strLinked.add(String.valueOf(i));
		elapsedTimeInMillis(startTime,"String-LinkedList()-add");
		
		startTime = System.nanoTime();
		for(int i=0;i<size;i++) strLinked.set(i,String.valueOf(i));
		elapsedTimeInMillis(startTime,"String-LinkedList()-set");
		
		startTime = System.nanoTime();
		for(int i=0;i<size;i++) strLinked.get(i);
		elapsedTimeInMillis(startTime,"String-LinkedList()-get");
		
		startTime = System.nanoTime();
		for(int i=0;i<size;i++) strLinked.remove(strLinked.size()-1);
		elapsedTimeInMillis(startTime,"String-LinkedList()-remove");
	}
	
	public static void elapsedTimeInMillis(long startTime, String text) {
		long endTime = System.nanoTime();
		long elapsedTimeInMillis = TimeUnit.MILLISECONDS.convert((endTime - startTime), TimeUnit.NANOSECONDS);
	    System.out.println("Total elapsed time ("+text+"): " + elapsedTimeInMillis + " ms"  );	
	}
	
}
