package day_05.d11_正则表达式_应用案例_校验数据;

public class Test {
    public static void main(String[] args) {
        //电话：
        //    手机13811112222 首位不能是0,第2位不能是0-2,之后跟9位任意数值
        //    座机:010233233，020-3212323 首位必须是0,前三位区号,横杠可有可无,之后跟6-8位座机号码

        //String regex1 ="[1-9][3-9]\\d{9}";
        //String regex2 ="0[0-9]{2}-?\\d{6,8}";
        //String regex ="[1-9][3-9]\\d{9} | 0[0-9]{2}-?\\d{6,8}";//错误的  13123456789 | 131011-1234567
        //分组
        String regex = "([1-9][3-9]\\d{9})|(0[0-9]{2}-?\\d{6,8})";//错误的  13123456789 | 131011-1234567
        System.out.println("\"13811112222\".matches(regex) = " + "13811112222".matches(regex));
        System.out.println("\"010233233\".matches(regex) = " + "010233233".matches(regex));
        System.out.println("\"131011-1234567\".matches(regex) = " + "131011-1234567".matches(regex));


        //邮箱：dlei@163.com，dlei@gmail.com，dlei@gmail.com.cn
        //    @符号必带    @符号前由最少两位字母组成 @符号后面由2-20位字字符组成
        //    之后跟点   点的后面跟域名,域名至少为2位字符 且个别邮箱可以跟两组域名
        //分组
        String regex2 = "[\\w&&[^_]]{2,}@\\w{2,20}(\\.\\w{2,}){1,2}";
        System.out.println("\"dlei@163.com\".matches(regex2) = " + "_dlei@163.com".matches(regex2));
        System.out.println("\"dlei@gmail.com.cn\".matches(regex2) = " + "dlei@gmail.com.cn".matches(regex2));
        System.out.println("\"dlei@gmail.com.cn.\".matches(regex2) = " + "dlei@gmail.com.cn.".matches(regex2));
    }
}
