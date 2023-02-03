package day_14.demo15_使用代理优化管理类;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Exception {
        // 需求:为UserServiceImpl类创建一个代理对象---让代理对象来测试程序的性能
        // 创建UserServiceImpl的对象
        UserServiceImpl userService = new UserServiceImpl();

        // 获取类加载器
        ClassLoader classLoader = userService.getClass().getClassLoader();
        // 指定接口
        Class[] interfaces = {UserService.class};
        // 为userService创建一个代理对象
        UserService proxy = (UserService) Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // 只要代理对象调用方法就会来到这里执行
                // 在这里指定代理要做的事情
                if (method.getName().equals("login") || method.getName().equals("deleteUsers") || method.getName().equals("selectUsers")) {
                    long time1 = System.currentTimeMillis();
                    // 执行被代理对象的login方法
                    Object res = method.invoke(userService, args);

                    long time2 = System.currentTimeMillis();
                    System.out.println(method.getName() + "方法耗时：" + (time2 - time1));
                    return res;
                }

                Object res = method.invoke(userService, args);
                return res;
            }
        });

        // 吩咐代理做事情
        proxy.login("admin", "123456");

        System.out.println("---------------");

        proxy.deleteUsers();

        System.out.println("----------------");

        String[] users = proxy.selectUsers();
        System.out.println("users:  " + Arrays.toString(users));

        System.out.println("----------------");

        String res = proxy.toString();// 不需要代理做其他事情,只需要代理叫被代理对象来执行toString方法
        System.out.println("res = " + res);
    }
}
