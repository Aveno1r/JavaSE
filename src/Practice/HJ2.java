package Practice;

import java.util.Scanner;

public class HJ2 {
    public static void main(String[] args) {
        /*
        描述
        写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字符，然后输出输入字符串中该字符的出现次数。（不区分大小写字母）
        数据范围： 1 \le n \le 1000 \1≤n≤1000
        输入描述：
        第一行输入一个由字母、数字和空格组成的字符串，第二行输入一个字符（保证该字符不为空格）。
        输出描述：
        输出输入字符串中含有该字符的个数。（不区分大小写字母
         */

        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        String str = in.nextLine().toLowerCase();
        char chr = in.next().toLowerCase().charAt(0);
        int count = 0;
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) - chr == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
