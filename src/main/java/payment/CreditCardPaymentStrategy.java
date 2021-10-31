package payment;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public String payment(double price){
        return "Payment with credit card is successful!";
    }
}
