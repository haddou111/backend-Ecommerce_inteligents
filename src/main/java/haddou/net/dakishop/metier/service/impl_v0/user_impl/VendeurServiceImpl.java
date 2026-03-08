package haddou.net.dakishop.metier.service.impl_v0.user_impl;

import haddou.net.dakishop.dao.entities.commande.Commande;
import haddou.net.dakishop.dao.entities.produit.Produit;
import haddou.net.dakishop.dao.entities.stati_avantage.DemandeAvantage;
import haddou.net.dakishop.metier.dto.avantage_service_dto.DemandeDTO;
import haddou.net.dakishop.metier.dto.produit_service_dto.ProduitDTO;
import haddou.net.dakishop.metier.enums.StatutAvantage;
import haddou.net.dakishop.metier.enums.StatutCommande;
import haddou.net.dakishop.metier.service.besoin_metier.user_service.IVendeurService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
public class VendeurServiceImpl implements IVendeurService {


    @Override
    public Commande confirmerCommande(Long commandeId) {
        return null;
    }

    @Override
    public List<Commande> voirCommandesAConfirmer(Long sellerId) {
        return List.of();
    }

    @Override
    public List<Commande> voirToutesLesCommandes(Long sellerId) {
        return List.of();
    }

    @Override
    public Commande mettreAJourStatutCommande(Long commandeId, StatutCommande statut) {
        return null;
    }

    @Override
    public Produit ajouterProduit(Long sellerId, ProduitDTO dto) {
        return null;
    }

    @Override
    public Produit modifierProduit(Long produitId, ProduitDTO dto) {
        return null;
    }

    @Override
    public void supprimerProduit(Long produitId) {

    }

    @Override
    public List<Produit> voirMesProduits(Long sellerId) {
        return List.of();
    }

    @Override
    public DemandeAvantage demandeAvantage(Long sellerId, DemandeDTO dto) {
        return null;
    }

    @Override
    public StatutAvantage voirStatutDemande(Long demandeId) {
        return null;
    }
}
