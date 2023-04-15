package pl.zajavka.w13.code;

import org.springframework.stereotype.Service;

@Service
public class InjectedBean  {
    private AnotherInjectedBean anotherInjectedBean;

    public InjectedBean() {
        System.out.println("Calling InjectedBean constructor");
    }

    public void setExampleBean(AnotherInjectedBean anotherInjectedBean) {
        this.anotherInjectedBean = anotherInjectedBean;
        System.out.println("Calling setter");
    }

    public void someMethod(){
        System.out.println("Calling injectedBean #someMethod");
    }
}
