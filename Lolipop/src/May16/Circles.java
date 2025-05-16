package May16;

public class Circles {
	static double pi = 3.14;
	public static void getArea(Circle c) {
		double area = pi*(c.getRadius()*c.getRadius());
		System.out.println("Area = "+area);
	}
	public static void getCircumference(Circle c) {
		double circumference = 2*pi*(c.getRadius());
		System.out.println("Circumference = "+circumference);
	}
}
