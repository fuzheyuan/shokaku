package azure.lane.java.proxy.dynamic;

import azure.lane.java.proxy.UserService;
import azure.lane.java.proxy.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Zheyuan Fu
 * @date 2019.06.18
 */
public class Client2 {
    public static void main(String[] args) {
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        ClassLoader classLoader = userServiceImpl.getClass().getClassLoader();
        Class[] interfaces = userServiceImpl.getClass().getInterfaces();
        InvocationHandler logHandler = new LogHandler(userServiceImpl);

        UserService proxy = (UserService) Proxy.newProxyInstance(classLoader, interfaces, logHandler);

        proxy.select();
        proxy.update();
    }
}
