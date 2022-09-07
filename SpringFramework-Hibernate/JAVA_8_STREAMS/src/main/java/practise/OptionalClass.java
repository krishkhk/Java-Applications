package practise;

import java.util.Optional;

/**
 * 
 * @author hk21398
 * Every Java Programmer is familiar with NullPointerException. It can crash your code. 
 * And it is very hard to avoid it without using too many null checks. 
 * So, to overcome this, Java 8 has introduced a new class Optional in java.util package. 
 * It can help in writing a neat code without using too many null checks.
 *  By using Optional, we can specify alternate values to return or alternate code to run.
 *
 */
public class OptionalClass {

	public static void main(String[] args) {

		//creating string array.
		String[] str=new String[5];
		
		//assigning text to index.
		
		str[3] ="This is Optional Class !!";
		
		//creating optional class
		
		Optional<String> check=Optional.empty();
		System.err.println(check);
		
		//print non-empty
		
		Optional<String>value=Optional.of(str[3]);
		System.out.println(value);
		
		//print hashcode
		
		System.out.println(value.hashCode());
		
		//print it is value is true or false
		System.out.println(value.isPresent());
		
		
		

	}

}
