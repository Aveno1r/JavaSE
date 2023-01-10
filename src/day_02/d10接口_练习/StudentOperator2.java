package day_02.d10接口_练习;

import java.util.ArrayList;

public class StudentOperator2 implements StudentOperator {
    @Override
    public void printAllInfo(ArrayList<Student> array) {
        int boyCount = 0;
        int girlCount = 0;
        //遍历集合
        for (int i = 0; i < array.size(); i++) {

            //获取每一个学生对象
            Student stu = array.get(i);
            System.out.println("姓名:" + stu.getName() + "，性别:" + stu.getSex() + "，成绩:" + stu.getScore());

            //统计男生和女士的个数
            if (stu.getSex() == '男') {
                boyCount++;
            } else {
                girlCount++;
            }
        }

        //打印男生和女士的个数
        System.out.println("男生有:" + boyCount + ",女生有:" + girlCount);
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
        //2.计算最高分
        double max = array.get(0).getScore();
        for (int i = 1; i < array.size(); i++) {
            //获取每一个学生
            Student stu = array.get(i);
            if (stu.getScore() > max) {
                max = stu.getScore();
            }
        }
        //3.计算最低分
        double min = array.get(0).getScore();
        for (int i = 1; i < array.size(); i++) {
            //获取每一个学生
            Student stu = array.get(i);
            if (stu.getScore() < min) {
                min = stu.getScore();
            }
        }
        //4.计算平局分 (总分-最高分-最低分)/(总人数-2)
        double avg = (sum - max - min) / (array.size() - 2);

        System.out.println("全班的平局分是:" + avg);

    }
}
