package lesson16;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 描述：     TODO
 */
public class CustomThreadPool {

    private static class CustomRejectionHandler implements RejectedExecutionHandler {

        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            //打日志，重新执行任务等拒绝策略
        }
    }
}
