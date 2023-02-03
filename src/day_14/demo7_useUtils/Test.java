package day_14.demo7_useUtils;


import day_14.demo6_utils.Utils;

public class Test {
    public static void main(String[] args) throws Exception {
        Student stu = new Student("柳岩", 40, '女', 167.5, "男星");
        Utils.writeObjectAttributeAndValueToTxt(stu);

        Teacher t = new Teacher("播妞", 6000);
        Utils.writeObjectAttributeAndValueToTxt(t);
    }
}
