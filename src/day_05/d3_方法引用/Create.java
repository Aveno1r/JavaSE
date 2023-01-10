package day_05.d3_方法引用;
@FunctionalInterface
public interface Create {
    //创建学生对象
    Student create(String name,int age);
}
