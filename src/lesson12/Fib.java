package lesson12;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * 描述：     TODO
 */
public class Fib {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        for (int i = 0; i < 10; i++) {
            ForkJoinTask task = forkJoinPool.submit(new Fibonacci(i));
            System.out.println(task.get());
        }
    }


}


class Fibonacci extends RecursiveTask<Integer> {

    int n;

    public Fibonacci(int n) {
        this.n = n;
    }

    @Override
    public Integer compute() {
        if (n <= 1) {
            return n;
        }
        Fibonacci f1 = new Fibonacci(n - 1);
        f1.fork();
        Fibonacci f2 = new Fibonacci(n - 2);
        f2.fork();
        return f1.join() + f2.join();
    }
}
//
//    int n;
//    int number;
//
//    public Fib(int n) {
//        this.n = n;
//    }
//
//    public int solve() {
//        if (n < 0) {
//            return 0;
//        }
//        if (n <= 1) {
//            return n;
//        } else {
//            Fib f1 = new Fib(n - 1);
//            Fib f2 = new Fib(n - 2);
//            f1.solve();
//            f2.solve();
//            number = f1.number + f2.number;
//            return number;
//        }
//
//
//    }
//
//    public static void main(String[] args) {
//        Fib fib = new Fib(1);
//        fib.solve();
//        System.out.println(fib.number);
//    }
//}
//public class ForkJoinPoolDemo {
