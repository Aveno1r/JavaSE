package day_14self.demo1_单元测试;

import org.junit.Test;

public class test {
    public static void main(String[] args) {

        deleteStudent();

        updateStudent();

        addStudent();

        findAllStudent();
    }
    @Test
    public static void deleteStudent(){
        System.out.println("删除学生");
    }
    @Test
    public static void updateStudent(){
        System.out.println("删除学生");
    }
    @Test
    public static void addStudent(){
        System.out.println("添加学生");
    }
    @Test
    public static void findAllStudent(){
        System.out.println("查询所有学生信息");
    }
}

