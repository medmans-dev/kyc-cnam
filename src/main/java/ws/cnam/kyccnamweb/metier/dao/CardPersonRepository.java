package ws.cnam.kyccnamweb.metier.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ws.cnam.kyccnamweb.metier.entities.CardPerson;

public interface CardPersonRepository extends JpaRepository<CardPerson, String>, JpaSpecificationExecutor<CardPerson>{


}
