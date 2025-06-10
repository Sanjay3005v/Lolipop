package June5;
import java.util.*;
public class test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		scan.close();
		unique(str);
	}
	public static void unique(String str) {
		Map<Character,Integer> map = new HashMap<>();
		for(char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		for(char ch : str.toCharArray()) {
			if(map.get(ch)==1) {
				System.out.print(ch);
			}
		}
	}
}
