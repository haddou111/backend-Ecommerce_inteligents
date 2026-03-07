package haddou.net.dakishop.dao.repositories.users_repo;

import haddou.net.dakishop.dao.entities.users.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminRepository extends JpaRepository<Admin,Long> {
}
