package day_02.d10接口_练习;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassManager {
    private ArrayList<Student> array = new ArrayList<>();
    //private StudentOperator so = new StudentOperator1();
    private StudentOperator so = new StudentOperator2();


    public ClassManager() {
        array.add(new Student("张三", '男', 99));
        array.add(new Student("李四", '男', 98.5));
        array.add(new Student("王五", '女', 96));
        array.add(new Student("赵六", '男', 99));
        array.add(new Student("孙七", '女', 88.88));
        array.add(new Student("王八", '男', 99));
    }

    public void start() {
        while (true) {
            System.out.println("1.打印所有学员信息");
            System.out.println("2.打印所有学员平均成绩");

            Scanner sc = new Scanner(System.in);
            System.out.println("请选择");
            int choose = sc.nextInt();

            switch (choose) {
                case 1:
                    so.printAllInfo(array);
                    break;
                case 2:
                    so.printAverageScore(array);
                    break;
                default:
                    System.out.println("您输入的选项有误");
            }
        }
    }
}
