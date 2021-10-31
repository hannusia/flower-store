package flowers;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter @Setter
public class Flower {
    private double price;
    private double sepalLength;
    private int[] color;
    private FlowerType type;

    public Flower(FlowerType flowerType) {
        this.type = flowerType;
    }

    public void setColor(int[] color) {
        this.color = Arrays.copyOf(color, color.length);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "price=" + price +
                ", sepalLength=" + sepalLength +
                ", color=" + Arrays.toString(color) +
                ", type=" + type +
                '}';
    }
}
