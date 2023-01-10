package day_04.d14Api_Arrays;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class Test {
    public static void main(String[] args) {
        //public static String toString(类型[] arr)	返回数组的内容
        int[] arr ={10,20,30,40,50,60};
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        //public static int[] copyOfRange(类型[] arr, 起始索引, 结束索引) 	拷贝数组（指定范围）
        //获取数组前三个元素
        int[] arr2 = Arrays.copyOfRange(arr, 0, 3);//范围包左不包右
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));

        //public static copyOf(类型[] arr, int newLength)	拷贝数组  newLength指定是新数组的长度
        //拷贝前三个元素
        int[] arr3 = Arrays.copyOf(arr, 10);//新数组长度大于原来的数组 拷贝所有数据
        System.out.println("Arrays.toString(arr3) = " + Arrays.toString(arr3));
        int[] arr4 = Arrays.copyOf(arr, 3);//新数组长度小于原来的数组  从第1个开始,拷贝新数组长度个数据
        System.out.println("Arrays.toString(arr4) = " + Arrays.toString(arr4));

        //public static setAll(double[] array, IntToDoubleFunction generator)	把数组中的原数据改为新数据
        // setAll方法用于修改数组中原有的值
        // 原理: setAll方法底层,会去遍历数组,将每个元素的索引传给  IntToDoubleFunction中的applyAsDouble方法的形参value
        // IntToDoubleFunction中的applyAsDouble方法返回的值,会替换对应位置原有的值。
        double[] scores={98.5,120,95};
        System.out.println("Arrays.toString(scores) = " + Arrays.toString(scores));
        //public interface IntToDoubleFunction{ double applyAsDouble(int value); }
        IntToDoubleFunction fun = new IntToDoubleFunction(){
            @Override
            public double applyAsDouble(int value) {
                //System.out.println("value = " + value);
                //value代表数组的索引

                //返回的值,会通过setAll方法,替换原有位置的值
                return scores[value]*0.85;
            }
        };
        Arrays.setAll(scores,fun);

        System.out.println("Arrays.toString(scores) = " + Arrays.toString(scores));

        //public static void sort(类型[] arr)	对数组进行排序(默认是升序排序)
        int[] arr5 ={50,60,30,40,10,20};
        System.out.println("排序前: = " + Arrays.toString(arr5));
        Arrays.sort(arr5);
        System.out.println("排序后: = " + Arrays.toString(arr5));
    }
}
