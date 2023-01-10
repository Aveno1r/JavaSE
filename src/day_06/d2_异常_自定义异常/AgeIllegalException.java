package day_06.d2_异常_自定义异常;
//运行时异常
//public class AgeIllegaException extends RuntimeException {
//编译时异常
public class AgeIllegalException extends Exception {
    public AgeIllegalException(String message){
        super(message);
    }
}
