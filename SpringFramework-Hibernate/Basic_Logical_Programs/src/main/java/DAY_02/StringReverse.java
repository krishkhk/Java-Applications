package DAY_02;

public class StringReverse {

	public static void main(String[] args) {
		String str="Krishna";
		
		//Using StringBuilder Predefined Method. 
		/*
		 * StringBuilder sb=new StringBuilder(); sb.append(str); sb.reverse();
		 * System.out.println("The given String "+sb);
		 */
		String reverse="";
		 for(int i=str.length()-1;i>=0;i--) {
			 reverse=reverse+str.charAt(i);
		 }
	
		 System.out.println("Orginal String " +str);
		 System.out.println("---------------------");
		 System.out.println("After reversed "+reverse);
	}
	

}
