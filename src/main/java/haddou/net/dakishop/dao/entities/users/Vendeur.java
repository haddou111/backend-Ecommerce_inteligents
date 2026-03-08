package haddou.net.dakishop.dao.entities.users;

import haddou.net.dakishop.dao.entities.produit.Produit;
import haddou.net.dakishop.metier.enums.StatusVendeur;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name = "vendeur_id")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Vendeur extends Utilisateur {
    private  String nomBoutique;
    private String adresseBoutique;
    @OneToMany(mappedBy = "vendeur")
    private List<Produit> produit;
    @Enumerated(EnumType.STRING)
    private StatusVendeur statutVendeur;

}
