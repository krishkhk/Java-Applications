package StringAssignments;

public class FindCharactersinString {

	public static void main(String[] args) {
		
		String st="This is krishna";
		int count=0;
		
		for(int i=0;i<st.length();++i) {
			if(st.charAt(i)!=' ')
				count++; 
		}
		System.out.println("String Charcters is :" +count);
	}

}
