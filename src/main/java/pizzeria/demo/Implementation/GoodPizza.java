package pizzeria.demo.Implementation;

import org.springframework.stereotype.Component;
import pizzeria.demo.Api.IPizza;

public class GoodPizza implements IPizza {
    private int price;
    private String name;

    public GoodPizza(int price, String name){
        super();
        this.price = price;
        this.name = name;
    }

    public int getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }
}
