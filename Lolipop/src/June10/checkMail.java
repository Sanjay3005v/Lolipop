package June10;

import java.util.*;

public class checkMail {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array : ");
		int size = scan.nextInt();
		String[] str = new String[size];
		System.out.println("Enter the elements : ");
		for (int i = 0; i < str.length; i++) {
			str[i] = scan.next();
		}
		scan.close();
		check(str);
		System.out.println(Arrays.toString(str));
	}

	public static void check(String[] str) {
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].endsWith("gmail.com")) {
				str[i] = str[i].replace("gmail.com", "yahoo.com");
				count++;
			}
		}
		System.out.println("Total replacement : " + count);
	}
}
