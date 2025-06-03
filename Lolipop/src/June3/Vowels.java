package June3;

import java.util.*;

public class Vowels {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String s = scan.nextLine();
		vowels(s);
		scan.close();
	}
	public static void vowels(String s) {
		int countVow = 0;
		int countCons = 0;
		s=s.toLowerCase();
        Set<Character> set  = new HashSet<>(Arrays.asList('a','e','i','o','u'));
		for(char ch:s.toCharArray()) {
			if(ch>='a' && ch<='z') {
				if(set.contains(ch)) {
					countVow++;
				}
				else {
					countCons++;
				}
			}
		}
		System.out.println("Vowels = "+countVow);
		System.out.println("Consonants = "+countCons);
	}
}
