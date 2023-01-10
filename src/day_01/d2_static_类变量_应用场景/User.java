package day_01.d2_static_类变量_应用场景;

public class User {
    static int number;
    String name;
    public User(){
        number++;
    }
    public User(String name){
        this.name = name;
        number++;
    }
}
