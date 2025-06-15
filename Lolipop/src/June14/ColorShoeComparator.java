package June14;

import java.util.Comparator;

public class ColorShoeComparator implements Comparator<Shoe>{
	@Override
	public int compare(Shoe o1, Shoe o2) {
		// TODO Auto-generated method stub
		return o1.getBrand().compareTo(o2.getBrand());
	}
}
