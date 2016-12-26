package module08;

import java.util.List;

public interface AbstractDAO<T extends AbstractEntity> {
	
	void delete(T item);
	
	void saveAll(List<T> list);
	List <T> getList();
	void daleteById(long id);
	T get(long id);
	void deleteAll(List<T> list);
	T save(T item);
}
