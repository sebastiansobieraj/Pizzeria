package pizzeria.demo.Implementation;

import pizzeria.demo.Api.IOrder;
import pizzeria.demo.Api.IPizza;

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
