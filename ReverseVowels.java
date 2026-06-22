import java.util.*;
class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        List <Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            if(vowels.contains(arr[i]) && vowels.contains(arr[j])){
                char temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
                j--;
            }
            else if(!vowels.contains(arr[i]) && vowels.contains(arr[j])){
                i++;
            }
            else if (vowels.contains(arr[i]) && !vowels.contains(arr[j])){
                j--;
            }
            else{
                i++;
                j--;
            }
        }
        String result = new String(arr);
        return result;
    }
}