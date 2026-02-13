// Last updated: 2/13/2026, 9:44:35 AM
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int ans = 0, cur = 0;
        for (int i = 2; i < nums.length; i++) {
            cur = (nums[i] - nums[i-1] == nums[i-1] - nums[i-2]) ? cur + 1 : 0;
            ans += cur;
        }
        return ans;
    }
}
