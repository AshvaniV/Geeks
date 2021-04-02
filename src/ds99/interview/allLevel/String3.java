//Print All duplicate
package ds99.interview.allLevel;

import java.util.HashMap;
import java.util.Map;

public class String3 {
    static void printDuplicate(String str) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            } else {
                map.put(str.charAt(i), (map.get(str.charAt(i)) + 1));
            }
        }
        for (Map.Entry set : map.entrySet()) {
            char key = (char) set.getKey();
            int value = (int) set.getValue();

            if (value > 1)
                System.out.println(key + " count " + value);
        }
    }

    public static void main(String[] args) {
        String S = "Ashvani Sharma";
        printDuplicate(S);
    }
}
