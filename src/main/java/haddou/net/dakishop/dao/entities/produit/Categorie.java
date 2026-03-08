package haddou.net.dakishop.dao.entities.produit;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String description;
    private String imageUrl;
    private boolean actif;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Categorie parent;           // ← "je suis enfant de qui ?"

    @OneToMany(mappedBy = "parent")
    private List<Categorie> sousCategories;  //  qui sont mes enfants ?
}