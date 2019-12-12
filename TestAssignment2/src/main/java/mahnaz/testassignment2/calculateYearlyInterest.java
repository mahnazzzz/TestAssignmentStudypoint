package mahnaz.testassignment2;

public class calculateYearlyInterest {

    public double Interesetcalculate(Account account) {

        int balance = account.getBalance();
        if (balance >= 0 && balance <= 100) {
            return balance * 0.03;
        } else if (balance > 100 && balance <= 1000) {
            return balance * 0.05;
        } else if (balance > 1000) {
            return balance * 0.07;
        }

        return 0.0;
    }
}
