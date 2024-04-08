class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int count = 0; count < nums.length; count++){
            if(nums[count] != val){
                nums[k] = nums[count];
                k++;
            }
        }
        return k;
    }
}