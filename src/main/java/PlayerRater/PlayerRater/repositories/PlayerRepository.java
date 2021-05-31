package PlayerRater.PlayerRater.repositories;

import PlayerRater.PlayerRater.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    List<Player> findPlayersByTeamName(String team_name);
    List<Player> findAll();
    List<Player> findPlayersByMatchId(int i);
}
