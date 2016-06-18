package design.factory;

/**
 * Created by haico on 6/11/2016.
 */
public class ProductTwo implements Product {
    public String getName() {
        return "Product two";
    }

    public Product createProduct() {
        return new ProductTwo();
    }

    static {
        ReflectionRegisterFactory.getInstance().registerProduct("02", ProductTwo.class);
        NonReflectionRegisterFactory.getInstance().registerProduct("02", new ProductTwo());
    }
}
