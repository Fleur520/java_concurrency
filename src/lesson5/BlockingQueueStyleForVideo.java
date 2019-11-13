package lesson5;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 描述：     为了简练，抓住主要核心思想的代码版本
 */
public class BlockingQueueStyleForVideo {

    public static void main(String[] args) {

        BlockingQueue<Object> queue = new ArrayBlockingQueue<>(10);

        Runnable producer = () -> {
            while (true) {
//                queue.put(new Object());
            }
        };

        new Thread(producer).start();
        new Thread(producer).start();

        Runnable consumer = () -> {
            while (true) {
//                queue.take();
            }
        };
        new Thread(consumer).start();
        new Thread(consumer).start();
    }
}
