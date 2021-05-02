package Array.RunningSumOf1DArray;

public class Test {

	public static void main(String[] args) throws Exception {
		int[] nums = {1, 2, 3, 4};
		Solution solution = new Solution();
		nums = solution.runningSum(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		testCase1();
		testCase2();
		testCase3();
		testCase4();
	}
	
	public static void testCase1() {
		try {
			int[] nums = null;
			Solution solution = new Solution();
			nums = solution.runningSum(nums);
			for (int i = 0; i < nums.length; i++) {
				System.out.println(nums[i]);
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void testCase2() {
		Solution solution = new Solution();
		try {
			int[] nums = new int[100000000];
			nums = solution.runningSum(nums);
			for (int i = 0; i < nums.length; i++) {
				System.out.println(nums[i]);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void testCase3() {
		Solution solution = new Solution();
		try {
			int[] nums = {-1000000000, 2, 3, 4};
			nums = solution.runningSum(nums);
			for (int i = 0; i < nums.length; i++) {
				System.out.println(nums[i]);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void testCase4() {
		Solution solution = new Solution();
		try {
			int[] nums = {1000000000, 2, 3, 4};
			nums = solution.runningSum(nums);
			for (int i = 0; i < nums.length; i++) {
				System.out.println(nums[i]);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
