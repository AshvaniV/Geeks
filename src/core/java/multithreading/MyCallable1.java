package core.java.multithreading;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable1 implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(5000);
        //return the thread name executing this callable task
        return Thread.currentThread().getName();
    }

    public static void main(String[] args) {
        //Get ExecutorService from Executors utility class, thread pool size is 10
        ExecutorService executor = Executors.newFixedThreadPool(10);
        //Create MyCallable instance
        Callable<String> callable = new MyCallable1();

        //submit Callable tasks to be executed by thread pool
        Future<String> future = executor.submit(callable);
        //add Future to the list, we can get return value using Future
        try {
            System.out.println(new Date() + "::" + future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}

/*Outcome: 10 threads will works parellely and will run till 100 time mean 10 by 10 times

 * */