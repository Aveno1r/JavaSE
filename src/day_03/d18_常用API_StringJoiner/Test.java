package day_03.d18_常用API_StringJoiner;

import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
        //构造方法
        //指定拼接分隔符
        //StringJoiner sj = new StringJoiner("@");
        //指定拼接分隔符,以及前缀字符串和后缀字符
        StringJoiner sj = new StringJoiner("@", "[", "]");


        //拼接字符串方法  public StringJoiner add (添加的内容)
        sj.add("java1");
        sj.add("java2");
        sj.add("java3");
        System.out.println("sj = " + sj);

        //获取字符串长度
        System.out.println("sj.length() = " + sj.length());

        //转为String类型字符串
        String s = sj.toString();
        System.out.println("s = " + s);

        int[] arr = {11,22,33};
        System.out.println("getStringByArray(arr) = " + getStringByArray(arr));
    }

    //获取数组字符串形式
    public static String getStringByArray(int[] arr) {
      StringJoiner sj=new StringJoiner(",", "[", "]");
        //遍历数组,获取数组内容
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i]+"");
        }
        return sj.toString();
    }
}
