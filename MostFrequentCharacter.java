import java.util.Scanner;
import java.util.HashMap;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        
        char mostFrequentChar = ' ';
        int maxCount = 0;
        
        for (char ch : charCount.keySet()) {
            if (charCount.get(ch) > maxCount) {
                mostFrequentChar = ch;
                maxCount = charCount.get(ch);
            }
        }
        
        System.out.println("Most Frequent Character: " + mostFrequentChar);
    }
}
