package order;

import delivery.Delivery;
import flowers.Item;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import payment.Payment;
import users.User;

import java.util.ArrayList;
import java.util.LinkedList;

@Getter @Setter @ToString
public class Order {
    LinkedList<Item> items = new LinkedList<>();
    Payment payment;
    Delivery delivery;
    ArrayList users;


    public Order(LinkedList items, Payment payment, Delivery delivery) {
        this.items = items;
        this.payment = payment;
        this.delivery = delivery;
    }

    public Order() {
    }

    public double calculateTotalPrice(){
        double price = 0;
        for(int i=0; i < this.items.size(); i++){
            price += this.items.get(i).getPrice();
        }
        return price;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public void addUser(User user){
        this.users.add(user);
    }

    public void removeUser(User user){
        this.users.remove(user);
    }

    public void notifyUsers(){
        for (int i=0; i<users.size(); i++){
            users.get(i).notify();
        }
    }
    public void order(){
        notifyUsers();
    }

    public String processOrder(){
        return "your order was successfully processed";
    }
}