package day_02.d10接口_练习;

import java.util.ArrayList;

public class StudentOperator1 implements StudentOperator {
    @Override
    public void printAllInfo(ArrayList<Student> array) {
        //遍历集合
        for (int i = 0; i < array.size(); i++) {
            //获取每一个学生对象
            Student stu = array.get(i);
            System.out.println("姓名:" + stu.getName() + "，性别:" + stu.getSex() + "，成绩:" + stu.getScore());
        }
    }

    @Override
    public void printAverageScore(ArrayList<Student> array) {
        //1.计算总分
        double sum = 0;
        //遍历集合
        for (int i = 0; i < array.size(); i++) {
            //获取每一个学生
            Student stu = array.get(i);
            //累加每一个学生的成绩
            sum += stu.getScore();
        }

        //2.计算平局分 总分/总人数
        double avg = sum / array.size();

        System.out.println("全班的平局分是:" + avg);

    }
}
