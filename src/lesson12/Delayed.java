package lesson12;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 描述：     TODO
 */
public class Delayed {

    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
        service.schedule(new Task(), 10, TimeUnit.SECONDS);
        service.scheduleAtFixedRate(new Task(), 10, 10, TimeUnit.SECONDS);
        service.scheduleWithFixedDelay(new Task(), 10, 10, TimeUnit.SECONDS);
    }
}

class Task implements Runnable {

    @Override
    public void run() {
    }
}