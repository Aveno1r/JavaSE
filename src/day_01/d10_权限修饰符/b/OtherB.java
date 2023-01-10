package day_01.d10_权限修饰符.b;


import day_01.d10_权限修饰符.a.Fu;

public class OtherB {
     //访问不同包中的四种权限
    public void show() {
        Fu f = new Fu();
        //System.out.println("访问不同包中的无关类私有权限的变量:" + f.priNum);//error
        //System.out.println("访问不同包中的无关类缺省权限的变量:" + f.num);//error
        //System.out.println("访问不同包中的无关类受保护权限的变量:" + f.proNum);//error
        System.out.println("访问不同包中的无关类公共的权限的变量:" + f.pubNum);
    }
}
