package pl.zajavka.w13.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.zajavka.w13.code.Marker;

@Configuration
@ComponentScan(basePackageClasses = Marker.class)
public class ExampleConfigurationClass {




}
