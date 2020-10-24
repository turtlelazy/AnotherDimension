import java.util.*;
public class Tester{
	public static void main(String Args[]){
		int[] b = {-1,6,9,-5,7};
		int[][] x = {{-1,6,9,-5,7},{9,-9,4},{0},{7,0}};
		int[][]  A  =  {  {  1,  0, 12, -1 },
                  {  7, -2,  2,  1 },
                  { -5, -2,  2, -9 }
               };
		int[]  B  =   {  1, 3, 5 };
	
		System.out.println(ArrayOps.sum(b));
		System.out.println(ArrayOps.largest(b));
		System.out.println(ArrayOps.arrToString(ArrayOps.sumRows(x)));
		System.out.println(ArrayOps.arrToString(ArrayOps.largestInRows(x)));
		System.out.println(ArrayOps.sum(x));
		
		System.out.println(Arrays.toString(ArrayOps.sumRows(A)));
		System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
		System.out.println(ArrayOps.sum(B));
		System.out.println(ArrayOps.sum(A));
	}
}