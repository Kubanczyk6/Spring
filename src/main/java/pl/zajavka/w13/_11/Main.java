package pl.zajavka.w13._11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationClass.class);


        PrototypeExample bean1 = applicationContext.getBean(PrototypeExample.class);
        PrototypeExample bean2 = applicationContext.getBean(PrototypeExample.class);
        System.out.println(bean1.getInjectedBean());
        System.out.println(bean1==bean2);
        SingletonExample bean3 = applicationContext.getBean(SingletonExample.class);
        SingletonExample bean4 = applicationContext.getBean(SingletonExample.class);
        System.out.println(bean3==bean4);
        bean1.someMethod();

        Arrays.asList(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
