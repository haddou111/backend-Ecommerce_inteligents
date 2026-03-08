package haddou.net.dakishop.metier.service.besoin_metier.user_service;


/*

  @author : haddou
  dans cette session j'ai essayer de crée notre besoin metier pour l'acteur vendeur  dans le usecase
  il faut juste crée une implimentation v0 de cette interface -> voir package impl_v0

 */

import haddou.net.dakishop.dao.entities.commande.Commande;
import haddou.net.dakishop.dao.entities.produit.Produit;
import haddou.net.dakishop.dao.entities.stati_avantage.DemandeAvantage;
import haddou.net.dakishop.metier.dto.avantage_service_dto.DemandeDTO;
import haddou.net.dakishop.metier.dto.produit_service_dto.ProduitDTO;
import haddou.net.dakishop.metier.enums.StatutAvantage;
import haddou.net.dakishop.metier.enums.StatutCommande;

import java.util.List;

public interface IVendeurService {

    // Confirmation des commandes
    Commande confirmerCommande(Long commandeId);
    List<Commande> voirCommandesAConfirmer(Long sellerId);

    // Voir statistiques produits
//    StatistiquesProduit voirStatistiquesProduits(Long sellerId);

    // Gestion des commandes
    List<Commande> voirToutesLesCommandes(Long sellerId);
    Commande mettreAJourStatutCommande(Long commandeId, StatutCommande statut);

    // Gestion des produits
    Produit ajouterProduit(Long sellerId, ProduitDTO dto);
    Produit modifierProduit(Long produitId, ProduitDTO dto);
    void supprimerProduit(Long produitId);
    List<Produit> voirMesProduits(Long sellerId);

    // Demande d'avantage
    DemandeAvantage demandeAvantage(Long sellerId, DemandeDTO dto);
    StatutAvantage voirStatutDemande(Long demandeId);

}
