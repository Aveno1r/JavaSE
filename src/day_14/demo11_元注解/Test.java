package day_14.demo11_元注解;

@MyAnnotation
public class Test {
    @MyAnnotation
    int num;

    @MyAnnotation
    public void show(@MyAnnotation int b){
        @MyAnnotation
        int a;
    }

    public static void main(String[] args) {

    }
}
