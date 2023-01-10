package day_05.d12_正则表达式_应用案例_过滤数据;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {
    public static void main(String[] args) {
        //String data="欢迎张全蛋光临本系统！他删库并跑路\n" +
        //        "欢迎李二狗子光临本系统！\n" +
        //        "欢迎马六子光临本系统！它浏览了很多好看的照片！\n" +
        //        "欢迎夏洛光临本系统！他在六点钟送出了一个嘉年华\n";

        //定义过滤规则
        String data="欢迎张全蛋光临王五光临本系统！他删库并跑路\n";
        //String regex="欢迎(.+)光临";//贪婪匹配 尽可能多(长)的匹配
        String regex="欢迎(.+?)光临";//非贪婪(懒惰)匹配 尽可能少(短)的匹配
        //定义过滤对象
        Pattern pattern = Pattern.compile(regex);
        //过滤数据,收集结果
        Matcher matcher = pattern.matcher(data);
        //打印结果
        while (matcher.find()){
            System.out.println("matcher.group() = " + matcher.group());
            System.out.println("matcher.group() = " + matcher.group(1));
        }
    }
}
