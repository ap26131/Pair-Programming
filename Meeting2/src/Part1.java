import java.util.Arrays;

public class Part1 {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 1};
		int[] arr2 = {1, 3, 2, 1};
		
		System.out.println(Arrays.toString(getConcatenation(arr1)));
		System.out.println(Arrays.toString(getConcatenation(arr2)));
	}

	public static int[] getConcatenation(int[] nums) {
		int[] ans = new int[nums.length * 2];

		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[i];
			ans[i + nums.length] = nums[i];
		}

		return ans;

	}
}

// LeetCode: https://leetcode.com/problems/concatenation-of-array/