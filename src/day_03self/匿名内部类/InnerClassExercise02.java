package day_03self.匿名内部类;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        new Cellphone().alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });


    }

}

interface Bell{
     void ring();
}

class Cellphone{
    public void alarmclock(Bell bell){
        bell.ring();
    }
}