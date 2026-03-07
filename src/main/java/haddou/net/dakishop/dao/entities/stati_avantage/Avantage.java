package haddou.net.dakishop.dao.entities.stati_avantage;

import haddou.net.dakishop.metier.enums.TypeAvantage;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Avantage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String nom;
    private boolean actif;
    @Enumerated(EnumType.STRING)
    private TypeAvantage typeAvantage;


}