package PlayerRater.PlayerRater.repositories;


import PlayerRater.PlayerRater.models.Stats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatsRepository extends JpaRepository<Stats, Long> {
}
