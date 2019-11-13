package lesson4;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 描述：     wait方法需要在synchronized中使用
 */
public class WaitNotify {

    private final Queue<String> buffer = new LinkedList<String>();

    public void give(String data) {
        synchronized (this) {
            buffer.add(data);
            notify();
        }
    }

    public String take() throws InterruptedException {
        synchronized (this) {
            while (buffer.isEmpty()) {
                wait();
            }
            return buffer.remove();
        }
    }
}
