package day_14self.demo10_注解;

@MyTest(value = "sx", bbb = {"sx","xs"})
public class Demo {
    @MyTest(value = "sx1", bbb = {"sx1","xs1"})
    public void test(){
        System.out.println("test方法");
    }
}
