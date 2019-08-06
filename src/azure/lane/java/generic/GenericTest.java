package azure.lane.java.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zheyuan Fu
 * @date 2019.06.18
 */
public class GenericTest {

    public class Generic<T> {
        private T key;
        public Generic(T key) {
            this.key = key;
        }

        public T getKey() {
            return key;
        }
    }

    public <T> T showKeyName(Generic<T> container) {
        System.out.println("Contains key: " + container.getKey());
        T test = container.getKey();
        return test;
    }

    public static void main(String[] args) {
//        List<String>[] ls = new ArrayList<String>[10];
        List<?>[] ls = new ArrayList<?>[10];
    }
}
