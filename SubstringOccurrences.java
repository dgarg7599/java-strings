import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a substring: ");
        String subStr = sc.nextLine();
        
        int count = 0;
        int index = 0;
        
        while ((index = str.indexOf(subStr, index)) != -1) {
            count++;
            index++;
        }
        
        System.out.println("Substring occurrences: " + count);
    }
}
