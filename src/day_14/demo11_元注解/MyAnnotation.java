package day_14.demo11_元注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 元注解@Target: 限制注解使用的位置
//@Target(value={ElementType.TYPE})
//@Target(ElementType.TYPE)
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD,ElementType.LOCAL_VARIABLE,ElementType.PARAMETER})
// 元注解@Retention:指定注解保留的生命周期
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
}
