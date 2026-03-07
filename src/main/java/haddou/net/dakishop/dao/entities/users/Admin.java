package haddou.net.dakishop.dao.entities.users;

import haddou.net.dakishop.metier.enums.NiveauAcces;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Admin extends Utilisateur {
    @Enumerated(EnumType.STRING)
    private NiveauAcces niveauAcces;



}
