package pl.zajavka.w13._11;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonExample {

    private InjectedBean injectedBean;

    public SingletonExample(InjectedBean injectedBean) {
        this.injectedBean = injectedBean;
    }

    public void someMethod(){
        System.out.println("Calling singleton bean");
    }
}
