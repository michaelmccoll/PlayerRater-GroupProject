package PlayerRater.PlayerRater.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="players")

public class Player {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @Column(name="first_name")
    private String first_name;

    @Column(name="second_name")
    private String second_name;

    @Column(name="age")
    private Integer age;

    @Column(name="position")
    private String position;

    @Column(name="management")
    private Boolean management;

    @ManyToOne
    @JoinColumn(name="team_id", nullable=false)
    @JsonIgnoreProperties({"players"})
    private Team team;

// Replace these with Stats class
    @Column(name="totalGoals")
    private Integer totalGoals;
    @Column(name="totalAssists")
    private Integer totalAssists;
    @Column(name="totalCleanSheets")
    private Integer totalCleanSheets;
    @Column(name="totalYellowCards")
    private Integer totalYellowCards;
    @Column(name="totalRedCards")
    private Integer totalRedCards;

    @ManyToMany
    @JsonIgnoreProperties({"players"})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "players_matches",
            joinColumns = { @JoinColumn(
                    name = "player_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = { @JoinColumn(
                    name = "match_id",
                    nullable = false,
                    updatable = false)
            }
    )
    private List<Match> matches;

    @Column(name="ratings")
    private ArrayList<Integer> ratings;

    @Column(name="totalAwards")
    private Integer totalAwards;

    public Player(
            String first_name, String second_name, Integer age, String position, Boolean management, Team team) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.age = age;
        this.position = position;
        this.management = management;
        this.team = team;

        this.totalGoals = 0;
        this.totalAssists = 0;
        this.totalCleanSheets = 0;
        this.totalYellowCards = 0;
        this.totalRedCards = 0;

        this.matches = new ArrayList<>();
        this.ratings = new ArrayList<>();
        this.totalAwards = 0;

    }

    public Player(){

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }
    public void setSecond_name(String second_name) {
        this.second_name = second_name;
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

    public Boolean getManagement() {
        return management;
    }
    public void setManagement(Boolean management) {
        this.management = management;
    }

    public Team getTeam() {
        return team;
    }
    public void setTeam(Team team) {
        this.team = team;
    }


    public Integer getTotalGoals() {
        return totalGoals;
    }
    public void setTotalGoals(Integer totalGoals) {
        this.totalGoals = totalGoals;
    }

    public Integer getTotalAssists() {
        return totalAssists;
    }
    public void setTotalAssists(Integer totalAssist) {
        this.totalAssists = totalAssists;
    }

    public Integer getTotalCleanSheets() {
        return totalCleanSheets;
    }
    public void setTotalCleanSheets(Integer totalCleanSheets) {
        this.totalCleanSheets = totalCleanSheets;
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


    public Integer getTotalAwards() {
        return totalAwards;
    }
    public void setTotalAwards(Integer totalAwards) {
        this.totalAwards = totalAwards;
    }

    public ArrayList<Integer> getRatings() {
        return ratings;
    }
    public void setRatings(ArrayList<Integer> ratings) {
        this.ratings = ratings;
    }

    public List<Match> getMatches() {
        return this.matches;
    }
    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public void addMatchToPlayer(Match match) {
        this.matches.add(match);
    }
}
