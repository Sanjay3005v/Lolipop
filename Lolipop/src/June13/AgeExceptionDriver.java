package June13;
import java.util.Scanner;
public class AgeExceptionDriver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		scan.close();
		try {
			if(age<18) {
				throw new AgeException();
			}
			else{
				System.out.println("Eligible");	
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.getStackTrace();
		}
	}
}
