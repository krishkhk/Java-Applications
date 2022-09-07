package practise;

/**
 * if we want Stream String We Use StreamOf
 */
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringLength {

	public static void main(String[] args) {
	String[] str={"hari","krishnaaa","java","python","angular","js"};
	
	Set<String> names=Stream.of(str).filter(i ->(i.length()>=8)).collect(Collectors.toSet());
	System.out.println(names);
	

	}

}
