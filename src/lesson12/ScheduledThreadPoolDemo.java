package lesson12;

import java.util.concurrent.Executors;

/**
 * 描述：     TODO
 */
public class ScheduledThreadPoolDemo {

    public static void main(String[] args) {
        Executors.newFixedThreadPool(5);
        Executors.newCachedThreadPool();
        Executors.newScheduledThreadPool(10);
        Executors.newSingleThreadExecutor();
        Executors.newSingleThreadScheduledExecutor();
    }
}
