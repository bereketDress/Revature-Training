package rev.ass2;

import java.util.Scanner;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void checkBalance() {
        System.out.println("Balance is " + balance);
    }

    public static void main(String[] args) {
        Account account = new Account(500);
        Scanner input = new Scanner(System.in);
        int choice = 1;
        while (choice != 4) {
            System.out.println("1. check balance");
            System.out.println("2. deposit");
            System.out.println("3. withdraw");
            System.out.println("4. exit");

            System.out.println("Please enter your choice");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    System.out.println("Enter deposit amount");
                    account.deposit(input.nextDouble());
                    account.checkBalance();
                    break;
                case 3:
                    System.out.println("Enter withdrawal amount");
                    account.withdraw(input.nextDouble());
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");

            }

        }


    }
}
