package nov_problems_practice;

public class SortingOld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {8,4,2,6,1,3};
		int temp=0;

		for(int i=0; i<arr.length; i++) {

			for(int j=i+1; j<arr.length; j++) {

				if(arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		for(int n: arr) {
			System.out.print(n+" ");
		}
	}

}
