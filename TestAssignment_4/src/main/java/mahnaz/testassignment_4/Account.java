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

    public Account(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
     
    
    public double Monthly_interest_rate(){
         if (getBalance() >= 0 && getBalance() <= 100) {
            return 0.03;
        }
         else if (getBalance() > 100 && getBalance() <= 1000) {
            return 0.05;
        }
         else if(getBalance() > 1000){
            return 0.07;
        }
        return 0.0;
    }

    
}
