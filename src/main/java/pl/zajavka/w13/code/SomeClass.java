package pl.zajavka.w13.code;

import org.springframework.stereotype.Service;

@Service
public class SomeClass implements Marker{

    public void method(){
        System.out.println("Calling method in SomeClass");
    }
}
