package design.iterator;

/**
 * Created by haico on 6/11/2016.
 */
public class BookIterator implements Iterator<Book> {
    private BookAggregate aggregate;
    private int current = 0;

    public BookIterator(BookAggregate aggregate) {
        this.aggregate = aggregate;
    }

    public Book first() {
        return aggregate.get(0);
    }

    public Book next() {
        Book result = null;
        if(current < aggregate.count()) {
            result = aggregate.get(current++);
        }
        return result;
    }

    public boolean isDone() {
        return current >= aggregate.count();
    }

    public Book current() {
        return aggregate.get(current);
    }
}
