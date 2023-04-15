package pl.zajavka.w13.project.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.zajavka.w13.project.Main;

@Configuration
@ComponentScan(basePackageClasses = Main.class)
public class ConfigurationClass {
}
