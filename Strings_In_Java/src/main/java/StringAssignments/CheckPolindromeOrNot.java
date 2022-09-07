package StringAssignments;

import java.util.Scanner;

/**
 * 
 * @author hari
 *
 *         A palindrome is a string, which, when read in both forward and
 *         backward ways is the same
 */
public class CheckPolindromeOrNot {
	

	public static void main(String[] args) {

		String rev="";

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String num=sc.nextLine();
		int lenghth=num.length();
		
		for(int i=lenghth-1;i>=0;i--) {
			rev=rev+num.charAt(i);
			
		}
		if(num.equals(rev)) {
			System.out.println("The " +num+ "is Polindrom");
		}else {
			System.out.println("The " +num+ "is Not Polindrom") ;
		}
		
		
		
		
		
	}

}
