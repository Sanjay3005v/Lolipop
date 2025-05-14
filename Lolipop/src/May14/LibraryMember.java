package May14;
import java.util.Scanner;
public class LibraryMember {
	static int totalMembers;
	int id;
	String name;
	static {
		System.out.println("Library Management System");
	}
	{
		System.out.println("Creating a new LibraryMember object...");
	}
	LibraryMember(String name) {
		this.name = name;
		this.id = ++totalMembers;
		System.out.println("Member registered: "+name+", ID: "+id);
	}
	public static void getTotalMembers() {
		System.out.println("Total members: "+totalMembers);
	}
	public void showMemberDetails() {
		System.out.println("Name :"+name);
		System.out.println("ID :"+ id);
	}
}
