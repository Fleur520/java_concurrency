package lesson2;

/**
 * 描述：     子方法编写者应该抛出或者重新中断
 */
public class SubTask {

    void subTas() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // 在这里不处理该异常是非常不好的
        }
    }


    void subTask2() throws InterruptedException {
        Thread.sleep(1000);
    }

    private void reInterrupt() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
}
