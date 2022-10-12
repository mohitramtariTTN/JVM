/***
 * Question 2):
 * Use a singleThreadExecutor, newCachedThreadPool() and newFixedThreadPool()
 * to submit a list of tasks and wait for completion of all tasks.
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class Task implements Runnable{
    private String name;
    public Task(String s){
        name = s;
    }

    public void run(){
            for(int i=0;i<=5;i++){
                Date d = new Date();
                SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                if(i==0){
                    System.out.println(name+" started at "+ft.format(d));
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if(i == 5){
                    System.out.println(name + " completed at "+ft.format(d));
                }
            }
    }
}

/*** FixedThreadPool is used when you need to execute n number of tasks at a single time ***/
class FixedThreadPool{
    public static void execute() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(5);

        Runnable r1 = new Task("Task 1");
        Runnable r2 = new Task("Task 2");
        Runnable r3 = new Task("Task 3");
        Runnable r4 = new Task("Task 4");
        Runnable r5 = new Task("Task 5");

        /*** A Fixed thread pool can be obtained by calling newFixedThreadPool() method **/
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(r1);
        pool.submit(r2);
        pool.submit(r3);
        pool.submit(r4);
        pool.submit(r5);
        latch.await();
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread Execution is completed"+"\n");

        /**When shutdown method is called, it stops accepting new tasks, waits for previous tasks to
         * complete and then terminates the executor **/
        pool.shutdown();
    }
}

/*** CachedThreadPool is used when tasks submitted for processing should not wait and needs to be
 * addressed as soon as submitted.
 */
class CachedThreadPool{
    public static void execute(){
        Runnable r1 = new Task("Task 1");
        Runnable r2 = new Task("Task 2");
        Runnable r3 = new Task("Task 3");
        Runnable r4 = new Task("Task 4");
        Runnable r5 = new Task("Task 5");

        /*** A Cached thread pool can be obtained by calling newCachedThreadPool() method **/
        ExecutorService executor = Executors.newCachedThreadPool();
        ThreadPoolExecutor pool = (ThreadPoolExecutor) executor;

        executor.submit(r1);
        executor.submit(r2);
        executor.submit(r3);
        executor.submit(r4);
        executor.submit(r5);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread Execution is completed"+"\n");
        executor.shutdown();

    }
}

/***SingleThreadExecutor creates an executor which executes a single task at a time ***/
class SingleThreadExecutor{
    public static void execute() {
        Runnable r1 = new Task("Task 1");
        Runnable r2 = new Task("Task 2");
        Runnable r3 = new Task("Task 3");
        Runnable r4 = new Task("Task 4");
        Runnable r5 = new Task("Task 5");

        /*** A single thread pool can be obtained by calling newSingleThreadExecutor() method **/
        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.submit(r1);
        executor.submit(r2);
        executor.submit(r3);
        executor.submit(r4);
        executor.submit(r5);

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread Execution is completed"+"\n");
    }
}
public class SecondTopic {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Cached Thread Pool Started : ");
        CachedThreadPool.execute();

        System.out.println("Fixed Thread Pool Started : ");
        FixedThreadPool.execute();

        System.out.println("Single Thread Pool Started : ");
        SingleThreadExecutor.execute();
    }
}

/*** Output :
 * Output of fixedThreadPool :
 * Task 1 started at 01:52:45
 * Task 2 started at 01:52:45
 * Task 1 completed at 01:52:50
 * Task 2 completed at 01:52:50
 * Task 3 started at 01:52:51
 * Task 4 started at 01:52:51
 * Task 4 completed at 01:52:56
 * Task 3 completed at 01:52:56
 * Task 5 started at 01:52:57
 * Task 5 completed at 01:53:02
 *
 *
 * Output of SingleThreadExecutor:
 * Task 1 started at 01:50:14
 * Task 1 completed at 01:50:19
 * Task 2 started at 01:50:20
 * Task 2 completed at 01:50:25
 * Task 3 started at 01:50:26
 * Task 3 completed at 01:50:31
 * Task 4 started at 01:50:32
 * Task 4 completed at 01:50:37
 * Task 5 started at 01:50:38
 * Task 5 completed at 01:50:43
 *
 *
 * Output of CachedThreadPool:
 * No. of threads scheduled : 5
 * Task 4 started at 01:53:47
 * Task 5 started at 01:53:47
 * Task 1 started at 01:53:47
 * Task 3 started at 01:53:47
 * Task 2 started at 01:53:47
 * Task 2 completed at 01:53:52
 * Task 4 completed at 01:53:52
 * Task 1 completed at 01:53:52
 * Task 3 completed at 01:53:52
 * Task 5 completed at 01:53:52
 */
