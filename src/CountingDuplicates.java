import java.security.Key;
import java.util.HashMap;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        // Write your code here
        HashMap<Character, Integer> letters = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            Character ch = text.charAt(i);
            if (!letters.containsKey(ch)) {
                letters.put(text.charAt(i), 1);
            } else {
                letters.put((ch), letters.get(ch) + 1);
            }
        }
        int countDuplicates = (int) letters.entrySet().stream().filter(entry -> entry.getValue() > 1).count();
        return countDuplicates;
    }
}

