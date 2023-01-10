package day_07.d9_可变参数;

public class Test {
    public static void main(String[] args) {
        //注意:
        //   1.可变参数只能有1个
        //   2.可变参数必须在形参的最后面
        //定义一个方法,计算"若干"个数值的和
        System.out.println("getSum() = " + getSum());//提交了一个长度为0的数组
        System.out.println("getSum(1) = " + getSum(1));
        System.out.println("getSum(1,2,3) = " + getSum(1, 2, 3));

    }

    //public static int getSum(int a,int b){
    //    return a+b;
    //}
    //public static int getSum(int a,int b,int c){
    //    return a+b+c;
    //}

    //使用的时候,必须先准备一个数组,为了调用方式时，接收数据的,更佳的方便,设计了一种方式叫做可变参数。
    //public static int getSum(int[] arr) {
    //    int sum = 0;
    //    for (int i = 0; i < arr.length; i++) {
    //        sum += arr[i];
    //    }
    //    return sum;
    //}

    //可变参数,本质就是一个数组。不同于数组的是,可以直接将若干数据提交给可变数组
    public static int getSum(int...arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    //如果有多个可变参数,后面的可变参数,无法接收到数据
    //public static int getSum2(int...arr,int...arr2) {
    //如果可变参数布置最后一个形参,导致后面的形参,无法接收到数据
    //public static int getSum2(int...arr,int i) {
    //   return 0;
    //}
}
