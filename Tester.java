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
		
		int[][] rowMagicYes = {{1,  2, 3, 4 }, {  2, 3,  4,  1},{ 3, 4,  1, 2 } };
		int[][] collumMagicYes = { {  1,  1, 1 },{  2, 2, 2 },{ 3,  3, 3 } };
		int[][] rowAndColMagic = { {  2,  2, 2 },{  2, 2, 2 }};
		
		System.out.println(ArrayOps.sum(b));
		System.out.println(ArrayOps.largest(b));
		System.out.println(Arrays.toString(ArrayOps.largestInRows(x)));
		System.out.println(Arrays.toString(ArrayOps.sumRows(x)));
		System.out.println(ArrayOps.sum(x));
		
		System.out.println(Arrays.toString(ArrayOps.sumRows(A)));
		System.out.println(Arrays.toString(ArrayOps.largestInRows(A)));
		System.out.println(ArrayOps.sum(B));
		System.out.println(ArrayOps.sum(A));
		
		System.out.println(Arrays.toString(ArrayOps.sumCols(A)));
		
		System.out.println(ArrayOps.isColMagic(rowMagicYes));
		System.out.println(ArrayOps.isColMagic(collumMagicYes));
		System.out.println(ArrayOps.isColMagic(rowAndColMagic));
		
	}
}