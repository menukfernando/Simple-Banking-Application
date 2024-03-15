import java.sql.SQLOutput;
import java.util.Scanner;

public class BankAccount {
    String customerName;
    String customerID;
    int balance;
    int depositAmount;
    int withdrawAmount;
    int previousTransaction;

    BankAccount(String customerName, String customerID){
        this.customerName = customerName;
        this.customerID = customerID;
    }

    void Deposit (int amount){
        if (amount != 0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void Withdraw (int amount1){
        if (amount1 != 0){
            balance = balance - amount1;
            previousTransaction = -amount1;
        }
    }

    void getPreviousTransaction(){
        if (previousTransaction > 0){
            System.out.println("DEPOSITED: Rs."+ previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("WITHDRAWN: Rs."+ Math.abs(previousTransaction));
        }else System.out.println("No Transactions were made.");
    }

    void menuList(){
        char choice = '0';
        Scanner sc = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("Banking Application");
        System.out.println("-------------------");

        System.out.println("Welcome "+customerName);
        System.out.println("ID: "+customerID);

        do {
            System.out.println("\n");
            System.out.println("A. Check Balance");
            System.out.println("B. Deposit Amount");
            System.out.println("C. Withdraw Amount");
            System.out.println("D. Transactions");
            System.out.println("E. Exit");
            System.out.println("--------------------");
            System.out.println("Enter Choice: ");
            choice = sc.next().charAt(0);

            switch(choice){
                case 'A':
                case 'a':
                    System.out.println("Your Current Balance is: Rs."+balance);
                    break;

                case 'B':
                case 'b':
                    System.out.println("Deposit Amount: Rs.");
                    int amount = sc.nextInt();
                    Deposit(amount);
                    break;

                case 'C':
                case 'c':
                    System.out.println("Withdraw Amount: Rs.");
                    int amount1 = sc.nextInt();
                    Withdraw(amount1);
                    break;

                case 'D':
                case 'd':
                    System.out.println("Transactions Made: \n");
                    getPreviousTransaction();
                    break;

                case 'E':
                case 'e':
                    System.exit(0);
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }while(true);

    }
}
