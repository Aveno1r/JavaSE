package day_05self.方法引用;

public class CompareDate {
    public static int CompareAge(Student o1,Student o2){
        return o1.getAge() - o2.getAge();
    }

    public int CompareAge1(Student o1,Student o2){
        return o1.getAge() - o2.getAge();
    }
}
