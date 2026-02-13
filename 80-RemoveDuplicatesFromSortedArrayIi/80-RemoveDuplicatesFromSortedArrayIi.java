// Last updated: 2/13/2026, 9:45:28 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        //int k = Math.min(2, nums.length);
        if(nums.length<2){
            int k=nums.length;
            return k;
        } 
        int k=2;
        for (int i = 2; i < nums.length; i++)
            if (nums[i] != nums[k - 2])
                nums[k++] = nums[i];
        return k;
    }
}
