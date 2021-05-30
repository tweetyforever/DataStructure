package FindTheDuplicateNumber;

public class Solution {
	public int findDuplicate(int[] nums){
		int currentValue = nums[0];
		int tempIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if(currentValue == nums[i] && tempIndex != i) {
				return currentValue;
			}
			if(i == nums.length - 1) {
				tempIndex++;
				currentValue = nums[tempIndex];
				i = tempIndex;
			}
		}
		return -1;
	}
}
