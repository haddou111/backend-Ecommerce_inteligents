package haddou.net.dakishop.dao.entities.produit;

import haddou.net.dakishop.dao.entities.users.Vendeur;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)

    private double prix;
    @Column(nullable = false)

    private double prixPromotionnel;
    @Column(nullable = false)

    private int stock;
    @Column(nullable = false)

    private  String reference;
    @ElementCollection
    private List<String> imageUrlList;  // en va voir est ce que notre produit va contenir une seule image ou plusieur s
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean disponible;
    private boolean enPromotion;
    private int nbreVentes;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vendeur_id")
    private Vendeur vendeur;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;

    @ManyToMany
    @JoinTable(
        name = "produit_promotion",
        joinColumns = @JoinColumn(name = "produit_id"),
        inverseJoinColumns = @JoinColumn(name = "promotion_id")
    )
    private List<Promotion> promotion;

    @OneToMany(mappedBy = "produit")
    private List<Avis> avisList;



}

