package Sample;

public class Demo2 {
	
	public static void main(String[] args) {
		System.out.println("main");
		real a = new real();
		real b = new real();
	}
}
class real{
	static {
		System.out.println("static");
	}
	
	{
		System.out.println("non-static");
	}
}
