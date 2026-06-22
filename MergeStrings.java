class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        String s = "";
        if(word1.length() < word2.length()){
            while(i < word1.length()){
                s += word1.charAt(i);
                s += word2.charAt(j);
                i++;
                j++;
            }
            s += word2.substring(j, word2.length());
        }
        else if(word2.length() < word1.length()){
            while(j < word2.length()){
                s += word1.charAt(i);
                s += word2.charAt(j);
                i++;
                j++;
            }
            s += word1.substring(i, word1.length());
        }
        else {
            while(i < word1.length() && j < word2.length()){
                s += word1.charAt(i);
                s += word2.charAt(j);
                i++;
                j++;
            }
        }
        return s;
    }
}