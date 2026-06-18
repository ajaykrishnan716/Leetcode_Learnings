class Solution {
    public void sortColors(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int ind = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == 0) count0++;
            else if(nums[i] == 1) count1++;
            else count2++;
        }
        for(int i = 0;i < count0;i++){
            nums[ind++] = 0;
        }
        for(int j = 0;j < count1;j++){
            nums[ind++] = 1;
        }
        for(int k = 0;k < count2;k++){
            nums[ind++] = 2;
        }
    }
}