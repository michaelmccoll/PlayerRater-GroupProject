package PlayerRater.PlayerRater.components;

import PlayerRater.PlayerRater.models.Match;
import PlayerRater.PlayerRater.models.Player;
import PlayerRater.PlayerRater.models.Stats;
import PlayerRater.PlayerRater.models.Team;
import PlayerRater.PlayerRater.repositories.MatchRepository;
import PlayerRater.PlayerRater.repositories.PlayerRepository;
import PlayerRater.PlayerRater.repositories.StatsRepository;
import PlayerRater.PlayerRater.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.awt.*;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    MatchRepository matchRepository;

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    TeamRepository teamRepository;

    @Autowired
    StatsRepository statsRepository;

    public DataLoader() {

    }
    public void run(ApplicationArguments args){

        Team team1 = new Team("Leith Walkers","Leith Links","Edinburgh Amateurs", Color.green,Color.WHITE,null);
        teamRepository.save(team1);
        Team team2 = new Team("Gorgie F.C.","Murrayfield","Edinburgh Amateurs",Color.MAGENTA,Color.GRAY,null);
        teamRepository.save(team2);
        Team team3 = new Team("Queensferry Park Rangers","Forth Stadium","Edinburgh Amateurs",Color.BLUE,Color.BLACK,null);
        teamRepository.save(team3);
        Team team4 = new Team("Stockbridge United","Raeburn","Edinburgh Amateurs",Color.yellow,Color.pink,null);
        teamRepository.save(team4);
        Team team5 = new Team("Portobello Pirates","Joppa","Edinburgh Amateurs",Color.red,Color.black,null);
        teamRepository.save(team5);
        Team team6 = new Team("Morningsliders","Colinton","Edinburgh Amateurs",Color.orange,Color.CYAN,null);
        teamRepository.save(team6);

        Player player1 = new Player("Lionel","Messi",33,"Forward",Boolean.FALSE,team1);
        playerRepository.save(player1);
        team1.addPlayerToTeam(player1);
        teamRepository.save(team1);
        Player player2 = new Player("Cristiano","Ronaldo",3,"Forward",Boolean.FALSE,team1);
        playerRepository.save(player2);
        team1.addPlayerToTeam(player2);
        teamRepository.save(team1);
        Player player3 = new Player("Paul","Pogba",27,"Midfield",Boolean.FALSE,team1);
        playerRepository.save(player3);
        team1.addPlayerToTeam(player3);
        teamRepository.save(team1);
        Player player4 = new Player("Tiago","Alacantra",30,"Midfield",Boolean.FALSE,team1);
        playerRepository.save(player4);
        team1.addPlayerToTeam(player4);
        teamRepository.save(team1);
        Player player5 = new Player("Andy","Robertson",26,"Defender",Boolean.FALSE,team1);
        playerRepository.save(player5);
        team1.addPlayerToTeam(player5);
        teamRepository.save(team1);
        Player player6 = new Player("Jordi","Alba",31,"Defender",Boolean.FALSE,team1);
        playerRepository.save(player6);
        team1.addPlayerToTeam(player6);
        teamRepository.save(team1);
        Player player7 = new Player("David","Marshall",36,"Goalkeeper",Boolean.TRUE,team1);
        playerRepository.save(player7);
        team1.addPlayerToTeam(player7);
        teamRepository.save(team1);

        Match match1 = new Match("Gorgie F.C.","Murrayfield",3,2,team1);
        match1.addPlayerToTeamsheet(player1);
        match1.addPlayerToTeamsheet(player4);
        match1.addPlayerToTeamsheet(player5);
        match1.addPlayerToTeamsheet(player6);
        match1.addPlayerToTeamsheet(player7);
        matchRepository.save(match1);
        team1.addMatchToTeam(match1);
        teamRepository.save(team1);

        Match match2 = new Match("Queensferry Park Rangers","Forth Stadium",1,2,team1);
        match2.addPlayerToTeamsheet(player1);
        match2.addPlayerToTeamsheet(player2);
        match2.addPlayerToTeamsheet(player3);
        match2.addPlayerToTeamsheet(player6);
        match2.addPlayerToTeamsheet(player7);
        matchRepository.save(match2);
        team1.addMatchToTeam(match2);
        teamRepository.save(team1);

        Match match3 = new Match("Stockbridge United","Raeburn",2,2,team1);
        match3.addPlayerToTeamsheet(player1);
        match3.addPlayerToTeamsheet(player2);
        match3.addPlayerToTeamsheet(player3);
        match3.addPlayerToTeamsheet(player4);
        match3.addPlayerToTeamsheet(player7);
        matchRepository.save(match3);
        team1.addMatchToTeam(match3);
        teamRepository.save(team1);

        Match match4 = new Match("Portobello Pirates","Joppa",0,2,team1);
        match4.addPlayerToTeamsheet(player1);
        match4.addPlayerToTeamsheet(player2);
        match4.addPlayerToTeamsheet(player4);
        match4.addPlayerToTeamsheet(player5);
        match4.addPlayerToTeamsheet(player7);
        matchRepository.save(match4);
        team1.addMatchToTeam(match4);
        teamRepository.save(team1);

        Match match5 = new Match("Morningsliders","Colinton",4,3,team1);
        match5.addPlayerToTeamsheet(player1);
        match5.addPlayerToTeamsheet(player2);
        match5.addPlayerToTeamsheet(player3);
        match5.addPlayerToTeamsheet(player6);
        match5.addPlayerToTeamsheet(player7);
        matchRepository.save(match5);
        team1.addMatchToTeam(match5);
        teamRepository.save(team1);

        Stats stat1 = new Stats(player1,2,1,0,0);
        stat1.addMatchToStats(match1);
        match1.addStatsToMatch(stat1);
        player1.addMatchToPlayer(match1);
        player1.addStatsToPlayer(stat1);
        statsRepository.save(stat1);

    }
}

