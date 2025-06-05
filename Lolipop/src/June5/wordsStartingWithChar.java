package June5;
import java.util.*;
public class wordsStartingWithChar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = scan.nextInt();
		scan.nextLine();
		String[] s = new String[size];
		System.out.println("Enter the elements");
		for(int i=0;i<s.length;i++) {
			s[i]= scan.nextLine();
		}
		System.out.println("Enter the Character: ");
		char ch = scan.next().charAt(0);
		scan.close();
		words(s,ch);
	}
	public static void words(String[] s,char ch) {
		int count=0;
		for(String str:s) {
			if(Character.toLowerCase(str.charAt(0))==Character.toLowerCase(ch)) {
				System.out.println(str);
				count++;
			}
		}
		if(count==0) {
			System.out.println("No match found");
		}
	}
}
