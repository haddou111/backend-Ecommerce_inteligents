package haddou.net.dakishop.dao.repositories.produit_repo;


import haddou.net.dakishop.dao.entities.produit.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import java.util.List;


@Repository
public interface ICategorieRepository extends JpaRepository<Categorie, Long> {

    Optional<Categorie> findByNom(String nom);

    List<Categorie> findByNomContainingIgnoreCase(String nom);

    List<Categorie> findByParentIsNull();

    List<Categorie> findByParentId(Long parentId);

    List<Categorie> findByActifTrue();

    boolean existsByNom(String nom);
}
