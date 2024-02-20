/*
 	Find the Largest Number in Array 
*/

class LargestEle{

	static void maximumEle(int[] arr, int size){

		int max = 0;
		for(int i=0; i<size; i++){

			if(arr[i] > max){
				max = arr[i];
			}
		}

		System.out.println("Largest Element : " + max);
	}

	public static void main(String[] args){

		int[] arr = new int[]{2,5,1,3,0};

		int n = arr.length;

		maximumEle(arr,n);
	}
}
