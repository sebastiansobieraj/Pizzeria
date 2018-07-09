package pizzeria.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pizzeria.demo.Api.IPizza;
import pizzeria.demo.Implementation.ExoticPizza;
import pizzeria.demo.Implementation.GoodPizza;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("pizzeria.demo.Implementation")
public class AutoConfig {

    @Bean
    public List<IPizza> listOfPizza() {
        List<IPizza> listOfPizza = new ArrayList<IPizza>();
        listOfPizza.add(new ExoticPizza(15, "exotic"));
        listOfPizza.add(new GoodPizza(10, "good"));
        return listOfPizza;
    }
}
