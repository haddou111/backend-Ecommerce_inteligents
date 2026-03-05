package haddou.net.dakishop.metier.service;




public interface IChatbotService {

    // Répondre client (interaction depuis Espace Client)
    String repondreAuClient(String message, Long clientId);


    // Historique des conversations
    List<MessageChat> voirHistoriqueChat(Long clientId);
}
