package module08;

import java.util.List;

import module08.User;

public class UserDAO implements AbstractDAO {

	@Override
	public AbstractEntity save(AbstractEntity item) {
		return save(item);
	}

	@Override
	public void delete(AbstractEntity item) {
		delete(item);
	}

	@Override
	public void deleteAll(List list) {
		deleteAll(list);
	}

	@Override
	public void saveAll(List list) {
		saveAll(list);
	}

	@Override
	public List<User> getList() {
		return getList();
	}

	@Override
	public void daleteById(long id) {
		daleteById(id);
	}

	@Override
	public AbstractEntity get(long id) {
		return get(id);
	}
}
