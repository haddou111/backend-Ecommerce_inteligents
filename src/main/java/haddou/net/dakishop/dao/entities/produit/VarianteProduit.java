package haddou.net.dakishop.dao.entities.produit;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class VarianteProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "produit_id")
    private Produit produit;
    private String reference;
    private String couleur;
    private String taille;
    private int stock;
    private double prix;
    private String imageUrl; // est ce que en peut ajouter une liste des images ?

    private boolean actif; // pour savoir si la variante est disponible à la vente ou pas
    private String autresCaracteristiques;

}
