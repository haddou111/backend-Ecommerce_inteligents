package haddou.net.dakishop.dao.repositories.users_repo;

import haddou.net.dakishop.dao.entities.users.Admin;
import haddou.net.dakishop.metier.enums.NiveauAcces;
import haddou.net.dakishop.metier.enums.StatutCompte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IAdminRepository extends JpaRepository<Admin, Long> {

    Optional<Admin> findByEmail(String email);

    List<Admin> findByNiveauAcces(NiveauAcces niveauAcces);

    List<Admin> findByStatutCompte(StatutCompte statutCompte);

    boolean existsByEmail(String email);
}
