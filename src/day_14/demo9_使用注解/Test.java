package day_14.demo9_使用注解;

@MyAnnotation1
@MyAnnotation2(name="张三",age=18,arr={"java","php"})
@MyAnnotation3(age=19)
public class Test {
    @MyAnnotation1
    @MyAnnotation2(name="张三",age=18,arr={"java","php"})
    @MyAnnotation3(age=19)
    int num;
    /*
        使用注解:
            不带属性的注解: @注解名
            带属性的注解: @注解名(属性名=属性值,属性名=属性值,...)
            注意:
                1.带属性的注解使用的时候必须给该注解的所有属性赋值
                2.定义注解的时候如果没有限制注解的使用位置,那么注解可以使用在任意位置
                3.同一个位置一个注解只能使用一次
                4.如果注解中中的属性有默认值,使用的时候可以不给有默认值的属性赋值
     */
    @MyAnnotation1
    @MyAnnotation2(name="张三",age=18,arr={"java","php"})
    @MyAnnotation3(age=19)
    public void show( @MyAnnotation1 int b){
        @MyAnnotation1
        @MyAnnotation2(name="张三",age=18,arr={"java","php"})
        @MyAnnotation3(age=19)
        int a;
    }
}
