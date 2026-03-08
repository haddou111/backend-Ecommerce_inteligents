package haddou.net.dakishop.dao.repositories.commande_repo;

import haddou.net.dakishop.dao.entities.commande.Commande;
import haddou.net.dakishop.metier.enums.StatutCommande;
import haddou.net.dakishop.metier.enums.StatutPaiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface ICommandeRepository extends JpaRepository<Commande, Long> {

    Optional<Commande> findByReference(String reference);

    List<Commande> findByClientId(Long clientId);

    List<Commande> findByClientIdOrderByDatecommandeDesc(Long clientId);

    List<Commande> findByStatutCommande(StatutCommande statutCommande);

    List<Commande> findByStatutPaiement(StatutPaiement statutPaiement);

    List<Commande> findByDatecommandeBetween(LocalDateTime debut, LocalDateTime fin);

    List<Commande> findByClientIdAndStatutCommande(Long clientId, StatutCommande statutCommande);

    boolean existsByReference(String reference);

    @Query("SELECT SUM(c.montantTotal) FROM Commande c WHERE c.statutPaiement = 'PAYE'")
    Long calculerChiffreAffairesTotal();

    @Query("SELECT COUNT(c) FROM Commande c WHERE c.client.id = :clientId")
    Long countByClientId(Long clientId);
}
