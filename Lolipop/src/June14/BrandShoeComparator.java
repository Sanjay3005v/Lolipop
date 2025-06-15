package June14;

import java.util.Comparator;

public class BrandShoeComparator implements Comparator<Shoe> {
	@Override
	public int compare(Shoe o1, Shoe o2) {
		// TODO Auto-generated method stub
		return o1.getBrand().compareTo(o2.getBrand());
	}
}
