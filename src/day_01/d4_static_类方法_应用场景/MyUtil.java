package day_01.d4_static_类方法_应用场景;

import java.util.Random;

public class MyUtil {
    //构造方法私有,避免别的人创建对象,浪费内存
    private MyUtil(){}

    /**
     * 该方法用于获取指定位数的验证码
     *
     * @param n 指定验证码的位数
     * @return 返回验证码
     */
    public static String createCode(int n) {
        String code = "";
        String data = "abcdefghihklmnopqrstuvwxyzABCDEFGHIHKLMNOPQRSTUVWXYZ0123456789";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(data.length());
            char ch = data.charAt(index);
            code += ch;
        }
        return code;
    }
}
