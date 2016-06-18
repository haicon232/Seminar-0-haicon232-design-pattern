package design;

/**
 * Created by haico on 6/5/2016.
 */
public enum SingletonEnum {
    INSTANCE;

    SingletonEnum() {
        System.out.println("Lazy Load SingletonEnum");
    }

    private int instance = 0;

    public void methodA() {
        instance = 100;
        System.out.println("do method A: " + instance);
    }

    public void methodB() {
        System.out.println("do method B: " + instance);
    }
}
