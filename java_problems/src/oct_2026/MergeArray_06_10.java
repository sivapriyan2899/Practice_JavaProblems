package oct_2026;

import java.util.Arrays;

public class MergeArray_06_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {5,2,1,7};
		int[] array2 = {2,8,1,5};
		int position =0;
		int[] result = new int[array1.length+array2.length];
		
		
		for(int n : array1) {
			result[position]=n;
			position++;
		}
		
		for(int element : array2) {
			result[position]=element;
			position++;
		}
		
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));
		
//		for(int element: result) {
//			System.out.println(element);
//		}

	}

}
