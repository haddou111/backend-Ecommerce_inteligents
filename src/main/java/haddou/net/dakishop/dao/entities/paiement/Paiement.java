package haddou.net.dakishop.dao.entities.paiement;


import haddou.net.dakishop.dao.entities.commande.Commande;
import haddou.net.dakishop.dao.entities.users.Client;
import haddou.net.dakishop.metier.enums.Device;
import haddou.net.dakishop.metier.enums.StatutPaiement;
import haddou.net.dakishop.metier.enums.TypePaiement;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private TypePaiement typePaiement;
    private String details;
    @Enumerated(EnumType.STRING)
    private StatutPaiement statutPaiement;

    private String referenceTransaction;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @Column( nullable = false)
    private double montant;
    @Enumerated(EnumType.STRING)
    private Device device;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "commande_id",
            nullable = false,
            unique = true
    )
    private Commande commande;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;


}
