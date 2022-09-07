package Arrays;

public class CopyOneArrayToAnotherArray {

	public static void main(String[] args) {
	
		int[] arr1={2,3,4,5,6,7};
		int[] arr2=new int[arr1.length];
		
	//copying 1 array to another.
		
		for(int i=0;i<arr1.length;i++){
			arr2[i]=arr1[i];
		}
		
		System.out.println("Orginal elements");
		for(int i=0;i<arr1.length;i++){
			System.out.println(arr1[i]+" ");
		}
		System.out.println("Copied Array");
		for(int i=0;i<arr2.length;i++){
			System.out.println(arr2[i]+" ");
		}

	}

}
