package design.proxy;

/**
 * Created by haico on 6/11/2016.
 */
public class MathProxy implements IMath {
    private Math math = new Math();

    public int add(int x, int y) {
        return math.add(x,y);
    }

    public int sub(int x, int y) {
        return math.sub(x,y);
    }

    public int mul(int x, int y) {
        return math.mul(x,y);
    }

    public int div(int x, int y) {
        return math.div(x,y);
    }
}
