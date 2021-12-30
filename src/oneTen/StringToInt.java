package oneTen;

public class StringToInt {
    public int myAtoi(String s) {

        boolean neg = false;
        boolean charAfterDigits = false;

        int num = 0;

        for(int i = 0; i<s.length(); i++){

            if(s.charAt(i)==' ' && charAfterDigits == false)    continue;
            else if(s.charAt(i)=='-' && charAfterDigits == false){
                neg = true;
                charAfterDigits = true;
                continue;
            }
            else if(s.charAt(i)=='+' && charAfterDigits == false){
                charAfterDigits = true;
                continue;
            }
            else if(Character.isDigit(s.charAt(i))){
                charAfterDigits = true;
                int digit = Integer.parseInt(String.valueOf(s.charAt(i)));

                if (neg == false && (num > Integer.MAX_VALUE/10 || (num == Integer.MAX_VALUE / 10 && digit > 7))) return Integer.MAX_VALUE;
                if (neg == true && (-num < Integer.MIN_VALUE/10 || (-num == Integer.MIN_VALUE / 10 && digit > 8))) return Integer.MIN_VALUE;

                num = num*10 + digit;

            }
            else break;
        }

        if(neg) return num*(-1);
        else return num;


    }
}
