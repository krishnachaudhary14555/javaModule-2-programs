/*
verables -> custName , accNum, balance
1: open a new account
2: withdraw money
3: check account balance */

// constructor name as same as class name , no return type , must be public , 

import java.util.*;

public class BankingApp {


    String custName;
    int accNo;
    double balance;
    boolean accountCreated = false;

    Scanner sc = new Scanner(System.in);

    // Open account
    void openAccount() {

        if (accountCreated) {
            System.out.println("Account already exists!");
            return;
        }

        System.out.print("Enter username: ");
        custName = sc.next();

        System.out.print("Enter account number: ");
        accNo = sc.nextInt();

        balance = 0;
        accountCreated = true;

        System.out.println("Account opened successfully!");
    }

    // Deposit money
    void deposit() {

        if (!accountCreated) {
            System.out.println("Please open an account first!");
            return;
        }

        System.out.print("Enter amount to deposit: ");
        double amt = sc.nextDouble();

        if (amt > 0) {
            balance = balance + amt;
            System.out.println("Money deposited successfully!");
        } else {
            System.out.println("Enter a valid amount.");
        }
    }

    // Withdraw money
    void withdraw() {

        if (!accountCreated) {
            System.out.println("Please open an account first!");
            return;
        }

        System.out.print("Enter amount to withdraw: ");
        double amt = sc.nextDouble();

        if (amt <= 0) {
            System.out.println("Enter a valid amount.");
        } else if (amt <= balance) {
            balance = balance - amt;
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Check balance
    void checkBalance() {

        if (!accountCreated) {
            System.out.println("Please open an account first!");
            return;
        }

        System.out.println("-------------- Details --------------");
        System.out.println("Username        : " + custName);
        System.out.println("Account number  : " + accNo);
        System.out.println("Current balance : " + balance);
    }

    public static void main(String[] args) {

        BankingApp ba = new BankingApp();

        while (true) {

            System.out.println("\n1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = ba.sc.nextInt();

            switch (choice) {
                case 1:
                    ba.openAccount();
                    break;

                case 2:
                    ba.deposit();
                    break;

                case 3:
                    ba.withdraw();
                    break;

                case 4:
                    ba.checkBalance();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

/*
CONSTRUCTOR -> object orienatation, 2. some operation during the object riention, initialize the object stack . 
memory allocate and value initialize during creating the space
instance variable creates only at once 

Default constructor()-> automatic  */