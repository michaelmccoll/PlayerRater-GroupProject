package PlayerRater.PlayerRater.models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Match {

    private Long id;
    private String opposition;
    private String venue;
    private List<Player> teamsheet;
    private ArrayList<Integer> score;
    private HashMap<Player, Integer> goals;
    private HashMap<Player, Integer> assists;
    private HashMap<Player, Integer> yellowCards;
    private HashMap<Player, Integer> redCards;


    public Match(String opposition, String venue) {
        this.opposition = opposition;
        this.venue = venue;
        this.teamsheet = new ArrayList<>();
        this.score = new ArrayList<>();
        this.goals = new HashMap<>();
        this.assists = new HashMap<>();
        this.yellowCards = new HashMap<>();
        this.redCards = new HashMap<>();
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

    public void setTeamsheet(List<Player> teamsheet) {
        this.teamsheet = teamsheet;
    }

    public ArrayList<Integer> getScore() {
        return score;
    }

    public void setScore(ArrayList<Integer> score) {
        this.score = score;
    }

    public HashMap<Player, Integer> getGoals() {
        return goals;
    }

    public void setGoals(HashMap<Player, Integer> goals) {
        this.goals = goals;
    }

    public HashMap<Player, Integer> getAssists() {
        return assists;
    }

    public void setAssists(HashMap<Player, Integer> assists) {
        this.assists = assists;
    }

    public HashMap<Player, Integer> getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(HashMap<Player, Integer> yellowCards) {
        this.yellowCards = yellowCards;
    }

    public HashMap<Player, Integer> getRedCards() {
        return redCards;
    }

    public void setRedCards(HashMap<Player, Integer> redCards) {
        this.redCards = redCards;
    }
}
