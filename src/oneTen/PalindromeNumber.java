package oneTen;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        if(x<0) return false;

        int temp = x;
        int res = 0;

        while(temp>0){
            int rem = temp%10;
            temp/=10;
            if(res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && rem>7)) return false;
            res = res*10 + rem;
        }

        if(res==x)  return true;
        else return false;
    }
}
