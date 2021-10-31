package practice;

public class InsertionSort {
	
	public void sort(int[] arr) {
		int key,j;
		for(int i=1 ; i<arr.length ; i++) {
			key = arr[i];
			j = i-1;
			
			while(j>=0 && arr[j]>key) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				j=j-1;
				for(int num : arr) {
					System.out.print(num+" ");
				}
				System.out.println("");
			}
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {31,1,12,15,88,3,2,1,44};
		InsertionSort is = new InsertionSort();
		is.sort(arr);
		System.out.print("Sorted array: ");
		for(int num : arr) {
			System.out.print(num+" ");
		}

	}

}
