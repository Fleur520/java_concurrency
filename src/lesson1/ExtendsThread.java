package lesson1;

/**
 * 描述：     继承Thread类实现线程
 */
public class ExtendsThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("用Thread类实现线程");
    }
}
