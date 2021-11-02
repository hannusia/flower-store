package payment;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public boolean payment(double price){
        System.out.println("Payment with credit card is successful!");
        return true;
    }
}
