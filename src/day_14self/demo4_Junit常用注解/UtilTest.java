package day_14self.demo4_Junit常用注解;

import day_14self.demo3_断言.StringUtil;
import org.junit.*;
import org.junit.Test;

public class UtilTest {
    @Before
    public void test1(){
        System.out.println("test1 Before执行");
    }

    @BeforeClass
    public static void test11(){
        System.out.println("test11 BeforeClass执行");
    }

    @After
    public void test2(){
        System.out.println("test2 After执行");
    }

    @AfterClass
    public static void test22(){
        System.out.println("test22 AfterClass执行");
    }
    @org.junit.Test
    public void testPrintNumber(){
        StringUtil.printNumber("admin");

    }


    @Test
    public void testGetMaxIndex() {
//        int index1 = StringUtil.getMaxIndex(null);
//        System.out.println("index1 = " + index1);

        int index2 = StringUtil.getMaxIndex("admin");
        System.out.println("index2 = " + index2);

//        Assert.assertEquals("测试方法有BUG",4,index2);
    }
}
