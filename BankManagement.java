package seleniumDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

class BankAccount {
    private String name;
    private String accNo;
    private double balance;

    
    public BankAccount(String name, String accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
            return;
        }
        balance += amount;
        System.out.println("Successfully deposited: " + amount);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdraw amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        }
    }

    // Display balance
    public void balanceEnquiry() {
        System.out.println("Current balance: " + balance);
    }

    // Display account details
    public void showDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

public class BankManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = null;

        try {
            System.out.println("=== Welcome to Bank Management System ===");

            // Create account
            System.out.print("Enter account holder name: ");
            String name = sc.nextLine();
            System.out.print("Enter account number: ");
            String accNo = sc.nextLine();
            System.out.print("Enter initial balance: ");
            double balance = sc.nextDouble();

            account = new BankAccount(name, accNo, balance);
            System.out.println("\nAccount created successfully!");

            boolean exit = false;

            while (!exit) {
                System.out.println("\n--- Menu ---");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Balance Enquiry");
                System.out.println("4. Account Details");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double dep = sc.nextDouble();
                        account.deposit(dep);
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double w = sc.nextDouble();
                        account.withdraw(w);
                        break;

                    case 3:
                        account.balanceEnquiry();
                        break;

                    case 4:
                        account.showDetails();
                        break;

                    case 5:
                        exit = true;
                        System.out.println("Exiting program...");
                        break;

                    default:
                        System.out.println("Invalid choice! Please select 1-5.");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numeric values for balance and amounts.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("Thank you for using the Bank Management System!");
        }
    }
}
