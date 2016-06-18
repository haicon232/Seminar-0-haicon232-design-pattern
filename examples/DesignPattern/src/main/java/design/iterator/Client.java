package design.iterator;

import java.util.Collection;

/**
 * Created by haico on 6/11/2016.
 */
public class Client {
    public static void main(String[] args) {
        BookAggregate listBook = new BookAggregate();
        listBook.add(new Book("con vit bi diec", "haicon232"));
        listBook.add(new Book("love monster", "thanhdancer"));
        listBook.add(new Book("phi hon hit", "hiendv"));
        listBook.add(new Book("sach vs bia", "harry"));

        Iterator<Book> iterator = listBook.createIterator();
        while(!iterator.isDone()) {
            Book book = iterator.next();
            System.out.println(book.toString());
        }
    }
}
