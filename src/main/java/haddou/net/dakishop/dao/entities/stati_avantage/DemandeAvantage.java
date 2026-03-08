package haddou.net.dakishop.dao.entities.stati_avantage;

import haddou.net.dakishop.dao.entities.users.Admin;
import haddou.net.dakishop.dao.entities.users.Vendeur;
import haddou.net.dakishop.metier.enums.StatutAvantage;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author  haddou
 * Cette classe représente une demande d'avantage faite par un vendeur.
 * Elle contient des informations sur le vendeur, l'avantage demandé,
 * les dates de demande et de traitement, le statut de la demande,
 * les commentaires de l'administrateur et les dates de début et de fin de l'avantage.
 * Vendeur
 *   └──(1,N)──► DemandeAvantage
 *                 ├── statut: EN_ATTENTE
 *                 ├── justification (message du vendeur)
 *                 ├── Avantage (N,1) ← quel avantage demandé
 *                 └── Admin (N,1)   ← qui traite la demande
 *                       └── commentaireAdmin + dateTraitement
 */

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DemandeAvantage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "vendeur_id")
    private Vendeur vendeur;

    @ManyToOne
    @JoinColumn(name = "avantage_id")
    private Avantage avantage;

    private LocalDateTime dateDemande;
    private LocalDateTime dateTraitement;
    @Enumerated(EnumType.STRING)
    private StatutAvantage statut;
    private String commentaireAdmin;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin adminTraitant;
    private LocalDateTime datedebut;
    private LocalDateTime datefin;



}
