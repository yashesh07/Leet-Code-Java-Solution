package oneTen;

public class ReverseNumber {
    public int reverse(int x) {

        int revInt = 0;
        boolean negInt = false;

        if(x<0){
            x = x*(-1);
            negInt = true;
        }

        while(x>0){
            int rem = x % 10;
            x = x/10;

            if (revInt > Integer.MAX_VALUE/10 || (revInt == Integer.MAX_VALUE / 10 && rem > 7)) return 0;
            if (revInt < Integer.MIN_VALUE/10 || (revInt == Integer.MIN_VALUE / 10 && rem < 8)) return 0;   //this line may have some correction

            revInt = revInt*10 + rem;
        }

        if(negInt)  revInt = revInt*(-1);

        return revInt;
    }
}
