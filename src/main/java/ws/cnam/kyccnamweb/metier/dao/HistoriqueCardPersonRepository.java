package ws.cnam.kyccnamweb.metier.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ws.cnam.kyccnamweb.metier.entities.HistoriqueCardPerson;

public interface HistoriqueCardPersonRepository extends JpaRepository<HistoriqueCardPerson, Long>, JpaSpecificationExecutor<HistoriqueCardPerson>{


}
