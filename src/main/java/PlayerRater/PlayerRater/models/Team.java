package PlayerRater.PlayerRater.models;

import PlayerRater.PlayerRater.models.Match;
import PlayerRater.PlayerRater.models.Player;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.imageio.plugins.jpeg.JPEG;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="teams")

public class Team {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="location")
    private String location;

    @Column(name="league")
    private String league;

    @Column(name="primary_colour")
    private String primaryColour;

    @Column(name="secondary_colour")
    private String secondaryColour;

    @Column(name="badge")
    private JPEG badge;
//    imageio (from jav

    @OneToMany(mappedBy="team")
    @JsonIgnoreProperties({"team"})
    private List<Match> matches;

    @OneToMany(mappedBy="team")
    @JsonIgnoreProperties({"team"})
    private List<Player> players;

    public Team(String name, String location, String league, String primaryColour, String secondaryColour, JPEG badge) {
        this.name = name;
        this.location = location;
        this.league = league;
        this.primaryColour = primaryColour;
        this.secondaryColour = secondaryColour;
        this.badge = badge;
        this.matches = new ArrayList<>();
        this.players = new ArrayList<>();
    }

    public Team(){

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getPrimaryColour() {
        return primaryColour;
    }

    public void setPrimaryColour(String primaryColour) {
        this.primaryColour = primaryColour;
    }

    public String getSecondaryColour() {
        return secondaryColour;
    }

    public void setSecondaryColour(String secondaryColour) {
        this.secondaryColour = secondaryColour;
    }

    public JPEG getBadge() {
        return badge;
    }

    public void setBadge(JPEG badge) {
        this.badge = badge;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
