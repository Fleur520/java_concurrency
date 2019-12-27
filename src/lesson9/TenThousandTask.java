package lesson9;

/**
 * 描述：     for循环新建10个线程
 */
public class TenThousandTask {

    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            Thread thread = new Thread(new Task());
            thread.start();
        }
    }

    static class Task implements Runnable {

        public void run() {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        }
    }
}
