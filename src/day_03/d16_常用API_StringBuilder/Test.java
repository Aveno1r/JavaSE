package day_03.d16_常用API_StringBuilder;

public class Test {

    public static void main(String[] args) {
        //StringBuilder表示内容可变的字符串

        //得到对象
        //无参构造
        StringBuilder sb = new StringBuilder();//""
        //有参构造:根据String得到一个对象的StringBuilder对象
        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println("sb2 = " + sb2.toString());

        //常用方法

        //追加字符串 append(追加内容)  修改原来字符串内容
        //public StringBuilder append(任意类型)
        StringBuilder sb3 = new StringBuilder("itheima");
        System.out.println("sb3 = " + sb3);
        //证明:append方法,谁调用,返回的是谁
        //StringBuilder sb4 = sb3.append("hello");
        //System.out.println("(sb4==sb3) = " + (sb4 == sb3));
        //System.out.println("sb3 = " + sb3);
        //System.out.println("sb4 = " + sb4);

        //append方法支持链式编程
        //sb3.append("hello");
        //sb3.append(true);
        //sb3.append(100);
        sb3.append("hello").append(true).append(100);
        System.out.println("sb3 = " + sb3);


        //反转字符串 reverse() 修改原来字符串内容
        sb3.reverse();
        System.out.println("sb3 = " + sb3);


        //获取字符串字符个数
        System.out.println("sb3.length() = " + sb3.length());

        //获取StringBuilder对象对应的String对象
        String s = sb3.toString();
        System.out.println("s = " + s);


        StringBuffer sb4=new StringBuffer();
        sb4.append("hello").append(true).append(100);
        System.out.println("sb4 = " + sb4);
    }
}
