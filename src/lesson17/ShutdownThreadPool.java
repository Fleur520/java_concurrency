package lesson17;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * 描述：     TODO
 */
public class ShutdownThreadPool {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {
            service.execute(new Task());
        }
        //开始关闭线程池
        service.shutdown();
        service.isShutdown();
        service.isTerminated();
        service.awaitTermination(10, TimeUnit.SECONDS);
        List<Runnable> runnables = service.shutdownNow();
    }
}
class Task implements Runnable {

    @Override
    public void run() {

    }
}