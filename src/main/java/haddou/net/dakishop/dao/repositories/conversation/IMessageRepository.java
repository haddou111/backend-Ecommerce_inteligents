package haddou.net.dakishop.dao.repositories.conversation;

import haddou.net.dakishop.dao.entities.interagir_IA.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMessageRepository extends JpaRepository<Message,Long> {
}
