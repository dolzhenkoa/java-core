package module09;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import module07.Currency;
import module07.Order;

public class OrderPredicates {
	
	public static Predicate<Order> is1500() {
	    return p -> p.getPrice()>=1500;
		}
	
	public static Predicate<Order> isUSD() {
	    return p -> Currency.USD==p.getCurrency();
		}
	
	public static Predicate<Order> isNotUSD() {
	    return p -> Currency.USD!=p.getCurrency();
		}
	
	public static Predicate<Order> isEUR() {
	    return p -> Currency.EUR==p.getCurrency();
		}
	
	public static Predicate<Order> isPetrov() {
	    return p -> "Petrov".equals("Petrov");
		}
	
	public static List<Order> filterOrders (List<Order> orders, Predicate<Order> predicate) {
		return orders.stream().filter( predicate ).collect(Collectors.<Order>toList());
    }
}
