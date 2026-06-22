class Solution {
    public int maxProfit(int[] arr) {
        if(arr.length == 1){
            return 0;
        }
        int i = 0;
        int j = 1;
        int maxProfit = 0;
        while(j < arr.length){
            int sum = 0;
            if(arr[j] < arr[i]){
                i++;
            }
            else{
               sum = arr[j] - arr[i];
               j++;
            }
            if(sum > maxProfit){
                maxProfit = sum;
            }
        }
        return maxProfit;
    }
}