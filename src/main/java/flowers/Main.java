package flowers;

public class Main {
    public static void main(String[] args){
        Flower flow1 = new Flower(FlowerType.Chamomile);
        int[] color = new int[]{12, 67, 234};
        flow1.setColor(color);
        flow1.setPrice(234.67);
        flow1.setSepalLength(2.56);
        System.out.println(flow1);
    }

}


