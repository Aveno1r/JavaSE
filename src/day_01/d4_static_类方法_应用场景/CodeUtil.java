package day_01.d4_static_类方法_应用场景;

import java.util.Random;

public class CodeUtil {

    public static String CreateCode(int length){
        String code = "";
        String chr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789";
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chr.length());
            char c = chr.charAt(index);
            code += c;
        }
        return code;
    }
}
