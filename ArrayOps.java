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
	
	public static int[] largestInRows(int[][] matrix){
		int[] returnArray = new int[matrix.length];
		for(int i = 0;i<matrix.length;i++){
			returnArray[i] = largest(matrix[i]);
		}
		return returnArray;
	}
	
	public static int sum(int[][] arr){
		return sum(sumRows(arr));
	}
	
	public static int[] sumCols(int[][] matrix){
		int[] returnArray = new int[matrix[0].length];
		for(int i = 0;i<returnArray.length;i++){
			for(int j = 0;j<matrix.length;j++){
				returnArray[i]+=matrix[j][i];
			}
		}
		return returnArray;
	}
	
	public static boolean isRowMagic(int[][] matrix){
		int[] a = sumRows(matrix);
		for(int i = 1; i < a.length;i++){
			if(a[i]!=a[i-1]){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isColMagic(int[][] matrix){
		int[] sumCollums = sumCols(matrix);
		for(int i = 1;i<sumCollums.length;i++){
			if(sumCollums[i]!=sumCollums[i-1]){
				return false;
			}
		}
		return true;
	}

}