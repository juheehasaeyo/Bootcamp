package DataStructure.Two;

public interface ListInterface2<E> {
    public void add(int i, E x);

    public void append(E x);

    public E remove(int i);

    public boolean removeItem(E x);

    public E get(int i);

    public void set(int i, E x);

    public int indexOf(E x);

    public int size();

    public boolean isEmpty();

    public void clear();
}
