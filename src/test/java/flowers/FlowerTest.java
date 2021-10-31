package flowers;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {

    private Flower flower;


    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        flower = new Flower(FlowerType.Rose);
        flower.setPrice(346);
        flower.setColor(new int[]{1,2,3});
        flower.setSepalLength(3.67);

    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(346, flower.getPrice());
    }

    @org.junit.jupiter.api.Test
    void getSepalLength() {
        assertEquals(3.67, flower.getSepalLength());
    }

    @org.junit.jupiter.api.Test
    void getFlowerType() {
        assertEquals(FlowerType.Rose, flower.getType());
    }
}