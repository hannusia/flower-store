package delivery;

import flowers.Item;

public interface Delivery {
    default String delivery(Item item){
        return null;
    }
}
