class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = 0;
        int index2 = 0;
        int[] tempNums = new int[m + n];
        for(int i = 0; i < m + n; i++){
            if(index1 >= m){
                tempNums[i] = nums2[index2];
                index2++;
            }
            else if(index2 >= n){
                tempNums[i] = nums1[index1];
                index1++;
            }
            else if(nums1[index1] >= nums2[index2]){
                tempNums[i] = nums2[index2];
                index2++;
            }
            else{
                tempNums[i] = nums1[index1];
                index1++;
            }
        }
        for(int i = 0; i < m + n; i++){
            nums1[i] = tempNums[i];
        }
    }
}