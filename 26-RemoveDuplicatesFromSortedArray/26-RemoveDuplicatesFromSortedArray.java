// Last updated: 2/13/2026, 9:45:48 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0;
        for(int right=1;right<nums.length;right++)
        {
            if(nums[left]!=nums[right])
            {
                left++;
                nums[left]=nums[right];
            }
        }
        return left+1;
    }
}