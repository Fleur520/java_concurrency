package lesson9;

/**
 * 描述：     单个任务的时候，新建线程来执行
 */
public class OneTask {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task());
        thread1.start();
    }

    static class Task implements Runnable {

        public void run() {
            System.out.println("Thread Name: " + Thread.currentThread().getName());
        }
    }
}
