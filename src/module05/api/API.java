package module05.api;

import module05.model.Room;

public interface API {
	Room[] rooms=null;

	Room[] findRooms(int price, int persons, String city, String hotel);
	Room[] getAll();	
	Room[] getRooms();	

}
