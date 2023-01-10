package day_03.d11_常用API_Object_重写方法;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //省略get/set 这里避免内容过长,所以暂时省略get/set不写。自己可以写上。

    //重写toString，返回对象的内容
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //重写equal 为了让对象,按照内容作比较

    //@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

   /* public boolean equals(Object o ){//this(调用当前方法的对象) vs  o(传入的对象)
        //比较地址值,假如地址值是一样的,表示是同一个对象。
        if (this==o){
            return true;
        }
        //传进来的o是null，或者this和o的类型不一样。直接返回false

        //if (o==null|| !(o instanceof Student))
        if (o==null|| this.getClass()!=o.getClass()){
            return false;
        }

        Student s= (Student) o;
        //if (this.name.equals(s.name) && this.age==s.age){
        //    return true;
        //}else{
        //    return false;
        //}
        //name=null  null.equals(xxx)
        return this.name.equals(s.name) && this.age==s.age;
    }*/
}
