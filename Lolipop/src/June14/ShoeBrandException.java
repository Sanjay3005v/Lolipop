package June14;

public class ShoeBrandException extends Exception {

	public ShoeBrandException() {
		super();
		System.err.println("ShoeBrandException occured");
	}

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.err.println("Brand is not available");
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Brand not found";
	}
}
