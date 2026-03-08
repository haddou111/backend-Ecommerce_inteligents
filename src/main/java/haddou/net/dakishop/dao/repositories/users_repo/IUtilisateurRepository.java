package haddou.net.dakishop.dao.repositories.users_repo;

import haddou.net.dakishop.dao.entities.users.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Long> {
        Utilisateur findByEmail(String email);
        boolean existsByEmail(String email);

}
