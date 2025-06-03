package June3;
import java.util.*;
public class ReverseString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Message to reverse: ");
		String msg = scan.next();
		System.out.println("Reversed message :");
		System.out.println(reverse(msg));
		scan.close();
	}
	public static String reverse(String s) {
		String sol = "";
		for(int i=s.length()-1;i>=0;i--) {
			sol+=s.charAt(i);
		}
		return sol;
	}
}
