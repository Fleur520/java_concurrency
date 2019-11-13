package lesson5;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 描述：     可运行版本的BlockingQueue实现的生产者消费者模式
 */
public class BlockingQueueStyle {

    public static void main(String[] args) {

        BlockingQueue<Object> queue = new ArrayBlockingQueue<>(10);

        Runnable producer = ()->{
            while (true) {
                try {
                    queue.put(new Object());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(producer).start();
        new Thread(producer).start();

        Runnable consumer = ()->{
            while (true) {
                try {
                    System.out.println(queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        new Thread(consumer).start();
        new Thread(consumer).start();
    }
}
