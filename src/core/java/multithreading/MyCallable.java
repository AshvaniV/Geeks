package core.java.multithreading;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("In call() method, before sleep");
        Thread.sleep(5000);
        System.out.println("In call() method, after sleep");
        //return the thread name executing this callable task
        return Thread.currentThread().getName();
    }

    public static void main(String args[]){
        //Get ExecutorService from Executors utility class, thread pool size is 10
        ExecutorService executor = Executors.newFixedThreadPool(10);
        //create a list to hold the Future object associated with Callable
        List<Future<String>> list = new ArrayList<Future<String>>();
        //Create MyCallable instance
        Callable<String> callable = new MyCallable();

        for(int i=0; i< 100; i++){
            //submit Callable tasks to be executed by thread pool
            Future<String> future = executor.submit(callable);
            //add Future to the list, we can get return value using Future
            list.add(future);
        }
        for(Future<String> fut : list){
            try {
                //print the return value of Future, notice the output delay in console
                // because Future.get() waits for task to get completed
                System.out.println(new Date()+ "::"+fut.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        //shut down the executor service now
        executor.shutdown();
    }
}

/*Outcome: 10 threads will works parellely and will run till 100 time mean 10 by 10 times
as 1 set result can be like:
Thu Jul 08 16:39:02 IST 2021::pool-1-thread-1
Thu Jul 08 16:39:07 IST 2021::pool-1-thread-2
Thu Jul 08 16:39:07 IST 2021::pool-1-thread-4
Thu Jul 08 16:39:07 IST 2021::pool-1-thread-5
Thu Jul 08 16:39:07 IST 2021::pool-1-thread-3
Thu Jul 08 16:39:07 IST 2021::pool-1-thread-6
Thu Jul 08 16:39:07 IST 2021::pool-1-thread-8
Thu Jul 08 16:39:07 IST 2021::pool-1-thread-7
Thu Jul 08 16:39:07 IST 2021::pool-1-thread-10
* */