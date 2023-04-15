package pl.zajavka.w13.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.zajavka.w13.project.configuration.ConfigurationClass;
import pl.zajavka.w13.project.model.User;
import pl.zajavka.w13.project.service.ReadFile;

import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static final String path = "src/main/java/pl/zajavka/w13/project/resources/users.csv";

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        ReadFile bean = context.getBean(ReadFile.class);

        List<User> users = bean.readFileAndCreateListOfUsers(Paths.get(path));
        users.forEach(System.out::println);
    }
}
