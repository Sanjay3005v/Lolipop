package June10;

import java.util.*;

public class emailCheck {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the email : ");
		String str = scan.next();
		scan.close();
		check(str);
	}

	public static void check(String str) {
		if (str.matches("[a-zA-Z0-9]+@(gmail.com|yahoo.com|hotmail.com)")) {
			System.out.println("The email is valid ");
		} else {
			System.out.println("The email is invalid ");
		}
	}
}
