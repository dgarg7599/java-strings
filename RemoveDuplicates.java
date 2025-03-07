import java.util.Scanner;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        HashSet<Character> charSet = new HashSet<>();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!charSet.contains(ch)) {
                charSet.add(ch);
                result += ch;
            }
        }
        
        System.out.println("String without duplicates: " + result);
    }
}
