package flowers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    private FlowerPack flowerPack;
    private Flower flower;
    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.Chamomile);
        flower.setPrice(165.89);
        flowerPack = new FlowerPack();
        flowerPack.setFlower(flower);
        flowerPack.setAmount(100);
    }

    @Test
    void price() {
        assertEquals(16589, flowerPack.price());
    }

    @Test
    void getFlower() {
        assertEquals(FlowerType.Chamomile, flowerPack.getFlower());
    }
}