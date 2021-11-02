package flowers;
import delivery.Delivery;
import lombok.Getter;
import lombok.Setter;
import payment.Payment;

import java.util.LinkedList;

public class Order {
    @Getter @Setter
    private LinkedList<Item> items;
    @Getter
    private Payment payment;
    @Getter
    private Delivery delivery;

    public void setPaymentStrategy(Payment newPayment) {
        this.payment = newPayment;
    }

    public void setDeliveryStrategy(Delivery newDelivery) {
        this.delivery = newDelivery;
    }

    public double calculateTotalPrice() {
        double price = 0;
        for(int i = 0; i < items.size(); i++) {
            price += items.get(i).getPrice();
        }
        return price;
    }

    public boolean processOrder() {
        boolean pay = this.payment.payment(calculateTotalPrice());
        boolean deliver = this.delivery.deliver(items);
        return pay && deliver;
    }

    public void addItem(Item toAdd) {
        this.items.add(toAdd);
    }

    public void removeItem(Item toRemove) {
        this.items.remove(toRemove);
    }

}