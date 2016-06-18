package design.factory;

import java.lang.reflect.Constructor;
import java.util.HashMap;

/**
 * Created by haico on 6/11/2016.
 */
public class NonReflectionRegisterFactory {
    private HashMap<String, Product> registeredProducts = new HashMap<String, Product>();
    private static NonReflectionRegisterFactory instance = new NonReflectionRegisterFactory();

    private NonReflectionRegisterFactory() {

    }

    public void registerProduct(String productID, Product productClass) {
        registeredProducts.put(productID, productClass);
    }

    public Product createProduct(String productID) {
        return registeredProducts.get(productID).createProduct();
    }

//    public Product createProduct(String productID) {
//        try {
//            Class productClass = registeredProducts.get(productID);
//            Constructor productConstructor = productClass.getConstructor();
//            return (Product) productConstructor.newInstance();
//        } catch (NoSuchMethodException e) {
//            return null;
//        } catch (Exception e) {
//            return null;
//        }
//    }

    public static NonReflectionRegisterFactory getInstance() {
        return instance;
    }
}
