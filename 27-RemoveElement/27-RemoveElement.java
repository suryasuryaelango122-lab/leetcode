// Last updated: 2/13/2026, 9:45:46 AM
class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0;
        //int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(val!=nums[i]){
               nums[c]=nums[i];
               c++;
            }
        }
        //for(int i=0;i<c;i++){
        //return res[i];
        //}
        return c;
    }
}