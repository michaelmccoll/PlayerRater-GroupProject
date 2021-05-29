package PlayerRater.PlayerRater.repositories;


import PlayerRater.PlayerRater.models.Match;
import PlayerRater.PlayerRater.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {
    List<Match> findMatchesByTeamName(String team_name);

//    List<Match> findTeamsheetByMatches_id(long match_id);
}
