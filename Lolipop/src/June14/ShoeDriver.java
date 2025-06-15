package June14;

import java.util.*;

public class ShoeDriver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Shoe> list = new ArrayList<>();
		String brand = "";
		String type = "";
		String color = "";
		int price = 0;
		while (true) {
			while (true) {
				System.out.println("Select Brand :");
				System.out.println("1.Adidas");
				System.out.println("2.Nike");
				System.out.println("3.Puma");
				int option = scan.nextInt();
				try {
					switch (option) {
					case 1:
						brand = "Adidas";
						break;
					case 2:
						brand = "Nike";
						break;
					case 3:
						brand = "Puma";
						break;
					default: {
						throw new ShoeBrandException();
					}

					}
				} catch (ShoeBrandException e) {
					System.err.println(e.getMessage());
					e.printStackTrace();
					continue;
				}
				break;
			}
			while (true) {
				System.out.println("Select Type :");
				System.out.println("1.Casuals");
				System.out.println("2.Sneakers");
				System.out.println("3.Sports");
				int option = scan.nextInt();
				try {
					switch (option) {
					case 1:
						type = "Casuals";
						break;
					case 2:
						type = "Sneakers";
						break;
					case 3:
						type = "Sports";
						break;
					default: {
						throw new ShoeTypeException();

					}

					}
				} catch (ShoeTypeException e) {
					System.err.println(e.getMessage());
					e.printStackTrace();
					continue;
				}
				break;

			}
			while (true) {
				System.out.println("Select Price :");
				System.out.println("1.500");
				System.out.println("2.600");
				System.out.println("3.700");
				System.out.println("4.800");
				System.out.println("5.900");
				System.out.println("6.1000");
				System.out.println("7.1500");
				int option = scan.nextInt();
				try {
					switch (option) {
					case 1:
						price = 500;
						break;
					case 2:
						price = 600;
						break;
					case 3:
						price = 700;
						break;
					case 4:
						price = 800;
						break;

					case 5:
						price = 900;
						break;
					case 6:
						price = 1000;
						break;
					case 7:
						price = 1500;
						break;
					default: {
						throw new ShoePriceException();
					}
					}
				} catch (ShoePriceException e) {
					System.err.println(e.getMessage());
					e.printStackTrace();
					continue;
				}
				break;
			}
			while (true) {
				System.out.println("Select color :");
				System.out.println("1.Red");
				System.out.println("2.Black");
				System.out.println("3.Blue");
				System.out.println("4.Brown");
				System.out.println("5.White");
				System.out.println("6.Grey");
				System.out.println("7.Green");
				int option = scan.nextInt();
				try {
					switch (option) {
					case 1:
						color = "Red";
						break;
					case 2:
						color = "Black";
						break;
					case 3:
						color = "Blue";
						break;
					case 4:
						color = "Brown";
						break;
					case 5:
						color = "White";
						break;
					case 6:
						color = "Grey";
						break;
					case 7:
						color = "Green";
						break;
					default: {
						throw new ShoeColorException();
					}
					}
				} catch (ShoeColorException e) {
					System.err.println(e.getMessage());
					e.printStackTrace();
				}
				break;
			}

			list.add(Shoe.createShoe(brand, type, color, price));
			System.out.println("Press 1 to exit");
			System.out.println("Press other number to add more products");

			int option = scan.nextInt();
			if (option == 1) {
				break;
			}
		}
		Shoe[] shoes = list.toArray(new Shoe[0]);
		for (Shoe shoe : shoes) {
			System.out.println(shoe);
		}
		System.out.println("-------------------------------------------------------------------");

		while (true) {
			System.out.println("Sorting option for products:");
			System.out.println("1.Price");
			System.out.println("2.Brand");
			System.out.println("3.Type");
			System.out.println("4.Color");
			System.out.println("Enter the option: ");
			int option = scan.nextInt();
			switch (option) {
			case 1:
				Arrays.sort(shoes);
				break;
			case 2:
				Arrays.sort(shoes, new BrandShoeComparator());
				break;
			case 3:
				Arrays.sort(shoes, new TypeShoeComparator());
				break;
			case 4:
				Arrays.sort(shoes, new ColorShoeComparator());
				break;
			default: {
				System.out.println("Option not available");
				continue;
			}

			}
			for (Shoe shoe : shoes) {
				System.out.println(shoe);
			}
			System.out.println("-------------------------------------------------------------------");

			System.out.println("Press 1 to exit");
			System.out.println("Press other number to check other sorting");

			int choice = scan.nextInt();
			if (choice == 1) {
				break;
			}

		}
		scan.close();

	}

}
