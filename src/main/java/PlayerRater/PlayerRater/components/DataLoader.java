package PlayerRater.PlayerRater.components;

import PlayerRater.PlayerRater.repositories.MatchRepository;
import PlayerRater.PlayerRater.repositories.PlayerRepository;
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


    public DataLoader() {

    }
    public void run(ApplicationArguments args){

    }
}
