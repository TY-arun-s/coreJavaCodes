package com.tyss.collection.comparator;

import java.util.Comparator;

public class MyComparator<T> implements Comparator<T> {

	@Override
	public int compare(T o1, T o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		if (i1 < i2)
			return -1;
		else if (i1 > i2)
			return -1;
		else
			return 0;

	}

}
