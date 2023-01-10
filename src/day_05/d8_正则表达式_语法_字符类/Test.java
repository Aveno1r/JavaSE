package day_05.d8_正则表达式_语法_字符类;

public class Test {
    public static void main(String[] args) {
        //字符类
        //[abc]	   ： 只能是a, b, 或c
        //[^abc]	   ： 除了a, b, c之外的任何字符
        //[a-zA-Z] 	   ： a到z A到Z，包括（范围）
        //[a-d[m-p]]    ： a到d，或m到p
        //[a-z&&[def]]  ： d, e, 或f(交集)
        //[a-z&&[^bc]]  ： a到z，除了b和c（等同于[ad-z]）
        //[a-z&&[^m-p]] :  a到z，除了m到p（等同于[a-lq-z]）


        //1. 验证字符串内容是否以h开头，以d结尾，中间是a,e,i,o,u中某个字符
        String regex ="h[aeiou]d";
        System.out.println("\"had\".matches(regex) = " + "had".matches(regex));
        System.out.println("\"hbd\".matches(regex) = " + "hbd".matches(regex));


        //2. 验证字符串内容是否以h开头，以d结尾，中间不是a,e,i,o,u中的某个字符
        String regex2 ="h[^aeiou]d";
        System.out.println("\"had\".matches(regex2) = " + "had".matches(regex2));
        System.out.println("\"hbd\".matches(regex2) = " + "hbd".matches(regex2));


        //3. 验证字符串内容是否a-z的任何一个小写字符开头，后跟ad
        String regex3 ="[a-z]ad";
        System.out.println("\"had\".matches(regex3) = " + "had".matches(regex3));
        System.out.println("\"hbd\".matches(regex3) = " + "hbd".matches(regex3));
        System.out.println("\"1ad\".matches(regex3) = " + "1ad".matches(regex3));


        //4. 验证字符串内容是否以a-d或者m-p之间某个字符开头，后跟ad
        String regex4 ="[a-d[m-p]]ad";
        System.out.println("\"had\".matches(regex4) = " + "had".matches(regex4));
        System.out.println("\"aad\".matches(regex4) = " + "aad".matches(regex4));
        System.out.println("\"oad\".matches(regex4) = " + "oad".matches(regex4));
    }
}
