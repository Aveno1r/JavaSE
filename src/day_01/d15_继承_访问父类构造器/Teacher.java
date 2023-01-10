package day_01.d15_继承_访问父类构造器;

public class Teacher extends People {
    private String name="老师";

    public Teacher() {
        //super();
        super("");
        System.out.println("Teacher 无参构造");
    }

    public Teacher(String name) {
        //super();
        super("");
        System.out.println("Teacher 有参构造");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
