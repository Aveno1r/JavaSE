package day_14self.demo7_反射获取成员变量;


import java.lang.reflect.Field;

public class TestClass {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<Cat> cat = Cat.class;
        Field[] fields = cat.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field.getName() + "--->" + field.getType());
        }

        Field name = cat.getDeclaredField("name");
        System.out.println(name.getName() + "--->" + name.getType());
        Field age = cat.getDeclaredField("age");
        System.out.println(age.getName() + "--->" + age.getType());

        Cat cat1 = new Cat();
        name.setAccessible(true);
        name.set(cat1,"加菲猫");
        age.setAccessible(true);
        age.set(cat1,22);
        System.out.println(cat1);

        String catName = (String) name.get(cat1);
        int catAge = (int) age.get(cat1);
        System.out.println("名字:" + catName + "\r\n" + "年龄:" + catAge);
    }
}
