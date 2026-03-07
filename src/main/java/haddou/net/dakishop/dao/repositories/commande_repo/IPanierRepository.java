package haddou.net.dakishop.dao.repositories.commande_repo;


import haddou.net.dakishop.dao.entities.commande.Panier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IPanierRepository extends JpaRepository<Panier,Long> {
}
