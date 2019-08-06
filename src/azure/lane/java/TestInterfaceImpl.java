package azure.lane.java;

/**
 * @author Zheyuan Fu
 * @date 2019.06.18
 */
public class TestInterfaceImpl implements TestInterface, NewTestInterface {
    @Override
    public void method() {
        System.out.println("implement method");
    }

    @Override
    public void method2() {
        System.out.println("implement method2");
    }

    @Override
    public void defaultMethod() {
        System.out.println("override defaultMethod");
    }

    public static void main(String[] args) {
        TestInterface.staticMethod();
        TestInterfaceImpl impl = new TestInterfaceImpl();
        impl.defaultMethod();
    }
}
