package June14;

import java.util.Comparator;

public class TypeShoeComparator implements Comparator<Shoe> {
	@Override
	public int compare(Shoe o1, Shoe o2) {
		// TODO Auto-generated method stub
		return o1.getType().compareTo(o2.getType());
	}
}
