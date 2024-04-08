// uses https://en.wikipedia.org/wiki/Boyer%E2%80%93Moore_majority_vote_algorithm

class Solution {
    public int majorityElement(int[] nums) {
        int temp = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                temp = nums[i];
                count = 1;
            }
            else if(temp == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return temp;
    }
}