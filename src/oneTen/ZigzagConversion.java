package oneTen;

import java.util.ArrayList;

public class ZigzagConversion {
    public String convert(String s, int numRows) {

        if(numRows==1)  return s;

        ArrayList<Character>[] r = new ArrayList[numRows];

        for(int i = 0; i<numRows; i++){
            ArrayList<Character> list = new ArrayList<>();
            r[i] = list;
        }

        int index = 0;
        boolean check = true;

        for(int i = 0; i<s.length(); i++){
            r[index].add(s.charAt(i));
            if(check)   index++;
            else    index--;
            if(index==numRows-1)    check = false;
            else if(index==0)   check = true;
        }

        String res = "";

        for(int i = 0; i<numRows; i++){
            for(int j = 0; j<r[i].size(); j++)
                res = res + r[i].get(j);
        }

        return res;
    }
}
