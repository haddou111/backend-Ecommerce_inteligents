package haddou.net.dakishop.dao.repositories.conversation;

import haddou.net.dakishop.dao.entities.interagir_IA.Conversation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IConversationRepository extends JpaRepository<Conversation,Long> {
}
