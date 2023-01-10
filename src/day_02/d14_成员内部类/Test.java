package day_02.d14_成员内部类;

public class Test {
    public static void main(String[] args) {
        //人类-心脏类
        Person p = new Person();
        Person.Heart h= p.new Heart();
        h.jump();
        p.setLive(false);
        h.jump();


        h.print();
    }
}
