package haddou.net.dakishop.metier.service.impl_v0.statistique_impl;

import haddou.net.dakishop.dao.entities.commande.Commande;
import haddou.net.dakishop.dao.entities.produit.Produit;
import haddou.net.dakishop.dao.entities.users.Client;
import haddou.net.dakishop.metier.dto.statistique.StatistiqueDTO;
import haddou.net.dakishop.metier.service.besoin_metier.statistique.IStatistiqueGlobal;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatistiqueGlobalImpl implements IStatistiqueGlobal {


    @Override
    public List<Client> getAllclient() {
        return List.of();
    }

    @Override
    public List<Produit> getAllprodact() {
        return List.of();
    }

    @Override
    public List<Commande> getAllcommande() {
        return List.of();
    }

    @Override
    public StatistiqueDTO getdatachiffreaboutsysteme() {
        return null;
    }
}
