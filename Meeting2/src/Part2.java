import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Part2 {

	public static void main(String[] args) {
		Integer[] arr1 = { -1, 1, 2, 3, 1 };
		List<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));
		Integer[] arr2 = { -6, 2, 5, -2, -7, -1, 3 };
		List<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));

		System.out.println(countPairs(list1, 2));
		System.out.println(countPairs(list2, -2));
	}

	public static int countPairs(List<Integer> nums, int target) {
		int count = 0;

		for (int i = 0; i < nums.size(); i++) {
			for (int j = i + 1; j < nums.size(); j++) {
				if (nums.get(i) + nums.get(j) < target) {
					count++;
				}
			}
		}

		return count;
	}
}

// LeetCode: https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
