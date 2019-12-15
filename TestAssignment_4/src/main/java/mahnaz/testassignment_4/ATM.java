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
public class ATM {

    public void deposit(double amount, Account account) {
        account.setBalance(account.getBalance() + amount);
    }

    public void withdraw(double amount, Account account) {
        account.setBalance(account.getBalance() - amount);
    }

    public void Purchase_with_discount(Customer c, boolean coupon) {

        if (c.creditCart.isCardISValid() == false && coupon == false) {
            System.out.println("you are a new customer opening a credit card account, you will get a 15% discount on all your purchases today)");
            c.getCreditCart().setDiscount(0.15);
            
            return;

        }
        if (c.creditCart.isCardISValid() == true && coupon == false) {
            System.out.println("you hold a loyalty card, you get a 10% discoun ");
            c.getCreditCart().setDiscount(0.10);
            return;

        }
        if (c.creditCart.isCardISValid() == true && coupon == true) {
            System.out.println("you have a coupon, you can get 20% off today ");
           // CreditCard cc = new CreditCard(c.getAcount(), 0.20, true);
           c.getCreditCart().setDiscount(0.20);
            return;

        }

        if (c.creditCart.isCardISValid() == false && coupon == true) {
            System.out.println("you are a new customer, can't be used with the 'new customer' ");
            c.getCreditCart().setDiscount(0.0);
            return;
        }

    }

    public double Monthly_interest_rate(Account a) {
        if (a.getBalance() < 0) {
            System.out.println("there is any interst rate for you.");
            return 0.0;
        } else if (a.getBalance() >= 0 && a.getBalance() <= 100) {
            return 0.03;
        } else if (a.getBalance() > 100 && a.getBalance() <= 1000) {
            return 0.05;
        } else {
            return 0.07;
        }

    }

}
