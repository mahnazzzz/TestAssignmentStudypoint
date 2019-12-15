/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahnaz.testassignment_4;

import java.util.ArrayList;

/**
 *
 * @author Bruger
 */
public class Customer {

    public Customer(String name, Account acount) {
        this.name = name;
        this.acount = acount;
    }
    int id;
    String name;
    Account acount ;
    CreditCard creditCart;
    boolean coupon = false;
   public  ArrayList<Customer> customers;

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public Customer(int id, String name, CreditCard creditCart, boolean coupon) {
        this.id = id;
        this.name = name;
        this.creditCart = creditCart;
        this.coupon = coupon;
    }

    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

   public ArrayList<Customer> addCustomer(Customer c){
       customers.add(c);
       return customers;
   }

    

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

    public CreditCard getCreditCart() {
        return creditCart;
    }

    public void setCreditCart(CreditCard creditCart) {
        this.creditCart = creditCart;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", acount=" + acount + ", creditCart=" + creditCart + ", coupon=" + coupon + '}';
    }

    
    
   
 
    
    
}
