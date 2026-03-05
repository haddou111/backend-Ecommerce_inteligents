package haddou.net.dakishop.metier.service;



/*

  @author : haddou
  dans cette session j'ai essayer de crée notre besoin metier pour l'acteur vendeur  dans le usecase
  il faut juste crée une implimentation v0 de cette interface -> voir package impl_v0

 */

public interface IVendeurService {

    // Confirmation des commandes
    Commande confirmerCommande(Long commandeId);
    List<Commande> voirCommandesAConfirmer(Long sellerId);

    // Voir statistiques produits
    StatistiquesProduit voirStatistiquesProduits(Long sellerId);

    // Gestion des commandes
    List<Commande> voirToutesLesCommandes(Long sellerId);
    Commande mettreAJourStatutCommande(Long commandeId, StatutCommande statut);

    // Gestion des produits
    Produit ajouterProduit(Long sellerId, ProduitDTO dto);
    Produit modifierProduit(Long produitId, ProduitDTO dto);
    void supprimerProduit(Long produitId);
    List<Produit> voirMesProduits(Long sellerId);

    // Demande d'avantage
    DemandeAvantage soumettreDemandeAvantage(Long sellerId, DemandeDTO dto);
    StatutDemande voirStatutDemande(Long demandeId);

}
