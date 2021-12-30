package oneTen;

public class LongestPalindrome {
    public String longestPalindrome(String s) {

        if(s.length()<1) return "";

        int start = 0, end = 0;

        for(int i = 0; i<s.length(); i++){
            if((s.length()-i)<((end-start+1)/2))   break;
            int len1 = expandFromMiddle(s, i, i);
            int len2 = expandFromMiddle(s, i, i+1);
            int len = Math.max(len1, len2);
            if(len>(end-start+1)){
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start, end+1);
    }

    public int expandFromMiddle(String s, int left, int right){

        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }

        left++;
        right--;

        return right - left + 1;
    }
}
