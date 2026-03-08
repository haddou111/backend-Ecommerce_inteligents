package haddou.net.dakishop.dao.entities.commande;

import haddou.net.dakishop.dao.entities.produit.Promotion;
import haddou.net.dakishop.dao.entities.users.Client;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Panier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String codePromo;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "panier")
    private List<LignePanier> lignesPanier;

    @ManyToOne
    @JoinColumn(name = "promotion_id")
    private Promotion promotion;

    private double totalPrice;
    private boolean actif;

}
