package day_14.demo10_使用注解的注意事项;


public class Test {
    /*
        使用注解的注意事项:
             1.带属性的注解使用的时候必须给该注解的所有属性赋值
             2.定义注解的时候如果没有限制注解的使用位置,那么注解可以使用在任意位置
             3.同一个位置一个注解只能使用一次
             4.如果注解中中的属性有默认值,使用的时候可以不给有默认值的属性赋值
             参考demo9案例
        扩展使用注解的注意事项:
            1.如果注解的属性是数组类型,给该属性赋值的时候数组中只有一个值,那么数组的大括号可以省略不写
            2.如果注解中只有一个属性,并且属性名为value,那么该属性赋值的时候属性名value可以省略不写
     */
    public static void main(String[] args) {

    }

    // 1.如果注解的属性是数组类型,给该属性赋值的时候数组中只有一个值,那么数组的大括号可以省略不写
    //@MyAnnotation1(arr={"java"})
    @MyAnnotation1(arr="java")
    public void show1(){}

     //2.如果注解中只有一个属性要赋值,并且属性名为value,那么该属性赋值的时候属性名value可以省略不写
    //@MyAnnotation2(value="java")
    @MyAnnotation2("java")
    public void show2(){}

    // 1.如果注解的属性是数组类型,给该属性赋值的时候数组中只有一个值,那么数组的大括号可以省略不写
    // 2.如果注解中只有一个属性要赋值,并且属性名为value,那么该属性赋值的时候属性名value可以省略不写
    //@MyAnnotation12(value = {"java"})
    //@MyAnnotation12(value = "java")
    //@MyAnnotation12({"java"})
    @MyAnnotation12("java")
    public void show12(){}

}
