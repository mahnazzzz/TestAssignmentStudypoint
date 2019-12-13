/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahnaz.testassignment_4;

/**
 *
 * @author Bruger
 */
public class Customer {
    int id;
    String name;
    Account acount ;
    CreditCard creditCart;
    boolean coupon = false;
    
    
     public Customer(String name, Account acount) {
        this.name = name;
        this.acount = acount;
        this.coupon = false;    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAcount() {
        return acount;
    }

    public void setAcount(Account acount) {
        this.acount = acount;
    }

    public CreditCard getCreditCard() {
        return creditCart;
    }

    public void setCreditCart(CreditCard creditCart) {
        this.creditCart = creditCart;
    }

    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }
    
    
    public void purchaseSCustomer() {
        if (getCreditCard().cardISValid == false && coupon ==false){
            System.out.println("15% discounts today for new customer");
            creditCart = new CreditCard (0.15, false);
            setAcount(new Account(0.00));
            return;
        }
        else if (getCreditCard().cardISValid == true && coupon == false) {
            System.out.println("valid credit card. 10% discount. ");
            creditCart = new CreditCard(0.10, false);
            return;
        }
        else  if (getCreditCard().cardISValid == true && coupon == true) {
            System.out.println("valid credit card. 10% discount. Added 20% with coupon ");
            creditCart = new CreditCard(30, false);
            return;
        }
        else if (getCreditCard().cardISValid== false && coupon == true) {
            System.out.println("you have a coupon, you can get 20% off today (but it can't be used with the 'new customer' discount ");
            creditCart = new CreditCard(20, false);
        }

    }
    
    
}
