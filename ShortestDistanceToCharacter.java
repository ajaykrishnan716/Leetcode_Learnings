import java.util.*;
class Solution {
    public int[] shortestToChar(String s, char c) {
        List <Integer> indices = new ArrayList<>();
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(ch == c){
                indices.add(i);
            }
        }
        System.out.println(indices);
        int[] output = new int[s.length()];
        int j = 0;
        for(int i = 0;i < s.length();i++){
            while(j < indices.size() - 1 && Math.abs(i - indices.get(j + 1)) <= Math.abs(i - indices.get(j))){
                j++;
            }
            output[i] = Math.abs(i - indices.get(j));
        }
        return output;
    }
}