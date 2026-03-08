package haddou.net.dakishop.dao.repositories.users_repo;

import haddou.net.dakishop.dao.entities.users.Utilisateur;
import haddou.net.dakishop.metier.enums.Role;
import haddou.net.dakishop.metier.enums.StatutCompte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Long> {

    Optional<Utilisateur> findByEmail(String email);

    boolean existsByEmail(String email);

    List<Utilisateur> findByTypeUtilisateur(Role role);

    List<Utilisateur> findByStatutCompte(StatutCompte statutCompte);

    @Query("SELECT u FROM Utilisateur u " +
            "WHERE lower(u.nom) LIKE lower(concat('%', :nom, '%')) " +
            "OR lower(u.prenom) LIKE lower(concat('%', :prenom, '%'))")
    List<Utilisateur> searchByName(@Param("nom") String nom,
                                   @Param("prenom") String prenom);

}