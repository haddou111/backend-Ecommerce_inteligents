package haddou.net.dakishop.dao.entities.users;

import haddou.net.dakishop.metier.enums.Role;
import haddou.net.dakishop.metier.enums.StatutCompte;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**

 @author Haddou
 ici comme ona deja traite dans notre conception j'ai essayée de crée une classe abstraite
 qui prend le nom utlisateur avec une innotatin specifique pour de @Inheritance(strategy = InheritanceType.JOINED)
 pour que les classes qui vont heriter de cette classe client , admin, vendeur
 vont partager les meme champs et on va eviter la redondance de code
 et aussi pour que notre base de données soit plus normalisé et plus facile a maintenir
 donc hibernate va crée la table utlisateur qui contient les champs commun
 et aussi dans les tables client , admin , vendeur on va avoir une clé étrangère qui pointe vers la table utilisateur
 pour faire le lien entre les tables atravers le id de la table utilisateur

 */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Utilisateur {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(nullable = false)
        private String nom;
        @Column(nullable = false)
        private String prenom;
        @Column(unique = true)
        private String email;
        @Column(nullable = false)
        private String motDePasse;
        private String telephone;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private StatutCompte statutCompte;
        @Enumerated(EnumType.STRING)
        private Role typeUtilisateur;

       // getter et setter sont gerée par l'api de lombok et ausssi les contructeurs



}
