package azure.lane.java;

/**
 * @author Zheyuan Fu
 * @date 2019.06.18
 */
public interface TestInterface {
    public static final Integer key = 1;

    int key2 = 2;

    public abstract void method();

    void method2();

    static void staticMethod() {
        System.out.println("interface staticMethod");
    }

    default void defaultMethod() {
        System.out.println("interface defaultMethod");
    }
}
