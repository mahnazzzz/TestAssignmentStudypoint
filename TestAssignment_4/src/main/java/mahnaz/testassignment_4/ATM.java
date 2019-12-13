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
    
 public static void main(String[] args) {
         

     double d = 300;
        Account a = new Account(d);
        Customer c = new Customer("Mahnnaz",a );
        c.setCoupon(true);
        c.purchaseSCustomer();
        
        double interst = c.getAcount().Monthly_interest_rate(); 
        System.out.println("interrest iiis "+interst);
          
        
    }
   public void deposit(double amount, Account account) {
      account.setBalance(account.getBalance()+amount);
    }

    public void withdraw(double amount, Account account) {
        account.setBalance(account.getBalance()-amount);
    }
    
    

    
        
}
