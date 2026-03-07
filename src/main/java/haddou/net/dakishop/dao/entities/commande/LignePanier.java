package haddou.net.dakishop.dao.entities.commande;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;


/**
 * @author  haddou
 * Cette classe représente une ligne de panier dans le système de commande.
 * Elle contient des informations sur la quantité, le prix unitaire et la date d'ajout d'un produit dans le panier.
 * et voici le deroulement total des relations entre les classes :
 * Client
 *   └──(1,1)──► Panier  ←─── actif = true
 *                 └──(1,N)──► LignePanier
 *                                └── VarianteProduit (N,1)
 *
 *          ──── validation ────►
 *
 *   └──(1,N)──► Commande  ←─── créée depuis le Panier
 *                 └──(1,N)──► LigneCommande
 *                                └── VarianteProduit (N,1)
 */

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LignePanier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Panier panier;

    private int quantite;
    private double prixUnitaire;
    private LocalDateTime dateAjout;


}
