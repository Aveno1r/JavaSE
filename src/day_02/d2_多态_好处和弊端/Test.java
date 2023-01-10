package day_02.d2_多态_好处和弊端;

public class Test {
    public static void main(String[] args) {

        Student s = new Student();
        s.study();
        Teacher t = new Teacher();

        show(s);//People p=s=new Student();
        show(t);
    }


    //利用多态,使用父类类型接收不同的子类对象,减少方法的书写。
    public static void show(People p) {
        p.run();
        //通过父类的引用无法调用子类特有的行为
        //p.study();
        //p.teach();
    }

    //public void show1(Student s){
    //
    //
    //}
    //public void show2(Teacher t){
    //
    //
    //}
}
