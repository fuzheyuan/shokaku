package azure.lane.java;

/**
 * @author Zheyuan Fu
 * @date 2019.06.18
 */
public class TestClient {
    public static void main(String[] args) {
        Integer n1 = 100, n2 = 100, n3 = 150, n4 = 150;
        int i1 = 100, i2 = 150;
        System.out.println(n1 == n2);
        System.out.println(n3 == n4);
        System.out.println(n1 == i1);
        System.out.println(n3 == i2);
    }
}
