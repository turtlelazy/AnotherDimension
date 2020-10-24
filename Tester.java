public class Tester{
	public static void main(String Args[]){
		int[] b = {-1,6,9,-5,7};
		int[][] x = {{-1,6,9,-5,7},{9,-9,4},{0},{7,0}};
		System.out.println(ArrayOps.sum(b));
		System.out.println(ArrayOps.largest(b));
		System.out.println(ArrayOps.arrToString(ArrayOps.sumRows(x)));
		System.out.println(ArrayOps.arrToString(ArrayOps.largestInRows(x)));
	}
}