package Array.RichestCustomerWealth;

public class Solution {
	private int[][] wealthInfo;
	
	public Solution(int[][] wealthInfo) throws Exception {
		if(wealthInfo.length > 50 || wealthInfo.length < 1 || wealthInfo[0].length > 50 || wealthInfo[0].length < 1) {
			throw new Exception("Number of rows and columns need to be between 1 and 50");
		}
		this.wealthInfo = wealthInfo;
	}
	
	public int getMaxWealth() {
		int max = 0;
		for (int i = 0; i < wealthInfo.length; i++) {
			int sum = 0;
			for (int j = 0; j < wealthInfo[i].length; j++) {
				sum += wealthInfo[i][j];
			}
			if(sum > max) {
				max = sum;
			}
		}			
		return max;
	}
}
