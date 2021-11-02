package payment;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public boolean payment(double price){
        System.out.println("Payment with PayPal is successful!");
        return true;
    }
}
