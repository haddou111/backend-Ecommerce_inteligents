package haddou.net.dakishop.dao.entities.users;


import haddou.net.dakishop.dao.entities.commande.Commande;
import haddou.net.dakishop.dao.entities.commande.Panier;
import haddou.net.dakishop.dao.entities.paiement.Paiement;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name = "client_id")
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Client extends Utilisateur {

    private String adresseLivraison;
    private String Ville;
    private String codepostal;

    @OneToMany (mappedBy = "client")
    private List<Commande> historiqueCommandes;

    @OneToOne (mappedBy = "client", fetch = FetchType.LAZY)
    private Panier panier;

    @OneToMany(mappedBy = "client")
    private List<Paiement> paiements;


}

