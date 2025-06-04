package June4;

import java.util.Scanner;

public class LongestWord {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = scan.nextLine();
		scan.close();
		LengthFind(s);
	}
	public static void LengthFind(String s) {
		String sol="";
		int max=0;
		for(String str : s.split("\\s+")) {
			if(str.length()>max) {
				max=str.length();
				sol=str;
			}
		}
		System.out.println(sol);
	}
}
