package pizzeria.demo.Implementation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pizzeria.demo.Api.IPizza;

@Component
public class ExoticPizza implements IPizza {

    private int price;
    private String name;

    public ExoticPizza(
            @Value("1") int pirce,
            @Value("Exotic") String name) {
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
