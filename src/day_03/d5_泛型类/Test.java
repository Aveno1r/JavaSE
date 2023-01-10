package day_03.d5_泛型类;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("abc");
        //list.add(true);//error

        String s = list.get(0);
        System.out.println(s);
    }
}
