
package June4;
import java.util.*;
public class palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = scan.nextLine();
		System.out.println(cleanPalindrome(s));
		scan.close();
	}
	public static boolean cleanPalindrome(String s) {
		String clean ="";
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				clean+=s.charAt(i);
			}
		}
		String rev="";
		for(int i=clean.length()-1;i>=0;i--) {
			rev+=clean.charAt(i);
		}
		return rev.equals(clean);
	}
}
