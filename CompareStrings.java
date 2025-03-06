import java.util.Scanner;

public class CompareStrings {

	// Method to compare both string using charAt()
	public static boolean compare(String str1, String str2){
		if(str1.length() != str2.length()) return false;
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i) != str2.charAt(i)){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String firstString = sc.next();
		System.out.println("Enter the second string: ");
		String secondString = sc.next();

		boolean charAtResult = compare(firstString, secondString);
		boolean equalsResult = firstString.equals(secondString);

		System.out.println("Comparison using charAt() : " + charAtResult);
		System.out.println("Comparison using equals() : " + equalsResult);
		System.out.println("Results Match of both comparison method: " + (charAtResult == equalsResult));

	}
}
