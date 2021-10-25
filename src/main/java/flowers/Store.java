package flowers;

import java.util.ArrayList;

public class Store {
    public ArrayList<String> goods = new ArrayList<String>();

    public Store() {
    }

    public void add(FlowerBucket bucket) {
        goods.add(bucket.toString());
    }

    public void add(FlowerPack pack) {
        goods.add(pack.toString());
    }

    public void add(Flower flower) {
        goods.add(flower.toString());
    }

    public int search(String toFind) {
        for(int i = 0; i < goods.size(); i++){
            if(goods.get(i) == toFind){
                return i;
            }
        }
        return -1;
    }
}