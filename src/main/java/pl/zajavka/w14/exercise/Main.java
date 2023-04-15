package pl.zajavka.w14.exercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigClass.class);
        UserManagementService bean = applicationContext.getBean(UserManagementService.class);
        UserManagementInMemoryRepository bean1 = applicationContext.getBean(UserManagementInMemoryRepository.class);
        var user1 = someUser().withEmail("email1@gmail.com");
        var user2 = someUser().withEmail("email2@gmail.com");
        var user3 = someUser().withName("newName").withEmail("email3@gmail.com");
        bean.create(user1);
        bean.create(user2);
        bean.create(user3);
        System.out.println(bean.findByName(user3.getName()));

    }

    private static User someUser(){
        return User.builder()
                .name("name")
                .surname("surname")
                .email("email@gmail.com")
                .build();
    }
}
