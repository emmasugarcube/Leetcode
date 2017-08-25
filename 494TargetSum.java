class 494TargetSum {
	int count = 0;
	public int findTargetSumWays (int[] nums, int s) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum -= nums[i];
		}
		if (s < sum || s > -sum) {
			return 0;
		}

		dp (s - sum, nums, 0, nums.length - 1);
		return count;
	}
	private void dp (int diff, int[] nums, int lo, int hi) {
		if (diff == 0) {
			count++;
		} else if (diff < 0 || lo > hi) {
			return;
		}

		for (int i = lo; i <= hi; i++) {
			int newdiff = diff - nums[i] * 2;
			dp (newdiff, nums, i + 1, hi);
		}
	}
}