package Sample;

public class Book {
	String title;
	double price;

	Book(String a ,double b){
		
		title = a;
		price = b;
	}
	public static void main(String[] args) {
		Book b1 = new Book("ABC",200);
		System.out.println("title = "+ b1.title+", price = "+b1.price);
	}
}
