package day_01.d10_权限修饰符.a;

public class Fu {
    private int priNum = 10;
    int num = 20;
    protected int proNum = 30;
    public int pubNum = 40;


    //访问本类中的四种权限
    public void show() {
        System.out.println("访问本类中的私有权限的变量:" + priNum);
        System.out.println("访问本类中的缺省权限的变量:" + num);
        System.out.println("访问本类中的受保护权限的变量:" + proNum);
        System.out.println("访问本类中的公共的权限的变量:" + pubNum);
    }
}
