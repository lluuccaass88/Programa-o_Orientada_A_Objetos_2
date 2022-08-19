package exc_avaliativo_1;


public abstract interface Lista<T>{
	public abstract void add(T info);
	public abstract void add(T info, int pos);
	public abstract T get(int pos);
	public abstract T remove(int pos);
	public abstract boolean remove (T info);
	public abstract int size ();
}
