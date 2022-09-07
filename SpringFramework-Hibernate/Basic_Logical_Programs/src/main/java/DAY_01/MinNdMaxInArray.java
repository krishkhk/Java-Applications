package DAY_01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MinNdMaxInArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int [] array= {10,202,350,470,240,70,80,25,69,78};
		
		int Max=Arrays.stream(array).max().getAsInt();
		
		System.out.println("Max element is " + Max);
		int Min=Arrays.stream(array).min().getAsInt();
		System.out.println("Min element is " + Min);
		

	}

}
