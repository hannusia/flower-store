package delivery;

import flowers.Item;

public class PostDeliveryStrategy implements Delivery{
    @Override
    public String delivery(Item item){
        return "Post delivery is successfull!";
    }
}
