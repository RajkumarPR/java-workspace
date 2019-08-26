package xyz.iamraj.threads;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * create a list of Callable tasks, and run them all with invokeAll
 *
 * @author rraigonde
 */
public class ThreadExecutorInvokeAll {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();

        List<Callable<Integer>> callableList = Arrays.asList(
                () -> 1,
                () -> 2,
                () -> 3);
        try {
            List<Future<Integer>> futures = executorService.invokeAll(callableList);
            int sum = futures.stream().map(f -> {
                try {
                    return f.get();
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }).mapToInt(Integer::intValue).sum();

            System.out.println("sum = "+sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            executorService.shutdown();
        }
    }
}
