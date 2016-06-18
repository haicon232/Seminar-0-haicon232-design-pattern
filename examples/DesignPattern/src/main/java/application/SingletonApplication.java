package application;

import design.SingletonEagerLoad;
import design.SingletonEnum;
import design.SingletonHolder;

/**
 * Created by haico on 6/5/2016.
 */
public class SingletonApplication {
    public static void main(String[] args) {

        System.out.println(SingletonEnum.class);
        SingletonEnum.INSTANCE.methodB();
        SingletonEnum.INSTANCE.methodA();
        SingletonEnum.INSTANCE.methodB();

        System.out.println(SingletonEagerLoad.class);
        System.out.println(SingletonEagerLoad.member);
        SingletonEagerLoad.getInstance().methodA();
        SingletonEagerLoad.getInstance().methodA();

        System.out.println(SingletonHolder.class);
        System.out.println(SingletonHolder.member);
        SingletonHolder.getInstance().methodA();
        SingletonHolder.getInstance().methodA();
    }
}
