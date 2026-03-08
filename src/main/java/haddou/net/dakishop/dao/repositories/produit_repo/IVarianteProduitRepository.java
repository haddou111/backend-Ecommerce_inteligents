package haddou.net.dakishop.dao.repositories.produit_repo;

import haddou.net.dakishop.dao.entities.produit.VarianteProduit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IVarianteProduitRepository extends JpaRepository<VarianteProduit, Long> {

    List<VarianteProduit> findByProduitId(Long produitId);

    List<VarianteProduit> findByProduitIdAndActifTrue(Long produitId);

    Optional<VarianteProduit> findByReference(String reference);

    List<VarianteProduit> findByProduitIdAndCouleur(Long produitId, String couleur);

    List<VarianteProduit> findByProduitIdAndTaille(Long produitId, String taille);

    List<VarianteProduit> findByProduitIdAndStockGreaterThan(Long produitId, int stockMin);

    boolean existsByReference(String reference);
}
