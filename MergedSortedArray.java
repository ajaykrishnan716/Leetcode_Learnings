class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        for(int i = arr1.length - 1;i >= 0;i--){
           if(n >= 0){
               if(m > 0 && n > 0 && arr1[m - 1] < arr2[n - 1]){
                   arr1[i] = arr2[n - 1];
                   n--;
               }
               else if(m > 0 && n > 0 && arr1[m - 1] > arr2[n - 1]){
                   arr1[i] = arr1[m - 1];
                   m--;
               }else{
                if(n > 0){
                   arr1[i] = arr2[n - 1];
                   n--;
                }
               }
           }
           else{
               break;
           }
       }
       System.out.println(arr1);
    }
}