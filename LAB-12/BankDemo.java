class InsufficientFundException extends Exception {

    public InsufficientFundException(String message) {
        super(message);
    }
}

class Account {

    private double balance;
    private static final double MIN_BALANCE = 1000;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;

        System.out.println("Deposited Amount: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    public void withdraw(double amount) throws InsufficientFundException {

        if (balance - amount < MIN_BALANCE) {

            throw new InsufficientFundException(
                "Withdrawal denied! Minimum balance of "
                + MIN_BALANCE
                + " must be maintained."
            );
        }

        balance -= amount;

        System.out.println("Withdrawn Amount: " + amount);
        System.out.println("Remaining Balance: " + balance);
    }
}

public class BankDemo {

    public static void main(String[] args) {

        Account acc = new Account(5000);

        acc.deposit(2000);

        try {
            acc.withdraw(6500);
        } catch (InsufficientFundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
