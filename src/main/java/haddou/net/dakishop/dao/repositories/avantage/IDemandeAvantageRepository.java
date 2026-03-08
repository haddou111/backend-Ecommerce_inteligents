package haddou.net.dakishop.dao.repositories.avantage;

import haddou.net.dakishop.dao.entities.stati_avantage.DemandeAvantage;
import haddou.net.dakishop.metier.enums.StatutAvantage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDemandeAvantageRepository extends JpaRepository<DemandeAvantage, Long> {

    List<DemandeAvantage> findByVendeurId(Long vendeurId);

    List<DemandeAvantage> findByVendeurIdOrderByDateDemandeDesc(Long vendeurId);

    List<DemandeAvantage> findByStatut(StatutAvantage statut);

    List<DemandeAvantage> findByStatutOrderByDateDemandeAsc(StatutAvantage statut);

    List<DemandeAvantage> findByAdminTraitantId(Long adminId);

    List<DemandeAvantage> findByVendeurIdAndStatut(Long vendeurId, StatutAvantage statut);

    boolean existsByVendeurIdAndAvantageIdAndStatut(Long vendeurId, Long avantageId, StatutAvantage statut);

    @Query("SELECT COUNT(d) FROM DemandeAvantage d WHERE d.statut = 'EN_ATTENTE'")
    Long countDemandesEnAttente();

    @Query("SELECT d FROM DemandeAvantage d WHERE d.vendeur.id = :vendeurId AND d.statut = 'ACCEPTE' AND d.datefin >= CURRENT_TIMESTAMP")
    List<DemandeAvantage> findAvantagesActifsByVendeurId(Long vendeurId);
}
