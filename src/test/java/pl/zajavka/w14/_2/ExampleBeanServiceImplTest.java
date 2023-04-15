package pl.zajavka.w14._2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.lang.model.AnnotatedConstruct;
import java.lang.annotation.Annotation;
import java.util.Objects;


@SpringJUnitConfig(classes = ConfigScanBean.class)
public class ExampleBeanServiceImplTest {

    @BeforeEach
    public void setUp() {
        Assertions.assertNotNull(exampleBeanService);
    }

    @Autowired
    ExampleBeanService exampleBeanService;



    @Test
    void sampleMethod(){


        //when
        boolean result = exampleBeanService.sampleMethod();

        //then

        Assertions.assertFalse(result);

    }
}
