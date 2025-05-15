package May14;
public class LibraryMember {
	//static variable
	static int totalMembers;
	//non static variable
	int id;
	String name;
	//static initializer
	static {
		System.out.println("Library Management System");
	}
	//non static initializer
	{
		System.out.println("Creating a new LibraryMember object...");
	}
	//constructor
	LibraryMember(String name) {
		this.name = name;
		this.id = ++totalMembers;
		System.out.println("Member registered: "+name+", ID: "+id);
	}
	//static method
	public static void getTotalMembers() {
		System.out.println("Total members: "+totalMembers);
	}
	//non static method
	public void showMemberDetails() {
		System.out.println("Name :"+name);
		System.out.println("ID :"+ id);
	}
}
