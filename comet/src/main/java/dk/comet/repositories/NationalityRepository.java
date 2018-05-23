package dk.comet.repositories;

import dk.comet.models.Nationality;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NationalityRepository extends JpaRepository<Nationality, String> {

    Optional<Nationality> findById (String id);


}
