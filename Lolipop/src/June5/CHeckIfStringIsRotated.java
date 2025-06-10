package June5;
import java.util.*;
public class CHeckIfStringIsRotated {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String 1: ");
		String s1 = scan.next();
		System.out.println("Enter the String 2: ");
		String s2 = scan.next();
		scan.close();
		System.out.println(checkRotate(s1,s2));
	}
	public static boolean checkRotate(String s1, String s2) {
		String temp = s1+s1;
		return temp.contains(s2) && s1.length()==s2.length();
	}
}
 