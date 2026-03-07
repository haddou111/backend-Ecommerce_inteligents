package haddou.net.dakishop.dao.repositories.commande_repo;

import haddou.net.dakishop.dao.entities.commande.LigneCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILigneCommandeRepository extends JpaRepository<LigneCommande,Long> {
}
