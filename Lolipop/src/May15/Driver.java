package May15;

public class Driver {
	public static void main(String[] args) {
		Branch branch = new Branch();
		branch.setMN("Smith");
		branch.setifsc("10121");
		System.out.println("Manager Name: "+branch.getMN());
		System.out.println("ifsc code: "+branch.getifsc());
	}
}
