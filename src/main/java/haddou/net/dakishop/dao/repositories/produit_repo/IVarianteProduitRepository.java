package haddou.net.dakishop.dao.repositories.produit_repo;

import haddou.net.dakishop.dao.entities.produit.VarianteProduit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVarianteProduitRepository extends JpaRepository<VarianteProduit,Long> {
}
