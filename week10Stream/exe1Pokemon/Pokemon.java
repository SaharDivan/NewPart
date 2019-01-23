package week10Stream.exe1Pokemon;

public class Pokemon {
    private String name;
    private String type1;
    private String type2;
    private String generation;
    private Integer speed;
    private Boolean legendary;

    public Pokemon(String name, String type1, String type2, String generation,Integer speed,Boolean legendary) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.generation = generation;
        this.speed = speed;
        this.legendary = legendary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Boolean getLegendary() {
        return legendary;
    }

    public void setLegendary(Boolean legendary) {
        this.legendary = legendary;
    }

    @Override
    public String toString() {
        return name;
    }
}
