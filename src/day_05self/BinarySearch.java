package day_05self;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        //准备一个数据有序的数组
        int[] arr = {7, 23, 79, 81, 127, 131, 147};

        int left = 0;
        int right = arr.length - 1;
        System.out.println("请输入您要查找的数值:");
        int targetNum = new Scanner(System.in).nextInt();
        int index = -1;

        while(left <= right){
            int mid = (left + right)/2;
            if (targetNum > arr[mid]){
                left = mid + 1;
            }else if(targetNum < arr[mid]){
                right = mid - 1;
            }else{
                index = mid;
                break;
            }
        }
        if (index == -1) {
            System.out.println("没找到");
        } else {
            System.out.println(targetNum + "在数组的第" + (index + 1) + "个位置");
        }
    }
}
