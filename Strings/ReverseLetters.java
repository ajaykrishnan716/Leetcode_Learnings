package Strings;
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] output = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(!(output[i] >= 'A' && output[i] <= 'Z' || output[i] >= 'a' && output[i] <= 'z')){
                i++;
            }
            else if(!(output[j] >= 'A' && output[j] <= 'Z' || output[j] >= 'a' && output[j] <= 'z')){
                j--;
            }
            else{
                char temp = output[i];
                output[i] = output[j];
                output[j] = temp;
                i++;
                j--;
               //System.out.print(Arrays.toString(output));
            }
        }
        return new String(output);
    }
}
