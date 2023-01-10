package day_05.d7_正则表达式_入门体验;

public class Test {
    public static void main(String[] args) {
        //QQ号:首位不能是0,长度在6-20之间,纯数字组成
        System.out.println("checkQQ(\"123456\") = " + checkQQ("123456"));
        System.out.println("checkQQ(\"0123456\") = " + checkQQ("0123456"));
        System.out.println("checkQQ(\"123456a\") = " + checkQQ("123456a"));


        System.out.println("checkQQ2(\"123456\") = " + checkQQ2("123456"));
        System.out.println("checkQQ2(\"0123456\") = " + checkQQ2("0123456"));
        System.out.println("checkQQ2(\"123456a\") = " + checkQQ2("123456a"));
    }

    //正则表达式
    public static boolean checkQQ2(String qq) {
        String regex = "[1-9][0-9]{5,19}";
        return qq.matches(regex);
    }

    //普通方式
    public static boolean checkQQ(String qq) {
        if (qq == null || qq.charAt(0) == '0' || qq.length() < 6 || qq.length() > 20) {
            return false;
        }
        //验证是否是纯数字
        for (int i = 0; i < qq.length(); i++) {
            //获取每一位字符
            char ch = qq.charAt(i);
            //保证每个字符都在‘0’字符到‘9’字符之间
            //一旦有1个不在‘0’字符到‘9’字符之间,不合法
            //"5956123"
            if (ch < '0' || ch > '9') {
                return false;
            }
        }

        //如果执行到这里,代表所有的情况都合法
        return true;
    }
}
