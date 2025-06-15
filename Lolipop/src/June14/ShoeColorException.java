package June14;

public class ShoeColorException extends Exception{

	public ShoeColorException() {
		super();
		System.err.println("ShoeColorException occured");
	}
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.err.println("Color is not available");
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Color not found";
	}
}
