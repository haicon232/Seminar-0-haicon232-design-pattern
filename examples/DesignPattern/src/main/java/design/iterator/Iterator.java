package design.iterator;

/**
 * Created by haico on 6/11/2016.
 */
public interface Iterator <T>{
    T first();
    T next();
    boolean isDone();
    T current();
}
