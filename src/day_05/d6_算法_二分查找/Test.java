package day_05.d6_算法_二分查找;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //准备一个数据有序的数组
        int[] arr = {7, 23, 79, 81, 127, 131, 147};

        //表示要查找的元素的变量
        System.out.println("请输入您要查找的数值:");
        int findNumber = new Scanner(System.in).nextInt();


        int index = findIndex(findNumber, arr);


        //根据查找的结果,给出提示
        if (index == -1) {
            System.out.println("没找到");
        } else {
            System.out.println(findNumber + "在数组的第" + (index + 1) + "个位置");
        }
    }

    public static int findIndex(int findNumber,int[] arr){
        //定义表示左右两个索引位置的变量 初始值:left=最小索引  right=最大索引
        int left = 0;
        int right = arr.length - 1;
        //定义表示最终查找到的位置的变量 (取负值,将来如果没有找到,index的值就是一个负数,而索引不可能为负数,可以用来表示没找到)
        int index = -1;


        //如果,left<=right情况下,开始查找数组中的元素是否存在
        //由于如果没有找到,需要重复执行计算中间位置,查找具体元素位置的操作,将上面判断操作,修改为一个while循环。
        while (left <= right) {
            //通过left和right的值,计算出中间索引位置
            int mid = (left + right) / 2;
            //通过中间索引位置的值,与要查找的元素作比较
            if (findNumber > arr[mid]) {
                //情况1:要查找的元素,比中间位置的元素大,往右边找,让left=mid+1
                left = mid + 1;
            } else if (findNumber < arr[mid]) {
                //情况2:要查找的元素,比中间位置的元素小,往左边找,让right=mid-1
                right = mid - 1;
            } else {
                //情况3:要查找的元素,与中间位置元素相同,该位置就是要找的位置,记录mid的值
                index = mid;
                //如果找到了,不需要在找了,结束循环
                break;
            }

            //如果,没有找到,需要根据新的左右位置,重新执行上述操作。
        }

        return index;
    }
}
