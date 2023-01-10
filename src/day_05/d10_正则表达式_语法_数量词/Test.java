package day_05.d10_正则表达式_语法_数量词;

public class Test {
    public static void main(String[] args) {
        //X?	X , 一次或0次
        //X*	X，零次或多次
        //X+	X , 一次或多次
        //X {n}	X，正好n次
        //X {n, }	X，至少n次
        //X {n,m}	X，至少n但不超过m次


        //1. 验证字符串内容是否是三位数字
        //String regex ="\\d\\d\\d";
        String regex ="\\d{3}";
        System.out.println("\"123\".matches(regex) = " + "123".matches(regex));
        System.out.println("\"a23\".matches(regex) = " + "a23".matches(regex));

        //2. 验证字符串内容是否是多位数字(最少1位)
        String regex2 ="\\d{1,}";
        System.out.println("\"\".matches(regex2) = " + "".matches(regex2));
        System.out.println("\"123\".matches(regex2) = " + "123".matches(regex2));
        System.out.println("\"123456\".matches(regex2) = " + "123456".matches(regex2));

        //3. 验证字符串内容是否是手机号
        //String regex3="1[358]\\d\\d\\d\\d\\d\\d\\d\\d\\d";
        String regex3="1[358]\\d{9}";
        System.out.println("\"13123456789\".matches(regex3) = " + "13123456789".matches(regex3));
        System.out.println("\"14123456789\".matches(regex3) = " + "14123456789".matches(regex3));
    }
}
