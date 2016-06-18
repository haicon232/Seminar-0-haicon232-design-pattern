package design.factory;

import java.lang.reflect.Constructor;
import java.util.HashMap;

/**
 * Created by haico on 6/11/2016.
 */
public class ReflectionRegisterFactory {
    private HashMap<String, Class> registeredProducts = new HashMap<String, Class>();
    private static ReflectionRegisterFactory instance = new ReflectionRegisterFactory();

    private ReflectionRegisterFactory() {

    }

    public void registerProduct(String productID, Class productClass) {
        registeredProducts.put(productID, productClass);
    }

    public Product createProduct(String productID) {
        try {
            Class productClass = registeredProducts.get(productID);
            Constructor productConstructor = productClass.getConstructor();
            return (Product) productConstructor.newInstance();
        } catch (NoSuchMethodException e) {
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public static ReflectionRegisterFactory getInstance() {
        return instance;
    }
}
