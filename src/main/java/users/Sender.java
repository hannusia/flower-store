package users;

import lombok.Getter;

@Getter
public class Sender implements User{
    private int id = 0;

    public Sender() {
        this.id = IdCounter.counter();
    }

    public String update(int status) {
        if(status == 1){
            return "your order has been received";
        }
        return "your order hasn't been received now";
    }
}