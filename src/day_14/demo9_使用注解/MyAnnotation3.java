package day_14.demo9_使用注解;

// 带属性的注解
public @interface MyAnnotation3 {
    String name() default "黑马程序员";
    int age();
    String[] arr() default {"java","前端","大数据"};
}
