package haddou.net.dakishop.metier.service.impl_v0.strategy_paiement.paiement;

import haddou.net.dakishop.dao.entities.commande.Commande;
import haddou.net.dakishop.dao.entities.paiement.Paiement;
import haddou.net.dakishop.metier.dto.paiement_service_dto.PaiementDTO;
import haddou.net.dakishop.metier.enums.TypePaiement;
import haddou.net.dakishop.metier.service.besoin_metier.strategy_paiement_service.IPaiementStrategy;

import static haddou.net.dakishop.metier.enums.TypePaiement.Virment_bancaire;

public class CarteBancaireStrategy implements IPaiementStrategy {

    @Override
    public Paiement effectuerPaiement(Commande commande, PaiementDTO dto) {
        return null;
    }

    @Override
    public TypePaiement getMode() {
        return Virment_bancaire;
    }
}
