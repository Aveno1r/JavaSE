package day_01.d10_权限修饰符.a;

public class ZiA extends Fu {


    //访问同一个包中的四种权限
    public void show() {
        //System.out.println("访问同一个包中的私有权限的变量:" + priNum);//error
        System.out.println("访问同一个包中的缺省权限的变量:" + num);
        System.out.println("访问同一个包中的受保护权限的变量:" + proNum);
        System.out.println("访问同一个包中的公共的权限的变量:" + pubNum);
    }
}
