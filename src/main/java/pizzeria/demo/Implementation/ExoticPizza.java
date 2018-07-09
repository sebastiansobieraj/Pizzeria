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
    @Value("#{goodPizza.price matches '[1-9][1-9]'}")
    boolean bool;

    public ExoticPizza(
            @Value("#{ goodPizza.price > 13 ? 13 : 20}") int price,
            @Value("#{goodPizza.getName()?.toUpperCase()}") String name) {
        super();
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        System.out.println(bool);
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
