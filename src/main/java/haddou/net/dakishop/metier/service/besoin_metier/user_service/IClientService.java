package haddou.net.dakishop.metier.service.besoin_metier.user_service;


import java.util.List;

/*

  @author : haddou
  dans cette session j'ai essayer de crée notre besoin metier pour l'acteur client dans le usecase
  il faut juste crée une implimentation v0 de cette interface -> voir package impl_v0

 */

public interface IClientService {
    // Gestion de Panier
    Panier ajouterAuPanier(Long clientId, Long produitId, int quantite);
    Panier retirerDuPanier(Long clientId, Long produitId);
    Panier voirPanier(Long clientId);
    void viderPanier(Long clientId);

    // Voir historique
    List<Commande> voirHistoriqueCommandes(Long clientId);

    // Suivi l'état
    StatutCommande suiviEtatCommande(Long commandeId);

    // Gestion de profil
    Client voirProfil(Long clientId);
    Client modifierProfil(Long clientId, ClientDTO dto);
    void supprimerCompte(Long clientId);

    // Consultation de produit
    List<Produit> consulterProduits();
    Produit consulterProduitParId(Long produitId);
    List<Produit> rechercherProduits(String keyword);

    // Interagir avec AI (chatbot)
    String interagirAvecChatbot(String message, Long clientId);

    // passer commande
    Commande passerCommande(Long clientId, CommandeDTO dto);



}
