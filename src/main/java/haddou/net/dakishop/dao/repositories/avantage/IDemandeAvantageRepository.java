package haddou.net.dakishop.dao.repositories.avantage;

import haddou.net.dakishop.dao.entities.stati_avantage.DemandeAvantage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDemandeAvantageRepository extends JpaRepository<DemandeAvantage,Long> {
}
