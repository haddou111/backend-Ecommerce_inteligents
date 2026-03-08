package haddou.net.dakishop.dao.repositories.commande_repo;


import haddou.net.dakishop.dao.entities.commande.Panier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IPanierRepository extends JpaRepository<Panier, Long> {

    Optional<Panier> findByClientIdAndActifTrue(Long clientId);

    Optional<Panier> findByClientId(Long clientId);

    boolean existsByClientIdAndActifTrue(Long clientId);

    Optional<Panier> findByCodePromo(String codePromo);
}
