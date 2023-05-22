public class Bank {
    private double balance;
    private String accountNumber;

    public Bank(double balance, String accountNumber) {
        setBalance(balance);
        setAccountNumber(accountNumber);
    }
    public Bank() {
        balance = 0;
        accountNumber = "123";
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Balance too low");
        }
}
}
