package June5;
import java.util.*;
public class GroupStringBasedOnLength {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = scan.nextInt();
		scan.nextLine();
		String[] s = new String[size];
		System.out.println("Enter the elements : ");
		for(int i=0;i<s.length;i++) {
			s[i]= scan.nextLine();
		}
		scan.close();
		groupStrings(s);
	}
	public static void groupStrings(String[] s) {
		Map<Integer,List<String>> map = new TreeMap<>();
		for(String str: s) {
			map.putIfAbsent(str.length(), new ArrayList<>());
            map.get(str.length()).add(str);
		}
		for (List<String> str : map.values()) {
            Collections.sort(str);
            for(String s1:str) {
            	System.out.print(s1+ " ");
            }
            System.out.println();
        }
	}	
}
