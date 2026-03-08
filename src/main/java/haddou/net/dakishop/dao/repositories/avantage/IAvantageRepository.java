package haddou.net.dakishop.dao.repositories.avantage;

import haddou.net.dakishop.dao.entities.stati_avantage.Avantage;
import haddou.net.dakishop.metier.enums.TypeAvantage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IAvantageRepository extends JpaRepository<Avantage, Long> {

    Optional<Avantage> findByNom(String nom);

    List<Avantage> findByNomContainingIgnoreCase(String nom);

    List<Avantage> findByActifTrue();

    List<Avantage> findByTypeAvantage(TypeAvantage typeAvantage);

    List<Avantage> findByTypeAvantageAndActifTrue(TypeAvantage typeAvantage);

    boolean existsByNom(String nom);
}