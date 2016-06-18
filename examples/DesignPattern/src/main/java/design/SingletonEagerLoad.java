package design;

/**
 * Created by haico on 6/5/2016.
 */
public class SingletonEagerLoad {
    private static SingletonEagerLoad instance = new SingletonEagerLoad();
    public static int member = 1;

    private SingletonEagerLoad() {
        System.out.println("Eager Load");
    }

    public static SingletonEagerLoad getInstance() {
        return instance;
    }

    public void methodA() {
        System.out.println("SingletonEagerLoad do methodA()");
    }
}
