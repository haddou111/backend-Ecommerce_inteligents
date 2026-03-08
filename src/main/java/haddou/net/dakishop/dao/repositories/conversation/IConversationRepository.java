package haddou.net.dakishop.dao.repositories.conversation;

import haddou.net.dakishop.dao.entities.interagir_IA.Conversation;
import haddou.net.dakishop.metier.enums.StatutConversation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * @author haddou
 * @version 1.0
 * @since 2026-03-08
 * ici j'ai remarquée une chose est ce que notre chat est reservée seulement pour 
 * les clients ou en peut aussi ajouter vendeur et admin !!!!!!!!!
 * Interface pour la gestion des conversations
 */
@Repository
public interface IConversationRepository extends JpaRepository<Conversation, Long> {

    List<Conversation> findByClientId(Long clientId);

    List<Conversation> findByClientIdAndStatut(Long clientId, StatutConversation statut);

    Optional<Conversation> findByIdAndClientId(Long id, Long clientId);

  
    List<Conversation> findByClientIdOrderByLastmessageAtDesc(Long clientId);


    List<Conversation> findByStatutAndLastmessageAtBefore(StatutConversation statut, LocalDateTime date);

}
