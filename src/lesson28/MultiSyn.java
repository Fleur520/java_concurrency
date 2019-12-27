package lesson28;

/**
 * 描述：     TODO
 */
public class MultiSyn {


    public void lockCoarsening() {
        synchronized (this) {
            //do something
        }
        synchronized (this) {
            //do something
        }
        synchronized (this) {
            //do something
        }
    }

    public void forLoop() {
        for (int i = 0; i < 1000; i++) {
            synchronized (this) {
                //do something
            }
        }
    }

    public void stringBufferDemo() {
        StringBuffer stringBuffer = new StringBuffer();
    }
}
