package haddou.net.dakishop.dao.entities.produit;


import haddou.net.dakishop.metier.enums.StatutPromotion;
import haddou.net.dakishop.metier.enums.TypeRemise;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codePromotion;
    private String description;
    @Enumerated(EnumType.STRING)
    private TypeRemise typeRemise;
    private double valeurRemise;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    @Enumerated(EnumType.STRING)
    private StatutPromotion statut;
    private int usagesMax;
    private int usagesActuels;

    @ManyToMany
    private List<Produit> produit;


}
