package DAY_01;

public class MinAndMaxUsingMethod {

	public int max(int [] array) {
	      int max = 0;
	     
	      for(int i=0; i<array.length; i++ ) {
	         if(array[i]>max) {
	            max = array[i];
	         }
	      }
	      return max;
	   }

	public int min(int[] array) {
		int min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int[] myArray = { 10, 20, 30, 50, 5000, 5 };

		MinAndMaxUsingMethod op = new MinAndMaxUsingMethod();
		System.out.println("Max Element " + op.max(myArray));
		System.out.println("Min Element " + op.min(myArray));

	}

}
