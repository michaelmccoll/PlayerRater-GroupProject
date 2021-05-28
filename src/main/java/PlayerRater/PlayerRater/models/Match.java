package PlayerRater.PlayerRater.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Entity
@Table(name="matches")
public class Match {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "opposition")
    private String opposition;

    @Column(name = "venue")
    private String venue;

    @ManyToMany
    @JsonIgnoreProperties({"matches"})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "players_matches",
            joinColumns = { @JoinColumn(
                    name = "match_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = { @JoinColumn(
                    name = "player_id",
                    nullable = false,
                    updatable = false)
            }
    )
    private List<Player> teamsheet;

    @Column(name = "homeScore")
    private Integer homeScore;

    @Column(name = "awayScore")
    private Integer awayScore;

    @ManyToMany
    @JsonIgnoreProperties({"matches"})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "stats_matches",
            joinColumns = { @JoinColumn(
                    name = "match_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = { @JoinColumn(
                    name = "stats_id",
                    nullable = false,
                    updatable = false)
            }
    )
    private List<Stats> stats;

    @ManyToOne
    @JoinColumn(name="team_id", nullable=false)
    @JsonIgnoreProperties({"matches"})
    private Team team;

    public Match(String opposition, String venue, Integer homeScore, Integer awayScore, Team team) {
        this.opposition = opposition;
        this.venue = venue;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.teamsheet = new ArrayList<>();
        this.stats = new ArrayList<>();
        this.team = team;
    }

    public Match() {

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getOpposition() {
        return opposition;
    }
    public void setOpposition(String opposition) {
        this.opposition = opposition;
    }

    public String getVenue() {
        return venue;
    }
    public void setVenue(String venue) {
        this.venue = venue;
    }

    public List<Player> getTeamsheet() {
        return teamsheet;
    }
    public Integer getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(Integer homeScore) {
        this.homeScore = homeScore;
    }
    public Integer getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(Integer awayScore) {
        this.awayScore = awayScore;
    }
    public void setTeamsheet(List<Player> teamsheet) {
        this.teamsheet = teamsheet;
    }

    public void addPlayerToTeamsheet(Player player){
        this.teamsheet.add(player);
    }

    public List<Stats> getStats() {
        return stats;
    }
    public void setStats(List<Stats> stats) {
        this.stats = stats;
    }

    public void addStatsToMatch(Stats stats){
        this.stats.add(stats);
    }
}