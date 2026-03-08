package haddou.net.dakishop.metier.service.besoin_metier.statistique;

import haddou.net.dakishop.dao.entities.commande.Commande;
import haddou.net.dakishop.dao.entities.produit.Produit;
import haddou.net.dakishop.dao.entities.users.Client;
import haddou.net.dakishop.metier.dto.statistique.StatistiqueDTO;

import java.util.List;

public interface IStatistiqueGlobal {


     List<Client> getAllclient();
     List<Produit> getAllprodact();
     List<Commande> getAllcommande();
     StatistiqueDTO getdatachiffreaboutsysteme();
}
