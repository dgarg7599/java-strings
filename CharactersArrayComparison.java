import java.util.Scanner;
import java.util.Arrays;

public class CharactersArrayComparison {

	// Method to return character array of string
	public static char[] characterArray(String str){
		char[] result = new char[str.length()];
		for(int i=0;i<str.length();i++){
			result[i] = str.charAt(i);
		}
		return result;
	}

	// Method to compare two arrays
	public static boolean compareArrays(char[] arr1, char[] arr2){
		if(arr1.length != arr2.length) return false;
		for(int i=0;i<arr1.length;i++){
			if(arr1[i] != arr2[i]) return false;
		}
		return true;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String inputString = sc.next();

		char[] userDefinedCharArray = characterArray(inputString);
		char[] builtinMethod = inputString.toCharArray();

		System.out.println("Characters using custom method: " + Arrays.toString(userDefinedCharArray));
		System.out.println("Characters using toCharArray(): " + Arrays.toString(builtinMethod));
		System.out.println("Comparison Result: " + compareArrays(userDefinedCharArray, builtinMethod));

	}
}


