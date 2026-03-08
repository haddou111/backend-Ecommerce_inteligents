package haddou.net.dakishop.dao.entities.commande;

import haddou.net.dakishop.dao.entities.paiement.Paiement;
import haddou.net.dakishop.dao.entities.users.Client;
import haddou.net.dakishop.metier.enums.StatutCommande;
import haddou.net.dakishop.metier.enums.StatutPaiement;
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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "commande", fetch = FetchType.LAZY)
    private List<LigneCommande> ligneCommandeList;

    @OneToOne(mappedBy = "commande",fetch = FetchType.LAZY)
    @JoinColumn(name = "paiement_id")
    private Paiement paiement;
    private String reference;
    private LocalDateTime datecommande;
    private LocalDateTime datelivraison;
    private StatutCommande statutCommande;
    private String adresseLivraison;
    private Long montantTotal;
    @Enumerated(EnumType.STRING)
    private TypePaiement typePaiement;
    @Enumerated(EnumType.STRING)
    private StatutPaiement statutPaiement;






}

