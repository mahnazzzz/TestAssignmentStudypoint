package mahnaz.testassignment2;

public class Account {
    int balance;
    
    public Account(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "Account{" + "balance=" + balance + '}';
    }
}