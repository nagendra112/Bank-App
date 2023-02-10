import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = sc.next();
        System.out.println("Create password : ");
        String password = sc.next();
        System.out.println("Enter initial balance : ");
        int balance = sc.nextInt();

        SBIAccount acc = new SBIAccount(name, balance, password);
        System.out.println("Your account has been created. Account no : "+acc.getAccountNo());

        //get balance
        System.out.println("Your current balance : "+acc.getBalance());

        //deposit
        System.out.println(acc.depositMoney(500));
        System.out.println("New balance : "+acc.getBalance());

        //withdraw
        System.out.println("Enter withdraw amount : ");
        int amount = sc.nextInt();
        System.out.println("Enter password : ");
        String enteredPassword = sc.next();

        System.out.println(acc.withdraw(amount, enteredPassword));

        //interest
        System.out.println("Interest on current balance "+acc.getBalance()+" is "+acc.calculateInterest(4));
    }
}