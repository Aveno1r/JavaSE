package day_14.demo12_解析注解;

@MyTest(value = "java", bbb = {"php", "大数据"})
public class Demo {

    @MyTest(value = "黑马程序员", aaa = 200, bbb = "传智播客")
    public void test1() {
        System.out.println("test1...");
    }
}
