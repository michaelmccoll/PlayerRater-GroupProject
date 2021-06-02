package PlayerRater.PlayerRater.components;

import PlayerRater.PlayerRater.models.*;
import PlayerRater.PlayerRater.repositories.*;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.nio.file.Paths;
import java.sql.Blob;
import java.time.LocalDate;

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

    @Autowired
    RatingRepository ratingRepository;

    public DataLoader() {

    }
    public void run(ApplicationArguments args){

        Team team1 = new Team("Leith Walkers","Leith Links","Edinburgh Amateurs", "#009933","#FFFFFF", null);
        teamRepository.save(team1);
        Team team2 = new Team("Gorgie F.C.","Murrayfield","Edinburgh Amateurs","#FF00FF","#808080",null);
        teamRepository.save(team2);
        Team team3 = new Team("Queensferry Park Rangers","Forth Stadium","Edinburgh Amateurs","#0000FF","#000000",null);
        teamRepository.save(team3);
        Team team4 = new Team("Stockbridge United","Raeburn","Edinburgh Amateurs","#FFFF00","#FFC0CB",null);
        teamRepository.save(team4);
        Team team5 = new Team("Portobello Pirates","Joppa","Edinburgh Amateurs","#FF0000","#000000",null);
        teamRepository.save(team5);
        Team team6 = new Team("Morningsliders","Colinton","Edinburgh Amateurs","#FFA500","#00FFFF",null);
        teamRepository.save(team6);

//        Team team1 = new Team("Leith Walkers","Leith Links","Edinburgh Amateurs",null);
//        teamRepository.save(team1);
//        Team team2 = new Team("Gorgie F.C.","Murrayfield","Edinburgh Amateurs",null);
//        teamRepository.save(team2);
//        Team team3 = new Team("Queensferry Park Rangers","Forth Stadium","Edinburgh Amateurs",null);
//        teamRepository.save(team3);
//        Team team4 = new Team("Stockbridge United","Raeburn","Edinburgh Amateurs",null);
//        teamRepository.save(team4);
//        Team team5 = new Team("Portobello Pirates","Joppa","Edinburgh Amateurs",null);
//        teamRepository.save(team5);
//        Team team6 = new Team("Morningsliders","Colinton","Edinburgh Amateurs",null);
//        teamRepository.save(team6);

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

        LocalDate testDate1 = LocalDate.of(2021, 5, 30);
        LocalDate testDate2 = LocalDate.of(2021, 5, 31);
        LocalDate testDate3 = LocalDate.of(2021, 6, 1);
        LocalDate testDate4 = LocalDate.of(2021, 6, 2);

        Match match1 = new Match(testDate1, true, "Gorgie F.C.",true,3,2,team1);
        match1.addPlayerToTeamsheet(player1);
        match1.addPlayerToTeamsheet(player4);
        match1.addPlayerToTeamsheet(player5);
        match1.addPlayerToTeamsheet(player6);
        match1.addPlayerToTeamsheet(player7);
        matchRepository.save(match1);
        team1.addMatchToTeam(match1);
        teamRepository.save(team1);

        Match match2 = new Match(testDate1, true,"Queensferry Park Rangers",true,1,2,team1);
        match2.addPlayerToTeamsheet(player1);
        match2.addPlayerToTeamsheet(player2);
        match2.addPlayerToTeamsheet(player3);
        match2.addPlayerToTeamsheet(player6);
        match2.addPlayerToTeamsheet(player7);
        matchRepository.save(match2);
        team1.addMatchToTeam(match2);
        teamRepository.save(team1);

        Match match3 = new Match(testDate2, true,"Stockbridge United",false,2,2,team1);
        match3.addPlayerToTeamsheet(player1);
        match3.addPlayerToTeamsheet(player2);
        match3.addPlayerToTeamsheet(player3);
        match3.addPlayerToTeamsheet(player4);
        match3.addPlayerToTeamsheet(player7);
        matchRepository.save(match3);
        team1.addMatchToTeam(match3);
        teamRepository.save(team1);

        Match match4 = new Match(testDate3, false,"Portobello Pirates",true,0,2,team1);
        match4.addPlayerToTeamsheet(player1);
        match4.addPlayerToTeamsheet(player2);
        match4.addPlayerToTeamsheet(player4);
        match4.addPlayerToTeamsheet(player5);
        match4.addPlayerToTeamsheet(player7);
        matchRepository.save(match4);
        team1.addMatchToTeam(match4);
        teamRepository.save(team1);

        Match match5 = new Match(testDate4, false,"Morningsliders",true,4,3,team1);
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

        Rating rating1 = new Rating(player1,match1,5);
        ratingRepository.save(rating1);
    }
}

