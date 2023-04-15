package pl.zajavka.w14._3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Marker.class)
public class BeanConfiguration {
}
