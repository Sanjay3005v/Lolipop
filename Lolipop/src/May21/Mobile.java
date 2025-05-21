package May21;

public class Mobile {
	private String brand;
	private double price;
	private int ram;
	private Battery b1 = new Battery("Lithium Ion", 5000);

	public Mobile(String brand, double price, int ram) {
		super();
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public Battery getBattery() {
		return b1;
	}

	public void setB1(Battery b1) {
		this.b1 = b1;
	}

	public void mobileDetails(Mobile m1) {
		System.out.println("Brand : " + m1.brand);
		System.out.println("Price : " + m1.price);
		System.out.println("Ram : " + m1.ram);

	}

}
