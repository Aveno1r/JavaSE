package day_05.d5_算法_选择排序;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //选择排序:从第1个元素开始,与后面的每个元素作比较,将较大的值放到后面,较小的值放到前面
        //每一轮,确定出来一个新的较小值,该较小值不再参与下一轮的比较

        //关键:每一轮,要比较的位置,随着轮数向后移动
        //关键:每一轮比较结束范围不变,开始比较的范围,是从要比较的位置的下一个位置开始的。

        int[] arr = {5, 1, 3, 2};

        //控制比较的轮数  轮数=数组元素个数-1
        for (int i = 0; i < arr.length - 1; i++) {
            //System.out.println("i ================== " + i);
            //每一轮的比较
            //由于比较的位置每一轮,是从轮数的下一个开始的,所以
            for (int j = i+1; j < arr.length; j++) {
                //比较的两个位置 i 和 j
                //System.out.println("j = " + j);
                //比较i和j两个位置的元素,如果i的位置的值比j的位置的值大，交换位置
               if (arr[i]>arr[j]){
                   int temp =arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
            }
        }

        //打印排序后的结果
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
