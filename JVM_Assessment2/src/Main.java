import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static <Switch> void main(String[] args) {
        ArrayList<? super Bank> accounts = new ArrayList<>();
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("\n"+"Enter 1 to Create Account");
            System.out.println("Enter 2 to Withdraw Money");
            System.out.println("Enter 3 to Deposit Money");
            System.out.println("Enter 4 to get all Bank Details");
            System.out.println("Enter 5 to get Details of a Specific Bank");
            System.out.println("Enter 6 to get Details of your account");
            System.out.println("Enter 7 to exit");

            int ipt = sc.nextInt();
            if(ipt == 1){
                int bankChoice;
                while(true){
                    System.out.println("\n"+"Enter 1 to Create Account in SBI");
                    System.out.println("Enter 2 to Create Account in BOI");
                    System.out.println("Enter 3 to Create Account in ICICI");
                    bankChoice = sc.nextInt();
                    if(bankChoice >=1 && bankChoice<=3)
                        break;
                    else
                        System.out.println("Please choose a valid option");
                }

                Scanner inputs = new Scanner(System.in);
                System.out.println("Enter Your Name");
                String name = inputs.nextLine();

                System.out.println("Enter your Account no.");
                String accountNo = inputs.nextLine();

                System.out.println("Enter Your Mobile No.");
                String mobile = inputs.nextLine();

                System.out.println("Press 1 for Current Account" + "\n" + "Press 2 for Savings Account");
                int accountType = getAccountType(inputs);

                System.out.println("Enter the amount that you want to deposit");
                double amount = inputs.nextDouble();

                if(bankChoice == 1){
                    SBI acc = new SBI();
                    acc.createAccount(name,accountNo,accountType,mobile,amount);
                    accounts.add(acc);
                }
                else if (bankChoice == 2) {
                    BOI acc = new BOI();
                    acc.createAccount(name,accountNo,accountType,mobile,amount);
                    accounts.add(acc);
                }
                else if (bankChoice == 3) {
                    ICICI acc = new ICICI();
                    acc.createAccount(name,accountNo,accountType,mobile,amount);
                    accounts.add(acc);
                }
                System.out.println("Your account has been created successfully");
            }
            else if (ipt == 2) {
                Scanner scc = new Scanner(System.in);
                System.out.println("Please Choose your bank name : "+"\n"+"1.SBI"+"\n"+"2.BOI"+"\n"+"3.ICICI");
                int bankChose = scc.nextInt();

                Scanner stringScc = new Scanner(System.in);
                System.out.println("Please enter your account no.");
                String accInput = stringScc.nextLine();

                int check = 0 ;
                for(int i=0;i< accounts.size();i++)
                    if (bankChose == 1) {
                        if (accounts.get(i).toString().startsWith("SBI")) {
                            SBI acc = (SBI) accounts.get(i);
                            if (acc.getAccountNumber().equals(accInput)) {
                                acc.withdrawMoney();
                                check = 1;
                            }
                        }
                    } else if (bankChose == 2) {
                        if (accounts.get(i).toString().startsWith("BOI")) {
                            BOI acc = (BOI) accounts.get(i);
                            if (acc.getAccountNumber().equals(accInput)) {
                                acc.withdrawMoney();
                                check = 1;
                            }
                        }
                    } else if (bankChose == 3) {
                        if (accounts.get(i).toString().startsWith("ICICI")) {
                            ICICI acc = (ICICI) accounts.get(i);
                            if (acc.getAccountNumber().equals(accInput)) {
                                acc.withdrawMoney();
                                check = 1;
                            }
                        }
                    }else{
                        System.out.println("Please choose a valid option");
                    }
                if(check == 0)
                    System.out.println("Please enter a valid account number");
            }
            else if (ipt == 3) {
                Scanner scc = new Scanner(System.in);
                System.out.println("Please Choose your bank name : "+"\n"+"1.SBI"+"\n"+"2.BOI"+"\n"+"3.ICICI");
                int bankChose = scc.nextInt();

                Scanner stringScc = new Scanner(System.in);
                System.out.println("Please enter your account no.");
                String accInput = stringScc.nextLine();

                int check = 0 ;
                for(int i=0;i< accounts.size();i++)
                    if (bankChose == 1) {
                        if (accounts.get(i).toString().startsWith("SBI")) {
                            SBI acc = (SBI) accounts.get(i);
                            if (acc.getAccountNumber().equals(accInput)) {
                                acc.depositMoney();
                                check = 1;
                            }
                        }
                    } else if (bankChose == 2) {
                        if (accounts.get(i).toString().startsWith("BOI")) {
                            BOI acc = (BOI) accounts.get(i);
                            if (acc.getAccountNumber().equals(accInput)) {
                                acc.depositMoney();
                                check = 1;
                            }
                        }
                    } else if (bankChose == 3) {
                        if (accounts.get(i).toString().startsWith("ICICI")) {
                            ICICI acc = (ICICI) accounts.get(i);
                            if (acc.getAccountNumber().equals(accInput)) {
                                acc.depositMoney();
                                check = 1;
                            }
                        }
                    }else{
                        System.out.println("Please choose a valid option");
                    }
                    if(check == 0)
                        System.out.println("Please enter a valid account number");
                }
             else if (ipt == 4) {
                Bank.printDetails();

            } else if (ipt == 5) {
                Scanner detail = new Scanner(System.in);
                System.out.println("Choose 1 to get details of SBI ");
                System.out.println("Choose 2 to get details of BOI ");
                System.out.println("Choose 3 to get details of ICICI");
                int input = detail.nextInt();
                if(input == 1){
                    Thread T = new Thread(SBI::getDetails);
                    T.start();
                } else if (input == 2) {
                    Thread T = new Thread(BOI::getDetails);
                    T.start();
                } else if (input == 3) {
                    Thread T = new Thread(ICICI::getDetails);
                    T.start();
                }else {
                    System.out.println("Please choose a valid option");
                }
            } else if (ipt == 6) {
                Scanner detail = new Scanner(System.in);

                System.out.println("Enter your bank name");
                String bankName = detail.nextLine();

                System.out.println("Enter your Account no.");
                String accountNo = detail.nextLine();

                for(int i=0;i< accounts.size();i++){
                    if(bankName.equals("SBI")){
                        if(accounts.get(i).toString().startsWith("SBI")){
                            SBI acc = (SBI) accounts.get(i);
                            if(acc.getAccountNumber().equals(accountNo)){
                                acc.getAccountDetails();
                            }
                        }
                    }

                    if(bankName == "BOI"){
                        if(accounts.get(i).toString().startsWith("BOI")){
                            BOI acc = (BOI) accounts.get(i);
                            if(acc.getAccountNumber().equals(accountNo)){
                                acc.getAccountDetails();
                            }
                        }
                    }

                    if(bankName == "ICICI"){
                        if(accounts.get(i).toString().startsWith("ICICI")){
                            ICICI acc = (ICICI) accounts.get(i);
                            if(acc.getAccountNumber().equals(accountNo)){
                                acc.getAccountDetails();
                            }
                        }
                    }
                }
            } else if (ipt == 7) {
                break;
            }else {
                System.out.println("Please Choose a Valid Option from above");
            }
        }

    }

    private static int getAccountType(Scanner inputs) {
        int accountType = inputs.nextInt();
        return accountType;
    }
}