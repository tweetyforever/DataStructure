package Array.FindMedium;

import java.util.*;

public class Solution {
	public double findMedian(int[] nums) throws Exception{
		if(nums.length < 1 || nums.length > 1000000) {
			throw new Exception("nums length needs to be between 1 and 1,000,000");
		}
		Arrays.sort(nums);
		if(nums.length % 2 == 0) {
			return medianEvens(nums);
		}
		else {
			return nums[nums.length / 2];
		}
	}

	private double medianEvens(int[] nums) {
		return (double) (nums[nums.length / 2] + nums[(nums.length / 2) - 1]) / 2;
	}
}
