package module05.dao;

import module05.model.Room;

public class DAOImpl implements DAO {

	@Override
	public Room save(Room room) {
		System.out.println("save: "+room.toString());
		return null;
	}

	@Override
	public boolean delete(Room room) {
		System.out.println("delete: "+room.toString());
		return false;
	}

	@Override
	public Room update(Room room) {
		System.out.println("update: "+room.toString());
		return null;
	}

	@Override
	public Room findById(long id) {
		System.out.println("find by id: "+id);
		return null;
	}

}
