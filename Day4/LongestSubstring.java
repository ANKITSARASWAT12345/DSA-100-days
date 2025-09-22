package Day4;

import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println("    length of Longest Substring Without Repeating Characters: "+longestSubstringLength(s));
    }
    public static int longestSubstringLength(String s){

        HashMap<Character, Integer> mp=new HashMap<>();

        int left=0;
        int maxLen=0;


        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            if(mp.containsKey(c)){
                left=Math.max(left,mp.get(c)+1);
            }
            mp.put(c, right);
            maxLen=Math.max(maxLen, right-left+1);

        }
        return maxLen;
    }
}
