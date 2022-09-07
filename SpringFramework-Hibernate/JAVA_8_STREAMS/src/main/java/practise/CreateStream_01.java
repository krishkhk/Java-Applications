package practise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class CreateStream_01 {

	public static void main(String[] args) {
	
		List<Integer> lists=new ArrayList<>();
		lists.add(12);
		lists.add(10);
		lists.add(35);
		lists.add(75);
		lists.add(95);
		lists.add(125);
		lists.add(555);
	//Stream.of("hari","krishna");	 
//		Stream.of(lists);
		System.out.println(lists);

		System.out.println("max Values");
		//Find Even Numbers
		//List<Integer> MaxValues=lists.stream().filter(i ->(i%2==0)).collect(Collectors.toList());
		
		//Max values
		List<Integer> MaxValues=lists.stream().filter(i ->(i>35)).collect(Collectors.toList());
		System.out.println(MaxValues);
		

	}

}
