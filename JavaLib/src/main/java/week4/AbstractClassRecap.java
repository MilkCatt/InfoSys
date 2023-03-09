package week4;

public class AbstractClassRecap {
    public static void main(String[] args) {
        Guest g = new Guest();
        RegularAccount ra = new RegularAccount("John Doe");

        System.out.println(Account.numberOfAccounts);

        checkOutPage(g);
        checkOutPage(ra);
    }

    public static void checkOutPage(Account a) {
        System.out.println(a.getUserName() + ": " + a.checkOut());
    }
}


abstract class Account{
    static int numberOfAccounts = 0;

    // protected = always accessible by subclass
    protected String userName;

    // different account implements different way to checkout
    abstract protected String checkOut();

    // Can have non-abstract method in abstract class
    public String getUserName() {
        return userName;
    }
}

class Guest extends Account{
    Guest() {
        userName = "Guest";
        numberOfAccounts += 1;
    }

    @Override
    protected String checkOut() {
        return "Fill address and payment details form, then confirmation page.";
    }
}

class RegularAccount extends Account{
    private String address;
    private String paymentDetails;

    RegularAccount(String userName) {
        this.userName = userName;
        numberOfAccounts += 1;
    }

    @Override
    protected String checkOut() {
        return "Show confirmation page with saved address and payment details of the account";
    }
}
