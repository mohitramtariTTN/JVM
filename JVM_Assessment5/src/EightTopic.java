/*** Demonstrate the use of autoclosable class ***/

import java.io.Closeable;

/***
 * Explanation : AutoCloseable interface providess support for the try-with-resource statement.
 * The close() method of an autocloseable object is called automatically when exiting a try with resource block
 * AutoCloseable interface defines only close() method.
 */

/*** Here I have created two classes named Demo1 and Demo2 and both are implementing Closeable interface ***/
/*** In both classes, i have created two methods show() and close() ***/
class Demo1 implements Closeable{
    public void show(){
        System.out.println("show method from Demo1 class");
    }
    public void close(){
        System.out.println("close method from Demo1 class");
    }
}

class Demo2 implements Closeable{
    public void show(){
        System.out.println("Show method from Demo2 class");
    }
    public void close(){
        System.out.println("Close method from Demo2 class");
    }
}
public class EightTopic {
    public static void main(String[] args) {
        /*** Created objects for both Demo1 and Demo2 class ***/
        Demo1 demo1Object = new Demo1();
        Demo2 demo2Object = new Demo2();

        /*** Here initiated try-with-resource block **/
        /*** Here i needed to call show methods but there wasn't any need to call close() methods,
             as they were called automatically ***/

        try(demo1Object;demo2Object){
            demo1Object.show();
            demo1Object.show();
        }
    }
}

/***
 * Output :
 * show method from Demo1 class
 * show method from Demo1 class
 * Close method from Demo2 class
 * close method from Demo1 class
 */