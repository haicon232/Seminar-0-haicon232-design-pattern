package design.factory;

/**
 * Created by haico on 6/11/2016.
 */
public class NormalFactory {
    public static Product createProduct(String productId) {
        if(productId == null) {
            return null;
        }
        if(productId.equals("01")) {
            return new ProductOne();
        }
        if(productId.equals("02")) {
            return new ProductTwo();
        }
        return null;
    }
}
