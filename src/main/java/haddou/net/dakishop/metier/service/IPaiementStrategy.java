package haddou.net.dakishop.metier.service;



public interface IPaiementStrategy {
    Paiement effectuerPaiement(Commande commande, PaiementDTO dto);
    ModePaiement getMode();
}
