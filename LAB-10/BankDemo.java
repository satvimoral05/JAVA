abstract class BankAccount {

    protected double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);

    abstract void withdraw(double amount);

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited in Savings Account: " + amount);
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn from Savings Account: " + amount);
        } else {
            System.out.println("Insufficient balance in Savings Account");
        }
    }
}

class CurrentAccount extends BankAccount {

    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited in Current Account: " + amount);
    }

    @Override
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn from Current Account: " + amount);
    }
}

public class BankDemo {

    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(5000);

        sa.deposit(1000);
        sa.withdraw(2000);
        sa.showBalance();

        System.out.println();

        CurrentAccount ca = new CurrentAccount(5000);

        ca.deposit(1000);
        ca.withdraw(3000);
        ca.showBalance();
    }
}
