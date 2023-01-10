package day_05self;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntToDoubleFunction;

public class Test2 {
    public static void main(String[] args) {
        Double[] scores = {98.8, 128.8, 100.0};

//        method1(scores);

//        Comparator<Double> comparator = new Comparator<Double>(){
//            @Override
//            public int compare(Double o1, Double o2) {
//                return (int) (o1-o2);
//            }
//        };

        Comparator<Double> comparator = (Double o1,Double o2) -> {return (int)(o1-o2);};
        Arrays.sort(scores,comparator);
        System.out.println("Arrays.toString(scores) = " + Arrays.toString(scores));

        //省略写法
        Comparator<Double> comparator1 = ( o1, o2) -> (int)(o1-o2);
        Arrays.sort(scores,comparator1);
        System.out.println("Arrays.toString(scores) = " + Arrays.toString(scores));
    }

    private static void method1(double[] scores) {
        //匿名内部类
        //        IntToDoubleFunction fun = new IntToDoubleFunction() {
        //            @Override
        //            public double applyAsDouble(int value) {
        //                return scores[value] * 0.85;
        //            }
        //        };
        //Lambda写法
        IntToDoubleFunction fun = (int value) -> {return scores[value] * 0.85;};
        //简略格式
        IntToDoubleFunction fun1 = (value) -> scores[value] * 0.85;
        Arrays.setAll(scores,fun);
        System.out.println("scores.toString() = " + Arrays.toString(scores));
    }
}
