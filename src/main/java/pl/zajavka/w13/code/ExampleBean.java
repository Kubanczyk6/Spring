package pl.zajavka.w13.code;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ExampleBean {

    private final InjectedBean injectedBean;
    private final Marker marker;

    public ExampleBean(InjectedBean injectedBean,@Qualifier("someClass") Marker marker) {
        this.injectedBean = injectedBean;
        this.marker = marker;
        System.out.println("Calling ExampleBean constructor");
    }

    public void exampleMethod(){
        System.out.println("Calling exampleMethod");
    }
}
