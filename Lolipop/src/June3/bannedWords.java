package June3;

import java.util.Scanner;

public class bannedWords {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = scan.nextLine();
		boolean res = bannedWordCheck(s);
		if(res) {
			System.out.println("The given string contains banned words");
		}
		else {
			System.out.println("There is no banned words in the given string");
		}
		scan.close();
	}
	public static boolean bannedWordCheck(String s) {
		s=s.toLowerCase();
		return (s.contains("bad") || s.contains("hate") || s.contains("ugly"));
	}
	
	
}
