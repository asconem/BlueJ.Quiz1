
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String str = baseValue + valueToBeAdded;
        return str;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        StringBuilder sb = new StringBuilder();
        for (int i = valueToBeReversed.length() - 1; i >=0; i--) {
            sb.append(valueToBeReversed.charAt(i));
        }
        
        return sb.toString();
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int stringLength = word.length();
        int middle = stringLength/2;
        char mid = word.charAt(middle);
        return mid;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        int index = value.indexOf(charToRemove);
        if(index == -1) {
            return value;
        }
        return removeCharacter(value.substring(0, index) + value.substring(index +1, value.length()), charToRemove);
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String str = sentence;
        String lastWord = str.substring(str.lastIndexOf(" ") + 1);
        
        return lastWord;
    }
}
