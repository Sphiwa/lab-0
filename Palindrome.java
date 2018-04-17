import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your input: ");
		
		String str = scan.next();

		if(reverseString(str))
			System.out.print("It's a palindrome!");
		else
			System.out.print("It's not a palindrome!");
	}
	
	public static boolean reverseString(String s) {

		for (int i = 0; i < s.length()/2; i++)
			if(s.charAt(i) != s.charAt(s.length()-i-1))
				return false;
			return true;
	}
}