package day_08.d21_递归演练1_求阶乘;

public class Test {
    public static void main(String[] args) {
        //求1~n的阶乘
        //1.规律  f(n)=f(n-1)*n
        //2.出口  f(1)=1
        System.out.println("f(5) = " + f(5));
    }

    //求1~n阶乘
    public static int f(int n) {
        //n等于1,返回1
        if (n == 1) {
            return 1;
        }

        //n不等于1  计算规则:f(n)=f(n-1)*n
        return f(n - 1) * n;
    }

}
