package module05.api;

import java.util.Date;

import module05.model.Room;

public class TripAdvisorAPI implements API {

	private Room[] rooms=null;
	
	public TripAdvisorAPI() {
		Room[] rooms={
			new Room(1, 10, 1, new Date(), "hotel1", "city1"),
			new Room(2, 15, 1, new Date(), "hotel2", "city2"),
			new Room(3, 20, 1, new Date(), "hotel5", "city3")
		};
		setRooms(rooms);
	}

	@Override
	public Room[] findRooms(int price, int persons, String city, String hotel) {
		Room[] tmp=new Room[rooms.length];
		int counter=0;
		for(Room item:rooms) {
			if(item.getPrice()>price) continue;
			if(item.getPersons()>persons) continue;
			if(!item.getCityName().equals(city)) continue;
			if(!item.getHotelName().equals(hotel)) continue;
			tmp[counter]=item;
			counter++;
		}
		Room[] result=new Room[counter];
		System.arraycopy(tmp, 0, result, 0, counter);
		return result;
	};
		
	@Override
	public Room[] getAll() {
		return this.rooms;
	}
	
	@Override
	public Room[] getRooms() {
		return rooms;
	}
	
	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}
}
