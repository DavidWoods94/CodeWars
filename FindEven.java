package cw;

public class FindEven {
	public static int findEvenIndex(int[] arr) {
		for(int i=0; i < arr.length; i++) {
			int leftSum = 0;
			int rightSum = 0;
			for(int j = 0; j < i; j++) {
				leftSum += arr[j];
			}
			for(int k = arr.length - 1; k > i; k--) {
				rightSum += arr[k];
			}
			if(leftSum == rightSum) {
				return i;
			}
		}
		return -1;
	    
	  }
}
