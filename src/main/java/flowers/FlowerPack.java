package flowers;

import lombok.Getter;

@Getter
public class FlowerPack {
    private Flower flower;
    private int amount;

    public FlowerPack(Flower flower, int amount){
        this.flower = flower;
        this.amount = amount;
    }

    public double price(){
        return this.getAmount() * this.getFlower().getPrice();
    }
}
