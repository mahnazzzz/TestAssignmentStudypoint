
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bruger
 */
public class Order {
    int id; 
    String name;
    String description;
    int price;
    Order order;
    ArrayList<Order> orders ;

    public Order(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Order(int id, String name, String description, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
       
    }
public ArrayList<Order> makeorders(Order order){
    
   orders.add(order);
   return orders;
  
}
 public ArrayList<Order> deleteOrder(Order order){
    
   orders.remove(order);
   return orders;
  
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    public Order makeorder(){
        return order;
    }
    
    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + '}';
    }
    
    
}
