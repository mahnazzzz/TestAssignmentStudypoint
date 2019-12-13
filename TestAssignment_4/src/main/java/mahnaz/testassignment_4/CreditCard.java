
package mahnaz.testassignment_4;

/**
 *
 * @author Bruger
 */
public class CreditCard {
    private double discount;
    boolean cardISValid = true;

    public CreditCard(double discount,boolean isvalid) {
        this.discount = discount;
        this.cardISValid = isvalid;
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

    public void setCardISValid(double discount, boolean cardISValid) {
        this.discount = discount;
        this.cardISValid = cardISValid;
    }

}
