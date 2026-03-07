package haddou.net.dakishop.dao.repositories.produit_repo;

import haddou.net.dakishop.dao.entities.produit.Avis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAvisRepository extends JpaRepository<Avis, Long> {
}
