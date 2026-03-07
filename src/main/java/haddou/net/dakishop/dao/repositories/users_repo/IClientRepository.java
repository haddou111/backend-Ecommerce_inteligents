package haddou.net.dakishop.dao.repositories.users_repo;

import haddou.net.dakishop.dao.entities.users.Vendeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientRepository extends JpaRepository<Vendeur,Long> {

}
