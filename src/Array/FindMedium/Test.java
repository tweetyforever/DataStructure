package Array.FindMedium;

public class Test {

	public static void main(String[] args) throws Exception{
		testCase1();
		testCase2();
		testCase3();
		testCase4();
	}
	
	public static void testCase1() {
		try {
			int nums[] = null;
			Solution median = new Solution();
			System.out.println(median.findMedian(nums));
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
	public static void testCase2() {
		try {
			int nums[] = new int[1000001];
			for (int i = 0; i < nums.length; i++) {
				nums[i] = (int) Math.random() * Integer.MAX_VALUE;
			}
			Solution median = new Solution();
			System.out.println(median.findMedian(nums));
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void testCase3() {
		try {
			int nums[] = {-23, 965, -45, 0, -2};
			Solution median = new Solution();
			System.out.println(median.findMedian(nums));
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
		
	public static void testCase4() {
		try {
			int nums[] = {29389, -2491824, 328, -598234593, 3283, -293};
			Solution median = new Solution();
			System.out.println(median.findMedian(nums));
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}
