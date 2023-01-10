package Practice;

import java.util.Scanner;

public class HJ1 {
    public static void main(String[] args) {
        /*
        计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。（注：字符串末尾不以空格为结尾）
        输入描述：
        输入一行，代表要计算的字符串，非空，长度小于5000。
        输出描述：
        输出一个整数，表示输入字符串最后一个单词的长度。
         */
        //方法一
//        Scanner in = new Scanner(System.in);
//        String str = in.nextLine();
//        String[] arr = str.split(" ");
//        System.out.println((arr[arr.length - 1]).length());
        //方法二
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int index = -1;
        for (int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i) == ' '){
                index = i;
                break;
            }
        }
        System.out.println(str.length() - 1 - index);
    }
}
