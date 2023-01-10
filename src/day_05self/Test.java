package day_05self;

import day_05.d1_lambda入门.Swiming;

public class Test {
    public static void main(String[] args) {
//        Swimming swimming = new Swimming(){
//
//            @Override
//            public void swim() {
//                System.out.println("🏊‍");
//            }
//        };
//       go(swimming);

        //Lambda表达式
        Swimming swimming = ()->{System.out.println("🏊‍");};
        go(swimming);
    }

    public static void go(Swimming swimming){
            swimming.swim();
    }
}
