package design.iterator;

/**
 * Created by haico on 6/11/2016.
 */
public interface Aggregate <T> {
    void add(T t);

    Iterator<T> createIterator();
}
