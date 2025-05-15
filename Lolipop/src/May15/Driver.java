package May15;

public class Driver {
	public static void main(String[] args) {
		Branch branch = new Branch();
		//setting values using setter methods
		branch.setMN("Smith");
		branch.setifsc("10121");
		//printing values using getter method
		System.out.println("Manager Name: "+branch.getMN());
		System.out.println("ifsc code: "+branch.getifsc());
	}
}
