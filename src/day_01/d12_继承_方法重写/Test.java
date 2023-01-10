package day_01.d12_继承_方法重写;
//方法重写:当子类觉得父类的某个方法,无法满足子类的需要,重写该方法。
//子类对象会按照就近原则,优先使用子类自己的方法。
public class Test {
    public static void main(String[] args) {
        B b = new B();
        //子类对象调用方法,遵守就近原则
        b.print();

        People people = new People("沈潇",23);
        System.out.println(people.say());

        Student student = new Student("sx", 23, 55, 98);
        System.out.println(student.say());
    }
}
