package azure.lane.java;

/**
 * @author Zheyuan Fu
 * @date 2019.06.18
 */
public interface NewTestInterface {

    static void staticMethod() {
        System.out.println("newTestInterface staticMethod");
    }

    default void defaultMethod() {
        System.out.println("newTestInterface defaultMethod");
    }
}
