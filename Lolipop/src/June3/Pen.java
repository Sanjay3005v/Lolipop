package June3;

public class Pen {
	int price;
	int quantity;

	public Pen(int price, int quantity) {
		super();
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public boolean equals(Object o) {
		Pen pen = (Pen)o;
		return this.price == pen.price && this.quantity == pen.quantity;
	}
	public static void main(String[] args) {
		Pen p1 = new Pen(10,2);
		Pen p2 = new Pen(10,2);
		Pen p3 = new Pen(15,3);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
	}
	
}
