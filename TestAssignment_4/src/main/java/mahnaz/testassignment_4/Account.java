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
public class Account {
    
    
     private Double balance;
     int CustomerNr;

    public Account(Double balance) {
        this.balance = balance;
    }
    
      public Account(Double balance, int CustomerNr) {
        this.balance = balance;
        this.CustomerNr = CustomerNr;
    }

    public int getCustomerNr() {
        return CustomerNr;
    }

    public void setCustomerNr(int CustomerNr) {
        this.CustomerNr = CustomerNr;
    }

  

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
     
    
   
    
}
