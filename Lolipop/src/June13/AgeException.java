package June13;

public class AgeException extends Exception {
	public AgeException() {
		System.err.println("Age exception occured");
	}
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.out.println("age is less than 18");
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "<18";
	}
}
