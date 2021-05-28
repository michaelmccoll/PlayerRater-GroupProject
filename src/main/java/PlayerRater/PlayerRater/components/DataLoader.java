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

        Team team1 = new Team("Leith Walkers","Leith Links","Edinburgh Amateurs","Green","Purple",null);
        teamRepository.save(team1);

        Team team2 = new Team("Gorgie F.C.","Murrayfield","Edinburgh Amateurs","Red","White",null);
        teamRepository.save(team2);

        Team team3 = new Team("Queensferry Park Rangers","Forth Stadium","Edinburgh Amateurs","Blue","Black",null);
        teamRepository.save(team3);

        Team team4 = new Team("Stockbridge United","Raeburn","Edinburgh Amateurs","Yellow","White",null);
        teamRepository.save(team4);

        Team team5 = new Team("Portobello Pirates","Joppa","Edinburgh Amateurs","White","Black",null);
        teamRepository.save(team5);

        Team team6 = new Team("Morningsliders","Colinton","Edinburgh Amateurs","Orange","Grey",null);
        teamRepository.save(team6);

        Player player1 = new Player("Lionel Messi",33,"Forward",Boolean.FALSE,team1);
        playerRepository.save(player1);

        Player player2 = new Player("Cristiano Ronaldo",3,"Forward",Boolean.FALSE,team1);
        playerRepository.save(player2);

        Player player3 = new Player("Paul Pogba",27,"Midfield",Boolean.FALSE,team1);
        playerRepository.save(player3);

        Player player4 = new Player("Tiago Alacantra",30,"Midfield",Boolean.FALSE,team1);
        playerRepository.save(player4);

        Player player5 = new Player("Andy Robertson",26,"Defender",Boolean.FALSE,team1);
        playerRepository.save(player5);

        Player player6 = new Player("Jordi Alba",31,"Defender",Boolean.FALSE,team1);
        playerRepository.save(player6);

        Player player7 = new Player("David Marshall",36,"Goalkeeper",Boolean.TRUE,team1);
        playerRepository.save(player7);

        Match match1 = new Match("Gorgie F.C.","Murrayfield",3,2,team1);
        matchRepository.save(match1);

        Match match2 = new Match("Queensferry Park Rangers","Forth Stadium",1,2,team1);
        matchRepository.save(match2);

        Match match3 = new Match("Stockbridge United","Raeburn",2,2,team1);
        matchRepository.save(match3);

        Match match4 = new Match("Portobello Pirates","Joppa",0,2,team1);
        matchRepository.save(match4);

        Match match5 = new Match("Morningsliders","Colinton",4,3,team1);
        matchRepository.save(match5);

//        Stats stat1 = new Stats(player1,2,1,0,0);
////        stat1.addStatsToMatch(match1);
//
//        statsRepository.save(stat1);
//        playerRepository.save(player1);

    }
}

