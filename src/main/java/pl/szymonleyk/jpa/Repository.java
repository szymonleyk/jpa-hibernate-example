package pl.szymonleyk.jpa;

public interface Repository<V> {
	
	void insert(V v);
	void delete(V v);
	V select(int id);
	
}
