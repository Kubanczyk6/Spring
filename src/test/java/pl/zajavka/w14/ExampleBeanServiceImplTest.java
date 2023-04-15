package pl.zajavka.w14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.zajavka.w14._1.ExampleBeanServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
class ExampleBeanServiceImplTest {

@InjectMocks
ExampleBeanServiceImpl exampleBeanService;
@Spy
    List<String> list = new ArrayList<>();


@ParameterizedTest
@MethodSource
    void sampleMethod(String...values) {
//given



        //when
        list.addAll(Arrays.asList(values));


        //then
        Assertions.assertEquals(2,list.size());
        Mockito.verify(list,Mockito.times(1)).addAll(ArgumentMatchers.any());
    }

static Stream<Arguments> sampleMethod(){
    return Stream.of(
            Arguments.of((Object) new String[]{"val1","val2"}),
            Arguments.of((Object) new String[]{"val3","val4"})
    );
}


}