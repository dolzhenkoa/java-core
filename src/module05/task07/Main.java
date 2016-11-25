package module05.task07;

import java.util.Date;

import module05.api.API;
import module05.api.BookingComAPI;
import module05.api.GoogleAPI;
import module05.api.TripAdvisorAPI;
import module05.controller.Controller;
import module05.dao.DAO;
import module05.dao.DAOImpl;
import module05.model.Room;

public class Main {
	private static Controller controller;
	
	public static void main(String[] args) {
		API bookingApi=new BookingComAPI();
		API tripAdvisorAPI=new TripAdvisorAPI();
		API googleApi=new GoogleAPI();
		
		DAO dao=new DAOImpl();
		dao.save(new Room(1, 10, 1, new Date(), "hotel1", "city1"));
		dao.update(new Room(1, 10, 1, new Date(), "hotel1", "city1"));
		dao.findById(1);
		dao.delete(new Room(1, 10, 1, new Date(), "hotel1", "city1"));
		
		API listApi[]={bookingApi,tripAdvisorAPI,googleApi};
		controller=new Controller(listApi);
				
		Room[] list1 = controller.requstRooms(10, 1, "city1", "hotel1");
		Room[] list2 = controller.requstRooms(15, 1, "city4", "hotel2");
		Room[] list3 = controller.requstRooms(20, 1, "city3", "hotel3");
		
		Room[] list4 = controller.check(bookingApi, tripAdvisorAPI);
		Room[] list5 = controller.check(googleApi, tripAdvisorAPI);
		Room[] list6 = controller.check(bookingApi, googleApi);
	}

}
