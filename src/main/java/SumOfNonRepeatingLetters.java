import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SumOfNonRepeatingLetters {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        String str = "";

        for (Character c : s.toCharArray()) {
            str = str.contains(String.valueOf(c)) ? str.substring(str.indexOf(c) + 1) + c : str + c;
            max = Math.max(max, str.length());
        }
        return max;
    }
}
