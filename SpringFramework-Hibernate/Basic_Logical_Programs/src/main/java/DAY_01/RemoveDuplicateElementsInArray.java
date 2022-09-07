package DAY_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsInArray {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,1,2,2,3,5,6,7,8,8));
		Set<Integer> removed=list.stream().collect(Collectors.toSet());
		System.out.println("After removing duplicate Elements "+removed);
		

	}

}
