package pizzeria.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pizzeria.demo.Api.IOrder;
import pizzeria.demo.Api.IPizza;
import pizzeria.demo.Implementation.ExoticPizza;
import pizzeria.demo.Implementation.GoodPizza;
import pizzeria.demo.Implementation.Order;

@Configuration
public class Config {

    @Bean
    public IPizza pizza() {
        return new ExoticPizza(17, "Exotic");
    }

//    @Bean
//    public IOrder order(IPizza pizza){
//        return new Order(pizza);
//    }
}
