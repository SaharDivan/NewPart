package week9Streem.exe4WorldHappiness;

public class HappinessRecord {

    private String country;
    private Integer rank;
    private String scour;


    public HappinessRecord(String country, Integer rank, String score) {
        this.country = country;
        this.rank = rank;
        this.scour = score;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getScour() {
        return scour;
    }

    public void setScour(String scour) {
        this.scour = scour;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Rank: " + rank+
                " | country: " + country  +
                " | sour=" + scour;
    }
}
