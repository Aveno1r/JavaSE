package day_14.demo8_定义注解;

// 带属性的注解
public @interface MyAnnotation2 {
    // 属性: public 属性类型 属性名();  不带默认值
    // 属性: public 属性类型 属性名() default 默认值;  带默认值
    // 扩展注意: 属性的类型只能是: 基本类型,String,Class,枚举类型,注解类型,以上类型的一维数组类型
    int a() default 10;
    String b();
    Class c();
    Gender d();
    MyAnnotation1 e();

    int[] arr1();
    String[] arr2();
    Class[] arr3();
    Gender[] arr4();
    MyAnnotation1[] arr5();


}
