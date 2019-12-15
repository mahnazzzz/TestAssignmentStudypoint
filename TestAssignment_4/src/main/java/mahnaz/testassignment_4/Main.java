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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account a = new Account(500.0);
        CreditCard cc = new CreditCard(a,0.0, true);
        Customer c1 = new Customer(1, "Mahnaz", cc, false);
        a.setCustomerNr(c1.getId());
        ATM atm = new ATM();
        
        Double d = atm.Monthly_interest_rate(a);
        
        atm.withdraw(450, a);
        System.out.println(" HEloooooo" + a.getBalance());
        // TODO code application logic here
    }
    
}
