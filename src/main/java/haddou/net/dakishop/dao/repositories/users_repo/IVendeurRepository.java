package haddou.net.dakishop.dao.repositories.users_repo;

import haddou.net.dakishop.dao.entities.users.Vendeur;
import haddou.net.dakishop.metier.enums.StatusVendeur;
import haddou.net.dakishop.metier.enums.StatutCompte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IVendeurRepository extends JpaRepository<Vendeur, Long> {

    Optional<Vendeur> findByEmail(String email);

    Optional<Vendeur> findByNomBoutique(String nomBoutique);

    // Recherche par nom de boutique (contient, insensible à la casse)
    @Query("SELECT v FROM Vendeur v WHERE lower(v.nomBoutique) LIKE lower(concat('%', :keyword, '%'))")
    List<Vendeur> SearchByNameOfBoutique(String keyword);

    List<Vendeur> findByStatutVendeur(StatusVendeur statutVendeur);

    List<Vendeur> findByStatutCompte(StatutCompte statutCompte);

    boolean existsByEmail(String email);

    boolean existsByNomBoutique(String nomBoutique);
}
