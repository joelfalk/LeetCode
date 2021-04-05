import spock.lang.Specification

class SumOfNonRepeatingLettersTest extends Specification {

    def "test"() {
        given:
        SumOfNonRepeatingLetters sum = new SumOfNonRepeatingLetters();

        when:
        int length = sum.lengthOfLongestSubstring("abcabcbb")

        then:
        length == 3
    }

}
