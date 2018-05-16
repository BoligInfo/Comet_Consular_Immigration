package dk.comet.repositories;

import dk.comet.models.Statistics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("apartmentRepository")
public interface StatisticsRepository extends JpaRepository<Statistics, Integer> {

}