class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] rich = new int[accounts.length];
        for(int i = 0;i < accounts.length;i++){
            int sum = 0;
            for(int j = 0;j < accounts[i].length;j++){
                sum = sum + accounts[i][j];
            }
            rich[i] = sum;
        }
        return max(rich);
    }
    static int max(int[] r){
        int m = r[0];
        for(int i = 1;i < r.length;i++){
            if(r[i] > m)
              m = r[i];
        }
        return m;
    }
}