package haddou.net.dakishop.metier.service.impl_v0.user_impl;

import haddou.net.dakishop.dao.entities.produit.Produit;
import haddou.net.dakishop.dao.entities.users.Client;
// À remplacer par l'entité Livreur quand elle existera
// import haddou.net.dakishop.dao.entities.users.Livreur; 

import haddou.net.dakishop.metier.service.besoin_metier.user_service.IAdminService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
public class AdminServiceImpl implements IAdminService {

    @Override
    public void traiterDemandeAvantage(Long demandeId, String reponse) {
        log.info("Traitement de la demande d'avantage {} avec réponse: {}", demandeId, reponse);
    }

    @Override
    public Produit ajouterProduit(Object produitDTO) {
        log.info("Ajout d'un produit global avec DTO: {}", produitDTO);
        return null;
    }

    @Override
    public Produit modifierProduitGlobal(Long produitId, Object produitDTO) {
        log.info("Modification du produit global {}", produitId);
        return null;
    }

    @Override
    public void supprimerProduitGlobal(Long produitId) {
        log.info("Suppression du produit global {}", produitId);
    }

    @Override
    public List<Produit> consulterTousLesProduits() {
        log.info("Consultation de tous les produits par admin");
        return List.of();
    }

    @Override
    public Client creerUtilisateur(Object utilisateurDTO) {
        log.info("Création d'un utilisateur par admin");
        return null;
    }

    @Override
    public Client modifierUtilisateur(Long userId, Object utilisateurDTO) {
        log.info("Modification de l'utilisateur {}", userId);
        return null;
    }

    @Override
    public void supprimerUtilisateur(Long userId) {
        log.info("Suppression de l'utilisateur {}", userId);
    }

    @Override
    public List<Client> consulterTousLesUtilisateurs() {
        log.info("Consultation de tous les utilisateurs");
        return List.of();
    }

//    @Override
//    public Livreur affecterLivreur(Long commandeId,  Long livreurId) {
//        log.info("Affectation du livreur {} à la commande {}", livreurId, commandeId);
//        return null;
//    }
}
