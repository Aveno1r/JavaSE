package day_14.demo14_动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        /*
            Proxy类:
                public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h);
                    功能: 为对象创建一个代理对象
                    参数1: 用于指定用哪个类加载器，去加载生成的代理类
                    参数2: 指定接口，这些接口用于指定生成的代理长什么，也就是有哪些方法
                    参数3: 用来指定生成的代理对象要干什么事情
         */
        // 创建杨超越大明星对象
        BigStar bigStar = new BigStar("杨超越");

        // 获取被代理类的类加载器
        ClassLoader classLoader = bigStar.getClass().getClassLoader();

        // 创建接口类型的字节码数组
        Class[] interfaces = {Star.class};
        //Class<?>[] interfaces1 = bigStar.getClass().getInterfaces();

        // 使用Proxy类的newProxyInstance方法为杨超越大明星对象创建代理对象---动态代理
        Star proxy = (Star) Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // 功能: 回调方法---只有代理对象调用方法就会来到这里执行
                // 参数1: 表示代理对象,慎用
                // 参数2: 表示代理对象调用的方法
                // 参数3: 表示代理对象调用方法时传入的实际参数
                // 返回值:  表示代理对象调用方法的返回值
                // 指定生成的代理对象要干什么事情
                // 判断代理对象调用的方法
                if (method.getName().equals("sing")) {
                    // 代理要准备话筒,收钱
                    System.out.println("代理准备话筒,收钱...");
                    // 叫杨超越过来唱歌---执行杨超越的唱歌方法---反射执行
                } else if (method.getName().equals("dance")) {
                    // 代理要准备场地,收钱
                    System.out.println("代理准备场地,收钱...");
                    // 叫杨超越过来跳舞
                }
                // 执行被代理对象中的同名方法
                Object res = method.invoke(bigStar, args);
                return res;
            }
        });

        // 使用代理对象
        String res = proxy.sing("恭喜发财");
        System.out.println("res = " + res);

        System.out.println("----------------------");

        proxy.dance();

        System.out.println("----------------------");

        // 获取杨超越的信息
        String msg = proxy.toString();
        System.out.println("msg = " + msg);
    }
}
