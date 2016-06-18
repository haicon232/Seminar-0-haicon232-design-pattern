package design.factory;

/**
 * Created by haico on 6/11/2016.
 */
public interface Product {
    String getName();

    Product createProduct();
}
