package haddou.net.dakishop.dao.entities.interagir_IA;

import haddou.net.dakishop.dao.entities.users.Client;
import haddou.net.dakishop.metier.enums.StatutConversation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Conversation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "conversation")
    private List<Message> messages;
    private String titre;
    private LocalDateTime createdAt;
    private LocalDateTime lastmessageAt;
    @Enumerated(EnumType.STRING)
    private StatutConversation statut;
    private String contexte;
    private String Langue;

}
