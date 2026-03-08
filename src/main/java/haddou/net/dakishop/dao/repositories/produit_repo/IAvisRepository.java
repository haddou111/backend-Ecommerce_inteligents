package haddou.net.dakishop.dao.repositories.produit_repo;

import haddou.net.dakishop.dao.entities.produit.Avis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAvisRepository extends JpaRepository<Avis, Long> {

    List<Avis> findByProduitId(Long produitId);

    List<Avis> findByClientId(Long clientId);

    List<Avis> findByProduitIdOrderByDateAvisDesc(Long produitId);

    List<Avis> findByProduitIdAndNote(Long produitId, int note);

    boolean existsByClientIdAndProduitId(Long clientId, Long produitId);

    @Query("SELECT AVG(a.note) FROM Avis a WHERE a.produit.id = :produitId")
    Double findNoteMoyenneByProduitId(Long produitId);
}
