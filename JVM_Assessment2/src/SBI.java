import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class SBI implements Bank{

    /*** Declared some required variables here ***/
    private String accountHolderName, accountNo, mobileNo;
    private AccountType accountType;
    private double amount;

    /*** Made an InsufficientAmountException class by extending Exception class ***/
    class InsufficientAmountException extends Exception{
        public InsufficientAmountException(String str){
            super(str);
        }
    }

    /*** Made a method to write all transactions in the file ***/
    public void writeSbiTransactions(String operation, double amount){
        try(FileWriter file = new FileWriter("writeSbiTransactions.txt",true)){
            StringBuilder trance = new StringBuilder();
            trance.append("Account Holder Name : "+ this.accountHolderName+"\n");
            trance.append("Account Number : "+ this.accountNo + "\n");
            if(operation.equals("Deposit")){
                trance.append("You have deposited " + amount + "\n");
                trance.append("Amount Before : " + (this.amount-amount)+"\n");
                trance.append("Amount After : " + (this.amount)+"\n\n");
            } else {
                if (operation.equals("Withdraw")) {
                    trance.append("You have withdrawn " + amount + "\n");
                    trance.append("Amount Before : " + (this.amount+amount)+"\n");
                    trance.append("Amount After : " + (this.amount)+"\n");
                }
            }
            trance.append("Date & Time : " + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new java.util.Date()));
            trance.append("\n"+"------------------------------------------------"+"\n");
            file.write(trance.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*** Created an enum of Account Type(Savings / Current) ***/
    enum AccountType{SAVINGS, CURRENT}

    /*** Made a method to get Bank Details ***/
    public static void getDetails(){
        System.out.println("Bank Name : " + "State Bank of India");
        System.out.println("Bank Slogan : " + "Pure Banking, Nothing Else");
        System.out.println("Rate of Interest : " + "7.8%" + "\n");
    }

    /*** Method to return Account Nummber of the user ***/
    public String getAccountNumber(){
        return this.accountNo;
    }

    /*** Made a method to create account in the bank ***/
    @Override
    public void createAccount(String accountHolderName, String accountNo, int accountType, String mobileNo, double amount) {
        this.accountHolderName = accountHolderName;
        this.accountNo = accountNo;
        this.accountType = accountType==1?AccountType.CURRENT:AccountType.SAVINGS;
        this.mobileNo = mobileNo;
        this.amount = amount;
    }

    /*** Made a method to get Account Details ***/
    public void getAccountDetails(){
        System.out.println("Account Holder Name : " + this.accountHolderName);
        System.out.println("Account No. : " + this.accountNo);
        System.out.println("Account Type : " + this.accountType);
        System.out.println("Mobile No. " + this.mobileNo);
        System.out.println("Balance : " + this.amount);
    }

    /*** Made a method to deposit money in the account ***/
    public void depositMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount that you want to deposit : ");
        double amountDeposited = sc.nextDouble();
        this.amount += amountDeposited;
        System.out.println("Your updated balance is " + this.amount);
        writeSbiTransactions("Deposit",amountDeposited);
    }

    /*** Made a method to withdraw money from the account ***/
    public void withdrawMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount that you want to withdraw : ");
        double amountWithdrawn = sc.nextDouble();

        try {
            if(amountWithdrawn>this.amount){
                throw new InsufficientAmountException("You are trying to withdraw more amount than you have in your account.");
            }
            this.amount -= amountWithdrawn;
            System.out.println("Your updated balance is " + this.amount);
            writeSbiTransactions("Withdraw",amountWithdrawn);
        } catch (InsufficientAmountException e) {
            System.out.println(e);
        }
    }

}
