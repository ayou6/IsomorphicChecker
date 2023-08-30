import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String strng1 = "abb";
        String strng2 = "yyy";

        if (strng1.length() == strng2.length()) {
            strng1 = strng1.toLowerCase();
            strng2 = strng2.toLowerCase();

            Map<Character, Character> map = new HashMap<>();
            boolean isIsomorphic = true;

            for (int i = 0; i < strng1.length(); i++) {
                char char1 = strng1.charAt(i);
                char char2 = strng2.charAt(i);

                if (map.containsKey(char1)) {
                    if (map.get(char1) != char2) {
                        isIsomorphic = false;
                        break;
                    }
                } else {
                    if (map.containsValue(char2)) {
                        isIsomorphic = false;
                        break;
                    }
                    map.put(char1, char2);
                }
            }

            if (isIsomorphic) {
                System.out.println("The strings are isomorphic.");
            } else {
                System.out.println("The strings are not isomorphic.");
            }
        } else {
            System.out.println("The strings are not isomorphic.");
        }
    }
}
