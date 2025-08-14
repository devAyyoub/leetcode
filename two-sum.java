class Solution {
	public int[] twoSum(int[] nums, int target) {
		java.util.Map<Integer, Integer> indexByValue = new java.util.HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			Integer previousIndex = indexByValue.get(complement);
			if (previousIndex != null) {
				return new int[] { previousIndex, i };
			}
			indexByValue.put(nums[i], i);
		}
		return new int[] { -1, -1 };
	}
}
