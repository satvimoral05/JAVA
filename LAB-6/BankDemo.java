class Account {

    int accNum;
    String accType;
    double balance;

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class BankDemo {

    public static void main(String[] args) {

        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = new Account();

        a1.setAccNum(1001);
        a1.setAccType("Savings");
        a1.setBalance(5000.0);

        a2.setAccNum(1002);
        a2.setAccType("Current");
        a2.setBalance(12000.0);

        a3.setAccNum(1003);
        a3.setAccType("Savings");
        a3.setBalance(7500.0);

        System.out.println(
            "Account 1: " + a1.getAccNum()
            + ", Type: " + a1.getAccType()
            + ", Balance: " + a1.getBalance()
        );

        System.out.println(
            "Account 2: " + a2.getAccNum()
            + ", Type: " + a2.getAccType()
            + ", Balance: " + a2.getBalance()
        );

        System.out.println(
            "Account 3: " + a3.getAccNum()
            + ", Type: " + a3.getAccType()
            + ", Balance: " + a3.getBalance()
        );
    }
}
