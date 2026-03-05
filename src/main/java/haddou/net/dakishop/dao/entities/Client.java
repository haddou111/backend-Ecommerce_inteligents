package haddou.net.dakishop.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class Client {
    @Id
    private Long id;
    private String firstname;
    private String email;

}
