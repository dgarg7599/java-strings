import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char removeChar = sc.next().charAt(0);
        
        String result = str.replaceAll(String.valueOf(removeChar), "");
        
        System.out.println("Modified String: " + result);
    }
}
