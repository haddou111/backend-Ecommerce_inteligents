package haddou.net.dakishop.dao.repositories.paiement;

import haddou.net.dakishop.dao.entities.paiement.Paiement;
import haddou.net.dakishop.metier.enums.StatutPaiement;
import haddou.net.dakishop.metier.enums.TypePaiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IPaiementRepository extends JpaRepository<Paiement, Long> {

    Optional<Paiement> findByTypePaiement(TypePaiement typePaiement);
    Optional<Paiement> findByCommandeId(Long commandeId);

    List<Paiement> findByClientId(Long clientId);

    List<Paiement> findByStatutPaiement(StatutPaiement statutPaiement);

    Optional<Paiement> findByReferenceTransaction(String referenceTransaction);

    boolean existsByCommandeId(Long commandeId);


}

