package design.iterator;

import java.util.ArrayList;

/**
 * Created by haico on 6/11/2016.
 */
public class BookAggregate implements Aggregate<Book> {
    private ArrayList<Book> listBook = new ArrayList<Book>();
    public void add(Book t) {
        listBook.add(t);
    }

    public Book get(int index) {
        return listBook.get(index);
    }

    public int count() {
        return listBook.size();
    }

    public Iterator createIterator() {
        return new BookIterator(this);
    }
}
