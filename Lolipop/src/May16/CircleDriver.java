package May16;
import java.util.Scanner;
public class CircleDriver {
	public static void main(String[] args) {
		System.out.println("Enter the radius : ");
		Scanner scan = new Scanner(System.in);
		int radius = scan.nextInt();
		Circle c1 = Circle.DisplayRef(radius);
		Circles.getArea(c1);
		Circles.getCircumference(c1);
		scan.close();
	}
}
