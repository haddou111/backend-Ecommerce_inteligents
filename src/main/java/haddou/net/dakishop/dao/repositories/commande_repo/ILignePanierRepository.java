package haddou.net.dakishop.dao.repositories.commande_repo;

import haddou.net.dakishop.dao.entities.commande.LignePanier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILignePanierRepository extends JpaRepository<LignePanier,Long> {
}
