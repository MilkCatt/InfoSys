package PSet1A;

import java.util.Date;

public class CheckingAccount extends Account{

    //CONSTRUCTORS
    CheckingAccount(){
        super(0,0);
    }
    CheckingAccount(int id, double balance){
        super(id,balance);
    }
    @Override
    public void withdraw(double d){
        if(getBalance()-d < -5000){
            System.out.println("over limit");
        }
        else{
            setBalance(getBalance()-d);
        }
    }

    public static void main(String[] args) {

        CheckingAccount myCheckAcc = new CheckingAccount(1024, 8000.0);
        myCheckAcc.deposit(2000);
        myCheckAcc.withdraw(15000);

        System.out.println(myCheckAcc.getBalance());
        myCheckAcc.withdraw(200);
        System.out.println(myCheckAcc.getBalance());
        myCheckAcc.deposit(7000);
        myCheckAcc.withdraw(200);
        System.out.println(myCheckAcc.getBalance());
    }

}
