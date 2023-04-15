package pl.zajavka.w14._2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigScanBean.class);
        ExampleBeanService exampleBeanService = applicationContext.getBean(ExampleBeanService.class);
        System.out.println(exampleBeanService.sampleMethod());

    }
}
