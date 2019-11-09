package lesson1;

/**
 * 描述：     TODO
 */
public class ExtendsThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("用Thread类实现线程");
    }
}
