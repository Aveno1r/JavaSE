package day_05.d1_lambda入门;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntToDoubleFunction;

public class Test2 {
    public static void main(String[] args) {
        //Arrays.setAll(数组,修改数组原始数据规则接口)    setAll(double[] array, IntToDoubleFunction generator)
        //Arrays.sort(数组,指定排序规则接口)      sort(T[] a, Comparator<? super T> c)
        //IntToDoubleFunction和Comparator 都是函数式接口

        //method1();


        method2();

    }

    public static void method2() {
        Double[] scores = {98.8, 128.8, 100.0};
        //Comparator<Double> c = new Comparator<Double>(){
        //
        //    @Override
        //    public int compare(Double o1, Double o2) {
        //        return (int)(o1-o2);
        //    }
        //};
        //lambda表达式
        Comparator<Double> c =(Double o1, Double o2)->{return (int)(o1-o2);};
        Arrays.sort(scores,c);
        System.out.println("Arrays.toString(scores) = " + Arrays.toString(scores));
    }

    public static void method1() {
        double[] scores = {98.8, 128.8, 100.0};
        //IntToDoubleFunction fun = new IntToDoubleFunction() {
        //
        //    @Override
        //    public double applyAsDouble(int value) {
        //        //让数组中的数变量为原来的0.85倍
        //        return scores[value] * 0.85;
        //    }
        //};
        //使用Lambda表达式简化
        IntToDoubleFunction fun =(int value)->{ return scores[value] * 0.85;};
        Arrays.setAll(scores,fun);

        System.out.println("Arrays.toString(scores) = " + Arrays.toString(scores));
    }
}
