package day_05.d12_正则表达式_应用案例_过滤数据;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String data = "来黑马程序员学习Java，\n" +
                    "电话：1866668888，18699997777\n" +
                    "或者联系邮箱：boniu@itcast.cn，\n" +
                    "座机电话：01036517895，010-98951256\n" +
                    "邮箱：bozai@itcast.cn，\n" +
                    "邮箱2：dlei0009@163.com，\n" +
                    "热线电话：400-618-9090 ，400-618-4000，4006184000，4006189090";

        //过滤数据
        //String regex ="(电话号码规则)|(热线电话规则)|(邮箱规则)...";
        String regex="(1[3-9]\\d{9})|(0\\d{2,5}-?\\d{5,15})|(400-?618-?\\d{4})|(\\w{2,}@\\w{2,20}(\\.\\w{2,}){1,2})";

        //获取过滤规则对象
        Pattern pattern = Pattern.compile(regex);
        //通过matcher方法,获取结果集Matcher
        Matcher matcher = pattern.matcher(data);
        //find判断是否过滤到数据,有数据返回true
        //group()获取结果集中所有组的数据
        while (matcher.find()){
            System.out.println("matcher.group() = " + matcher.group());
        }
    }
}
