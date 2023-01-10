package day_01.d10_权限修饰符.b;


import day_01.d10_权限修饰符.a.Fu;

public class ZiB extends Fu {

    //访问不同包中的四种权限
    public void show() {
        //System.out.println("访问不通包中的私有权限的变量:" + priNum);//error
        //System.out.println("访问不通包中的缺省权限的变量:" + num);//error
        System.out.println("访问不通包中的受保护权限的变量:" + proNum);
        System.out.println("访问不通包中的公共的权限的变量:" + pubNum);
    }

}
