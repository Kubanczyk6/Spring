package pl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.zajavka.w13.code.ExampleBean;
import pl.zajavka.w13.configuration.ExampleConfigurationClass;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);
        System.out.println("################");
        ExampleBean bean = applicationContext.getBean( ExampleBean.class);
        System.out.println("#################");
       bean.exampleMethod();

        Arrays.asList(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
