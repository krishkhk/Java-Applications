package Arrays;

public class PrintDuplicateElements {

	public static void main(String[] args) {

		int[] arr={2,2,34,56,66,34,56,56,56,1,3,4,5,67,};
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.print(arr[i]+" ");
				}
			}
		}
	}

}
