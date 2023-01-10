package day_05.d3_方法引用;

public class CompareDate {
    public static int compare1(Student o1, Student o2) {
        //升序比较
        return o1.getAge() - o2.getAge();
    }

    public int compare2(Student o1, Student o2) {
        //升序比较
        return o1.getAge() - o2.getAge();
    }
}
