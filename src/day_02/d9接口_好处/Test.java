package day_02.d9接口_好处;

public class Test {
}

interface Mi1 {
}

interface Mi2 {
}

class Fu {
}

//好处:避免了单继承的局限性
//继承并实现
class Zi extends Fu implements Mi1, Mi2 {
}

//多实现
class Zi2 implements Mi1, Mi2 {
}

//单实现
class Zi3 implements Mi1 {
}