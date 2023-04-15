package pl.zajavka.w14._1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleBeanServiceImpl implements ExampleBeanService {
    List<String> list=new ArrayList<>();
    @Override
    public void sampleMethod(String... values) {
        list.addAll(Arrays.asList(values));
    }
}
