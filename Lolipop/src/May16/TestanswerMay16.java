package May16;
import java.util.Scanner;
public class TestanswerMay16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = scan.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<nums.length;i++) {
			nums[i]=scan.nextInt();
		}
		scan.close();
		DifferenceSwap(nums);
		for(int num:nums) {
			System.out.println(num);
		}
	}
	public static void DifferenceSwap(int[] nums) {
		for(int i=0;i<nums.length-1;i++) {
			if((nums[i]-nums[i+1])<0) {
				int temp=nums[i];
				nums[i]=nums[i+1];
				nums[i+1]=temp;
			}
		}
		return;
	}
}
