package day_05.d13_正则表达式_应用案例_String常见方法;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //public String replaceAll(String regex , 字符串内容new字符串内容)	按照正则表达式匹配的内容进行替换
        //public String[] split(String regex)：	按照正则表达式匹配的内容进行分割字符串，反回一个字符串数组。

        //需求1：请把"古力娜扎ai8888迪丽热巴999aa5566马尔扎哈fbbfsfs42425卡尔扎巴"中的不是汉字的部分替换为 “-”
        String data = "古力娜扎ai8888迪丽热巴999aa5566马尔扎哈fbbfsfs42425卡尔扎巴";
        //String regex="\\w";
        String regex="\\w+";
        String rs = data.replaceAll(regex, "-");
        System.out.println("rs = " + rs);

        //需求2：某语音系统，收到一个口吃的人说的“我我我喜欢编编编编编编编编编编编编程程程！”，需要优化成“我喜欢编程！”
        String data2="我我我喜欢编编编编编编编编编编编编程程程！";
        //String regex2 =".{2,}";
        String regex2 ="(.)\\1+";
        //(.)\1+中  \\1表示组,整句含义表示,组1中的字符出现1次或多次,即同一个字符出现多次。
        //如果写成(.)+表示任意字符1次或多次,则会将整个字符串识别为一个整体,进行替换

        //$记录组  $1-->表示替换为当前规则中,正则规则里面的第1组的内容
        String rs2 = data2.replaceAll(regex2, "$1");
        System.out.println("rs2 = " + rs2);

        //需求3：请把“古力娜扎ai8888迪丽热巴999aa5566马尔扎哈fbbfsfs42425卡尔扎巴”中的人名取出来，使用切割来做
        String data3 = "古力娜扎ai8888迪丽热巴999aa5566马尔扎哈fbbfsfs42425卡尔扎巴";
        String regex3 ="\\w+";
        String[] rs3 = data3.split(regex3);
        System.out.println("rs3.length = " + rs3.length);
        System.out.println("Arrays.toString(rs3) = " + Arrays.toString(rs3));

        String data4="aa.bb.cc";
        //按照点切割
        //String regex4=".";//错误的
        String regex4="\\.";
        String[] rs4 = data4.split(regex4);
        System.out.println("rs4.length = " + rs4.length);
        System.out.println("Arrays.toString(rs4) = " + Arrays.toString(rs4));

    }
}
