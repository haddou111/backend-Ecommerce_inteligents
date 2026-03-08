package haddou.net.dakishop.metier.service.impl_v0.interagir_AI_impl;

import haddou.net.dakishop.dao.entities.interagir_IA.Message;
import haddou.net.dakishop.metier.service.besoin_metier.interagir_Ai_service.IChatbotService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatbotServiceImpl implements IChatbotService {
    @Override
    public String repondreAuClient(String message, Long clientId) {
        return "";
    }

    @Override
    public List<Message> voirHistoriqueChat(Long clientId) {
        return List.of();
    }
}
