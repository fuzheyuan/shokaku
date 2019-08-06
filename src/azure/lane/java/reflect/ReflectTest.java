package azure.lane.java.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Zheyuan Fu
 * @date 2019.06.18
 */
public class ReflectTest {
    public static void main(String[] args) {
        try {
            Class clzz = Class.forName("azure.lane.java.reflect.ReflectClass");
            Method method = clzz.getMethod("call", null);
            Constructor constructor = clzz.getConstructor();
            Object reflectClass = clzz.newInstance();
            method.invoke(reflectClass, null);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
