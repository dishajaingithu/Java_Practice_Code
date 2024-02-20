/*
	Check if the Array is Sorted
*/

class checkArrayIsSorted{
	static void arrayIsSorted(int[] arr, int size){
		boolean check = true;
		for(int i=1; i<size; i++){

			if(arr[i] < arr[i-1]){

				check = false;
				break;
			}
		}
		if(check == true){
			System.out.println("Array is Sorted");
		}else{
			System.out.println("Array is Not Sorted");
		}
	}	

	public static void main(String[] args){

		int[] arr = new int[]{5,4,6,7,8};
		int n = arr.length;

		arrayIsSorted(arr,n);
	}
}
