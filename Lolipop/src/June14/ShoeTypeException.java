package June14;

public class ShoeTypeException extends Exception {

	public ShoeTypeException() {
		super();
		System.out.println("ShoeTypeException occured");
	}

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.err.println("Type is not available");
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Type not found";
	}

}
