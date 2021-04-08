public class LongestPallindrome {
    public String longestPalindrome(String s) {

        String maxPallindrome = "";
        StringBuilder sTest = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sTest.append(s.charAt(i));
            if(sTest.charAt(0) == sTest.charAt(i)){
            String forward = sTest.toString();
            String backward = sTest.reverse().toString();
            if (forward.equals(backward)) {
                if (maxPallindrome.length() < forward.length()) {
                    maxPallindrome = forward;
                }
            }
            sTest.reverse();
            }
        }

        String string = s.length() >= 1 ? longestPalindrome(s.substring(1)) : "";

        return string.length() > maxPallindrome.length() ? string : maxPallindrome;
    }
}
