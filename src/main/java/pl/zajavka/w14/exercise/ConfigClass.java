package pl.zajavka.w14.exercise;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Marker.class)
public class ConfigClass {
}
