package pizzeria.demo.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pizzeria.demo.Api.GoodPizza;
import pizzeria.demo.Api.IOrder;
import pizzeria.demo.Api.IPizza;

import java.util.List;

@Component
@Primary
public class ExclusiveOrder implements IOrder {

    @Value("#{listOfPizza[1]}")
    private IPizza pizza;
    @Autowired
    private List<IPizza> listOfPizza;

    public ExclusiveOrder() {
        super();
    }

    public void printOrder() {
        System.out.println("Zamówienie exclusive: " + pizza.getName() + " cena: " + pizza.getPrice());
    }

//    @Value("#{exoticPizza}")
    public void setPizza(IPizza pizza) {
        this.pizza = pizza;
    }
}
