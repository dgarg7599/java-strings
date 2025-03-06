import java.util.Scanner;

public class CompareSubstrings {

	// Method to create substring
	public static String createSubstring(String str, int start, int end){
		String result = "";
		for(int i=start;i<end;i++){
			result += str.charAt(i);
		}
		return result;
	}

	// Method to compare two strings
	public static boolean compareStrings(String str1, String str2){
		if(str1.length() != str2.length()) return false;
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i) != str2.charAt(i)) return false;
		}
		return true;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String inputString = sc.next();
		System.out.println("Enter the starting index: ");
		int start = sc.nextInt();
		System.out.println("Enter the ending index: ");
		int end = sc.nextInt();

		String substringUsingCharAt = createSubstring(inputString, start, end);
		String substringUsingMethod = inputString.substring(start, end);

		System.out.println("Substring using charAt(): " + substringUsingCharAt);
		System.out.println("Substring using substring(): " + substringUsingMethod);
		System.out.println("Comparison result of both method: " + compareStrings(substringUsingCharAt, substringUsingMethod));

	}
}
