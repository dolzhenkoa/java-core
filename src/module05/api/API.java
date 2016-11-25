package module05.api;

import module05.model.Room;

public abstract class API {
	private Room[] rooms=null;

	public Room[] findRooms(int price, int persons, String city, String hotel) {
		Room[] tmp=new Room[rooms.length];
		int counter=0;
		for(Room item:rooms) {
			if(item.getPrice()!=price) continue;
			if(item.getPersons()!=persons) continue;
			if(!item.getCityName().equals(city)) continue;
			if(!item.getHotelName().equals(hotel)) continue;
			tmp[counter]=item;
			counter++;
		}
		Room[] result=new Room[counter];
		System.arraycopy(tmp, 0, result, 0, counter);
		return result;
	};
		
	public Room[] getAll() {
		return this.rooms;
	}
	
	public Room[] getRooms() {
		return rooms;
	}
	
	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}
}
