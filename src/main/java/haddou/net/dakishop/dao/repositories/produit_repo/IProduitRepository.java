package haddou.net.dakishop.dao.repositories.produit_repo;

import haddou.net.dakishop.dao.entities.produit.Produit;
import haddou.net.dakishop.dao.entities.users.Vendeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IProduitRepository extends JpaRepository<Produit, Long> {

    List<Produit> findByNomContainingIgnoreCase(String nom);

    Optional<Produit> findByReference(String reference);

    List<Produit> findByVendeur(Vendeur vendeur);

    List<Produit> findByCategorieId(Long categorieId);

    List<Produit> findByDisponibleTrue();

    List<Produit> findByEnPromotionTrue();

    List<Produit> findByPrixBetween(double prixMin, double prixMax);

    List<Produit> findByDisponibleTrueOrderByNbreVentesDesc();

    boolean existsByReference(String reference);
}
