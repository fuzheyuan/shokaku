package azure.lane.java.generic;

/**
 * @author Zheyuan Fu
 * @date 2019.06.18
 */
public class Generic<T> {
    private T key;

    public Generic(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public static void main(String[] args) {
        Generic<Integer> genericInteger = new Generic<Integer>(123456);
        Generic<String> genericString = new Generic<String>("key-value");
        System.out.println(genericInteger.getKey());
        System.out.println(genericString.getKey());
    }
}
