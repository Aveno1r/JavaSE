package day_14.demo1_Junit;

import org.junit.*;

public class TestDemo {

    /*
        使用Junit单元测试:
            1.导入junit框架到项目中
            2.编写测试方法--->公共,无参,无返回值的方法
            3.在测试方法声明之上写上@Test注解,然后alt+回车,选择添加junit4
            4.运行测试方法,绿色表示测试成功,红色表示测试失败
     */
    // 编写一个测试方法
    @Test
    public void test1(){
        System.out.println("test1...");
        //System.out.println(1/0);
    }

    @Test
    public void test2(){
        System.out.println("test2...");
    }

    public void test3(){
        System.out.println("test3...");
    }

    @Before   // 用来修饰一个实例方法，该方法会在每一个测试方法执行之前执行一次
    public void beforeMethod(){
        System.out.println("beforeMethod...");
    }

    @After // 用来修饰一个实例方法，该方法会在每一个测试方法执行之后执行一次
    public void afterMethod(){
        System.out.println("afterMethod...");
    }

    @BeforeClass // 用来修饰一个静态方法，该方法会在所有测试方法和@Before修饰方法之前只执行一次。
    public static void beforeClassMethod(){
        System.out.println("beforeClassMethod...");
    }

    @AfterClass // 用来修饰一个静态方法，该方法会在所有测试方法之后只执行一次。
    public static void afterClassMethod(){
        System.out.println("afterClassMethod...");
    }


    /*
        Junit断言: 预判
             public static void assertEquals(String message, long expected, long actual) ;
                参数1: 错误信息
                参数2: 期望的值
                参数3: 实际的值
                如果期望的值和实际的值不相同,就会报AssertionError错误,否则就正常运行
     */
    @Test
    public void testGetSum(){
        // 调用隔壁哥们写的getSum方法,得到结果
        int sum = getSum(10, 20);

        // 预判:
        Assert.assertEquals("计算结果有问题",30,sum);
        //Assert.assertEquals(30,sum);

        // 使用结果继续运算---比较复杂的业务,中间有1000行代码


        // 显示结果
        System.out.println("sum * 10 = " + sum * 10);



    }


    // 方法里面也有1000行代码---比较复杂的算法
    public int getSum(int num1,int num2){
        return num1 * num2;
    }

}
