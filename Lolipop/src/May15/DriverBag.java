package May15;

public class DriverBag {
	public static void main(String[] args) {
		//object for bag 1
		Bag bag1 = new Bag();
		
		bag1.setcolor("Green");
		bag1.setprice(2500);
		
		System.out.println("Color : "+bag1.getcolor());
		System.out.println("Price : Rs "+bag1.getPrice());
		//object for bag 2
		Bag bag2 = new Bag();
		
		bag2.setcolor("White");
		bag2.setprice(5000);
		
		System.out.println("Color : "+bag2.getcolor());
		System.out.println("Price : Rs "+bag2.getPrice());
	}
}
