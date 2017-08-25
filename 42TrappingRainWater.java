class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        if (left >= right) {
            return res;
        }
        
        int leftheight = height[left];
        int rightheight = height[right];
        
        while (left < right) {
            if (leftheight < rightheight) {
                left++;
                if (leftheight > height[left]) {
                    res += (leftheight - height[left]);
                } else {
                    leftheight = height[left];
                }
            } else {
                right--;
                if (rightheight > height[right]) {
                    res += (rightheight - height[right]);
                } else {
                    rightheight = height[right];
                }
            }
        }
        return res;
    }
}