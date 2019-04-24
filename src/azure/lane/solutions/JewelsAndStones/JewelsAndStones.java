package azure.lane.solutions.JewelsAndStones;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zheyuan Fu
 * @date 2019.04.24
 */
public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        for(Character c : S.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(Character c : J.toCharArray()) {
            res += map.getOrDefault(c, 0);
        }
        return res;
    }

    public static void main(String[] args) {
        String s1 = "aA", s2 = "aAAbbbb";
        String s3 = "z", s4 = "ZZ";
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        System.out.println(jewelsAndStones.numJewelsInStones(s1, s2));
        System.out.println(jewelsAndStones.numJewelsInStones(s3, s4));
    }
}
