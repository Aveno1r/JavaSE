package day_02.d3_多态_类型转换;

public class Test {
    public static void main(String[] args) {
        //向上转型:自动类型转换
        //Fu f = new Zi();
        Fu f= new Zi2();//java.lang.ClassCastException:  Zi2 cannot be cast to Zi
        //向下转型:强制类型转换
        Zi z = (Zi) f;

        Student s = new Student();
        Teacher t = new Teacher();

        show(s);//People p=s=new Student();
        show(t);
    }


    //利用多态,使用父类类型接收不同的子类对象,减少方法的书写。
    public static void show(People p) {
        p.run();
        //想要调用学生的特有功能,需要将p转换为学生类型
        //判断p变量对应的对象   是否是指定的类型
        if (p instanceof Student) {
            Student s = (Student) p;
            s.study();
        } else if (p instanceof Teacher) {
            //想要调用老师的特有功能,需要将p转换为老师类型
            Teacher t = (Teacher) p;
            t.teach();
        }

    }
}


class Fu {
}

class Zi extends Fu {
}

class Zi2 extends Fu {
}