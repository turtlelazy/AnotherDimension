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
	
	public static int[] sumRows(int[][] matrix){
		int[] returnArray = new int[matrix.length];
		for(int i = 0;i<matrix.length;i++){
			returnArray[i] = sum(matrix[i]);
		}
		return returnArray;
	}
	
	public static String arrToString(int[] arr){
		String array = "{" ;
	  for(int i =0;i<arr.length;i++){
		array+=arr[i];
		if(i!=arr.length-1){
		  array+=", ";
		}
	  }
	  array+="}";
	  return array;
	}


}