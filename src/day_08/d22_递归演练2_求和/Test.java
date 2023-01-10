package day_08.d22_递归演练2_求和;

public class Test {
    public static void main(String[] args) {
        //需求:求1~n的和
        //规律:f(n)=f(n-1)+n
        //出口:f(1)=1;
        System.out.println("f(5) = " + f(5));
    }

    public static int f(int n) {
        if (n == 1) {
            return 1;
        }

        return f(n-1)+n;
    }
}
