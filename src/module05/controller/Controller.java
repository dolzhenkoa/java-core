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
			result=duplication(item, result, price, persons, city, hotel).clone();
		}		
		return result;
	}
	
	public Room[] check(API api1, API api2) {
		Room[] result = api1.getRooms().clone();
		for(Room item:api1.getRooms()){
			result=duplication(api2, result, item.getPrice(), item.getPersons(), item.getCityName(), item.getHotelName()).clone();
		}		
		return result;
	}
	
	public Room[] duplication(API api, Room[] result, int price, int persons, String city, String hotel) {
		Room[] findRooms=api.findRooms(price, persons, city, hotel);
		if(result==null) {
			result=findRooms.clone();
		} else {
			Room[] tmp=new Room[result.length+findRooms.length];
			System.arraycopy(result, 0, tmp, 0, result.length);
			System.arraycopy(findRooms, 0, tmp, result.length, findRooms.length);
			result=tmp.clone();
		}
		return result;
	}
}
