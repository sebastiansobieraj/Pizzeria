package pizzeria.demo.Implementation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pizzeria.demo.Api.GoodPizza;
import pizzeria.demo.Api.IPizza;


@Component
@GoodPizza
public class ExoticPizza implements IPizza {

    private int price;
    private String name;

    public ExoticPizza(
            @Value("1") int price,
            @Value("Exotic") String name) {
        super();
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }
}
