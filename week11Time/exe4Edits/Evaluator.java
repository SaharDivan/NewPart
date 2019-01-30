package week11Time.exe4Edits;

public class Evaluator {

    public Boolean isEitherOneOrZeroStepAway(String theText, String theOriginalText) {
        return isTextCorrect(theText, theOriginalText) ||
                isOneEditingStepAway(theText, theOriginalText);
    }

    private Boolean isTextCorrect(String theText, String theOriginalText) {
        return theText.equalsIgnoreCase(theOriginalText);
    }

    private Boolean isOneEditingStepAway(String text, String originalText) {
        if (isTooManyStepAway(text, originalText)) {
            return false;
        }
        int lengthMin = Math.min(text.length(), originalText.length());
        int lengthDiffer = text.length() - originalText.length();
        int acceptanceFactor = 0;
        int shift = 0;
        for (int position = 0; position < lengthMin; position++) {
            Character letterTarget = text.charAt(position + shift);
            Character letterMeasure= originalText.charAt(position);
            if (!(letterTarget.equals(letterMeasure))) {
                acceptanceFactor++;
                if(acceptanceFactor==1)
                shift = shift + lengthDiffer;
            }
        }
        return acceptanceFactor <= 1;
    }
    private boolean isTooManyStepAway(String text, String originalText) {
        return Math.abs(text.length() - originalText.length()) > 1;
    }
}