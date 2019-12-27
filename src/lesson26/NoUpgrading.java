package lesson26;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 描述：     ReentrantReadWriteLock不支持锁升级
 */
public class NoUpgrading {

    final static ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    public static void main(String[] args) {
        upgrade();
    }

    public static void upgrade() {
        rwl.readLock().lock();
        System.out.println("获取到了读锁");
        rwl.writeLock().lock();
        System.out.println("成功升级");
    }
}
