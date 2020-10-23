public class ArrayOps{
	public static int sum(int[] a){
		int returnSum = 0;
		for(int i = 0; i<a.length;i++){
			returnSum+=a[i];
		}
		return returnSum;
	}


}