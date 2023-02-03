package day_14.demo10_使用注解的注意事项;

public @interface MyAnnotation2 {
   String value();
   int num() default 10;
}
