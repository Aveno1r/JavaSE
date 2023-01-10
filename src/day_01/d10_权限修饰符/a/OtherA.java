package day_01.d10_权限修饰符.a;

public class OtherA {
    //访问同一个包中的四种权限
    public void show() {
        Fu f = new Fu();
        //System.out.println("访问同一个包中的私有权限的变量:" + f.priNum);//error
        System.out.println("访问同一个包中的缺省权限的变量:" + f.num);
        System.out.println("访问同一个包中的受保护权限的变量:" + f.proNum);
        System.out.println("访问同一个包中的公共的权限的变量:" + f.pubNum);
    }
}
