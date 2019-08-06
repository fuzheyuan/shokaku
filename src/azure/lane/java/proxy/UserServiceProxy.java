package azure.lane.java.proxy;

import java.util.Date;

/**
 * @author Zheyuan Fu
 * @date 2019.06.18
 */
public class UserServiceProxy implements UserService {
    private UserService target;

    public UserServiceProxy(UserService userService) {
        this.target = userService;
    }

    public void select() {
        before();
        target.select();    // 这里才实际调用真实主题角色的方法
        after();
    }
    public void update() {
        before();
        target.update();    // 这里才实际调用真实主题角色的方法
        after();
    }

    private void before() {     // 在执行方法之前执行
        System.out.println(String.format("log start time [%s] ", new Date()));
    }
    private void after() {      // 在执行方法之后执行
        System.out.println(String.format("log end time [%s] ", new Date()));
    }
}
