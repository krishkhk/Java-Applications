package Strings;

public class StringMethods {

	public static void main(String[] args) {

		String str1 = "krishna";
		String str2 = "krishna";

		String str3 = new String("krishna");
		String str4 = new String("krishna");
		
		String str="krishna,hari,krishna";
		int len=str.length();
		System.out.println(len);
			
		
		System.out.println(str.charAt(0)+" | " +str.charAt(len-1));
		System.out.println(len);
		
		String str0=str.toUpperCase();
		System.out.println(str0);

		
		
			
		}
	}
