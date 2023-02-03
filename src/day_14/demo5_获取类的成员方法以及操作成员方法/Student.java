package day_14.demo5_获取类的成员方法以及操作成员方法;

public class Student {
    public void show(){
        System.out.println("show方法,无参无返回值...");
    }

    public int show(String str,double numD){
        System.out.println("show方法,有参有返回值...str:"+str+",numD:"+numD);
        return 100;
    }

    private void show3(){
        System.out.println("private show3方法...");
    }

    public static String show4(double numD,int num){
        System.out.println("静态方法 show4...");
        return "java";
    }
}
