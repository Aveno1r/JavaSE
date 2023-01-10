package day_01.d15_继承_访问父类构造器;

public class People {
    private String name = "人类";

    //public People() {
    //    System.out.println("People 无参构造");
    //}

    public People(String name) {
        System.out.println("People 有参构造");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
