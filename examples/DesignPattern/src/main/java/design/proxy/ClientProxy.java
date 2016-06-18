package design.proxy;

/**
 * Created by haico on 6/11/2016.
 */
public class ClientProxy {
    public static void main(String[] args) {
        MathProxy proxy = new MathProxy();
        System.out.println("6 + 2 = " + proxy.add(6,2));
        System.out.println("6 - 2 = " + proxy.sub(6,2));
        System.out.println("6 * 2 = " + proxy.mul(6,2));
        System.out.println("6 / 2 = " + proxy.div(6,2));
    }
}
