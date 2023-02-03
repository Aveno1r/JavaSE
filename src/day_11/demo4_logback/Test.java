package day_11.demo4_logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {

    // 静态的成员变量---创建记录日志信息的对象Logger
    public static final Logger LOGGER = LoggerFactory.getLogger("Test");

    public static void main(String[] args) {
        //while (true) {
            try {
                LOGGER.info("开始调用chu的方法...");
                //chu(10, 2);
                chu(10, 0);
                LOGGER.info("调用chu的方法完毕...");
            } catch (Exception e) {
                // 记录日志
                LOGGER.error(e.getMessage());
            }
        //}



    }

    public static void chu(int a, int b) {
        LOGGER.debug("参数a的值是:" + a);
        LOGGER.debug("参数b的值是:" + b);
        int res = a / b;
        LOGGER.info("运行结果是:" + res);
    }
}
