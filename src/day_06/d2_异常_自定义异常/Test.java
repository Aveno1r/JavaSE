package day_06.d2_异常_自定义异常;

public class Test {
    public static void main(String[] args) /*throws AgeIllegalException*/{
        int age = -1;
        try {
            checkAge(age);
        }catch (AgeIllegalException e){
            e.printStackTrace();
        }


        System.out.println("over");
    }

    //不用异常的处理办法
    //1.不具备问题的传递性  2.如果出了问题,只能以输出语句的形式提示，异常是可以将问题直接打印到控制台
    //public static void checkAge(int age) {
    //    if (age < 0 || age > 200) {
    //        System.out.println("您提供的年龄有误...");
    //    }
    //}
    public static void checkAge(int age) throws AgeIllegalException {
        if (age < 0 || age > 200) {
            //产生异常
            throw new AgeIllegalException("年龄异常...");
        }
    }
}
