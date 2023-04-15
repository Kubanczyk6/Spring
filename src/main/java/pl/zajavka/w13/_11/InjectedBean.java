package pl.zajavka.w13._11;

import org.springframework.stereotype.Component;

@Component
public class InjectedBean {

    public void method(){
        System.out.println("Calling injected bean");
    }
}
