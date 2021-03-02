import java.util.HashMap;

public class CountingDuplicates {
    public static void main(String[] args) {
        String input = "Well, you can’t never let anything happen to him. Then nothing would ever happen to him. Not much fun for little Harpo.";
        System.out.println("The amount of duplicated letters in the string is :" + duplicateCount(input));
    }
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

