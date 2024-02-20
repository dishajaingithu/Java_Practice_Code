/*
	Linear Search in Array
*/

class linearSearch{

	static void searchEle(int[] arr, int size, int ele){
		
		int searchIndex = -1;

		for(int i=0; i<size; i++){

			if(arr[i] == ele){
				searchIndex = i;
				break;
			}
		}
		if(searchIndex != -1){

			System.out.println(searchIndex);
		}else{
			System.out.println("Element not Present");
		}
	}

	public static void main(String[] args){

		int[] arr = new int[]{5,4,3,2,1};

		int n = arr.length;

		int num = 5;

		searchEle(arr,n,num);
	}
}
