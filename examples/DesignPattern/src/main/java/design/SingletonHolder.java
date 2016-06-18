package design;

/**
 * Created by haico on 6/5/2016.
 */
public class SingletonHolder {
    public static int member = 2;
    private SingletonHolder() {
        System.out.println("Lazy Load SingletonHolder");
    }

    private static class LazyHolder {
        private static final SingletonHolder INSTANCE = new SingletonHolder();
    }

    public static SingletonHolder getInstance() {
        return LazyHolder.INSTANCE;
    }

    public void methodA() {
        System.out.println("SingletonHolder do methodA()");
    }
}
