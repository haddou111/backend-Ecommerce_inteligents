package haddou.net.dakishop.dao.entities.interagir_IA;

import haddou.net.dakishop.metier.enums.RoleMessage;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

/**
 * @author haddou
 * shema des relation durant une conversation entre le client et l'ia ,
 * chaque message a un role (client ou ia) et une date d'envoi
 * Client
 *   └──(1,N)──► Conversation
 *                 ├── contexte (historique achats injecté)
 *                 ├── statut, device, langue
 *                 └──(1,N)──► Message
 *                               ├── role: USER      ← question du client
 *                               ├── role: ASSISTANT ← réponse de l'IA
 *                               └── role: SYSTEM    ← instruction système (caché)
 */

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Conversation conversation;

    private String content;
    @Enumerated(EnumType.STRING)
    private RoleMessage role;
    private LocalDateTime dateEnvoi;



}
