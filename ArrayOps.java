public class ArrayOps{
	public static int sum(int[] a){
		int returnSum = 0;
		for(int i = 0; i<a.length;i++){
			returnSum+=a[i];
		}
		return returnSum;
	}
	
	public static int largest(int[] arr){
		int returnLargest = arr[0];
		for(int i = 1;i<arr.length;i++){
			if(arr[i]>returnLargest){
				returnLargest = arr[i];
			}
		}
		return returnLargest;
	}


}