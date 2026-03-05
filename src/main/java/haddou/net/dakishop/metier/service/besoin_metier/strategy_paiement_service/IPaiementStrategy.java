package haddou.net.dakishop.metier.service.besoin_metier.strategy_paiement_service;



public interface IPaiementStrategy {
    Paiement effectuerPaiement(Commande commande, PaiementDTO dto);
    ModePaiement getMode();
}
