package azure.lane.java.generic;

import java.util.Random;

/**
 * @author Zheyuan Fu
 * @date 2019.06.18
 */
public class FruitGenerator implements Generator<String> {
    private String[] fruits = new String[]{"Apple", "Banana", "Pear"};

    @Override
    public String next() {
        Random random = new Random();
        return fruits[random.nextInt(3)];
    }

    public static void main(String[] args) {
        FruitGenerator fruitGenerator = new FruitGenerator();
        System.out.println(fruitGenerator.next());
    }
}
