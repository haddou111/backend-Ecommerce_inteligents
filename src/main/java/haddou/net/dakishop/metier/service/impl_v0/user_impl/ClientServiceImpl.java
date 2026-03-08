package haddou.net.dakishop.metier.service.impl_v0.user_impl;

import haddou.net.dakishop.dao.entities.commande.Commande;
import haddou.net.dakishop.dao.entities.commande.Panier;
import haddou.net.dakishop.dao.entities.produit.Produit;
import haddou.net.dakishop.dao.entities.users.Client;
import haddou.net.dakishop.metier.dto.commande_service_dto.CommandeDTO;
import haddou.net.dakishop.metier.dto.user_service_dto.ClientDTO;
import haddou.net.dakishop.metier.enums.StatutCommande;
import haddou.net.dakishop.metier.service.besoin_metier.user_service.IClientService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
public class ClientServiceImpl implements IClientService {


    @Override
    public Panier ajouterAuPanier(Long clientId, Long produitId, int quantite) {
        return null;
    }

    @Override
    public Panier retirerDuPanier(Long clientId, Long produitId) {
        return null;
    }

    @Override
    public Panier voirPanier(Long clientId) {
        return null;
    }

    @Override
    public void viderPanier(Long clientId) {

    }

    @Override
    public List<Commande> voirHistoriqueCommandes(Long clientId) {
        return List.of();
    }

    @Override
    public StatutCommande suiviEtatCommande(Long commandeId) {
        return null;
    }

    @Override
    public Client voirProfil(Long clientId) {
        return null;
    }

    @Override
    public Client modifierProfil(Long clientId, ClientDTO dto) {
        return null;
    }

    @Override
    public void supprimerCompte(Long clientId) {

    }

    @Override
    public List<Produit> consulterProduits() {
        return List.of();
    }

    @Override
    public Produit consulterProduitParId(Long produitId) {
        return null;
    }

    @Override
    public List<Produit> rechercherProduits(String keyword) {
        return List.of();
    }

    @Override
    public String interagirAvecChatbot(String message, Long clientId) {
        return "";
    }

    @Override
    public Commande passerCommande(Long clientId, CommandeDTO dto) {
        return null;
    }
}
