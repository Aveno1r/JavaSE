package day_03.d13_常用API_Objects;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        //Objects中提供了大量的空指针安全或容忍空指针的方法。

        Student s = new Student("张三", 18);
        Student s2 = new Student("张三", 18);
        System.out.println("s.equals(s2) = " + s.equals(s2));
        Student s3 = new Student();//name=null age=0
        System.out.println("s3.equals(s) = " + s3.equals(s));
        System.out.println("---------");

        //Objects中的方法
        //public static boolean equals(Object a, Object b)
        System.out.println("s.equals(s2) = " + s.equals(s2));
        System.out.println("Objects.equals(s,s2) = " + Objects.equals(s, s2));

        //public static boolean isNull(Object obj)
        System.out.println("(s==null) = " + (s == null));
        System.out.println("Objects.isNull(s) = " + Objects.isNull(s));


        //public static boolean nonNull(Object obj)
        System.out.println("(s!=null) = " + (s != null));
        System.out.println("Objects.nonNull(s) = " + Objects.nonNull(s));
    }
}
