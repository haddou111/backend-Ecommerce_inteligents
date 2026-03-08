package haddou.net.dakishop.metier.service.besoin_metier.strategy_paiement_service;


import haddou.net.dakishop.dao.entities.commande.Commande;
import haddou.net.dakishop.dao.entities.paiement.Paiement;
import haddou.net.dakishop.metier.dto.paiement_service_dto.PaiementDTO;
import haddou.net.dakishop.metier.enums.TypePaiement;

public interface IPaiementStrategy {
    Paiement effectuerPaiement(Commande commande, PaiementDTO dto);

    TypePaiement getMode();
}
