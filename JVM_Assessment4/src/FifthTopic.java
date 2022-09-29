/**** Made two interfaces namely poet and writer with both having default methods and of same name.***/
interface poet{
    default void write(){
        System.out.println("Poet's default method");
    }
}

interface writer{
    default void write(){
        System.out.println("Writer's default method");
    }
}

/*** Here class is implementing both poet and writer ***/
public class FifthTopic implements poet,writer{
    /*** Here i am overriding wrtie() method **/
    /*** There are three things that can be done ***/
    /*** Use poet's write method using super ***/
    /*** Use Wrtier's write method using super ***/
    /*** Or just completely modify write() method ***/
    public void write(){
        poet.super.write();  //this is how we can call poet's write method
        writer.super.write();  //this is how we can call writer's write method
        System.out.println("Override both poet and writer's method");  //this is how we can modify write() method
    }

    public static void main(String[] args) {
        FifthTopic obj = new FifthTopic();
        obj.write();
    }

}
