package May14;

import java.util.Scanner;
public class LibrarySystem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		LibraryMember.getTotalMembers();
		
		System.out.println("Enter the name of the member: ");
		String name1 = scan.nextLine();
		LibraryMember m1 = new LibraryMember(name1);
		
		System.out.println("Enter the name of the member: ");
		String name2 = scan.nextLine();
		LibraryMember m2 = new LibraryMember(name2);
		
		m1.showMemberDetails();
		m2.showMemberDetails();
		
		LibraryMember.getTotalMembers();
		
		scan.close();
	}
}
