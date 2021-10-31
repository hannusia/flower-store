package flowers;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FlowerPack extends Item{
    private Flower flower;
    private int amount;

    public double price(){
        return this.getAmount() * this.getFlower().getPrice();
    }

    @Override
    public double getPrice() {
        return this.price();
    }

    @Override
    public String getDescription() {
        return "Pack of " + flower.getType().toString();
    }
}
