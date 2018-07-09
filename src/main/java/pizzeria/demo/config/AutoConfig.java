package pizzeria.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan ("pizzeria.demo.Implementation")
public class AutoConfig {
}
