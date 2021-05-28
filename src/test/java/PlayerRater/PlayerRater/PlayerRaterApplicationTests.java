package PlayerRater.PlayerRater;

import PlayerRater.PlayerRater.repositories.MatchRepository;
import PlayerRater.PlayerRater.repositories.PlayerRepository;
import PlayerRater.PlayerRater.repositories.StatsRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
class PlayerRaterApplicationTests {

	@Autowired
	StatsRepository teamRepository;

	@Autowired
	MatchRepository matchRepository;

	@Autowired
	PlayerRepository playerRepository;

	@Autowired
	StatsRepository statsRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateTeam(){

	}
}
