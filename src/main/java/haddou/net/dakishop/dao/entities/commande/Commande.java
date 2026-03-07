package haddou.net.dakishop.dao.entities.commande;

import haddou.net.dakishop.dao.entities.users.Client;
import haddou.net.dakishop.metier.enums.StatutCommande;
import haddou.net.dakishop.metier.enums.StatutPaiment;
import haddou.net.dakishop.metier.enums.TypePaiement;
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
public class Commande {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String reference;

    @ManyToOne
    private Client client;

    @OneToMany
    private List<LigneCommande> ligneCommandeList;

    private LocalDateTime datecommande;
    private LocalDateTime datelivraison;
    private StatutCommande statutCommande;
    private String adresseLivraison;
    private Long montantTotal;
    @Enumerated(EnumType.STRING)
    private TypePaiement typePaiement;
    @Enumerated(EnumType.STRING)
    private StatutPaiment statutPaiment;






}

