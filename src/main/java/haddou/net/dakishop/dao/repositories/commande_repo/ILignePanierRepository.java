package haddou.net.dakishop.dao.repositories.commande_repo;

import haddou.net.dakishop.dao.entities.commande.LignePanier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ILignePanierRepository extends JpaRepository<LignePanier, Long> {

    List<LignePanier> findByPanierId(Long panierId);

    List<LignePanier> findByPanierIdOrderByDateAjoutDesc(Long panierId);

    @Query("SELECT SUM(l.quantite) FROM LignePanier l WHERE l.panier.id = :panierId")
    Integer sumQuantiteByPanierId(Long panierId);

    @Query("SELECT SUM(l.prixUnitaire * l.quantite) FROM LignePanier l WHERE l.panier.id = :panierId")
    Double calculerTotalPanier(Long panierId);

    void deleteAllByPanierId(Long panierId);
}
