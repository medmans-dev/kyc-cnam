package ws.cnam.kyccnamweb.metier.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ws.cnam.kyccnamweb.metier.entities.PersonneAssure;

public interface PersonneRepository extends JpaRepository<PersonneAssure, String>, JpaSpecificationExecutor<PersonneAssure>{

	PersonneAssure findByNni(String nni);

}
