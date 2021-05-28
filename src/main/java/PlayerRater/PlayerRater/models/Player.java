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

    @Column(name="name")
    private String name;

    @Column(name="age")
    private Integer age;

    @Column(name="position")
    private String position;

    @Column(name="totalGoals")
    private Integer totalGoals;

    @Column(name="totalAssists")
    private Integer totalAssists;

    @Column(name="totalCleanSheets")
    private Integer totalCleanSheets;

    @Column(name="management")
    private Boolean management;

    @Column(name="totalYellowCards")
    private Integer totalYellowCards;

    @Column(name="totalRedCards")
    private Integer totalRedCards;

    @Column(name="ratings")
    private ArrayList<Integer> ratings;

    @Column(name="totalAwards")
    private Integer totalAwards;

    @ManyToOne
    @JoinColumn(name="team_id", nullable=false)
    @JsonIgnoreProperties({"players"})
    private Team team;

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


    public Player(
            String name, Integer age, String position, Boolean management, Team team) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.totalGoals = null;
        this.totalAssists = null;
        this.totalCleanSheets = null;
        this.management = management;
        this.totalYellowCards = null;
        this.totalRedCards = null;
        this.ratings = new ArrayList<>();
        this.totalAwards = null;
        this.team = team;
        this.matches = new ArrayList<>();
    }

    public Player(){

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

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public List<Match> getMatches() {
        return this.matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }
}
