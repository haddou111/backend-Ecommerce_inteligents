package haddou.net.dakishop.dao.repositories.produit_repo;

import haddou.net.dakishop.dao.entities.produit.Promotion;
import haddou.net.dakishop.metier.enums.StatutPromotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface IPromotionRepository extends JpaRepository<Promotion, Long> {

    Optional<Promotion> findByCodePromotion(String codePromotion);

    boolean existsByCodePromotion(String codePromotion);

    List<Promotion> findByStatut(StatutPromotion statut);

    @Query("SELECT p FROM Promotion p WHERE p.statut = 'ACTIVE' AND p.dateDebut <= :now AND p.dateFin >= :now")
    List<Promotion> findPromotionsActives(LocalDateTime now);

    @Query("SELECT p FROM Promotion p WHERE p.usagesActuels < p.usagesMax AND p.statut = 'ACTIVE'")
    List<Promotion> findPromotionsDisponibles();
}
