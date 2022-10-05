/***
 *Question 3) : Use Synchronize method and synchronize block to enable synchronization
 *  between multiple threads trying to access method at same time.
 *
 *  Explanation : Synchronization in Java allows to control the access of multiple threads over
 *  shared resources. Synchronized method is used to lock an object for any shared resource.
 *  When a thread invokes a synchonized method, it invokes a lock on that method and release it
 *  when its work is completed.
 *
 *
 */
class Table {
    /**Here I have made a printTable a synchronized method by using synchronized keyword**/
    synchronized void printTableSynchronizedMethod(int n){
        System.out.println("Table of "+n+":");
        for (int i=1;i<=10;i++){
            System.out.println(n*i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /*** Here i have made a synchronized block***/
    void printTableSynchronizedBlock(int n){
        synchronized (this){
            System.out.println("Table of "+n+":");
            for (int i=1;i<=10;i++){
                System.out.println(n*i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

/*** Made a thread class here by the name of myThread1 **/
class myThread1 extends Thread{
    Table T ;
    myThread1(Table T){
        this.T = T;
    }
    public void run(){
        T.printTableSynchronizedBlock(8);
        T.printTableSynchronizedMethod(9);
    }
}

/*** Made a thread class here by the name of myThread2 **/
class myThread2 extends Thread{
    Table T;
    myThread2(Table T){
        this.T = T;
    }
    public void run(){
        T.printTableSynchronizedBlock(12);
        T.printTableSynchronizedMethod(15);
    }
}

public class ThirdTopic {
    public static void main(String[] args) {
        Table obj = new Table();
        myThread1 T1 = new myThread1(obj);
        myThread2 T2 = new myThread2(obj);

        T1.start();
        T2.start();
    }
}

/***
 * Output if synchronized is not used :
 * Table of 15:
 * Table of 8:
 * 15
 * 8
 * 16
 * 30
 * 24
 * 45
 * 32
 * 60
 * 40
 * 75
 * 48
 * 90
 * 56
 * 105
 * 64
 * 120
 * 135
 * 72
 * 150
 * 80
 */

/*** Output if synchronized is used :
 * Table of 8:
 * 8
 * 16
 * 24
 * 32
 * 40
 * 48
 * 56
 * 64
 * 72
 * 80
 * Table of 15:
 * 15
 * 30
 * 45
 * 60
 * 75
 * 90
 * 105
 * 120
 * 135
 * 150
 */