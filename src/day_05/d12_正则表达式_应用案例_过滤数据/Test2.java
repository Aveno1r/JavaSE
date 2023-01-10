package day_05.d12_正则表达式_应用案例_过滤数据;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {
    public static void main(String[] args) {
        //过滤出所有邮箱的用户名  boniu@itcast.cn-> boniu

        String data = "来黑马程序员学习Java，\n" +
                "电话：1866668888，18699997777\n" +
                "或者联系邮箱：boniu@itcast.cn，\n" +
                "座机电话：01036517895，010-98951256\n" +
                "邮箱：bozai@itcast.cn，\n" +
                "邮箱2：dlei0009@163.com，\n" +
                "热线电话：400-618-9090 ，400-618-4000，4006184000，4006189090";

        //定义过滤规则
        String regex="(\\w{2,})@\\w{2,20}(\\.\\w{2,}){1,2}";

        //获取过滤对象
        Pattern pattern = Pattern.compile(regex);
        //获取数据结果集
        Matcher matcher = pattern.matcher(data);
        //打印所有数据
        while (matcher.find()){
            System.out.println("matcher.group() = " + matcher.group(1));
        }
    }


}
