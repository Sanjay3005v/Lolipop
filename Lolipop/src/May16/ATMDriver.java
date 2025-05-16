package May16;

import java.util.*;

public class ATMDriver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ATM atm = new ATM();
		
		while(true) {
			System.out.println("Enter choice ");
			System.out.println("1. Deposit");
			System.out.println("2. Withdrawl");
			System.out.println("3. Exit");
			int choice = scan.nextInt();
			if(choice==1) {
				System.out.println("Enter the money");
				double money = scan.nextDouble();
				System.out.println("Enter the location");
				String location = scan.next();
				atm.setmoney(money);
				atm.setlocation(location);
				System.out.println("Money deposited from "+location);
			}
			else if(choice==2) {
				System.out.println("Enter the PIN : ");
				int pin = scan.nextInt();
				System.out.println(atm.getmoney(pin));
			}
			else {
				break;
			}
		}
		scan.close();
	}
}
