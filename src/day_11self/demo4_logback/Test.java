package day_11self.demo4_logback;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    public static final Logger LOGGER = LoggerFactory.getLogger("Test");
    public static void main(String[] args) {
        LOGGER.info("开始计算啦");
        try {
            divide(10,0);
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
        LOGGER.info("可能会有错");
    }

    public static void divide(int a,int b){
        LOGGER.info("方法被调用");
        int res = a/b;
        LOGGER.info("方法使用完毕");
    }
}
