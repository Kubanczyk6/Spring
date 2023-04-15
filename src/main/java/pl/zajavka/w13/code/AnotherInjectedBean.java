package pl.zajavka.w13.code;

import org.springframework.stereotype.Component;

@Component
public class AnotherInjectedBean implements Marker {

    public AnotherInjectedBean() {
        System.out.println("Calling AnotherInjectedBean constructor");
    }
}
