package module05.controller;

import module05.api.API;
import module05.model.Room;

public class Controller {
	private API apis[] = new API[3];
	
	public Controller(API[] apis) {
		this.apis = apis;
	}

	public Room[] requstRooms(int price, int persons, String city, String hotel) {
		Room[] result = null;
		for(API item:apis){	
			Room[] findRooms=item.findRooms(price, persons, city, hotel);
			if(result==null) {
				result=findRooms.clone();
			} else {
				Room[] tmp=new Room[result.length+findRooms.length];
				System.arraycopy(result, 0, tmp, 0, result.length);
				System.arraycopy(findRooms, 0, tmp, result.length, findRooms.length);
				result=tmp.clone();
			}
		}		
		return result;
	}
	
	public Room[] check(API api1, API api2) {
		Room[] result = null;
		for(Room item:api1.getRooms()){	
			Room[] findRooms=api2.findRooms(item.getPrice(), item.getPersons(), item.getCityName(), item.getHotelName());
			if(result==null) {
				result=findRooms.clone();
			} else {
				Room[] tmp=new Room[result.length+findRooms.length];
				System.arraycopy(result, 0, tmp, 0, result.length);
				System.arraycopy(findRooms, 0, tmp, result.length, findRooms.length);
				result=tmp.clone();
			}
		}		
		return result;
	}
}
