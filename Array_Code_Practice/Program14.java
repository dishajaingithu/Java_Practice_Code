/*
	Remove the Duplicate show only Distinct element 
*/

class UniqueEle{
	static void distinctEle(int[] arr, int n){
		int[] ans = new int[n];
		int index = 0;

		for(int i=0; i<n; i++){
			int flag = 0;
			for(int j=0; j<i; j++){
				if(arr[i] == arr[j]){
					flag = 1;
					break;
				}
			}
			if(flag == 0){
				ans[index] = arr[i];
				index++;
			}
		}

		for(int i=0; i<index; i++){

			System.out.println(ans[i]);
		}
	}

	public static void main(String[] args){

		int[] arr = new int[]{1,1,2,2,2,3,3,10,11,11,12};

		int n = arr.length;

		distinctEle(arr,n);
	}
}
