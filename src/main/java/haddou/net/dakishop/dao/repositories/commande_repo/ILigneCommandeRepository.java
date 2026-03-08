package haddou.net.dakishop.dao.repositories.commande_repo;

import haddou.net.dakishop.dao.entities.commande.LigneCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ILigneCommandeRepository extends JpaRepository<LigneCommande, Long> {

    List<LigneCommande> findByCommandeId(Long commandeId);

    List<LigneCommande> findByProduitId(Long produitId);

    List<LigneCommande> findByVendeurId(Long vendeurId);

    @Query("SELECT SUM(l.quantite) FROM LigneCommande l WHERE l.produit.id = :produitId")
    Integer sumQuantiteByProduitId(Long produitId);

    @Query("SELECT SUM(l.prixUnitaire * l.quantite) FROM LigneCommande l WHERE l.vendeur.id = :vendeurId")
    Double calculerChiffreAffairesVendeur(Long vendeurId);
}
