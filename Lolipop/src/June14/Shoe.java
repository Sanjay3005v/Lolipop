package June14;

public class Shoe implements Comparable<Shoe>{
	private String brand;
	private String type;
	private String color;
	private double price;
	

	private Shoe(String brand, String type, String color, double price) {
		super();
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public static Shoe createShoe(String brand, String type,String color, double price) {
		return new Shoe(brand, type, color, price);
	}

	@Override
	public int compareTo(Shoe o) {
		// TODO Auto-generated method stub
		if (this.price == o.price) {
			return 0;
		} else if (this.price > o.price) {
			return 1;
		} else {
			return -1;
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.brand+" "+this.type+" "+" "+this.color+" "+this.price;
	}
}
