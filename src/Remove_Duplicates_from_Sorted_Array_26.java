import java.util.ArrayList;

public class Remove_Duplicates_from_Sorted_Array_26 {

	public static void main(String[] args) {
		int arr[] = {0,0,1,1,1,2,2,3,3,4};
		removeDuplicates(arr);
	}
	
	public static int removeDuplicates(int[] nums) {
		int targetIndex = 1;
		int lastNum;
		
		if(nums.length<2) {
			return nums.length;
		}
		
		lastNum = nums[0];
		
		for(int i=1; i<nums.length; i++) {
			if(nums[i] >lastNum) {
				nums[targetIndex] = nums[i];
				lastNum = nums[targetIndex];
                targetIndex++;
			}
		}
		
		
		return targetIndex;
    }
}
