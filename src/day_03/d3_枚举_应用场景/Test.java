package day_03.d3_枚举_应用场景;

public class Test {
    public static void main(String[] args) {
        //定义一个方法,判断是男还是女,如果是男,推荐男生喜欢阅读的内容,如果是女生，推荐女生喜欢阅读的内容
        //read("男");
        //read("boy");
        //read("难");
        //read("女");
        read(Sex.BOY);
        read(Sex.GIRL);
    }

    //public static void read(String sex) {
    //    if (sex.equals("男")) {
    //        System.out.println("推荐男生喜欢阅读的内容");
    //    } else if (sex.equals("女")) {
    //        System.out.println("推荐女生喜欢阅读的内容");
    //    } else {
    //        System.out.println("啥也不是");
    //    }
    //
    //}
    public static void read(Sex sex){

        switch (sex){
            case BOY:
                System.out.println("推荐男生喜欢阅读的内容");
                break;
            case GIRL:
                System.out.println("推荐女生喜欢阅读的内容");
                break;
            default:
                System.out.println("啥也不是");
        }
    }
}
