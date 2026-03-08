package haddou.net.dakishop.metier.service;


import haddou.net.dakishop.dao.entities.commande.Panier;

public interface IPanierValidationStrategy {
    void valider(Panier panier);
}
