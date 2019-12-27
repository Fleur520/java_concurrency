package lesson23;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 描述：     TODO
 */
public class LockDemo {

    Lock lock = new ReentrantLock();
    Lock lock1 = new ReentrantLock();
    Lock lock2 = new ReentrantLock();

    public static void main(String[] args) {

    }

    public void lockDemo() {
        lock.lock();
        try {
            System.out.println("操作同步资源");
        } finally {
            lock.unlock();
        }
    }


    public void tryLock(Lock lock1, Lock lock2) throws InterruptedException {
        while (true) {
            if (lock1.tryLock()) {
                try {
                    if (lock2.tryLock()) {
                        try {
                            System.out.println("获取到了两把锁，完成业务逻辑");
                            return;
                        } finally {
                            lock2.unlock();
                        }
                    }
                } finally {
                    lock1.unlock();
                }
            } else {
                Thread.sleep(new Random().nextInt(1000));
            }
        }
    }


    public void lockInterruptibly() {
        try {
            lock.lockInterruptibly();
            try {
                System.out.println("操作同步资源");
            } finally {
                lock.unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
