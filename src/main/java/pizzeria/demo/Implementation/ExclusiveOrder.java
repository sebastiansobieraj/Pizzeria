package pizzeria.demo.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pizzeria.demo.Api.GoodPizza;
import pizzeria.demo.Api.IOrder;
import pizzeria.demo.Api.IPizza;

@Component
@Primary
public class ExclusiveOrder implements IOrder {

    private IPizza pizza;

    public ExclusiveOrder() {
        super();
    }

    public void printOrder() {
        System.out.println("Zamówienie exclusive: " + pizza.getName() + " cena: " + pizza.getPrice());
    }

    @Autowired
    public void setPizza(IPizza pizza) {
        this.pizza = pizza;
    }
}
