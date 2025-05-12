package Sample;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		//System.out.println(Arrays.toString(mulby2(arr)));
		int[] sol ={sumofeven(arr),mulofodd(arr)};
		System.out.println(Arrays.toString(sol));
	}
	public static int[] mulby2(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			nums[i]=nums[i]*2;
		}
		return nums;
	}
	public static int mulofodd(int[] nums) {
		int sol = 1;
		for(int num:nums) {
			if(num%2!=0) {
				sol*=num;
			}
		}
		return sol;
	}
	public static int sumofeven(int[] nums) {
		int sol = 0;
		for(int num:nums) {
			if(num%2==0) {
				sol+=num;
			}
		}
		return sol;
	}
}
