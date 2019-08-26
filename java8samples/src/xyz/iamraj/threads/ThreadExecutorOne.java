package xyz.iamraj.threads;

import java.util.concurrent.*;

/**
 * A classic ExecutorService example to create a thread pool with 5 threads,
 * submit two tasks, get the result from Future and also how to handle the exception.
 *
 * @author rraigonde
 */
public class ThreadExecutorOne {

    public static void main(String[] args) {

        // creates the thead pool of size 5
        ExecutorService executorService = Executors.newFixedThreadPool(5);


        // Runnable, return void, nothing, submit and run the task async
        executorService.submit(() -> System.out.println("I'm Runnable task."));

        // Callable, return a future, submit and run the task async
        Future<Integer> futureTask1 = executorService.submit(() -> {
            System.out.println("I'm Callable task.");
            return 1 + 1;
        });

        try {

            otherTask("Before Future Result");

            // block until future returned a result,
            // timeout if the future takes more than 5 seconds to return the result
            Integer result = futureTask1.get(1, TimeUnit.SECONDS);

            System.out.println("Get future result : " + result);

            otherTask("After Future Result");


        } catch (InterruptedException e) {// thread was interrupted
            e.printStackTrace();
        } catch (ExecutionException e) {// thread threw an exception
            e.printStackTrace();
        } catch (TimeoutException e) {// timeout before the future task is complete
            e.printStackTrace();
        } finally {

            // shut down the executor manually
            executorService.shutdown();

        }

    }

    private static void otherTask(String name) {
        System.out.println("I'm other task! " + name);
    }
}