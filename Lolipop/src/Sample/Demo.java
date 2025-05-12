package Sample;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] nums = mulby2(arr);
		System.out.println(Arrays.toString(nums));	
	}
	public static int[] mulby2(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			nums[i]=nums[i]*2;
		}
		return nums;
	}
}
