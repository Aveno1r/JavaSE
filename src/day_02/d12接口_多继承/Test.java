package day_02.d12接口_多继承;

public class Test {
}

interface Mi1{
    public default  void print1(){}
}
interface Mi2{
    public default  void print2(){}
}
interface Mi3 extends Mi1,Mi2{
    //继承了两个方法
}

class MiImpl implements Mi3{}