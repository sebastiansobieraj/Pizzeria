package pizzeria.demo.Implementation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pizzeria.demo.Api.IOrder;
import pizzeria.demo.Api.IPizza;

@Component
public class Order implements IOrder {

    private IPizza pizza;

    public Order(IPizza pizza) {
        super();
        this.pizza = pizza;
    }

    public void printOrder() {
        System.out.println("Zamówienie : " + pizza.getName() + " cena: " + pizza.getPrice());
    }
}
