package May16;

public class Order {
	private String ProductName,id,payment;
	private int Price;
	public void setdetails(String ProductName , String id, int Price,String payment) {
		this.ProductName=ProductName;
		this.id=id;
		this.Price=Price;
		this.payment=payment;
	}
	public String getProductName() {
		return this.ProductName;
	}
	public String getid() {
		return this.id;
	}
	public int getprice() {
		return this.Price;
	}
	public String getpayment() {
		return this.payment;
	}
}
