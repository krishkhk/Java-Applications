package DAY_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestElement {

	public static int getSecondLargest(Integer[] a, int total) {
		List<Integer> list = Arrays.asList(a);
		Collections.sort(list);
		int element = list.get(total - 2);
		return element;
	}

	public static void main(String[] args) {
		
		Integer[] a = {5,2,5,4,3,1,5};
		Integer[] b = {44,54,6,65,56,5,65};
		System.out.println("Second Largest: "+getSecondLargest(a,5));  
		System.out.println("Second Largest: "+getSecondLargest(b,4));  

	}

}
