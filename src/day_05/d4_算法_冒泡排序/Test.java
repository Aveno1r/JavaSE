package day_05.d4_算法_冒泡排序;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //冒泡排序:每一轮,相邻元素两两比较,将最大值放到后面。
        //每一轮,都会得出一个较大值,该较大值不参与下一轮的比较。

        //重点:比较的轮数=元素个数-1
        //重点:每轮比较的范围,随着轮数的增加,而减少  但是每一轮从从第0个索引位置开始

        int[] arr = {5,2,3,1};

        //控制比较的轮数  arr.length-1是因为比较的次数比元素的个数少1次。
        for (int i = 0; i < arr.length-1; i++) {
            //System.out.println("i ========================= " + i);
            //每一轮的比较
            //为了避免j+1的值超出索引的范围,所以需要arr.length-1
            //为了让比较的范围随着轮数的增加而减少,所以需要arr.length-i
            for (int j = 0; j < arr.length-1-i; j++) {
                //比较的元素位置 j  和  j+1
                //System.out.println("j = " + j);
                //如果j的位置的元素,比j+1位置元素大,交换元素位置
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];//用一个临时变量记录前面的元素
                    arr[j]=arr[j+1];//把后面的元素放到前面的位置
                    arr[j+1]=temp;//把记录的前面位置的元素,放到了后面
                }
            }
        }

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
