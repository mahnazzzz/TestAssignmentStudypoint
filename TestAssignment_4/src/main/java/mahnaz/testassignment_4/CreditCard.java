package mahnaz.testassignment_4;

/**
 *
 * @author Bruger
 */
public class CreditCard {

    Account account;
    double discount;
    boolean cardISValid = false;

  

    public CreditCard(Account account, double discount, boolean cardISValid) {
        this.account = account;
        this.discount = discount;
        this.cardISValid = cardISValid;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public boolean isCardISValid() {
        return cardISValid;
    }

    public void setCardISValid(boolean cardISValid) {
        this.cardISValid = cardISValid;
    }

    @Override
    public String toString() {
        return "CreditCard{" + "account=" + account + ", discount=" + discount + ", cardISValid=" + cardISValid + '}';
    }

}
