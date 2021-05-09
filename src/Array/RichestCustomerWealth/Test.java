package Array.RichestCustomerWealth;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		testCase1();
		System.out.println("*******************************************");
		testCase2();
		System.out.println("*******************************************");
		testCase3();
		System.out.println("*******************************************");
		testCase4();
	}

	private static void testCase4() {
		int[][] wealthInfo = new int[3][51];
		for (int i = 0; i < wealthInfo.length; i++) {
			for (int j = 0; j < wealthInfo[i].length; j++) {
				wealthInfo[i][j] = (int) (Math.random() * 10);
				System.out.print(wealthInfo[i][j] + "   ");
			}
			System.out.println();
		}
		try {
			Solution test = new Solution(wealthInfo);
			test.getMaxWealth();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void testCase3() {
		int[][] wealthInfo = new int[51][3];
		for (int i = 0; i < wealthInfo.length; i++) {
			for (int j = 0; j < wealthInfo[i].length; j++) {
				wealthInfo[i][j] = (int) (Math.random() * 10);
				System.out.print(wealthInfo[i][j] + "   ");
			}
			System.out.println();
		}
		try {
			Solution test = new Solution(wealthInfo);
			test.getMaxWealth();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void testCase2() {
		int[][] wealthInfo = null;
		try {
			Solution test = new Solution(wealthInfo);
			test.getMaxWealth();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void testCase1() {
		int[][] wealthInfo = new int[3][3];
		for (int i = 0; i < wealthInfo.length; i++) {
			for (int j = 0; j < wealthInfo[i].length; j++) {
				wealthInfo[i][j] = (int) (Math.random() * 10);
				System.out.print(wealthInfo[i][j] + "   ");
			}
			System.out.println();
		}
		try {
			Solution test = new Solution(wealthInfo);
			System.out.println(test.getMaxWealth());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
