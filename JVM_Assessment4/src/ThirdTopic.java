public class ThirdTopic {
    /*** Making a thread using runnable ***/
    public static void main(String[] args) {
        Runnable myThread = () -> {
            Thread.currentThread().setName("Mohit's Thread ");
            System.out.println(Thread.currentThread().getName() + "is running");
        };
        Thread run = new Thread(myThread);
        run.start();
    }
}
