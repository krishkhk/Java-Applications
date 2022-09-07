package Arrays;

import java.util.Scanner;

public class PrintArrayElements {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		System.out.println("Enter array elements");
		
		int[] arr=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();  
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(arr[3]);
		
	}

}
