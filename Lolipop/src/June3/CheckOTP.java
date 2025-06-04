package June3;
import java.util.*;
public class CheckOTP {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the OTP: ");
		String s = scan.nextLine();
		scan.close();
		System.out.println(checkNum(s));
	}
	public static boolean checkNum(String s) {
		if(s.length()==0) {
			return false;
		}
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i) <='9') {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}
}
