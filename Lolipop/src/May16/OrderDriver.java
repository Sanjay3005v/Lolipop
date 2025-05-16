package May16;

public class OrderDriver {
	public static void main(String[] args) {
		Order order1 = new Order();
		order1.setdetails("Camera", "twqeh76321575", 60000,"phonepe");
		Order order2 = new Order();
		order2.setdetails("GoPro_hero11","5r5t45wwe5",52000,"Cash On delivery");
		System.out.println("Order one details are ");
		System.out.println("Product name : "+order1.getProductName());
		System.out.println("Id : "+order1.getid());
		System.out.println("Price : "+order1.getprice());
		System.out.println("Payment : "+order1.getpayment());
		System.out.println("Order two details are ");
		System.out.println("Product name : "+order2.getProductName());
		System.out.println("Id : "+order2.getid());
		System.out.println("Price : "+order2.getprice());
		System.out.println("Payment : "+order2.getpayment());
	}
	
}
