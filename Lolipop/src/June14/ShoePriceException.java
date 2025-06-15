package June14;

public class ShoePriceException extends Exception{

	public ShoePriceException() {
		super();
		System.err.println("ShoePriceException occured");
	}
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.err.println("Price is not available");
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Price not found";
	}
}
