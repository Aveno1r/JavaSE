package day_03.d15_常用API_包装类_字符串与基本类型转换;

public class Test {
    public static void main(String[] args) {
        //1.基本类型转字符串
        int i=10;
        //包装类中静态的toString方法
        String s1 = Integer.toString(i);//"10"
        //包装类中的(继承自Object)toString
        Integer ii =i;
        String s2 = ii.toString();
        //使用+拼接空字符串
        String s3=i+"";
        //String类中静态方法valueOf
        String s4 = String.valueOf(i);


        //字符串转基本类型
        String s="20";
        //包装类中的静态方法 parseXxx
        int i1 = Integer.parseInt(s);
        //包装类中的静态方法 valueOf
        //Integer ii2 = Integer.valueOf(s);
        //int i2=ii2;
        int i2=Integer.valueOf(s);
    }
}
