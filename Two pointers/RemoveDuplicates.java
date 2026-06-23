class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        int ind = 0;
        while(j < nums.length){
            if(nums[i] != nums[j]){
                nums[ind++] = nums[i];
            }
            i++;
            j++;
        }
        nums[ind++] = nums[nums.length - 1];
        return ind;
    }
}