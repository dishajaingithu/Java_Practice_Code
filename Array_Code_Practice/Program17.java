/*
	Find the Missing Number in Array 
*/

class MissingNum{

	static int getMissingNum(int[] arr, int size){

		int sum = 0;

		for(int i=0; i<size; i++){

			sum = sum + arr[i];
		}

		return ((size * (size+1))/2 - sum);
	}

	public static void main(String[] args){

		int[] arr = {1,2,3,5};
		int n = arr.length;

		System.out.println(getMissingNum(arr,n));
	}
}
