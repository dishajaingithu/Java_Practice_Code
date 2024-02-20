
class CheckArrIsPallindrome{

	static void isPalindrome(int[] arr, int size){

		int flag = 0;

		for(int i=0; i<=size/2 && size!=0; i++){

			if(arr[i] != arr[size-i-1]){
				flag = 1;
				break;
			}
		}

		if(flag == 1){
			System.out.println("Not Palindrome");
		}else{
			System.out.println("Palindrome");
		}
	}

	public static void main(String[] args){

		int[] arr = new int[] {1,2,3,2,1};
		int n = arr.length;

		isPalindrome(arr,n);
	}
}


