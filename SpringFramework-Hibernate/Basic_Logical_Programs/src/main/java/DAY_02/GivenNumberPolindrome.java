package DAY_02;

import java.util.Scanner;

public class GivenNumberPolindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rev=0,reminder;
		System.out.println("Enter A number");
		int num=sc.nextInt();
		int orginal=num;
		while(num!=0) {
			reminder=num%10;
			rev=rev*10+reminder;
			num=num/10;
			
		}
		if(orginal==rev) {
			System.out.println("The Given Number is Polindrome " +orginal);
		}else {
			System.err.println("The number not "+orginal);
		}

	}

}
