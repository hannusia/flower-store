package flowers;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item{
    @Getter @Setter
    List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double price() {
        double price = 0;
        for (int i = 0; i < flowerPacks.size(); i++) {
            price += flowerPacks.get(i).price();
        }
        return price;
    }

    @Override
    public double getPrice() {
        return this.price();
    }

    @Override
    public String getDescription() {
        return "Flower Bucket";
    }
}