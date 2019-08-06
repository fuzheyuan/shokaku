package azure.lane.java.proxy;

/**
 * @author Zheyuan Fu
 * @date 2019.06.18
 */
public class Client {
    public static void main(String[] args) {
        UserService userServiceImpl = new UserServiceImpl();
        UserService proxy = new UserServiceProxy(userServiceImpl);

        proxy.select();
        proxy.update();
    }
}
