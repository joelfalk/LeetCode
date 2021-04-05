import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SumOfNonRepeatingLetters {
    public int lengthOfLongestSubstring(String s) {

        int lengthSum = 0;
        int max = 0;
        List<Character> characterList = new ArrayList<>();
        for (Character c : s.toCharArray()) {
            if (!characterList.contains(c)) {
                characterList.add(c);
                lengthSum++;
            } else {
                if (max < lengthSum) {
                    max = lengthSum;
                }
                lengthSum = 0;
                characterList.clear();
            }
        }
        return max;
    }
}
