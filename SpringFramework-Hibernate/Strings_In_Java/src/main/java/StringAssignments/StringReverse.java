package StringAssignments;
/**
 * 
 * @author hari
 *
 *Java program to ReverseString using StringBuilder
 *
 */
public class StringReverse {

	public static void main(String[] args) {
		
		String str="My name is Hari";
		StringBuilder sb=new StringBuilder();
		
		//append str data to builder
		
		sb.append(str);
		
		//reverse String builder using reverse().
		
		sb.reverse();
		
		System.out.println(sb);

	}

}
