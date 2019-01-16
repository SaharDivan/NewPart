package week9Streem.exe5FilmSummerize;

public class FilmSummarizerApplication {

    public static void main(String[] args) {

        FilmSummarizer summarizer = new FilmSummarizer();
        summarizer.getTopScores();
        summarizer.getTopScoresLong();
        summarizer.getTopExpensive();
        summarizer.getTopExpensiveShort();
        summarizer.getTopRatedWithBudget();
    }
}
