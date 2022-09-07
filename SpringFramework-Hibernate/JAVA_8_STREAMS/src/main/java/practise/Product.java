package practise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;



/**
 * 
 * @author hk21398 Using java8 find number is even or not.
 */
public class Product {

	public static void main(String[] args) {
		// before java8
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number ");
		int n = sc.nextInt();*/

		/*if (n % 2 == 0) {
			System.out.println("The number is Even");
		} else {
			System.out.println("The number is Odd");
		}

		// using ternary
		String result = (n % 2 == 0) ? "even!!" : "odd";
		System.out.println("The number is " + result);*/
		
		//using java8 stream
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7);
		
		java.util.Map<Boolean,List<Integer>> result=(java.util.Map) list.stream().collect(Collectors.partitioningBy(i -> i%2==0));
		
		System.out.println(result);
	}

	
}
