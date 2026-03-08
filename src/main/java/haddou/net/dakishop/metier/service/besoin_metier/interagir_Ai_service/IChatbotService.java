package haddou.net.dakishop.metier.service.besoin_metier.interagir_Ai_service;


import haddou.net.dakishop.dao.entities.interagir_IA.Message;

import java.util.List;

public interface IChatbotService {

    // Répondre client (interaction depuis Espace Client)
    String repondreAuClient(String message, Long clientId);


    // Historique des conversations
    List<Message> voirHistoriqueChat(Long clientId);
}
