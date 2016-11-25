package module05.api;

import java.util.Date;

import module05.model.Room;

public class GoogleAPI extends API {

	public GoogleAPI() {
		Room[] rooms={
			new Room(1, 10, 1, new Date(), "hotel1", "city1"),
			new Room(2, 15, 1, new Date(), "hotel4", "city2"),
			new Room(3, 20, 1, new Date(), "hotel3", "city3")
		};
		setRooms(rooms);
	}

}
