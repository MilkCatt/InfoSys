package PSet1A;

import java.util.Date;

public class Account {
    // ATTRIBUTES
    private int id;
    private double balance;
    private static double annualInterestRate = 0;
    private Date dateCreated = new Date();

    // CONSTRUCTORS

    Account(){
        this(0,0);
    }
    Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    // GETTERS AND SETTERS

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }
    public Date getDateCreated() {
        return dateCreated;
    }

    // METHODS
    static double getMonthlyInterestRate(){
        return annualInterestRate/12.0;
    }
    public double getMonthlyInterest(){
        return getBalance() * getMonthlyInterestRate()/100;
    }
    public void withdraw(double amount){
        setBalance(getBalance()-amount);
    }
    public void deposit(double amount){
        setBalance(getBalance()+amount);
    }


    public static void main (String[] args) {

        Account account = new Account(1122, 20000);

        Account.setAnnualInterestRate(4.5);

        account.withdraw(2500);

        account.deposit(3000);

        System.out.println("Balance is " + account.getBalance());

        System.out.println("Monthly interest is " +

                account.getMonthlyInterest());

    }

}
