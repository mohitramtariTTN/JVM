/***
 * Question 1) :
 * Create and Run a Thread using Runnable Interface and Thread class
 * and show usage of sleep and join methods in the created threads.
 */

/***Here I am creating a class by extending Thread class while helps to create thread***/
class createThread extends Thread{
    public void run(){
        System.out.println(getName()+" is starting");
        try {
            System.out.println(getName()+" is going to sleep");
            /*** The method sleep() is used to halt the working of the current thread for the given amount of time **/
            Thread.sleep(1000);
            System.out.println(getName()+" wakes up");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

/** Here I have created a class by implementing Runnable interface ***/
class createThreadByRunnable implements Runnable{
    public void run(){
        System.out.println("Runnable Thread is Starting");
    }
}


public class FirstTopic {
    public static void main(String[] args) throws InterruptedException {
        /** Created a thread by extending thread class **/
        createThread T1 = new createThread();
        T1.setName("Thread 1");

        /** Created a thread by implementing Runnable interface **/
        createThreadByRunnable rt = new createThreadByRunnable();
        Thread T2 = new Thread(rt);
        T2.setName("Thread 2");

        /** Created another thread by extending thread class **/
        createThread T3 = new createThread();
        T3.setName("Thread 3");

        /*** Here I have used join methods, so that threads execute in the same order that I have put
         * them in here, that meands T1 executes first then T3 and then T2.
         * By using join() method, it allows the current thread to complete its execution and then let
         * other threads start executing.
         * For e.g. there is a thread T, and i put T.join(), then T will complete its execution first completely
         * and then only other threads can begin their execution
         */
        T1.start();
        T1.join();
        System.out.println("\n");

        T3.start();
        T3.join();
        System.out.println("\n");

        T2.start();
        T2.join();
    }
}
