import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CharacterReverser {

	public static void main(String[] args) throws InterruptedException {
		String set1;
		String set2;
		String set2Rev = "";
		String result = "";
		int qtNum = 0;
		int qtChar = 0;
		int it = 0;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter a set of characters: ");
		set1 = read.nextLine();
		System.out.println("\nEnter another set of characters: ");
		set2 = read.nextLine();
		System.out.println("\nWe're joining the sets and reversing the second set. Please wait...");
		TimeUnit.SECONDS.sleep(2);
		
		int set1Size = set1.length();
		int set2Size = set2.length();
		
		
		if (set1Size > set2Size) {
			it = set1Size;
		} else {
			it = set2Size;
		}
		
		
		for (int i = set2Size - 1; i >= 0; i--) {
			set2Rev += set2.charAt(i);
		}
		

		for (int i = 0; i <= it; i++) {
			if (set1Size > i && set2Size > i) {
				result += set1.charAt(i);
				result += set2Rev.charAt(i);
			} else if (set1Size > i && set2Size <= i){
				result += set1.charAt(i);
			} else if (set2Size > i && set1Size <= i) {
				result += set2Rev.charAt(i);
			}
		}
		
		
		
		for (int i = 0; i < result.length(); i++) {
			if (Character.isDigit(result.charAt(i))) {
				qtNum++;
			} else {
				qtChar++;
			}
		}
		
		System.out.println("\nResult: " + result);
		System.out.println("Quantity of numbers found: " + qtNum);
		System.out.println("Quantity of other characters found: " + qtChar);

	}

}
