import java.util.function.Consumer;

public interface Bank {
    public static void printDetails(){
        Thread T1 = new Thread(SBI::getDetails);
        T1.start();

        Thread T2 = new Thread(BOI::getDetails);
        T2.start();

        Thread T3 = new Thread(ICICI::getDetails);
        T3.start();
    }
    public static void getDetails(){

    }

    void createAccount(String accountHolderName, String accountNo, int accountType, String mobileNo, double amount);

    public void depositMoney();
    public void withdrawMoney();
}