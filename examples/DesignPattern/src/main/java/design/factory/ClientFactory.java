package design.factory;

import java.util.ArrayList;

/**
 * Created by haico on 6/11/2016.
 */
public class ClientFactory {
    static {
        try {
            Class.forName("design.factory.ProductOne");
            Class.forName("design.factory.ProductTwo");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ArrayList<Product> listProduct = new ArrayList<Product>();
        ReflectionRegisterFactory reflectionRegisterFactory = ReflectionRegisterFactory.getInstance();
        NonReflectionRegisterFactory nonReflectionRegisterFactory = NonReflectionRegisterFactory.getInstance();


//        listProduct.add(NormalFactory.createProduct("01"));
//        listProduct.add(NormalFactory.createProduct("02"));

//        listProduct.add(reflectionRegisterFactory.createProduct("01"));
//        listProduct.add(reflectionRegisterFactory.createProduct("02"));

        listProduct.add(nonReflectionRegisterFactory.createProduct("01"));
        listProduct.add(nonReflectionRegisterFactory.createProduct("02"));

        for (Product product : listProduct) {
            if(product == null) {
                System.out.println("Product is null");
                continue;
            }
            System.out.println(product.getName());
        }
    }
}
