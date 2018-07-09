package pizzeria.demo.Implementation;

import pizzeria.demo.Api.IPizza;

public class ExoticPizza implements IPizza {

    private int price;
    private String name;

    public ExoticPizza(int pirce, String name) {
        super();
        this.price = pirce;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
