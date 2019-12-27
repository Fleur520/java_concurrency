package lesson12;

import com.sun.jmx.snmp.tasks.Task;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 描述：     TODO
 */
public class ThreadPoolDemo {

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 1000; i++) {
//            service.execute(new Task() {
//            });
        }
    }
}
