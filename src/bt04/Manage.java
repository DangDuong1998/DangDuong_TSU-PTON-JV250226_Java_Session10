package bt04;

public interface Manage<T> {
    void add(T item);
    void update(int index);
    void delete(int index);
    void display();

}
