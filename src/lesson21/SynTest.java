package lesson21;

/**
 * 描述：     TODO
 */
public class SynTest {

    public void synBlock() {
        synchronized (this) {
            System.out.println("lagou");
        }
    }

    public synchronized void synMethod() {

    }
}
