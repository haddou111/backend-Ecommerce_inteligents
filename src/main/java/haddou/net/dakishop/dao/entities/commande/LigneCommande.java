package haddou.net.dakishop.dao.entities.commande;

import haddou.net.dakishop.dao.entities.produit.Produit;
import haddou.net.dakishop.dao.entities.users.Vendeur;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;

/**
 * @author :  Haddou
 * donc voici le diagramme visual de l'enchinement des relation entre le client produit et commande
 *
Client
└──(1,N)──► Commande
               ├── adresse livraison (snapshot)
               ├── paiement
               └──(1,N)──► LigneCommande
                                ├── Produit (snapshot prix + nom)
                                └── Vendeur
 */

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LigneCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomProduit;
    private double prixUnitaire;
    private int quantite;

    @ManyToOne
    @JoinColumn(name = "commande_id")
    private Commande commande;

    @ManyToOne
    @JoinColumn(name = "produit_id")
    private Produit produit;

    @ManyToOne
    @JoinColumn(name = "vendeur_id")
    private Vendeur vendeur;


}
