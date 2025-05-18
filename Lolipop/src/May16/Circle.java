package May16;

public class Circle {
	private int radius;
	//setter
	public void setRadius(int radius) {
		this.radius=radius;
	}
	//getter
	public int getRadius() {
		return this.radius;
	}
	//constructor
	private Circle(int radius) {
		this.radius=radius;
	}
	public static Circle DisplayRef(int radius) {
		Circle c1 = new Circle(radius);
		return c1;
	}
}
