package June14;

public class Laptop implements Comparable{
	String brand;
	double price;
	public Laptop(String brand,double price) {
		super();
		this.brand=brand;
		this.price=price;
	}
	@Override
	public int compareTo(Object o) {
		Laptop l1 = (Laptop)o;
		if(this.price==l1.price) {
			return 0;
		}
		else if(this.price>l1.price) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
