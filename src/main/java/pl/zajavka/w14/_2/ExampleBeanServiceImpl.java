package pl.zajavka.w14._2;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@AllArgsConstructor
public class ExampleBeanServiceImpl implements ExampleBeanService{

    private InjectedBeanService injectedBeanService;
    @Override
    public boolean sampleMethod() {
        return injectedBeanService.anotherSampleMethod();
    }
}
