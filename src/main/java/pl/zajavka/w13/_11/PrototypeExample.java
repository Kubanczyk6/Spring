package pl.zajavka.w13._11;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeExample {

    private InjectedBean injectedBean;

    public PrototypeExample(InjectedBean injectedBean) {
        this.injectedBean = injectedBean;
    }

    public void someMethod(){
        System.out.println("Calling prototype");
    }

    public InjectedBean getInjectedBean() {
        return injectedBean;
    }
}
