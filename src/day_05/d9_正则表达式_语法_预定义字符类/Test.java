package day_05.d9_正则表达式_语法_预定义字符类;

public class Test {
    public static void main(String[] args) {
        //预定义字符
        //.	任何字符
        //\d	一个数字： [0-9]
        //\D	非数字： [^0-9]
        //\s	一个空白字符：
        //\S	非空白字符： [^\s]
        //\w	[a-zA-Z_0-9]
        //\W	 [^\w] 一个非单词字符


        //\单独使用,表示转义符  d本身只是一个字母, \d代表对d进行转义,用于表示特殊的含义。
        System.out.println("_n_");
        //\n 被转义了,用于表示换行的效果。
        System.out.println("_\n_");

        //\d整体表示[0-9]之间字符 想要使用,需要对这里的斜杠再次转义(将原有的转义斜杠转换为普通的斜杠)\\d


        //1. 验证字符串内容是否3位数字
        //String regex="[0-9][0-9][0-9]";
        String regex="\\d\\d\\d";
        System.out.println("\"123\".matches(regex) = " + "123".matches(regex));
        System.out.println("\"a23\".matches(regex) = " + "a23".matches(regex));

        //2. 验证手机号：1开头，第二位：3/5/8，剩下9位都是0-9的数字
        //String regex2="1[358][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
        String regex2="1[358]\\d\\d\\d\\d\\d\\d\\d\\d\\d";
        System.out.println("\"13123456789\".matches(regex2) = " + "13123456789".matches(regex2));
        System.out.println("\"14123456789\".matches(regex2) = " + "14123456789".matches(regex2));

        //3. 验证字符串是否以h开头，以d结尾，中间是任何字符
        String regex3="h.d";
        System.out.println("\"had\".matches(regex3) = " + "had".matches(regex3));
        System.out.println("\"h1d\".matches(regex3) = " + "h1d".matches(regex3));
        System.out.println("\"h11d\".matches(regex3) = " + "h11d".matches(regex3));

        //4. 验证字符串内容是否是："had."  最后一位必须是点不能是别的
        //String regex4="had.";
        //注意:.单独使用,表示的是任意字符,而这里,我们指向让.表示点的含义。不去表示任意字符。
        //\.表示真正的点,单个斜杠又是转义符,需要让\表示真正的斜杠  需要使用两个\==>\\.
        String regex4="had\\.";
        System.out.println("\"had.\".matches(regex4) = " + "had.".matches(regex4));
        System.out.println("\"had1\".matches(regex4) = " + "had1".matches(regex4));
        System.out.println("\"hada\".matches(regex4) = " + "hada".matches(regex4));
    }
}
