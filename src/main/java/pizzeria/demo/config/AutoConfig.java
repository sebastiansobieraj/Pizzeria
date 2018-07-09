package pizzeria.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan ("pizzeria.demo.Implementation")
@Import(Config.class)
public class AutoConfig {
}
