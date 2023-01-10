package day_05.d2_lambda省略格式;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntToDoubleFunction;

public class Test2 {
    public static void main(String[] args) {
        /*
        1.小括号中的数据类型可以省略
        2.如果小括号中只有1个参数,小括号可以省略
        3.如果方法体中只有1句代码,大括号和分号可以一起省略,如果这一句代码含return的,return必须一并省略
         */

        //method1();


        method2();

    }
    public static void method1() {
        double[] scores = {98.8, 128.8, 100.0};
        //使用Lambda表达式简化
        //IntToDoubleFunction fun =(int value)->{ return scores[value] * 0.85;};
        IntToDoubleFunction fun = value-> scores[value] * 0.85;
        Arrays.setAll(scores,fun);

        System.out.println("Arrays.toString(scores) = " + Arrays.toString(scores));
    }
    public static void method2() {
        Double[] scores = {98.8, 128.8, 100.0};
        //lambda表达式
        //Comparator<Double> c =(Double o1, Double o2)->{return (int)(o1-o2);};
        Comparator<Double> c =( o1,  o2)-> (int)(o1-o2);
        Arrays.sort(scores,c);
        System.out.println("Arrays.toString(scores) = " + Arrays.toString(scores));
    }


}
