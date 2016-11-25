package module05.dao;

import module05.model.Room;

public interface DAO {
	Room save(Room room);
	boolean delete(Room room);
	Room update(Room room);
	Room findById(long id);
}
