package payment;

public interface Payment {
    default String payment(double price){
        return null;
    }
}
