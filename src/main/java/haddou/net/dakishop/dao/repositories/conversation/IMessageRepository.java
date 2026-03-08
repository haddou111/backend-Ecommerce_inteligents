package haddou.net.dakishop.dao.repositories.conversation;

import haddou.net.dakishop.dao.entities.interagir_IA.Message;
import haddou.net.dakishop.metier.enums.RoleMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMessageRepository extends JpaRepository<Message, Long> {


    List<Message> findByConversationIdOrderByDateEnvoiAsc(Long conversationId);


    List<Message> findByConversationIdAndRoleOrderByDateEnvoiAsc(Long conversationId, RoleMessage role);

    Message findTopByConversationIdOrderByDateEnvoiDesc(Long conversationId);

    long countByConversationId(Long conversationId);

}
