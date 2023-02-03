package day_14self.demo3_断言;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    @Test
    public void testPrintNumber(){
        StringUtil.printNumber("admin");
        StringUtil.printNumber(null);
    }


    @Test
    public void testGetMaxIndex() {
        int index1 = StringUtil.getMaxIndex(null);
        System.out.println("index1 = " + index1);

        int index2 = StringUtil.getMaxIndex("admin");
        System.out.println("index2 = " + index2);

        Assert.assertEquals("测试方法有BUG",4,index2);
    }
}
