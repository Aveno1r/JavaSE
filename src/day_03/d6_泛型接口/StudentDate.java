package day_03.d6_泛型接口;

public class StudentDate implements MyDate<Student> {
    @Override
    public void showDate(Student student) {
        System.out.println("show student");
    }
}
