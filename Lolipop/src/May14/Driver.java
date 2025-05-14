package May14;

public class Driver {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(101 , "ABC" , "XYZ");
		e1.display();
		System.out.println("Count : "+Employee.count);
		System.out.println("Company : "+Employee.companyName);
	}
}
