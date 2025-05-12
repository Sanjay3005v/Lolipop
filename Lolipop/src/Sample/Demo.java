package Sample;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		mulby2(arr);
		System.out.println(Arrays.toString(arr));	
	}
	public static void mulby2(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			nums[i]=nums[i]*2;
		}
		return;
	}
}
