package week9Streem.exe5FilmSummerize;

public class Film {
    private Long Budget;
    private Long revenue;
    private Integer runTime;
    private String title;
    private Double score;
    private Integer voteCount;

    public Film(Long budget, Long revenue, Integer runTime, String title, Double score, Integer voteCount) {
        Budget = budget;
        this.revenue = revenue;
        this.runTime = runTime;
        this.title = title;
        this.score = score;
        this.voteCount = voteCount;
    }

    public Long getBudget() {
        return Budget;
    }

    public void setBudget(Long budget) {
        Budget = budget;
    }

    public Long getRevenue() {
        return revenue;
    }

    public void setRevenue(Long revenue) {
        this.revenue = revenue;
    }

    public Integer getRunTime() {
        return runTime;
    }

    public void setRunTime(Integer runTime) {
        this.runTime = runTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    @Override
    public String toString() {
        return "Film" +
                " Budget=" + Budget +
                " revenue=" + revenue +
                " runTime=" + runTime +
                " title='" + title +
                " score='" + score +
                " voteCount=" + voteCount;
    }
}
