class Solution {
    public String optimalDivision(int[] nums) {
        String rst = "";
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                rst += "/";
            }
            if (i == 1 && nums.length > 2) {
                rst += "(";
            }
            rst += Integer.toString(nums[i]);
            if (i == nums.length - 1 && nums.length > 2) {
                rst += ")";
            }
        }
        return rst;
    }
}