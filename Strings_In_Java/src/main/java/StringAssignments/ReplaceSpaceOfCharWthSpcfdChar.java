package StringAssignments;

public class ReplaceSpaceOfCharWthSpcfdChar {

	public static void main(String[] args) {
		
		String str=new String("This is a java Program");
		
		char c='*';
		str = str.replace(' ', c);   

		System.out.println(str);
	}

}
