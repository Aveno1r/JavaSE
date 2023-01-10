package day_03.d6_泛型接口;

public class TeacherDate implements MyDate<Teacher> {
    @Override
    public void showDate(Teacher teacher) {
        System.out.println("show teacher");
    }
}
