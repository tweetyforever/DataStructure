package Array.RunningSumOf1DArray;

public class Solution {
	public int[] runningSum(int[] nums) throws Exception {
		if(nums.length < 1 || nums.length > 1000) {
			throw new Exception("Nums must have a length from 1 to 1000");
		}
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] < -Math.pow(10, 6) || nums[i] > Math.pow(10, 6)) {
				throw new Exception("int values in nums must be from -10^6 to 10^6.");
			}
			sum += nums[i];
			nums[i] = sum;
		}
		return nums;
	}
}
