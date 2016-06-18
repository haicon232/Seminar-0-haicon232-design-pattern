package design.factory;

/**
 * Created by haico on 6/11/2016.
 */
public class ProductOne implements Product {
    public String getName() {
        return "Product One";
    }

    public Product createProduct() {
        return new ProductOne();
    }

    static {
        ReflectionRegisterFactory.getInstance().registerProduct("01", ProductOne.class);
        NonReflectionRegisterFactory.getInstance().registerProduct("01", new ProductOne());
    }
}
