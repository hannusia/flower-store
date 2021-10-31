package payment;

public class PayPalPaymentStrategy implements Payment{
    @Override
    public String payment(double price){
        return "Payment with PayPal is successful!";
    }
}
