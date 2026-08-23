class BankAccount {

    int accountNo;
    int balance;

    static String bankName;
    static double interestRate;

    public BankAccount(int accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public static void setBankName(String name) {
        bankName = name;
    }

    public static void setInterest(double ir) {
        interestRate = ir;
    }

    public static String getBankName() {
        return bankName;
    }

    public static Double getInterest() {
        return interestRate;
    }

    public String toString() {
        return "Bank Name: " + bankName
                + " Interest Rate: " + interestRate
                + " Account No: " + accountNo
                + " Balance: " + balance;
    }
}

public class Bank {

    public static void main(String[] args) {

        BankAccount b1 =
            new BankAccount(12345, 50000);

        BankAccount b2 =
            new BankAccount(54123, 100000);

        BankAccount b3 =
            new BankAccount(87654, 150000);

        BankAccount.bankName = "HDFC Bank";
        BankAccount.interestRate = 9.2;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
