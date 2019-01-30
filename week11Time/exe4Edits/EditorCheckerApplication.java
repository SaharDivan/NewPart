package week11Time.exe4Edits;

import java.util.Scanner;

public class EditorCheckerApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Evaluator evaluator = new Evaluator();
        String theText = getTheText(scanner);
        String theOriginalText = getTheOriginal(scanner);

        Boolean result = evaluator.isEitherOneOrZeroStepAway(theText, theOriginalText);
        System.out.println("The text is either correct or needs one single step editing to be correct. | " + result);
    }

    private static String getTheText(Scanner scanner) {
        System.out.println("Please Enter The Edited Text");
        return scanner.nextLine();
    }

    private static String getTheOriginal(Scanner scanner) {
        System.out.println("Please Enter The Original Text");
        return scanner.nextLine();
    }
}
