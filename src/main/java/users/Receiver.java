package users;

import lombok.Getter;

@Getter
public class Receiver implements User{
    private int id = 0;

    public Receiver() {
        this.id = IdCounter.counter();
    }

    public String update(int status) {
        if(status == 1){
            return "your order has benn delivered";
        }
        return "your order hasn't been delivered yet";
    }
}