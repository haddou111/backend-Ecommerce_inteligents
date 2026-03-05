package haddou.net.dakishop.metier.service;


/*

  @author : haddou
  dans la partie de destinction de besoin metier pour l'admin dans le usecase ona le 
  cas d'utilisation de recuperation des statistiques globales , 
  mais j'ai essayée de separé entre ces deux cas on va cree un serive concerne seulement les statistiques globales 
  et dans le controller en va faire appel a ce service avec une endpoint dans la controller admin

*/

public interface IAdminService {

    // 1. Répondre demande avantage
    void traiterDemandeAvantage(Long demandeId, String reponse);

    // 2. Products CRUD (Accès global)
    Produit ajouterProduit(Object produitDTO);

    Produit modifierProduitGlobal(Long produitId, Object produitDTO);

    void supprimerProduitGlobal(Long produitId);

    List<Produit> consulterTousLesProduits();

    // 3. Users CRUD
    Client creerUtilisateur(Object utilisateurDTO);

    Client modifierUtilisateur(Long userId, Object utilisateurDTO);

    void supprimerUtilisateur(Long userId);

    List<Client> consulterTousLesUtilisateurs();

    // 5. Affecter DP/DR (Delivery Person)
    Livreur affecterLivreur(Long commandeId, Long livreurId);
}
