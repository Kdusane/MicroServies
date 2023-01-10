package MicroServicetwo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PDRepo extends JpaRepository<PersonalDetails, Integer> {
}
