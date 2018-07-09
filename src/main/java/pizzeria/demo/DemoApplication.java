package pizzeria.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pizzeria.demo.Api.IOrder;
import pizzeria.demo.Implementation.Order;
import pizzeria.demo.config.AutoConfig;
import pizzeria.demo.config.Config;

//@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
        IOrder order = context.getBean(Order.class);
        order.printOrder();
    }
}
