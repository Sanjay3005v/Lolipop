package June14;

import java.util.Arrays;

public class LaptopDriver {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("Lenovo",50000);
		Laptop l2 = new Laptop("Hp",80000);
		Laptop l3 = new Laptop("Asus",150000);
		
		Laptop[] laptops = {l2,l3,l1};
		
		for(Laptop laptop : laptops) {
			System.out.println(laptop.brand+" "+laptop.price);
		}
		System.out.println();
		Arrays.sort(laptops);
		
		for(Laptop laptop : laptops) {
			System.out.println(laptop.brand+" "+laptop.price);
		}
		System.out.println();
		Arrays.sort(laptops,new BrandComparator());

		for(Laptop laptop : laptops) {
			System.out.println(laptop.brand+" "+laptop.price);
		}
		
	}
}
