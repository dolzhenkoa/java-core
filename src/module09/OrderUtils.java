package module09;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import module07.Order;

public class OrderUtils {
	
	public static List<Order> sortedMaxMin(List<Order> orders) {
	    return orders.stream()
				.sorted((o1,o2)->{return o1.compareTo(o2);})
				.collect(Collectors.toList());
		}
	
	public static List<Order> sortedMinMaxCity(List<Order> orders) {
	    return orders.stream()
				.sorted(new Comparator<Order>() {
			        public int compare(Order o1, Order o2) {
				        	int result=o1.getUser().getCity().compareTo(o2.getUser().getCity());
				        	
				        	if(result != 0) return result;
				        	
				        	if (o1.getUser().getCity().equals(o2.getUser().getCity())==false)
				                return 1;
				            else if (o1.getUser().getCity().equals(o2.getUser().getCity())==true)
				                return -1;
				            else
				                return 0;      	
				        }
					})
				.collect(Collectors.toList());
		}
	
	public static List<Order> sortedItemNameIdCity(List<Order> orders) {
	    return orders.stream()
				.sorted(new Comparator<Order>() {
			        public int compare(Order o1, Order o2) {
				        	int result=o1.getItemName().compareTo(o2.getItemName());
				        	if(result != 0) return result;
				        	
				        	result=Long.compare(o1.getId(), o2.getId());
				        	if(result != 0) return result;
				        	
				        	if (o1.getUser().getCity().equals(o2.getUser().getCity())==false)
				                return -1;
				            else if (o1.getUser().getCity().equals(o2.getUser().getCity())==true)
				                return 1;
				            else
				                return 0;      	
			        	}
					})
				.collect(Collectors.toList());
		}

	public static Map<String,List<Order>> groupByCity(List<Order> orders) {
	    return orders.stream()
				.collect(Collectors.groupingBy(Order::getCity));
		}
	
	public static List<Order> distinct(List<Order> orders) {
	    return orders.stream().distinct().collect(Collectors.toList());
		}
}
