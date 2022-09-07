package Arrays;
/**
 * 
 * @author hk21398
 *
 *In this program, we need to rotate the elements of an array towards the left by the specified number of times
 */
public class RotateLeft {

	public static void main(String[] args) {
		
		int[] arr={1,2,3,4,5};
		
		int[] fq=new int[arr.length];
		int n=7;
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		for(int i = 0; i < n; i++){  
            int j, first;  
            //Stores the first element of the array  
            first = arr[0];  
            for(j = 0; j < arr.length-1; j++){  
                //Shift element of array by one  
                arr[j] = arr[j+1];  
            }  
            arr[j]=first;
	}
		System.out.println();
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

}
}
