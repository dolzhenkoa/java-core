package module08;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDAOImpl<T extends AbstractEntity> implements AbstractDAO<T> {
	private List<T> out=new ArrayList<T>(); 

	@Override
	public T save(T item) {
		out.add((T) item);
		return item;
	}

	@Override
	public void delete(T item) {
		out.remove(item);
	}

	@Override
	public void deleteAll(List<T> list) {
		this.out.removeAll(list);
	}

	@Override
	public void saveAll(List<T> list) {
		out.addAll(list);
	}

	@Override
	public List<T> getList() {
		return out;
	}

	@Override
	public void daleteById(long id) {
		for(T item:out) {
			if(item.getId()==id) {
				out.remove(item);
				break;
			}
		}
	}

	@Override
	public T get(long id) {
		for(T item:out) {
			if(item.getId()==id) {
				return item;
			}
		}
		return null;
	}		

}
