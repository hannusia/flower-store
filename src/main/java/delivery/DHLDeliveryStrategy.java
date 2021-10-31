package delivery;

import flowers.Item;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public String delivery(Item item){
        return "DHL delivery is successful!";
    }
}
