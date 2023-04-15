package pl.zajavka.w14._1;

public class InjectedBeanServiceImpl implements InjectedBeanService {
    @Override
    public String anotherSampleMethod(String val) {
        return "someValue";
    }
}
