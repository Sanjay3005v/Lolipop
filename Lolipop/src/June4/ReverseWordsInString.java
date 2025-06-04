package June4;
import java.util.*;
public class ReverseWordsInString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = scan.nextLine();
		scan.close();
		reverse(s);
	}
	public static void reverse(String s) {
		String rev = "";
        s=s.trim();
        String[] words = s.split("\\s+");
		for( int i=words.length-1;i>=0;i--) {
			rev+=words[i];
            if(i!=0){
                rev+=" ";
            }
		}
		System.out.println(rev);
	}
}
