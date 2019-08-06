package azure.lane.java;

/**
 * @author Zheyuan Fu
 * @date 2019.06.18
 */
public class ExtendAbstractClass extends TestAbstractClass {
    @Override
    public void defaultMethod() {

    }

    @Override
    public void method2() {

    }

    @Override
    void method3() {

    }

    public static void main(String[] args) {
        ExtendAbstractClass test = new ExtendAbstractClass();
        test.method();
    }
}
