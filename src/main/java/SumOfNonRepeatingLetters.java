import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;

public class SumOfNonRepeatingLetters {
    public int lengthOfLongestSubstring(String s) {

        int lengthSum = 0;
        int max = 0;
        HashMap<Character, Boolean> hashMap = new HashMap<Character, Boolean>();

        for (Character c : s.toCharArray()) {
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, true);
                lengthSum++;
            } else {
                if (max < lengthSum) {
                    max = lengthSum;
                }
                lengthSum = 0;
                hashMap.clear();
            }
        }
        return max;
    }
}
