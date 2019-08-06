package azure.lane.java.proxy;

/**
 * @author Zheyuan Fu
 * @date 2019.06.18
 */
public class UserServiceImpl implements UserService {
    @Override
    public void select() {
        System.out.println("查询 selectById");
    }
    @Override
    public void update() {
        System.out.println("更新 update");
    }
}
