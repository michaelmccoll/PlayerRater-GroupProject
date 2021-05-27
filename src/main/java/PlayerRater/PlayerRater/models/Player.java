package PlayerRater.PlayerRater.models;

import java.util.ArrayList;

public class Player {

    private Long id;
    private String name;
    private Integer age;
    private String position;
    private Integer totalGoals;
    private Integer totalAssist;
    private Integer totalCleansheets;
    private Boolean management;
    private Integer totalYellowCards;
    private Integer totalRedCards;
    private ArrayList<Rater> ratings;
    private Integer totalAwards;


    public Player(
            String name, Integer age, String position, Integer totalGoals,
            Integer totalAssist, Integer totalCleansheets, Boolean management,
            Integer totalYellowCards, Integer totalRedCards, ArrayList<Rater> ratings,
            Integer totalAwards) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.totalGoals = totalGoals;
        this.totalAssist = totalAssist;
        this.totalCleansheets = totalCleansheets;
        this.management = management;
        this.totalYellowCards = totalYellowCards;
        this.totalRedCards = totalRedCards;
        this.ratings = ratings;
        this.totalAwards = totalAwards;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getTotalGoals() {
        return totalGoals;
    }

    public void setTotalGoals(Integer totalGoals) {
        this.totalGoals = totalGoals;
    }

    public Integer getTotalAssist() {
        return totalAssist;
    }

    public void setTotalAssist(Integer totalAssist) {
        this.totalAssist = totalAssist;
    }

    public Integer getTotalCleansheets() {
        return totalCleansheets;
    }

    public void setTotalCleansheets(Integer totalCleansheets) {
        this.totalCleansheets = totalCleansheets;
    }

    public Boolean getManagement() {
        return management;
    }

    public void setManagement(Boolean management) {
        this.management = management;
    }

    public Integer getTotalYellowCards() {
        return totalYellowCards;
    }

    public void setTotalYellowCards(Integer totalYellowCards) {
        this.totalYellowCards = totalYellowCards;
    }

    public Integer getTotalRedCards() {
        return totalRedCards;
    }

    public void setTotalRedCards(Integer totalRedCards) {
        this.totalRedCards = totalRedCards;
    }

    public ArrayList<Rater> getRatings() {
        return ratings;
    }

    public void setRatings(ArrayList<Rater> ratings) {
        this.ratings = ratings;
    }

    public Integer getTotalAwards() {
        return totalAwards;
    }

    public void setTotalAwards(Integer totalAwards) {
        this.totalAwards = totalAwards;
    }
}
